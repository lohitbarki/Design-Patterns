package com.adapter.design;

import com.adapter.model.BallPen;

/**
 * @author Lohit Barki
 *
 * lohit.barki15@gmail.com
 */

// This is a adapter to use BallPen 
public class PenAdapter implements Pen{

	private BallPen ballPen = new BallPen();
	
	@Override
	public void write(String val) {
		ballPen.type(val);
	}

}
