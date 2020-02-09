package com.pool.core;

import java.sql.Connection;

import com.pool.model.JDBCConnectionPool;

/**
 * @author Lohit Barki
 *
 * lohit.barki15@gmail.com
 */
public class InitConnection {
	
	public static void main(String[] args) {
		
		JDBCConnectionPool pool = new JDBCConnectionPool( 
            "org.hsqldb.jdbcDriver", "jdbc:hsqldb: //localhost/lhbDB", 
            "sa", "password"); 
  
        Connection con = pool.takeOut(); 
        
        pool.takeIn(con);
	}
}
