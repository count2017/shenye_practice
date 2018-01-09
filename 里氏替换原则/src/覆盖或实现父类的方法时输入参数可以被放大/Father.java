package 覆盖或实现父类的方法时输入参数可以被放大;

import java.util.Collection;
import java.util.HashMap;

/**
 * 大家可以这样想 想看，在一个Invoker 类中关联了一个父类，调用了一个父类的方法，子类可以重写这个方法，也可以重
 * 载这个方法，前提是要扩大这个前置条件，就是输入参数的类型大于父类的类型覆盖范围。可能比较理难 理解，那我们再反过来想一下，如果Father
 * 类的输入参数类型大于子类的输入参数类型，会出现什么问题？ 就会出现父类存在的地方，子类就未必可以存在，因为一旦把子类作为参数传入进去，
 * 调用者就很可能进入子类的方法范畴.
 * */
public class Father {
	public Collection doSomething(HashMap map) {
		System.out.println("父类被执行...");
		return map.values();
	}
}
