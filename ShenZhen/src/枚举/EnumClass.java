package 枚举;

enum Shrubbery{GROUND,CRAWLING,HANGING}


public class EnumClass {
	public static void main(String[] args) {
		/*
		 * 遍历枚举Shrubbery中的对象
		 */
		for(Shrubbery s : Shrubbery.values()){
			System.out.println(s+":"+s.ordinal());//返回枚举常量的序数（它在枚举声明中的位置，其中初始常量序数为零）。
			System.out.println("compareto():"+s.compareTo(Shrubbery.CRAWLING));
			System.out.println("equals():"+s.equals(Shrubbery.CRAWLING));
			System.out.println("是否相等："+(s==Shrubbery.CRAWLING));
			System.out.println("与枚举对象相对应的Class对象："+s.getDeclaringClass());
			System.out.println("s.name():"+s.name());
			System.out.println("**********************");
		}
		
		
	}
}
