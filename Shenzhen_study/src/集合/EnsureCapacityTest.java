package 集合;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.TreeMap;

public class EnsureCapacityTest {
	public static void main(String[] args) {  
        final int N=1000000;  
        Object obj=new Object();  
        ArrayList list1=new ArrayList();  
        long start=System.currentTimeMillis();  
        for(int i=0;i<N;i++){  
            list1.add(obj);  
        }  
        System.out.println("所耗时间："+(System.currentTimeMillis()-start));  
        System.out.println("----------------");
        ArrayList list2=new ArrayList();  
        long start2=System.currentTimeMillis();  
        list2.ensureCapacity(N);//显示的对低层数组进行扩容  
        for(int i=0;i<N;i++){  
            list2.add(obj);  
        }  
        System.out.println(System.currentTimeMillis()-start2); 
        
        int a = (int) (15*1.5);
        
        TreeMap tm = new TreeMap();
        
        AbstractMap am = new AbstractMap();
        
    } 
}
