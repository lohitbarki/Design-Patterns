package com.adapter.core;

import com.adapter.design.Pen;
import com.adapter.design.PenAdapter;
import com.adapter.model.Assignment;

/**
 * @author Lohit Barki
 *
 * lohit.barki15@gmail.com
 */
public class StartAssignment {
	
	public static void main(String[] args) {
		
		Assignment assignMent = new Assignment();
		
		//Need pen to write assignment
		Pen p = new PenAdapter();
		assignMent.setPen(p);
		assignMent.writeAssignment("Welcome to adapter pattern!!");
	}
}
