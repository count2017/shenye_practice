package 子类必须完全的实现父类的方法;

public class MachineGun extends AbstractGun {
	public void shoot() {
		System.out.println("机枪扫射...");
	}
}
