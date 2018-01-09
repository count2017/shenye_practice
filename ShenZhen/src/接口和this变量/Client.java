package 接口和this变量;

public class Client {
	public static void main(String[] args) {
		HisDao h = new HisDao();
		
		System.out.println(h.getClass());
		
		IQueryDao iqd = h.createQuery(User.class);
		
		Object obj = new Object();
		
		
		
	}
}
