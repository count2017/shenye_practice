package 原型模式02;

import java.util.Date;


public class Client_qian_clone {
/**
 * 浅克隆
 * @param args
 * @throws CloneNotSupportedException
 */
	public static void main(String[] args) throws CloneNotSupportedException {
		Sheep_qian_clone s1 = new Sheep_qian_clone("s1羊",new Date(1511512L),18);
		Sheep_qian_clone s2 = (Sheep_qian_clone) s1.clone();
		System.out.println(s1==s2?"地址相同":"不同地址");
		System.out.println(s1.getName()==s2.getName() ? "字符串浅拷贝" : "字符串深拷贝");
		System.out.println(s1.getAge()==s2.getAge() ? "年龄相等" : "");
		s1.setName("zeze");
		System.out.println(s1.getName()==s2.getName() ? "浅拷贝??" : "深拷贝？？");
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
