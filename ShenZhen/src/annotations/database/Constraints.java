package annotations.database;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)//应用目标:字段、枚举的常量
@Retention(RetentionPolicy.RUNTIME)//保留策略：运行时
public @interface Constraints {//约束注解
	boolean primaryKey() default false;
	boolean allowNull() default false;
	boolean unique() default false;
}
