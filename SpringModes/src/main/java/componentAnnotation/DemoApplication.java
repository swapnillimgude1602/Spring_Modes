package componentAnnotation;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class DemoApplication {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();		//Annotation based spring context
		context.scan("componentAnnotation");
		//context.refresh();

		ComponentDemo componentDemo =(ComponentDemo) context.getBean(ComponentDemo.class);		//Getting the Bean from the component class 
		componentDemo.demoFunction();
		context.close();
	}
}