package zizixin.JavaPractice.JdkFeature;

public class CloneTest implements Cloneable{

	
	public static void main(String[] args) {
		try {
			CloneTest origin = new CloneTest();
			System.out.println(origin.toString());
			
			Object copyOne = origin.clone();
			System.out.println(copyOne.toString());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
