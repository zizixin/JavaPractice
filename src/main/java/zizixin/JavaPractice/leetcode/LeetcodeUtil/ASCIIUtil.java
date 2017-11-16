package zizixin.JavaPractice.leetcode.LeetcodeUtil;

public class ASCIIUtil {

	
	public static void main(String[] args) {
		
		byte aByte = '1';
		
		char bChar = '1';
		
		byte cByte = (byte) bChar;
		
		System.out.println("abyte:"+aByte+"bChar:"+bChar+"cByte:"+cByte);
		
		Byte byteTest = '1';
		
		System.out.println(byteTest.toString());
		
		Character charactorTest = '1';
		
		//through experience,Character will retun character ascii value,so if want ascii value,usr char as a briage
	}
	
//	public static Integer ToASCIIValue(String targetValue) throws Exception{
//		if(targetValue.length()!=1){
//			throw new Exception("targetValue string length must equil 1");
//		}
//	}
	
}
