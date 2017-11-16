package zizixin.JavaPractice.designPattern.businessDelegatePattern;

import zizixin.JavaPractice.designPattern.Demo;

public class BusinessDelegatePatternDemo implements Demo{

	@Override
	public void show() throws Exception {
		
		BusinessServiceDelegate delegate = new BusinessServiceDelegate();
		
		delegate.doTask();
		
		delegate.setServiceType("JMS");
		
		delegate.doTask();
	}

	public static void main(String[] args) {
		try {
			new BusinessDelegatePatternDemo().show();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
