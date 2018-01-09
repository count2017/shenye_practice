package 单例模式1.枚举;

/**
 * 枚举方式实现单例模式：没有延时加载
 * @author lenovo
 *
 */
public enum SingletonDemo5 {
	//该枚举元素本身就是单例模式
	INSTANCE;
	
	//添加自己需要的操作
	public void singletonOperation(){
		
	}
}
