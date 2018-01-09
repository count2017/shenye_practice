package annotations.database;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)//应用目标:字段、枚举的常量
@Retention(RetentionPolicy.RUNTIME)//保留策略：运行时
public @interface SQLString {
	int value() default 0;
	String name() default "";
	/*
	 * 注解类型的...
	 * */
	Constraints constraints() default @Constraints;
}
