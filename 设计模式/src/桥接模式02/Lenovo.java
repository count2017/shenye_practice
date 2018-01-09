package 桥接模式02;

public class Lenovo implements Brand {

	@Override
	public void sale() {
		System.out.println("销售联想电脑");
	}
}
