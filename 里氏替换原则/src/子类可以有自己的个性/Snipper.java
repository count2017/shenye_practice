package 子类可以有自己的个性;

public class Snipper {
	public void killEnemy(G3 g3) {
		// 首先看看敌人的情况，别杀死敌人，自己也被人干掉
		g3.zoomOut();
		// 开始射击
		g3.shoot();
	}
}
