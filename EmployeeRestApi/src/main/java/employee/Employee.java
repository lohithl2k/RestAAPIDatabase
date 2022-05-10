package employee;

import java.net.HttpURLConnection;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement 
public class Employee {
	
	private String EmpName;
	private int Empid;
	private String Empdept;
	
	public Employee(){
		
	}
	public Employee(String empName, int empid, String empdept) {
		super();
		this.EmpName = empName;
		this.Empid = empid;
		this.Empdept = empdept;
	}

	public String getEmpName() {
		return EmpName;
	}

	public void setEmpName(String empName) {
		EmpName = empName;
	}

	public int getEmpid() {
		return Empid;
	}

	public void setEmpid(int empid) {
		Empid = empid;
	}

	public String getEmpdept() {
		return Empdept;
	}

	public void setEmpdept(String empdept) {
		Empdept = empdept;
	}
	
}
