package zizixin.JavaPractice.multiThread.ticket;

import java.util.ArrayList;
import java.util.List;

public class TicketGenerate implements Generater<Ticket,TicketSeed>{


	public List<Ticket> GeneraterListBySeed(TicketSeed seed) {
		List<Ticket> tickets = new ArrayList<>(seed.getNumber());
		
		for(int i=1;i<seed.getNumber();i++){
			Ticket ticket = new Ticket();
			ticket.setTickid(i);;//设置carID
			ticket.setTicketNumber(seed.getPatchNumber()+"-"+i);//票据批号生成方式
			ticket.setCarId(seed.getCarId());//设置carId
			tickets.add(ticket);
		}
		
		return tickets;
	}


}
