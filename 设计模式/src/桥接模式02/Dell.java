package 桥接模式02;

public class Dell implements Brand {

	@Override
	public void sale() {
		System.out.println("销售戴尔电脑");
	}
}
