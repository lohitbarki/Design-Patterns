package com.singleton.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.singleton.constants.Constants;

/**
 * @author Lohit Barki
 *
 * lohit.barki15@gmail.com
 */
public class ConnectionInstance {
	
	private static ConnectionInstance instance = null;
	
	private ConnectionInstance() {
		
	}
	
	// making thread safe
	public static ConnectionInstance getConnInstance() {
		if(instance == null) {
			synchronized (ConnectionInstance.class) {
				if(instance == null) {
					instance = new ConnectionInstance();
				}
			}
		}
		return instance;
	}
	
	// create jdbc connection 
	private static Connection getConnection() throws SQLException, ClassNotFoundException {
		Connection conn=null;  
        
		Class.forName(Constants.DRIVER_CLASS);  
        conn= DriverManager.getConnection(Constants.JDBC_URL, "lhb", "Code12#");  
        return conn; 
	}
	
	public void view(String city) throws SQLException {
		Connection conn = null;
		PreparedStatement preStmt = null;
		ResultSet resSet = null;
		
		try {
			conn = ConnectionInstance.getConnection();
			preStmt = conn.prepareStatement("select * from Person where city = ?");
			preStmt.setString(1, city);
			resSet = preStmt.executeQuery();
			
			while(resSet.next()) {
				System.out.println("Name : " + resSet.getString(2) + "\t" + "Age : " + resSet.getInt(3));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			if(resSet != null) {
				resSet.close();
			}
			if(preStmt != null) {
				preStmt.close();
			}
			if(conn != null) {
				conn.close();
			}
		}
	}
}
