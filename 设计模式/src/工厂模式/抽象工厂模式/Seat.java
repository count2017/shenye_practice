package 工厂模式.抽象工厂模式;

public interface Seat {
	void message();
}

class LuxurySeat implements Seat{

	@Override
	public void message() {
		System.out.println("可以自动按摩");
	}
	
} 

class LowSeat implements Seat{

	@Override
	public void message() {
		System.out.println("不能自动按摩");
	}
	
}