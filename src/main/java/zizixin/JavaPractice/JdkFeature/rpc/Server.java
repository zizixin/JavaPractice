package zizixin.JavaPractice.JdkFeature.rpc;

public interface Server {

	public void start() throws Exception;
	
	public void stop()  throws Exception;
	
	public void register(Class<?> serviceInterface, Class<?> impl);
	
	public boolean isRunning();
	
	public int getPort();
}
