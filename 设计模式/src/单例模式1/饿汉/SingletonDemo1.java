package 单例模式1.饿汉;

public class SingletonDemo1 {
	//类初始化时立即加载这个对象（没有延时加载的优势）。加载类时，天然的是线程安全的
	private static SingletonDemo1 instance = new SingletonDemo1();
	private SingletonDemo1(){
	}
	
	//没有方法同步，调用效率高！
	public static SingletonDemo1 getInstance(){
		return instance;
	}
}
