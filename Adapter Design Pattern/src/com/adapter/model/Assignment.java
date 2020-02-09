package com.adapter.model;

import com.adapter.design.Pen;

/**
 * @author Lohit Barki
 *
 * lohit.barki15@gmail.com
 */
public class Assignment {
	
	private Pen pen;
	
	public Pen getPen() {
		return pen;
	}

	public void setPen(Pen pen) {
		this.pen = pen;
	}


	public void writeAssignment(String val) {
		pen.write(val);
	}
}
