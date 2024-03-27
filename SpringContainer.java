package springContainer;

import pojo.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import configurationFiles.applicationConfiguration;

public class SpringContainer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String config_file = "configurationFiles/applicationConfiguration.xml";
		
//		ApplicationContext context = new ClassPathXmlApplicationContext(config_file); ---> For XML Config file
		ApplicationContext context = new AnnotationConfigApplicationContext(applicationConfiguration.class); //---> for Java config file
		
		Employee emp = (Employee) context.getBean("emp1");
//		Employee emp1 = (Employee) context.getBean("emp2");
		
		emp.display();
		System.out.println();
//		emp1.display();
	}

}
