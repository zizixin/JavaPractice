package zizixin.JavaPractice.designPattern.templatePattern;

/**
 * @author zizixin
 * this in abstract means extends class instance  
 */
public abstract class Game {

	protected abstract void init();
	
	protected abstract void startPlay();
	
	protected abstract void endPlay();
	
	/**
	 *  main template
	 */
	final public void play(){
		this.init();
		
		this.startPlay();
		
		this.endPlay();
	}
}
