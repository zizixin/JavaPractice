package zizixin.JavaPractice.designPattern.adapterPattern;

/**
 * @author zizixin
 * 使用适配器，需要在使用的时候动态初始化，这个在实现过程中，觉得比较别扭的一点
 */
public class MediaAdapter implements MediaPlay{

	public AdvanceMediaPlay advanceMediaPlay;
	
	public MediaAdapter(String mediaType){
		if(mediaType.equals("VLC")){
			this.advanceMediaPlay = new VLCPlayer();
		}else if(mediaType.equals("Mp4")){
			this.advanceMediaPlay = new Mp4Player();
		}
	}
	
	@Override
	public void play(String mediaType, String fileName) {
		if(mediaType.equals("VLC")){
			this.advanceMediaPlay.playVLC(fileName);
		}else if(mediaType.equals("Mp4")){
			this.advanceMediaPlay.playMp4(fileName);
		}
	}

}
