package annotations.database;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)//应用目标：接口、类、枚举、注解
@Retention(RetentionPolicy.RUNTIME)//保留策略：运行时
public @interface DBTable {//数据库注解
	public String name() default "";
}
