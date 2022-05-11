package database;

import java.sql.SQLException;

import java.util.List;

import javax.ws.rs.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/emps")
public class EmployeeResource 
{	
      ServiceEmp s=new ServiceEmp();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
	public List<Employees> getAllEmp()throws SQLException
    {                                                                           
    	return s.test();
	}
    
    @GET
    @Path("/{empid}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Employees> getOne(@PathParam("empid")int empid) throws SQLException{
    	return s.getemp(empid);
    }
    
    @POST
    @Path("{emp}")
    @Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
    public Employees create(Employees e1) {
    	System.out.println(e1);
    	 s.create(e1);
    	 return e1;
    } 
    
    @PUT
    @Path("{empu}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Employees updateEmp(Employees e1) {
    	s.update(e1);
    	return e1;
    }
    
//    @DELETE 
//    @Path("/{empd}")
//    @Produces(MediaType.APPLICATION_JSON)
//    public void deleteEmp(Employees e1) {
//    	s.delete(e1);
//    }
    
    @DELETE
    @Path("/{empid}")
    @Produces(MediaType.APPLICATION_JSON)
    public void deleteemp(@PathParam("empid")int empid) {
         s.delete(empid);
    }   
}
