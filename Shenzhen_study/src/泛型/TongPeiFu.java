package 泛型;

import java.util.ArrayList;
import java.util.List;

public class TongPeiFu {
	public static void test(List<?> c){
		for(int i=0;i<c.size();i++){
			System.out.println(c.get(i));
		}
	}
	public static void main(String[] args) {
		List<?> strList = new ArrayList<String>();
		strList.add("l");
//		strList.add("luxio");
		strList.add(null);
		test(strList);
	}
}
