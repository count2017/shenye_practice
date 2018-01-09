package 子类可以有自己的个性;

public class Rifle extends AbstractGun {
	// 步枪的特点是射程远，威力大
	public void shoot() {
		System.out.println("步枪射击...");
	}
}
