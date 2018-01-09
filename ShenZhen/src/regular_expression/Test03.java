package regular_expression;

public class Test03 {

	public static void main(String[] args) {
		
		/*p("ab".matches("\\w"));
		p(" ".matches("\\s"));
		p("  ".matches("\\s{2}"));
		p("adfv dfs  dfaf".replaceAll("[\\s]", "-"));
		p("\\".matches("\\\\"));*/
		p("5.355".matches("^\\d+(\\.\\d+)?"));
		p("565".matches("[\\d]"));
		p("adf".matches(""));
	}
	
	private static void p(Object o){
		System.out.println(o);
	}

}
