package 装饰模式;

public class Client {

	public static void main(String[] args) {
		
		Car car = new Car();
		
		car.move();
		System.out.println("=========================");
		
		FlyCar flycar = new FlyCar(new WaterCar(car));
		
		flycar.move();
		
		System.out.println("=========================");
		
		AICar acar = new AICar(new FlyCar(new WaterCar(car)));
		
		acar.move();
	}

}
