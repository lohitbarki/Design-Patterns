package com.pool.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author Lohit Barki
 *
 * lohit.barki15@gmail.com
 */
public class JDBCConnectionPool extends ObjectPool<Connection>{
	
	String dsn, user, password; 
	  
    public JDBCConnectionPool(String driver, String dsn, String usr, String pwd) { 
        super(); 
        try { 
            Class.forName(driver).newInstance(); 
        } 
        catch (Exception e) { 
            e.printStackTrace(); 
        } 
        this.dsn = dsn; 
        this.user = usr; 
        this.password = pwd; 
    } 
  
    Connection create() { 
        try { 
            return (DriverManager.getConnection(dsn, user, password)); 
        } 
        catch (SQLException e) { 
            e.printStackTrace(); 
            return (null); 
        } 
    } 
  
    void dead(Connection o){ 
        try { 
            ((Connection)o).close(); 
        } 
        catch (SQLException e) { 
            e.printStackTrace(); 
        } 
    } 
  
    boolean validate(Connection o) { 
        try { 
            return (!((Connection)o).isClosed()); 
        } 
        catch (SQLException e) { 
            e.printStackTrace(); 
            return (false); 
        } 
    } 

}
