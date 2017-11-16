package zizixin.JavaPractice.multiThread.ticket;

/**
 * @author zizixin
 *
 */
public class Ticket {

	
	/**
	 * 票内部票号
	 */
	private int tickid;
	/**
	 * 票号
	 */
	private String ticketNumber;
	
	/**
	 * 票批次
	 */
	private String ticketBatch;
	
	/**
	 * 售卖人员，为零表示未售卖，-1表示退票
	 */
	private int userId;
	
	
	/**
	 * 车号
	 */
	private int carId;


	public int getTickid() {
		return tickid;
	}


	public void setTickid(int tickid) {
		this.tickid = tickid;
	}


	public String getTicketNumber() {
		return ticketNumber;
	}


	public void setTicketNumber(String ticketNumber) {
		this.ticketNumber = ticketNumber;
	}


	public String getTicketBatch() {
		return ticketBatch;
	}


	public void setTicketBatch(String ticketBatch) {
		this.ticketBatch = ticketBatch;
	}


	public int getUserId() {
		return userId;
	}


	public void setUserId(int userId) throws InterruptedException {
		this.userId = userId;
	}


	public int getCarId() {
		return carId;
	}


	public void setCarId(int carId) {
		this.carId = carId;
	}
	
}
