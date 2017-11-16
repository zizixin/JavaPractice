package zizixin.JavaPractice.designPattern.commandPattern;

public class Something {

	public String name="something";
	
	public Something(String name){
		this.name = name;
	}
	
	public void buy(){
		System.out.println("buy"+this.name);
	}
	
	public void sell(){
		System.out.println("sell"+this.name);
	}
	
}
