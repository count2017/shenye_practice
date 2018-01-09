package 数据结构__哈希表;

import java.util.Hashtable;

public class HashTableDemo {
	public static void main(String[] args) {
		/*//create a hash map
		Hashtable balance = new Hashtable();*/
		  Hashtable<String, Integer> numbers
		     = new Hashtable<String, Integer>();
		   numbers.put("one", 1);
		   numbers.put("two", 2);
		   numbers.put("three", 3);

		   Integer n = numbers.get("two");
		     if (n != null) {
		         System.out.println("two = " + n);
		     }
	}
}
