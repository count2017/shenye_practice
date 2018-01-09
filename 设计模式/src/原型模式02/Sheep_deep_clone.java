package 原型模式02;

import java.util.Date;

/**
 * 浅克隆
 * @author lenovo
 *
 */
public class Sheep_deep_clone implements Cloneable{
	private String name;
	private Date birthday;
	
	
	public Sheep_deep_clone() {
		super();
	}


	public Sheep_deep_clone(String name, Date birthday) {
		super();
		this.name = name;
		this.birthday = birthday;
	}


	@Override
	protected Object clone() throws CloneNotSupportedException {
		Object obj = super.clone();//直接调用object对象的clone()方法
		
		//添加如下代码进行深复制
		Sheep_deep_clone s = (Sheep_deep_clone) obj;
//		s.name = this.name.clone();
		s.birthday = (Date) this.birthday.clone();
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
	
	
}
