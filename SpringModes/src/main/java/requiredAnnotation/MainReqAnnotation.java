package requiredAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainReqAnnotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("requiredAnnotation/application-context.xml");
		
		Student s = (Student) context.getBean("stud");
		System.out.println("id:"+s.getId());
		System.out.println("name:"+s.getName());
		
		

	}

}
