package zizixin.JavaPractice.JdkFeature.javaCompiler;

//import sun.tools;

public class JvmCompiler {

	public static int compile(String[] args){
		//com.sun.tools.javac.main.Main compiler = new com.sun.tools.javac.main.Main("javac");
		sun.tools.jar.Main complier = new sun.tools.jar.Main(null, null, null);
		return 0;
	}
}
