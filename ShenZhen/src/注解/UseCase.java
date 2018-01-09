package 注解;

import static java.lang.annotation.ElementType.*;

import java.lang.annotation.Retention;
import static java.lang.annotation.RetentionPolicy.*;
import java.lang.annotation.Target;

@Target(value={METHOD})
//注解信息保留到运行时
@Retention(RUNTIME)
public @interface UseCase {
	public String hehe();
	public int id();
	public String description() default "no description";
}
