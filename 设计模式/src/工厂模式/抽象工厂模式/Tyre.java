package 工厂模式.抽象工厂模式;

public interface Tyre {
	void revolve();
}


class LuxuryTyre implements Tyre{

	@Override
	public void revolve() {
		System.out.println("不磨损");
	}
	
}

class LowTyre implements Tyre{

	@Override
	public void revolve() {
		System.out.println("磨损快");
	}
	
}