package zizixin.JavaPractice.designPattern.adapterPattern;

/**
 * @author zizixin
 * 适配器和装饰器的不同是，构造函数不用动态的传入 适配器，适配器的初始化是在代码中初始化的，装饰器是动态传入对象进行装饰
 */
public class Mp3Player implements MediaPlay{

	private MediaAdapter mediaAdapter;
	
	@Override
	public void play(String mediaType, String fileName) {
		if(mediaType.equals("Mp3")){
			System.out.println("play mp3 ,file:"+fileName);
		}
		else if(mediaType.equals("VLC")||mediaType.equals("Mp4")){
			this.mediaAdapter = new MediaAdapter(mediaType);//动态选择相应的适配器
			this.mediaAdapter.play(mediaType, fileName);
		}else{
			System.out.println("can not play now file format");
		}
		
	}

}
