package 子类必须完全的实现父类的方法;

public class Rifle extends AbstractGun {
	// 步枪的特点是射程远，威力大
	public void shoot() {
		System.out.println("步枪射击...");
	}
}
