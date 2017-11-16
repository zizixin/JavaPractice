package zizixin.JavaPractice.annotation.myAnnotation;

import java.lang.annotation.Annotation;

@TestAnnotation
public class AnnotationTest {

	
	static{
		AnnotationTest test = new AnnotationTest();
		System.out.println(test.toString());
	}
	
	public static void main(String[] args) {
		
		
		try {
			Class.forName("zizixin.JavaPractice.annotation.myAnnotation.AnnotationTest");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		AnnotationTest.class.getAnnotatedInterfaces();
		Annotation[] annotations = AnnotationTest.class.getAnnotations();
		AnnotationTest.out(annotations.length);
		AnnotationTest.class.getAnnotations();
		System.out.println("for debug!");
	}
	
	public static void out(Object obj){
		System.out.println(obj.toString());
	}
}
