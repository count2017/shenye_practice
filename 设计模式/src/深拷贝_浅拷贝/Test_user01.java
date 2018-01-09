package 深拷贝_浅拷贝;

import java.util.Date;

public class Test_user01 {
	public static void main(String[] args) {
		Date date = new Date(55523554L);
		User u = new User("张三",15,date);
		System.out.println(u);
		System.out.println(u.getName());
		System.out.println(u.getAge());
		System.out.println(u.getBirthday());
		System.out.println("====================");
		User uc = null;
		uc = u;
		System.out.println(uc);
		System.out.println(uc.getName());
		System.out.println(uc.getAge());
		System.out.println(uc.getBirthday());
		uc.setName("李四");
		System.out.println("==================");
		System.out.println(u);
		System.out.println(u.getName());
		System.out.println(u.getAge());
		System.out.println(u.getBirthday());
		u.setBirthday(new Date(45121L));
		System.out.println("==================");
		System.out.println(uc);
		System.out.println(uc.getName());
		System.out.println(uc.getAge());
		System.out.println(uc.getBirthday());
	}
}
