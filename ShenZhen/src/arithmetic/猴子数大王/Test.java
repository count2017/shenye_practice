package arithmetic.猴子数大王;

import java.util.LinkedList;
import java.util.List;
public class Test {
	protected static Object regist(List<?> list,int now,int a){
		int l_now = now - 1;
		int count = 0;
		while(list.size() > 1){
			++count;
			if(count == a){
				count = 0;
				if(l_now == list.size()-1){
					Object k = list.remove(l_now);
					l_now = 0;
					continue;
				}
				Object l = list.remove(l_now);
				continue;
			}
			if(l_now == list.size()-1){
				l_now = 0;
				continue;
			}
			l_now++;
		}
		return list.get(0);
	}
	
	//main方法
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		for(int i=0;i<7;i++){
			list.add(new Integer(i+1));
		}
		Object o = regist(list,5,5);
		System.out.println(o);
	}
}
