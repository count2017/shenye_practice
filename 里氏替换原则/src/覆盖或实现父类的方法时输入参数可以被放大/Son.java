package 覆盖或实现父类的方法时输入参数可以被放大;

import java.util.Collection;
import java.util.Map;

public class Son extends Father {
	// 放大输入参数类型
	
	/**
	 * // @Override 
	 * 大家注意看黄色明显标记部分，和父类同样的一个方法名称，但是又不是重写（Override）父类的方 法，你加个@Override
	 * 试试看，报错的，为什么呢？是输入参数类型不同，编译器就不认为是重写父类的方
	 * 法了，那这是什么？是重载（Overload）！不用大惊小怪的，不在一个类就不能是重载了？继承是什么意思，子类拥有
	 * 子类拥有父类的所有属性和方法，那方法名重复输入参数类型又不相同当然是重载了。
	 * */

	public Collection doSomething(Map map) {
		System.out.println("子类被执行...");
		return map.values();
	}
}
