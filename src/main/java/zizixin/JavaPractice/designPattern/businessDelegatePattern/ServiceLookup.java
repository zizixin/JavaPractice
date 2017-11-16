package zizixin.JavaPractice.designPattern.businessDelegatePattern;

public class ServiceLookup {
	
	public BusinessService getService(String name) throws Exception{
		if(name.equals("EJB")){
			return new EJBService();
		}else if(name.equals("JMS")){
			return new JMSService();
		}else{
			throw new Exception();
		}
	}
}
