package zizixin.JavaPractice.multiThread.ticket;

import java.util.List;

public class TicketSellerProgress {

	private int number;
	
	private List<Ticket> tickets;
	
	public TicketSellerProgress(List<Ticket> tickets){
		this.number = tickets.size();
		this.setTickets(tickets);
	}
	
	public  synchronized Ticket sellTicket(int userId) throws Exception{
		if(userId == 0) throw new Exception("illegal user");
		if(this.number == 0) throw new Exception("no ticket anymore!");
		Ticket progressTicket = this.tickets.get(this.number - 1);
		/*
		 * 分析，如果一个线程执行到这里，progressTicket 还未赋值，有线程进来，函数压栈
		 * 第二个线程入栈，取出progress 另外一个线程进入，函数压栈 未执行number--
		 * 第三个线程入栈，取出progressTicket 执行完毕，返回progressTicket
		 * 回到第一个线程，线程得到的票是以前没有卖出过的票，不会出现异常
		 * 切换至第二个线程，progressTicket已经卖出，但是重新卖出一次，外面再次接收这个引用，出现一票两卖
		 * 
		 * 
		 * */
		Thread.sleep(10);//在这里添加可以查看线程同步的重要性,加上这个，也间接的让add things to Collection.indexList 能够同步，可以自己画图看一下，就比较清晰了，前提是需要加上同步
		progressTicket.setUserId(userId);
		this.number--;
		//Thread.sleep(1000);
		return progressTicket;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public List<Ticket> getTickets() {
		return tickets;
	}

	public void setTickets(List<Ticket> tickets) {
		this.tickets = tickets;
	}
}
