package configurationFiles;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import pojo.Employee;

@Configuration
public class applicationConfiguration {
	
	@Bean
	public Employee emp1() { //Here method name i.e emp1 will be by default bean name
		Employee emp = new Employee();		
		emp.setName("Amit");
		emp.setSalary(50000);
		emp.setEmpId(1234);		
		return emp;
	}
}












