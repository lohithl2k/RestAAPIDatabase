package database;

//
import java.sql.Connection;
import java.sql.SQLException;

import org.apache.tomcat.dbcp.dbcp2.BasicDataSource;

public class Databasedb {
	
	public static  BasicDataSource ds = new BasicDataSource();
		//Logger logger = (Logger) LoggerFactory.getLogger(getClass());

	static {	
		ds.setDriverClassName("com.mysql.jdbc.Driver");
	    ds.setUrl("jdbc:mysql://localhost:3306/demoDb?autoReconnect=true&useSSL=false");
	    ds.setUsername("root");
	    ds.setPassword("sHj@6378#jw"); 
	    ds.setMinIdle(10);
	    ds.setMaxIdle(20);
	    ds.setMaxOpenPreparedStatements(100);
	   }

public static Connection getConnection() throws SQLException {
	
	return ds.getConnection();
}	
	public Databasedb(){} 

	}