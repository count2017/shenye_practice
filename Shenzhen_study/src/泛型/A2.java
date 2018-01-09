package 泛型;

public class A2 extends Apple{

	public A2(Object info) {
		super(info);
	}
	
	@Override
	public String getInfo() {
		return (String) super.getInfo();
	}

}
