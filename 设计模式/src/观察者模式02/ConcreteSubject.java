package 观察者模式02;

public class ConcreteSubject extends Subject{
	private int state;

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
		//主题对象（目标对象）值发生变化，请通知所以的观察者
		this.notifyAllObservers();
	}
	
	
	
}
