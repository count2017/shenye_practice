package 代理模式1.静态代理;

public class Client {
	public static void main(String[] args) {
		Star real = new RealStar();
		Star proxy = new ProxyStar(real);
		proxy.bookTicket();
		proxy.collectMoney();
		proxy.sing();
	}
}
