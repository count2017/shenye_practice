package 适配器2;
/**
 * 客户端类
 * 相当于例子中的笔记本，只有USB接口
 * @author lenovo
 *
 */
public class Client {
	public void test1(Target t){
		t.handelReq();
	}
	public static void main(String[] args) {
		Client c = new Client();
		Adaptee a = new Adaptee();
		
		Target t = new Adapter2(a);
		
		c.test1(t);
	}
	
}
