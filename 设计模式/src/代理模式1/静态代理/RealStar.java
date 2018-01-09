package 代理模式1.静态代理;

public class RealStar implements Star {

	@Override
	public void confer() {
		// TODO Auto-generated method stub
		System.out.println("RealStar.confer()");
		
	}

	@Override
	public void signContract() {
		// TODO Auto-generated method stub
		System.out.println("RealStar.signContract()");
	}

	@Override
	public void bookTicket() {
		// TODO Auto-generated method stub
		System.out.println("RealStar.bookTicket()");
	}

	@Override
	public void sing() {
		System.out.println("RealStar(周杰伦).sing()");
		
	}

	@Override
	public void collectMoney() {
		// TODO Auto-generated method stub
		System.out.println("RealStar.collectMoney()");
		
	}
	
}
