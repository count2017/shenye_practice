package 原型模式02;

import java.util.Date;

public class Client_deep_clone {
	public static void main(String[] args) throws CloneNotSupportedException {
		Sheep_deep_clone s1 = new Sheep_deep_clone("s1_羊",new Date(1511512L));
		Sheep_deep_clone s2 = (Sheep_deep_clone) s1.clone();
		System.out.println(s1);
		System.out.println("s1的name:"+s1.getName());
		System.out.println("s1的birthday:"+s1.getBirthday());
		System.out.println(s1.getClass());
		s1.setName("洋洋");
		System.out.println("s1——s1_setName(洋洋)之后的name:"+s1.getName());
		s1.setBirthday(new Date(581551L));
		System.out.println("======================");
		
		System.out.println("s2刚刚克隆出来时的name:"+s2.getName());
		s2.setName("央央");
		System.out.println("s1——在s2_setName(央央)之后的name:"+s1.getName());
		System.out.println(s2);
		System.out.println("s2的name_在s2_setName(央央)之后:"+s2.getName());
		System.out.println("s2的birthday:"+s2.getBirthday());
		System.out.println(s2.getClass());
		System.out.println("s1的name:"+s1.getName());
	}
}
