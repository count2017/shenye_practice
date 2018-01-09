package 观察者模式03;

public class Client {

	public static void main(String[] args) {
		//创建目标对象
		ConcreteSubject subject = new ConcreteSubject();
		
		//创建观察者
		ObserverA obs1 = new ObserverA();
		ObserverA obs2 = new ObserverA();
		ObserverA obs3 = new ObserverA();
		
		subject.addObserver(obs1);
		subject.addObserver(obs2);
		subject.addObserver(obs3);
		
		subject.set(4000);
		
		System.out.println("#############");
		System.out.println(obs1.getMyState());
		System.out.println(obs2.getMyState());
		System.out.println(obs3.getMyState());
		
		subject.set(6000);
		
		System.out.println("#############");
		System.out.println(obs1.getMyState());
		System.out.println(obs2.getMyState());
		System.out.println(obs3.getMyState());
	}

}
