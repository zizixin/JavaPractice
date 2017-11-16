package zizixin.JavaPractice.multiThread.ticket;

public class TicketSellerClient {

	private String clientName;
	
	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	private TicketSellerProgress ticketSellerProgress;
	
	public TicketSellerClient(String clientName,TicketSellerProgress ticketSellerProgress){
		this.clientName = clientName;
		this.ticketSellerProgress = ticketSellerProgress;
	}
	
	public void sell(int userid){
		try {
			Ticket ticket = this.ticketSellerProgress.sellTicket(userid);
			System.out.println(this.clientName + " sell "+ ticket.getTickid() +" to "+ticket.getUserId());
			System.out.println(this.clientName+" : "+ticket.getTickid());
			Collection.indexList.add(ticket.getTickid());
			System.out.println("for debug!"+ticket.getTickid());
			System.out.println(Collection.indexList);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
