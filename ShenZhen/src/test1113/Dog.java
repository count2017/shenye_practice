package test1113;

public class Dog {
	private String name;
	
	public String fff(String name){
		return this.name = name;
	}
	
	public String kkk(String s){
		return name = s;
	}
	
	public String nr(){
		String str = null;
		if(this.name == null){
			return "什么都没有";
		}
		switch (name) {
			case "":
				 str = "空白";
				 break;
			case "bob":
				 str = "鲍勃";
				 break;
			case " ":
				str = "是空的";
				break;
		}
		return str;
	}
	
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.fff("");
		dog.kkk("bob");
		String s = dog.nr();
		System.out.println(s);
	}
}
