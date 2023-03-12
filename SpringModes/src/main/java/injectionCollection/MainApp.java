package injectionCollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("injectionCollection/Beans.xml");
		JavaCollection j = (JavaCollection) context.getBean("javaCollection");
		j.getAddressList();
		j.getAddressSet();
		j.getAddressMap();
		j.getAddressProp();
		
	}

}
