package zizixin.JavaPractice.multiThread.ticket;

/**
 * @author zizixin
 * 生成一沓车票需要的三个要素，票批次，票数量，车号
 *
 */
public class TicketSeed implements Seed{

	private String patchNumber;
	
	private int carId;
	
	private int number;
	
	public String getPatchNumber() {
		return patchNumber;
	}

	public void setPatchNumber(String patchNumber) {
		this.patchNumber = patchNumber;
	}

	public int getCarId() {
		return carId;
	}

	public void setCarId(int carId) {
		this.carId = carId;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	public TicketSeed(String patchNumber,int carId,int number){
		this.patchNumber = patchNumber;
		this.carId = carId;
		this.number = number;
	}
	
}
