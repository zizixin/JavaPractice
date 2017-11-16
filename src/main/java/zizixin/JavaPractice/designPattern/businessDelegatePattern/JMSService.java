package zizixin.JavaPractice.designPattern.businessDelegatePattern;

public class JMSService implements BusinessService{

	@Override
	public void doProcess() {
		System.out.println("service in jms service");
	}

}
