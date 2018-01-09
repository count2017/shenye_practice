package Practice20170708;

public class Boss {
	private int age;
	private double money;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}
	@Override
	public String toString() {
		return "Boss [age=" + age + ", money=" + money + "]";
	}
	
	
}
