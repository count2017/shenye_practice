package 注解处理器;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import 注解.PswUtils;
import 注解.UseCase;

public class UseCaseTracker {
	public static void
		trackUseCases(List<?> useCases,Class<?> cl){
		for(Method m:cl.getDeclaredMethods()){
			UseCase uc = m.getAnnotation(UseCase.class);
			if(uc!=null){
				System.out.println("Found Use Case: id="+uc.id()+" annotion="+uc.description());
				useCases.remove(new Integer(uc.id()));
				useCases.remove(uc.hehe());
			}
		}
		
		for(Object i:useCases){
			System.out.println("Warning:minssing the case = "+i);
		}
	}
	
	//main()方法
	public static void main(String[] args) {
		List<Integer> useCases = new ArrayList<Integer>();
		Collections.addAll(useCases, 47,48,49,50);
		trackUseCases(useCases, PswUtils.class);
		System.out.println("##################");
		List<String> uc = new ArrayList<String>();
		Collections.addAll(uc, "1","2","3","4");
		trackUseCases(uc, PswUtils.class);
	}
	
}
