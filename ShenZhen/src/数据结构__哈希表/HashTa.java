package 数据结构__哈希表;

public class HashTa  extends Dic implements Ma,Ma02{
	
	/**
	 * size()、isEmpty()方法为接口Ma、Ma02和抽象方法Dic所共有
	 */
	@Override
	public int size() {
		System.out.println("size()");
		return 111;
	}

	@Override
	public boolean isEmpty() {
		System.out.println("isEmpty()");
		return false;
	}
	
	/**
	 * isNotEmpty()方法只有接口Ma02有
	 */
	@Override
	public boolean isNotEmpty() {
		System.out.println("isNotEmpty()");
		return false;
	}
	
	public static void main(String[] args) {
		
		Ma m = new HashTa();
		//Ma的实现类对象调用HashTa的方法
		System.out.println(m.size());
		System.out.println(m.isEmpty());
		System.out.println("---------------------");
		Dic d = new HashTa();
		//Dic的子类对象调用HashTa的方法
		System.out.println(d.size());
		System.out.println(d.isEmpty());
		System.out.println("---------------------");
		Ma02 m2 = new HashTa();
		//Ma02的实现类对象调用HashTa的方法
		System.out.println(m2.size());
		System.out.println(m2.isEmpty());
		System.out.println(m2.isNotEmpty());
	}

}
