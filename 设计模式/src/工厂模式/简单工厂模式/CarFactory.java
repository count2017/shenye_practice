package 工厂模式.简单工厂模式;
/**
 * 简单工厂，也称为“静态工厂”
 * 有缺陷，违反了"开闭原则"
 * 项目中较常用
 * @author lenovo
 *
 */
public class CarFactory {
	public static Car createCar(String type){
		if("奥迪".equals(type)){
			return new Audi();
		}else if("比亚迪".equals(type)){
			return new Byd();
		}else{
			return null;
		}
	}
}
