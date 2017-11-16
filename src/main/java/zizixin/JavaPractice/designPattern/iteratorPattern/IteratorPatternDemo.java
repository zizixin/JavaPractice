package zizixin.JavaPractice.designPattern.iteratorPattern;

import zizixin.JavaPractice.designPattern.Demo;

public class IteratorPatternDemo implements Demo{

	@Override
	public void show() throws Exception {
		NameRepository names = new NameRepository();
		Iterator<String> iterator = names.getIterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
	}

	public static void main(String[] args) {
		try {
			new IteratorPatternDemo().show();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
