package 泛型测试01;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;

public class Test {
	
	/**
	 * 泛型方法
	 * @param list
	 * @param o
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static <T extends Animal> List<T> add(
			List<T> list,Object o){
				list.add((T) o);
				return list;
	}
	public static void main(String[] args) throws ClassNotFoundException {
//		Cat c = new Cat("cat");
		Dog d = new Dog("dog");
		Dog d1 = new Dog("dog111");
		Dog d2 = new Dog("dog2222");
		Bird b = new Bird();
		Animal a = new Animal("dfsafdsad");
		Object o = new Object();
		List<Animal> list = new ArrayList<Animal>();
		add(list,d);
		add(list,d);
		add(list,d1);
		add(list,a);
		List<Animal> _li = add(list,a);
		for (int i = 0; i < _li.size(); i++) {
			System.out.println(_li.get(i).getName());
		}
		d.run();
		Class c = Class.forName("泛型测试01.Cat");
		Constructor[] cc = c.getDeclaredConstructors();
		String s = c.toGenericString();
		System.out.println(s);
		for (int i = 0; i < cc.length; i++) {
			System.out.println(cc);
		}
	}
}
