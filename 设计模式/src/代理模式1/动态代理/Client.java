package 代理模式1.动态代理;

import java.lang.reflect.Proxy;

public class Client {
	public static void main(String[] args) {
		Star realStar = new RealStar();
		StarHandler  handler = new StarHandler(realStar);
		Star proxy = (Star) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{Star.class}, handler);
		//订票
		proxy.bookTicket();
		//唱歌
		proxy.sing();
	}
}
