package exam05;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class PrintAnnotationTest {

	public static void main(String[] args) {
//		Service service = new Service();
//		service.method1();
		
		//어노테이션은 정보 전달 역할이므로 해당 클래스의 정보를 반영하는 리플렉션 방법으로 확인해야함
	System.out.println(Service.class);
	
	Annotation annotations[] = Service.class.getDeclaredAnnotations();
	
	for (Annotation ano : annotations) {
		
		System.out.println(ano.annotationType());
	}
	
	System.out.println("=============================");
	
	Method methods[]=Service.class.getDeclaredMethods();
for (Method method : methods) {
		
		System.out.println(method.getAnnotation(PrintAnnotation.class));
	}
	
	
	}

}
