package 单例模式1.懒汉;

public class SingletonDemo2 {
	//初始化类时，不初始化这个对象（延时加载，真正用的时候再加载）
	private static SingletonDemo2 instance;
	private SingletonDemo2(){}//构造方法私有化
	
	//方法同步，调用效率低
	public static synchronized SingletonDemo2 getInstance(){
		if(instance == null){
			instance = new SingletonDemo2();
		}
		return instance;
	}

}
