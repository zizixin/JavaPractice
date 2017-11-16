package zizixin.JavaPractice.designPattern.mementoPattern;

public class Original {

	private String state;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	public Original(String state){
		this.state = state;
	}
	
	public Memento saveStateToMemento(){
		return new Memento(this.state);
	}
	
	public void getStateFromMemento(Memento memento){
		this.state = memento.getState();
	}
	
}
