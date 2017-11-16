package zizixin.JavaPractice.getPlace;

public class JavaScriptBracketTest {
	{
		String a = "10";
		{
			System.out.println(a);
			//System.out.println(b);
			{
				String b = "12";
			}
		}
	}
	
	public static void main(String[] args) {
		new JavaScriptBracketTest();
	}
}
