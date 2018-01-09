package 单例模式1;

import 单例模式1.枚举.SingletonDemo5;
import 单例模式1.饿汉.SingletonDemo1;

public class Client {
	public static void main(String[] args) {
		SingletonDemo5 s = SingletonDemo5.INSTANCE;
		s.toString();
		System.out.println(SingletonDemo5.INSTANCE == SingletonDemo5.INSTANCE);
		
	}
}
