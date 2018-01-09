package 桥接模式02;

public class Desktop extends Computer{

	public Desktop(Brand b) {
		super(b);
	}
	
	@Override
	public void sale() {
		super.sale();
		System.out.println("销售台式机");
	}

}
