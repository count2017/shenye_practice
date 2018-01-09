package 子类可以有自己的个性;

public class Soldier {
	public void killEnemy(AbstractGun gun) {
		System.out.println("士兵开始杀人...");
		gun.shoot();
	}
}
