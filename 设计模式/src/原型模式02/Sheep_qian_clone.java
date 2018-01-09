package 原型模式02;

import java.util.Date;

/**
 * 浅克隆
 * @author lenovo
 *
 */
public class Sheep_qian_clone implements Cloneable{
	private String name;
	private Date birthday;
	private int age;
	
	
	public Sheep_qian_clone() {
		super();
	}


	public Sheep_qian_clone(String name, Date birthday,int age) {
		super();
		this.name = name;
		this.birthday = birthday;
		this.age = age;
	}


	@Override
	protected Object clone() throws CloneNotSupportedException {
		Object obj = super.clone();//直接调用object对象的clone()方法
		return obj;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Date getBirthday() {
		return birthday;
	}


	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}
	
	
}
