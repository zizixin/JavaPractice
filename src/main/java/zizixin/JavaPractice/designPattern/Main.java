package zizixin.JavaPractice.designPattern;

/**
 * @author zizixin
 *
 * issue: when you do this two pattern,need to fix is 
 * 1.which classes should use singleton instance
 * 2.the error log should be more detail
 *
 */
public class Main {

	public static void main(String[] args) {
		try {
			//NO1
			Demo factoryDemo = DemoFactory.getDemo(DemoFactory.FactoryPattern);
			factoryDemo.show();
			
			//NO2
			Demo abstractFactoryDemo = DemoFactory.getDemo(DemoFactory.AbstractFactoryPattern);
			abstractFactoryDemo.show();
			
			//NO3
//			Demo SingletonPatternDemo = DemoFactory.getDemo(DemoFactory.SingletonPattern);
//			SingletonPatternDemo.show();
			
			//NO4
			Demo BuilderPatternDemo = DemoFactory.getDemo(DemoFactory.BuilderPattern);
			BuilderPatternDemo.show();
			
			Demo adapterPatternDemo = DemoFactory.getDemo("adapterPattern");
			adapterPatternDemo.show();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
