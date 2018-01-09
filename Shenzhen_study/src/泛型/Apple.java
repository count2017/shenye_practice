package 泛型;

public class Apple<T> {
	private T info;

	public Apple(T info) {
		super();
		this.info = info;
	}

	public T getInfo() {
		return info;
	}

	public void setInfo(T info) {
		this.info = info;
	}
	
	public static void main(String[] args) {
		Apple<String> aq = new Apple<>("apple");
		System.out.println(aq.getInfo());
		Apple<Integer> as = new Apple<>(5); 
		System.out.println(as.getInfo());
		System.out.println("==========");
		System.out.println(aq.getClass() == as.getClass());
		if(aq instanceof Apple<?>){
			System.out.println("llll");
		}
	}
}
