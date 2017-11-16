package zizixin.JavaPractice.designPattern.templatePattern;

import zizixin.JavaPractice.designPattern.Demo;

public class TemplatePatternDemo implements Demo{

	@Override
	public void show() throws Exception {
		new OriginalGameImpl("football").play();
		new OriginalGameImpl("basketball").play();
	}

	public static void main(String[] args) {
		try {
			new TemplatePatternDemo().show();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
