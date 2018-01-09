package 工厂模式.简单工厂模式;

public class CarFactory2 {
	public static Car createAuid(){
		return new Audi();
	}
	
	public static Car createByd(){
		return new Byd();
	}
}
