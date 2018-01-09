package 泛型;

import java.util.ArrayList;
import java.util.List;

public class Aextends {
	public static void test(List<Object> c){
		for(int i=0;i<c.size();i++){
			System.out.println(c.get(i));
		}
	}
	public static void main(String[] args) {
		List<String> strList = new ArrayList<>();
		test(strList);
	}
}
