package zizixin.JavaPractice.JdkFeature.generic;

/**
 * @author zizixin
 *
 * @param <T>
 * next is java s grammer,implements a interface with generic,you should give it a instance or a appropriate generic in now class
 */
public class GenericExtentLevelTwoAndLevelOne<T extends Comparable<T>> implements GenericExtendLevelOne<T>{

	@Override
	public T getT() {
		// TODO Auto-generated method stub
		return null;
	}

//	public class TempInnerTest implements GenericExtendLevelOne<T extends Comparable<T>>{
//		
//	}
	
}
