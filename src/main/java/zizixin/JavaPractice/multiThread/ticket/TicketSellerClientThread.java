package zizixin.JavaPractice.multiThread.ticket;

/**
 * @author zizixin
 *
 * use for mock;
 */
public class TicketSellerClientThread extends Thread{

	/**
	 * 单纯无线程的一个售票客户端
	 */
	public TicketSellerClient ticketSellerClient;
	
	/**
	 * 采用程序内部初始化售票用户
	 */
	public int[] userIds;
	
	/**
	 * 当前售票到哪一位用户
	 */
	public int userIndex;
	
	/**
	 * 该线程模拟的售票的用户数量
	 */
	public int userNumber;
	
	/**
	 * 用于初始化的日志打印
	 * @return string 代表初始化的用户的userIds
	 */
	public String userIdsToString(){
		StringBuilder sb = new StringBuilder();
		sb.append("  ");
		for(int i=0;i<userIds.length;i++){
			sb.append(userIds[i]+",");
		}
		return sb.toString();
	}
	
	/**
	 * 构造方法
	 * @param ticketSellerClient
	 * @param userNumber
	 */
	public TicketSellerClientThread(TicketSellerClient ticketSellerClient,int userNumber){
		this.ticketSellerClient = ticketSellerClient;
		this.userNumber = userNumber;
		userIds = new int[this.userNumber];
		for(int i=1;i<=userIds.length;i++){
			userIds[i-1] = i;
		}
		System.out.println(ticketSellerClient.getClientName()+userIdsToString());//输出初始化信息
	}
	
	@Override
	public void run() {
		while(true){
			if(userIndex ==userIds.length)break;
			this.ticketSellerClient.sell(userIds[userIndex]);
			userIndex++;
			super.run();
		}
	}
}
