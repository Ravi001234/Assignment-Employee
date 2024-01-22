package usingConfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import java.util.List;
public class Config {
	public static void main(String[] args) {
		EmployeeServices es=new EmployeeServices();
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(EmpConfiguration.class);
		EmployeeServices employeeDAO=context.getBean(EmployeeServices.class);
		Employee employee=new Employee(3,"Ravi",21,"developer",50000);
 	   es.createEmployee(employee);
 	   employee=new Employee(2,"Ram",30,"Developer",55032);
 	   es.createEmployee(employee);
 
 	   Employee getEmployee=es.viewEmployee(2);
 	   System.out.println(getEmployee);
 	   
 	   Employee updatedEmployee=new Employee(4,"Prasanna",35,"tester",70023);
 	   es.updateEmployee(updatedEmployee);
 	   
 	   es.removeEmployee(2);
 	  
 	   List<Employee> list=es.getEmployeeList();
 	   System.out.println("list of employees:");
 	   for(Employee e:list) {
 		   System.out.println(e);
 	   }
}
}
