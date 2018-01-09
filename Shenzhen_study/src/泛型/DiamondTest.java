package 泛型;

import java.util.ArrayList;
import java.util.List;

public class DiamondTest {

	public static void main(String[] args) {
		List<String> books = new ArrayList<String>();
		books.add("piaoliuji");
		books.add("mingchaonaxieshi");
		for (Object s : books) {
			System.out.println(((String) s).length());
		}
	}

}
