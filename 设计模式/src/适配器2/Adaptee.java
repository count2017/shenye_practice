package 适配器2;
/**
 * 被适配的类
 * 相当于ps/2键盘
 * *
 * @author lenovo
 *
 */
public class Adaptee {
	public void request(){
		System.out.println("可以完成客户请求的需要的功能");
	}
}
