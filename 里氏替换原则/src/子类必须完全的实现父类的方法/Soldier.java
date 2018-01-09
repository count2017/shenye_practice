package 子类必须完全的实现父类的方法;

public class Soldier {
	public void killEnemy(AbstractGun gun) {
		System.out.println("士兵开始杀人...");
		gun.shoot();
	}
}
