package zizixin.JavaPractice.annotation.myAnnotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(value = {ElementType.TYPE})
public @interface TestAnnotation {

}
