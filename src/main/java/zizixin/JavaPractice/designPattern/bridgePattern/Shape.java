package zizixin.JavaPractice.designPattern.bridgePattern;

public abstract class Shape {

	protected DrawApi drawApi;
	
	public Shape(DrawApi drawApi){
		this.setDrawApi(drawApi);
	}
	
	public abstract void draw();

	public DrawApi getDrawApi() {
		return drawApi;
	}

	public void setDrawApi(DrawApi drawApi) {
		this.drawApi = drawApi;
	}
	
}
