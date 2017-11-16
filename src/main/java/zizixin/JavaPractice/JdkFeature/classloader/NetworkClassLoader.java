package zizixin.JavaPractice.JdkFeature.classloader;

public class NetworkClassLoader extends ClassLoader{

	@Override
	protected Class<?> findClass(String name) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		return super.findClass(name);
	}
}
