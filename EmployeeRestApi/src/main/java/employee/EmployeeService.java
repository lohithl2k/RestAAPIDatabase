package employee;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeService {
	
	private Map<Integer, Employee> employees=Database.getAllEmployees();//new
	public  EmployeeService() {
		employees.put(1, new Employee("Abc", 1, "Devolopment"));
		employees.put(2, new Employee("xyz", 2, "Networking"));
	}
///	List<Employee> list=new ArrayList<>();
	public List<Employee> getAEmployees()
	{
//		Employee e1=new Employee("Abc", 101,"Devolopment");
//		Employee e2=new Employee("Xyz", 102, "Production");
//		Employee e3=new Employee("abcd", 103, "Networking");
//		
//		//List<Employee> list=new ArrayList<>();
//		list.add(e1);
//		list.add(e2);
//		list.add(e3);
		System.out.println(employees.size());
		return new ArrayList<Employee>(employees.values());		 
		//return list;
	}
	public Employee getEmployee(int id){ 
		 return employees.get(id);
	}
	
	public  Employee addEmployees(Employee employee) {		
		//System.out.println(employees.size());	
		employee.setEmpid(employees.size() + 1);
		employees.put(employee.getEmpid(), employee);
		return employee;
	}
	
	 public Employee updateEmployee(Employee employee) {
     	if(employee.getEmpid() <= 0) {
			  return null;
		  }

		      employees.put(employee.getEmpid(), employee);
		      return employee;
		  }
	
	  public Employee removeEmployee(int id) {
	 	return employees.remove(id);
	   }
}
