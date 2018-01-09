package 桥接模式02;

public class Client {
	public static void main(String[] args) {
		//销售联想的笔记本电脑
		Computer c  = new Laptop(new Lenovo());
		c.sale();
	}
}
