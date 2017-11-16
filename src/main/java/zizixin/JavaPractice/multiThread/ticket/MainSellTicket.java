package zizixin.JavaPractice.multiThread.ticket;

import java.util.Collections;

public class MainSellTicket {

	public static void main(String[] args) throws InterruptedException {
		
		final TicketSellerProgress ticketSellerProgress = new TicketSellerProgress(new TicketGenerate().GeneraterListBySeed(new TicketSeed("20170302",22,20)));//一个卖票progress
		
		TicketSellerClient clientOne = new TicketSellerClient("clientOne",ticketSellerProgress);
		
		TicketSellerClient clientTwo = new TicketSellerClient("clientTwo",ticketSellerProgress);
		
		TicketSellerClient clientThree = new TicketSellerClient("clientThree",ticketSellerProgress);
		
		Collections.synchronizedList(Collection.indexList);
		
		new TicketSellerClientThread(clientOne,3).start();
		new TicketSellerClientThread(clientTwo,3).start();
		new TicketSellerClientThread(clientThree,3).start();
		
		Thread.sleep(3000);
		java.util.Collections.sort(Collection.indexList);
		System.out.println(Collection.indexList.toString());
		try {
		
			//Collection.judgeDuplicate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
