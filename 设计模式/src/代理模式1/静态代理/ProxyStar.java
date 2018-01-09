package 代理模式1.静态代理;

public class ProxyStar implements Star{
	private Star star; 
	public ProxyStar(Star real){
		this.star = real;
	}
	@Override
	public void confer() {
		// TODO Auto-generated method stub
		System.out.println("ProxyStar.confer()");
		
	}

	@Override
	public void signContract() {
		// TODO Auto-generated method stub
		System.out.println("ProxyStar.singContract()");
	}

	@Override
	public void bookTicket() {
		// TODO Auto-generated method stub
		System.out.println("ProxyStar.bookTicket()");
		
	}

	@Override
	public void sing() {
		// TODO Auto-generated method stub
		star.sing();
	}
	

	@Override
	public void collectMoney() {
		// TODO Auto-generated method stub
		System.out.println("ProxyStar.collectMoney()");
	}

}
