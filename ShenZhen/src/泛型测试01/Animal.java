package 泛型测试01;

public class Animal {
	private String name;
	
	public void run(){
		System.out.println("奔跑吧动物");
	}

	public Animal(String name) {
		super();
		this.name = name;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
//	public Animal(){}
	
}
