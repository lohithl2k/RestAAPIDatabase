package employee;

import java.util.List;
//import javax.websocket.server.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.PathParam;


@Path("/emp") 
public class EmployeeResource {
	
	EmployeeService es=new EmployeeService();
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	
     public List<Employee> getAllEmployees()
     {
		return  es.getAEmployees();
     }
//	@POST
//	@Path("/{string}")
//	@Produces(MediaType.TEXT_PLAIN)
//	public String getString(@PathParam("string") String string)
//	{
//		return "Got path pharm"+ string ;
//	}
	@GET
	@Path("/{empid}")
	@Produces(MediaType.APPLICATION_JSON)
	public Employee test(@PathParam("empid")int id) {
		return es.getEmployee(id);
	}	
	@POST
	@Path("/{empid}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Employee addingEmployees(Employee employee) {
		return  es.addEmployees(employee);
	}	
	@PUT      
	@Path("/{empid}")
	//@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Employee updatingEmployees(@PathParam("empid")int id,Employee employee) {
		 employee.setEmpid(id);
	     return es.updateEmployee(employee);
	}
	@DELETE
	@Path("/{empid}")
	@Produces(MediaType.APPLICATION_JSON)
	public void deleteEmployee(@PathParam("empid")int id) {
	    es.removeEmployee(id);
	}
}








