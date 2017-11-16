package zizixin.JavaPractice.JdkFeature.dynamicProxy.cglib;

public class CglibTest {

	public static void main(String[] args) {
		DoProxy proxy = new DoProxy();
		Do doInsrtance = (Do) proxy.getInstance(new DoImpl());
		
		doInsrtance.DoTest();
	}
}
