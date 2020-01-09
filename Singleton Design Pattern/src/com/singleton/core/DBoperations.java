package com.singleton.core;

import java.sql.SQLException;

import com.singleton.model.ConnectionInstance;

/**
 * @author Lohit Barki
 *
 * lohit.barki15@gmail.com
 */

/*
 * Demo on using singleton pattern for DB operations
 */

public class DBoperations {
	public static void main(String[] args) {
		ConnectionInstance connInstance = ConnectionInstance.getConnInstance();
		try {
			connInstance.view("Bangalore");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
