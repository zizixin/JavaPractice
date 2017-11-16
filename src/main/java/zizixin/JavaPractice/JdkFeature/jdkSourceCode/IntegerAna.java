package zizixin.JavaPractice.JdkFeature.jdkSourceCode;

import java.util.HashMap;

import javax.swing.plaf.synth.SynthSpinnerUI;

/**
 * @author zizixin
 * what I need to say is that ana means Analysis
 */
public class IntegerAna {

	public static void main(String[] args) {
		
		Class<Integer> type = Integer.TYPE;
		System.out.println(type);
		
		
		Integer test = 1000;
		System.out.println(test.getClass());
		
		Integer testTwo = 1000;
		System.out.println(test==testTwo);
		
		Integer testThree = new Integer(1000);
		
		System.out.println(test==testThree);
		
		Integer testSmallValue = 1;
		System.out.println(testSmallValue.getClass());
		
		Integer testTwoSmallValue = 1;
		System.out.println(testSmallValue==testTwoSmallValue);
		
		Integer testThreeSmallValue  = new Integer(1);
		
		System.out.println(testSmallValue==testThreeSmallValue);
		
		//In jdk Integer has do cache in -127-128 value
		
		
		Object obj = new IntegerAna();
		
		HashMap<String,Object> mapTest = new HashMap<>();
		mapTest.put("keyOne", new Object());
		
		System.out.println(mapTest);
	}
}
