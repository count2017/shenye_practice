package 子类必须完全的实现父类的方法;

public class Handgun extends AbstractGun {
	// 手枪的特点是携带方便，射程短
	@Override
	public void shoot() {
		System.out.println("手枪射击...");
	}
}
