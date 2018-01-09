package 观察者模式02;

public class Client {
	public static void main(String[] args) {
		//目标对象
		ConcreteSubject subject = new ConcreteSubject();
		
		//创建多个观察者
		ObserverA obs1 = new ObserverA();
		ObserverA obs2 = new ObserverA();
		ObserverA obs3 = new ObserverA();
		
		//将这三个观察者添加到subject对象的观察者队伍中
		subject.registerObserver(obs1);
		subject.registerObserver(obs2);
		subject.registerObserver(obs3);
		
		System.out.println(obs1.getMyState());
		System.out.println(obs2.getMyState());
		System.out.println(obs3.getMyState());
		
		//改变观察者的状态
		subject.setState(3000);
		
		System.out.println(obs1.getMyState());
		System.out.println(obs2.getMyState());
		System.out.println(obs3.getMyState());
	}
	
}
