package 工厂模式.抽象工厂模式;
/**
 * 用到的概率较低，除非产品或较大的项目，用来增加产品族
 * @author lenovo
 *
 */
public class Client {
	public static void main(String[] args) {
		CarFactory factory = new LuxuryCarFactory();
		Engine e = factory.createEngine();
		e.run();
		e.start();
	}
}
