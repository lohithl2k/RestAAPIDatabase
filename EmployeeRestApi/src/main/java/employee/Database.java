package employee;

import java.util.HashMap;
import java.util.Map;

public class Database {
      
	
	private static Map<Integer, Employee> employees=new HashMap<>();
	
	public static Map<Integer, Employee> getAllEmployees(){
		return employees;
	}
}
