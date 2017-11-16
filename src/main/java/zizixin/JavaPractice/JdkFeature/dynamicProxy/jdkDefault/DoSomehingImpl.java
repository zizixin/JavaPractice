package zizixin.JavaPractice.JdkFeature.dynamicProxy.jdkDefault;

public class DoSomehingImpl implements DoSomething{

	@Override
	public void doSomething() {
		
		System.out.println("do something !");
	}

	@Override
	public void doSomehingTwo() {
		
		System.out.println("do something two !");
	}

}
