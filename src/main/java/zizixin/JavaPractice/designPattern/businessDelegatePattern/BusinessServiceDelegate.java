package zizixin.JavaPractice.designPattern.businessDelegatePattern;

public class BusinessServiceDelegate {

	/**
	 * 添加一个loolUp
	 */
	public ServiceLookup lookUp = new ServiceLookup();
	
	public BusinessService businessService = new EJBService();
	
	public void setServiceType(String serviceType) throws Exception{
		this.businessService = lookUp.getService(serviceType);
	}
	
	public void doTask(){
		this.businessService.doProcess();
	}
}
