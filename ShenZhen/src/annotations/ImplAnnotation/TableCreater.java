package annotations.ImplAnnotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import annotations.database.Constraints;
import annotations.database.DBTable;
import annotations.database.SQLInteger;
import annotations.database.SQLString;

public class TableCreater {
	public static void main(String[] args) throws ClassNotFoundException {
		if(args.length<1){
			System.out.println("参数是注解类型");
			System.exit(0);
		}
		for(String className:args){
			//通过反射机制获取“全类名”对应的Class对象
			Class<?> cl = Class.forName(className);
			//获取DBTable注解
			DBTable dbTable = cl.getAnnotation(DBTable.class);
			//判断是类中是否有DBTable注解
			if(dbTable == null){
				System.out.println("类中没有DBTable注解："+className);
				continue;
			}
			String tableName = dbTable.name();
			/*
			 * 如果DBTable注解存在,但长度小于1
			 * （"".length()=0）,则取对应
			 * 类名作为表名
			 * */
			if(tableName.length() < 1){
				tableName = cl.getName().toUpperCase();
			}
			List<String> columnDefs = new ArrayList<String>();
			/*
			 *1.通过反射机制依次获取类中属性对应的注解
			 *
			 *3.
			 * */
			for (Field field:cl.getDeclaredFields()) {
				String columnName = null;
				Annotation[] anns = field.getDeclaredAnnotations();
				if(anns.length < 1) continue; //not a db table column
				//2.对获取到的注解进行instanceof判断
				if(anns[0] instanceof SQLInteger){
					SQLInteger sInt = (SQLInteger) anns[0];
					//如果没有指定SQLInteger注解的name，则将类中属性名称作为数据库列名
					if(sInt.name().length() < 1)
						columnName = field.getName().toUpperCase();
					else
						columnName = sInt.name();
					columnDefs.add(columnName+" INT"+getConstraints(sInt.constraints()));
				}
				//2.对获取到的注解进行instanceof判断
				if(anns[0] instanceof SQLString){
					SQLString sString = (SQLString) anns[0];
					//空字符串 判断
					if(sString.name().length() < 1)
						columnName = field.getName().toUpperCase();
					else
						columnName = sString.name(); 
					columnDefs.add(columnName+" VARCHAR("+
						sString.value()+")"+getConstraints(sString.constraints()));
				}
				StringBuilder createCommand = new StringBuilder(
						"CREATE TABLE "+tableName+"(");
				String tableCreate = "";
				for (String columnDef : columnDefs) {
					createCommand.append("\n " + columnDef + ",");
					tableCreate = createCommand.substring(
							0,createCommand.length()-1)+");";
				}
				//循环输出每次SQL拼接结果
				System.out.println("为"+className+"创建的SQL： "+
						"\n "+ tableCreate+"\n ");
			}
		}
	}
	
	/*
	 * 获取约束的方法
	 * */
	private static String getConstraints(Constraints con){
		String constraints = "";
		if(!con.allowNull())
			constraints += " NOT NULL";
		if(con.primaryKey())
			constraints += " PRIMARY KEY";
		if(con.unique())
			constraints += " UNIQUE";
		return constraints;
	}
	
}
