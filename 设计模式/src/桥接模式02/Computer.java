package 桥接模式02;

public abstract class Computer {
	
	protected Brand brand;
	
	public Computer(Brand b){
		this.brand = b;
	}
	
	public void sale(){
		brand.sale();
	}
	
}
