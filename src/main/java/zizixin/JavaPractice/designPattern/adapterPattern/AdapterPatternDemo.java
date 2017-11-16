package zizixin.JavaPractice.designPattern.adapterPattern;

import zizixin.JavaPractice.designPattern.Demo;

public class AdapterPatternDemo implements Demo{

	@Override
	public void show() throws Exception {
		String mp3file = "i am a mp3 file";
		
		String mp4File = "a am a mp4 file";
		
		String vLCFile = "i am a VLC file";
		
		MediaPlay mp3Play = new Mp3Player();
		mp3Play.play("Mp3", mp3file);
		mp3Play.play("Mp4", mp4File);
		mp3Play.play("VLC", vLCFile);
	}

}
