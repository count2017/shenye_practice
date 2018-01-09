package 装饰模式;

public class AICar extends SuperCar{

	public AICar(ICar car) {
		super(car);
	}
	
	@Override
	public void move() {
		super.move();
		System.out.println("自动跑！");
	}

}
