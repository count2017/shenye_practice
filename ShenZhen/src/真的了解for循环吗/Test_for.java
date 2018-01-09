package 真的了解for循环吗;

public class Test_for {
	static boolean foo(char c){
		System.out.println(c);
		return true;
	}
	static void h(){}
	
	public static void main(String[] args) {
		int i=0;
		for(h();true;h()){
			i++;
		}
		/*for(foo('s');true;true){
			
		}*/
	}
}
