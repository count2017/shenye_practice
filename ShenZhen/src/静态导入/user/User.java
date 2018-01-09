package 静态导入.user;

import static 静态导入.util.Teacher.*;
import 静态导入.util.Teacher;

public class User {
	
	public static void main(String[] args) {
		Teacher t = new Teacher();
		t.setAge("18");
		System.out.println(USERNAME);
	}
}
