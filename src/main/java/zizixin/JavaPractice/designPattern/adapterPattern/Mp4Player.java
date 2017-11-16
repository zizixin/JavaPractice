package zizixin.JavaPractice.designPattern.adapterPattern;

public class Mp4Player implements AdvanceMediaPlay{

	@Override
	public void playVLC(String fileName) {
	}

	@Override
	public void playMp4(String fileName) {
		System.out.println("play mp4 file:"+fileName);
	}

}
