package Practice20170708;

public class BossAndUser<T,C> {
	private T obj1;
	private C obj2;
	/*public  BossAndUser(T o1,C o2){
		this.obj1 = o1;
		this.obj2 = o2;
	}*/
	public BossAndUser() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BossAndUser(T obj1, C obj2) {
		super();
		this.obj1 = obj1;
		this.obj2 = obj2;
	}
	public T getObj1() {
		return obj1;
	}
	public void setObj1(T obj1) {
		this.obj1 = obj1;
	}
	public C getObj2() {
		return obj2;
	}
	public void setObj2(C obj2) {
		this.obj2 = obj2;
	}
	@Override
	public String toString() {
		return "BossAndUser [obj1=" + obj1 + ", obj2=" + obj2 + "]";
	}
	
}
