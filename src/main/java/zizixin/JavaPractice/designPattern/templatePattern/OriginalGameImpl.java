package zizixin.JavaPractice.designPattern.templatePattern;

public class OriginalGameImpl extends Game{

	public String name;
	
	public OriginalGameImpl(String name){
		this.name = name;
	}
	
	@Override
	public void init() {
		System.out.println(this.name+"game init");
	}

	@Override
	public void startPlay() {
		System.out.println(this.name+"game start");
	}

	@Override
	public void endPlay() {
		System.out.println(this.name+"game end");
	}

}
