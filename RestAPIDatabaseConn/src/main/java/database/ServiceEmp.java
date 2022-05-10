package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ServiceEmp {	
	
		  List<Employees> emplist=new ArrayList<Employees>();
		  
		  public List<Employees> test() throws SQLException
		  {
			 String query="SELECT * FROM DEMODB.EMPLOYEE WHERE EMPID=1;";
		    // connect();
			 Employees es=new Employees();
			 Connection con=Databasedb.ds.getConnection();
		     PreparedStatement ps=con.prepareStatement(query);
	         ResultSet rs=ps.executeQuery();
		      while(rs.next()) {
			       es.setEmpID(rs.getInt(1));
			       es.setEmpname(rs.getString(2));
			       es.setEmpAge(rs.getInt(3));
			       es.setEmpDept(rs.getString(4));
			       es.setEmpEmail(rs.getString(5));
		      }
		     emplist.add(es);
		     return emplist;
		  }
		  
		  public List<Employees> getemp(int empid) throws SQLException{
			 String query="SELECT * FROM DEMODB.EMPLOYEE WHERE EMPID="+empid+";";
			 Employees es=new Employees();
		   // Class.forName("com.mysql.jdbc.Driver"); //: java.lang.ClassNotFoundException: com.mysql.jdbc.Driver;
	      // Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demoDB?useSSL=false&allowPublicKeyRetrieval=true","root","sHj@6378#jw");
			 Connection con=Databasedb.ds.getConnection();
		     PreparedStatement ps=con.prepareStatement(query);
	         ResultSet rs=ps.executeQuery();
		      while(rs.next()) {
			       es.setEmpID(rs.getInt(1));
			       es.setEmpname(rs.getString(2));
			       es.setEmpAge(rs.getInt(3));
			       es.setEmpDept(rs.getString(4));
			       es.setEmpEmail(rs.getString(5));
		      } 
		     emplist.add(es);
		     return emplist;
		  }
		  public void create(Employees e1) {
			  String iquery="insert into  DEMODB.EMPLOYEE values(?,?,?,?,?)";
			  
			   try {
				   Connection con=Databasedb.getConnection();
				   PreparedStatement ps=con.prepareStatement(iquery);
				   ps.setInt(1,e1.getEmpID() );
				   ps.setString(2, e1.getEmpname());
				   ps.setInt(3, e1.getEmpAge());
				   ps.setString(4, e1.getEmpDept());
				   ps.setString(5, e1.getEmpEmail());
				   ps.executeUpdate();
				   }
			   
				   catch(Exception e) {
					   System.out.println(e);
				   }
		  }
	      public void update(Employees e1) {
			  String uquery="update DEMODB.EMPLOYEE set EmpName=? where empid=?;";
					  try {
						Connection con=Databasedb.getConnection();
						PreparedStatement ps=con.prepareStatement(uquery);
						
						ps.setString(1,e1.getEmpname());
						ps.setInt(2, e1.getEmpID());
						ps.executeUpdate();
						
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						System.out.println(e);
					}
		  }       
//		  public void delete(Employees e1) {
//			  String squery="DELETE FROM DEMODB.EMPLOYEE WHERE EMPID=?;";
//			  try {
//				Connection con=Databasedb.getConnection();
//				PreparedStatement ps=con.prepareStatement(squery);
//				ps.setInt(1, e1.getEmpID());
//				ps.executeUpdate();
//			} catch (SQLException e) {
//				// TODO Auto-generated catch block
//				System.out.println(e);
//			}  
//		  }
	          public void delete(int empid) {
	        	  String dquery="DELETE FROM DEMODB.EMPLOYEE WHERE EMPID="+empid+";";
	        	  try {
					Connection con=Databasedb.getConnection();
				    PreparedStatement ps=con.prepareStatement(dquery);
				    ps.executeUpdate();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	        	  
	          }
	  }
