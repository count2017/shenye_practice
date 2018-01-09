package 代理模式1.动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class StarHandler implements InvocationHandler{
	Star realStar;
	
	public StarHandler(Star realStar){
		super();
		this.realStar = realStar;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) 
			throws Throwable {
		Object object = null;
		System.out.println("正真的方法执行前");
		if("sing".equals(method.getName())){
			object = method.invoke(realStar, args);
		}
		System.out.println("真正的方法执行后");
		return object;
	}

}
