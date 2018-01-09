package 覆盖或实现父类的方法时输入参数可以被放大;

import java.util.HashMap;

/**
 * 里氏替换法则说是父类出现的地方子类就能出现，我们把上面的黄色部分修改为子类，程序如下：
 * 运行结果还是一样，看明白是怎么回事了吗？父类方法的输入参数是HashMap类型，子类的输入参数 是Map
 * 类型，也就是说子类的输入参数类型的范围扩大了，子类代替父类传递到调用类用，子类的方法永
 * 远都不回被执行，这是正确的，如果你想让子类的方法运行，你就必须重写父类的方法.
 * 
 * */

public class Client {
	public static void invoker() {
		// 父类存在的地方，子类就应该能够存在
//		Father f = new Father();
		Son f = new Son();
		HashMap map = new HashMap();
		f.doSomething(map);
	}

	public static void main(String[] args) {
		invoker();
	}
}
