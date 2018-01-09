package regular_expression;

public class Test01 {
	public static void main(String[] args) {
		System.out.println("adfas".matches("...."));
		String[] srr = "a,b".split("\\,");
		String[] sr = "a ;  ;;b".split("\t");
		System.out.println("\\t");
		System.out.println("\t");
		System.out.println("\\n");
		System.out.println("\\\n");
		System.out.println("\n");
		System.out.println("\\|");
		System.out.println("\\");
		System.out.println("\\\t");
		System.out.println("\'");
		for (String s : srr) {
			System.out.println(s);
		}
		for (String s : sr) {
			System.out.println(s);
		}
		System.out.println("ads5a4asd56a".replaceAll("\\d", "-"));
		System.out.println("ads5a4asd56a".replaceAll("\\D", "-"));
		System.out.println("ads5a4asd56a".replaceAll(".", "-"));
	}
}
