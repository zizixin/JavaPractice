package zizixin.JavaPractice.designPattern.proxyPattern;

public class RealImage implements Image{

	public String fileName;
	
	public RealImage(String fileName){
		this.fileName = fileName;
	}
	
	@Override
	public void disPlay() {
		System.out.println("dispaly"+this.fileName);
	}

	public void loadImage(String fileName){
		System.out.println("load"+this.fileName);
	}
}
