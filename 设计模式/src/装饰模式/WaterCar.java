package 装饰模式;

public class WaterCar extends SuperCar{

	public WaterCar(ICar car) {
		super(car);
	}
	
	@Override
	public void move() {
		super.move();
		System.out.println("水上漂！");
	}

}
