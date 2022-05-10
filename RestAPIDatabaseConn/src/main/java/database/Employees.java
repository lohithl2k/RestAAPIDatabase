package database;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Employees {
	
	private int empID;
	private String empname;
	private int empAge;
	private String empDept;
	private String empEmail;
	
	public Employees() {
	
	}	
	
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empName) {
		this.empname = empName;
	}
	public int getEmpAge() {
		return empAge;
	}
	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}
	public String getEmpDept() {
		return empDept;
	}
	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}
	public String getEmpEmail() {
		return empEmail;
	}
	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}
	
	
}
