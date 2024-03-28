package exam05;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//이 어노테이션을 어디에 사용할 것인가(대상, target)
@Target(ElementType.METHOD)
//@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME) //자바에서 컴파일 하는 과정(
public @interface PrintAnnotation {

	
	//요소(element): 속성명과 속성값 / value가 속성명 default가 타입 "-"가 속성값
	String value() default "-";
	
	int name() default 15;
	
}
