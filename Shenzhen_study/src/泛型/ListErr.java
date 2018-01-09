package 泛型;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ListErr {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		List strList = new ArrayList();
		strList.add("你好");
		strList.add("世界");
		strList.add(5);
		for (Object object : strList) {
			System.out.println(((String)object).length());
		}
	}

}
