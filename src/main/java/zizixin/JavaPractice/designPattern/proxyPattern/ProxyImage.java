package zizixin.JavaPractice.designPattern.proxyPattern;

/**
 * @author zizixin
 * 和装饰模式的区别是，这个被代理类目前这个列子是后期new 出来的
 */
public class ProxyImage implements Image{

	public ProxyImage(String fileName){
		this.realImage = new RealImage(fileName);
	}
	
	public RealImage realImage;
	
	@Override
	public void disPlay() {
		System.out.println("this is Proxy method!");
		this.realImage.disPlay();
	}

}
