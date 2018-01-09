package 动态编译;

import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;

public class Demo01 {
	public static void main(String[] args) {
		JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
		int result = compiler.run(null, null, null, "f:/myj/HelloWorld.java");
		System.out.println(result==0?"success":"fail");
	}
}
