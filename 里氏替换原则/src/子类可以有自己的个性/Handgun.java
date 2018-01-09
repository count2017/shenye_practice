package 子类可以有自己的个性;

public class Handgun extends AbstractGun {
	// 手枪的特点是携带方便，射程短
	@Override
	public void shoot() {
		System.out.println("手枪射击...");
	}
}
