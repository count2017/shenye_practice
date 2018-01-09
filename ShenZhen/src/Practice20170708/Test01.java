package Practice20170708;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.Properties;

public class Test01 {
	
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		ArrayList<BossAndUser> arr = new ArrayList<BossAndUser>();
		User u1 = new User();
		u1.setPassword("123");
		u1.setUsername("admin");
		Boss b1 = new Boss();
		b1.setAge(18);
		b1.setMoney(155661.3);
		BossAndUser bau = new BossAndUser<User, Boss>(u1, b1);
		BossAndUser bau1 = new BossAndUser<Boss, Boss>(b1, b1);
		BossAndUser bau2 = new BossAndUser<User, User>(u1, u1);
		arr.add(bau);
		System.out.println(arr);
		arr.remove(bau);
		System.out.println("------------------------------");
		
		arr.add(bau1);
		System.out.println(arr);
		arr.remove(bau1);
		System.out.println("------------------------------");
		
		arr.add(bau2);
		System.out.println(arr);
		arr.remove(bau2);
		System.out.println("------------------------------");
		
		Properties p = new Properties();
		Hashtable<String, User> hashtable = new Hashtable<>(11, 11f);
		
		
	}
		
}
