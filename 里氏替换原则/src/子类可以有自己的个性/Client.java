package 子类可以有自己的个性;

/**
 * 在Java 的基础知识中，每位老师都会讲继承，Java 的三大特征嘛，继承、封装、多态，继承就是告诉
 * 你拥有父类的方法和属性，然后你就可以重写父类的方法。按照类的继承原则，我们上面的玩具枪继承 AbstractGun
 * 也是没有问题的呀，毕竟也是枪嘛，但是到我们的具体项目中就要考虑这个问题了：子类是否
 * 完整的实现了父类的业务，否则就会出现像上面的拿枪杀敌人时却发现是把玩具枪的笑话。
 * */
public class Client {
	public static void main(String[] args) {
		// 产生三毛这个狙击手
		Snipper sanMao = new Snipper();
		sanMao.killEnemy(new G3());
	}
	
	
//	显示是不行的，会在运行期报java.lang.ClassCastException 异常，这也是大家经常说的向下转
//	型（downcast）是不安全的，从里氏替换法则来看，就是有子类出现的地方父类未必就可以出现。
	/*public static void main(String[] args) {
		//产生三毛这个狙击手
		Snipper sanMao = new Snipper();
		Rifle rifle = new Rifle();
		sanMao.killEnemy((G3)rifle);
	}*/
}
