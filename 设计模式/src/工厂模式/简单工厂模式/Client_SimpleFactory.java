package 工厂模式.简单工厂模式;
/**
 * 简单工厂情况下
 * @author lenovo
 *
 */
public class Client_SimpleFactory {

	public static void main(String[] args) {
//		Car audi = CarFactory.createCar("奥迪");
//		Car byd = CarFactory.createCar("比亚迪");
//		
		Car audi = CarFactory2.createAuid();
		Car byd = CarFactory2.createByd();
		
		audi.run();
		byd.run();
	}
}
