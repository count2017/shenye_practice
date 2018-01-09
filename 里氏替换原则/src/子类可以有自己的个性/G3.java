package 子类可以有自己的个性;

public class G3 extends Rifle {
	// 狙击枪都是携带一个精准的望远镜
	public void zoomOut() {
		System.out.println("通过望远镜观看敌人...");
	}

	public void shoot() {
		System.out.println("G3射击...");
	}
}
