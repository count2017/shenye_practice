package 桥接模式02;

public class Laptop extends Computer{

	public Laptop(Brand b) {
		super(b);
	}
	
	@Override
	public void sale() {
		super.sale();
		System.out.println("销售笔记机");
	}

}

