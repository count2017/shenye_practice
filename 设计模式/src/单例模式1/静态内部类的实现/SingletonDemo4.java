package 单例模式1.静态内部类的实现;
/**
 * 测试静态内部类实现单例模式
 * 特点：线程安全，调用效率高，并且实现了延时加载
 * @author lenovo
 *
 */
public class SingletonDemo4 {
	private static class SingletonClassInstance{
		private static final SingletonDemo4 instance = new SingletonDemo4();
	}
	private SingletonDemo4(){}//构造方法私有化
	//方法没有同步，调用效率高！
	private static SingletonDemo4 getInstance(){
		return SingletonClassInstance.instance;
	}
}
