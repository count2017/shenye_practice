package regular_expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test02 {
	public static void main(String[] args) {
		Pattern p = Pattern.compile("[a-z]{3}");
		Matcher m = p.matcher("asfs");
		p(m.matches());
		p("192.".matches("[0-1][0-9][0-9]\\."));
		p("168..".matches("\\d{1,3}\\."));
		p("e".matches("[abd]"));
		p("e".matches("[^abd]"));
		p("e".matches("[A-E]|[a-e]"));
		p("Z".matches("[a-yA-Z]"));
		p("E".matches("[A-E]"));
	}
	
	private static void p(Object o){
		System.out.println(o);
	}
}
