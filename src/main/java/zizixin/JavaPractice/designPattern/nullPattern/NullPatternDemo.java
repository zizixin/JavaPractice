package zizixin.JavaPractice.designPattern.nullPattern;

import zizixin.JavaPractice.designPattern.Demo;

public class NullPatternDemo implements Demo{

	
	@Override
	public void show() throws Exception {
		String[] names = {"perosnA","personD","personC"};
		for(String name:names){
			System.out.println(new TargetFactory().getTarget(name).getName());
		}
	}

	public static void main(String[] args) {
		try {
			new NullPatternDemo().show();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
