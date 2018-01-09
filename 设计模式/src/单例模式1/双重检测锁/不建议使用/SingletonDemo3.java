package 单例模式1.双重检测锁.不建议使用;
/**
 * 双重检测锁实现单例模式
 * @author lenovo
 *
 */
public class SingletonDemo3 {
	private static SingletonDemo3 instance = null;
	public static SingletonDemo3 getInstance(){
		if(instance == null){
			SingletonDemo3 sc;
			synchronized(SingletonDemo3.class){
				sc = instance;
				if(sc == null){
					synchronized(SingletonDemo3.class){
						if(sc == null){
							instance = new SingletonDemo3();
						}
					}
					instance = sc;
				}
			}
		}
		return instance;
	}
	
}
