package javaassist;

import java.io.IOException;

import javassist.CannotCompileException;
import javassist.ClassPool;
import javassist.CtClass;
import javassist.CtConstructor;
import javassist.CtField;
import javassist.CtMethod;
import javassist.NotFoundException;

public class Demo01 {
	public static void main(String[] args) throws CannotCompileException, NotFoundException, IOException {
		ClassPool pool = ClassPool.getDefault();
		CtClass cc =  pool.makeClass("javaassist.bean.Emp");
		
		//创建属性
		CtField f1 = CtField.make("private int emp_no;", cc);
		CtField f2 = CtField.make("private String emp_name;", cc);
		cc.addField(f1);
		cc.addField(f2);
		
		CtMethod m1 = CtMethod.make("public int getEmp_no(){return emp_no;}", cc);
		CtMethod m2 = CtMethod.make("public void setEmp_no(){"
				+ "this.emp_no = emp_no;}", cc);
		cc.addMethod(m1);
		cc.addMethod(m2);
		
		/*//添加构造器
		CtConstructor constructor = new CtConstructor(
				(new CtClass[]{CtClass.intType,pool.get("java.lang.String")}),cc);
		constructor.setBody("{super(); this.emp_no = emp_no; this.emp_name = emp_nae;}");
		*/
		
		cc.writeFile("f:/myjava");
		System.out.println("!!!!!!!!!!!!!");
	}
	
}
