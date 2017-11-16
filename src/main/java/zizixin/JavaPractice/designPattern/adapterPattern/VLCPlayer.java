package zizixin.JavaPractice.designPattern.adapterPattern;

public class VLCPlayer implements AdvanceMediaPlay{

	@Override
	public void playVLC(String fileName) {
		System.out.println("play VLC file:"+fileName);
	}

	@Override
	public void playMp4(String fileName) {
		
	}

}
