package 装饰模式;

public class FlyCar extends SuperCar{

	public FlyCar(ICar car) {
		super(car);
	}
	
	@Override
	public void move() {
		super.move();
		System.out.println("空中飞！");
	}

}
