package com.decorator.model;

import com.decorator.design.IWebPage;

/**
 * @author Lohit Barki
 *
 * lohit.barki15@gmail.com
 */
public class SimpleWebPage implements IWebPage{

	private String html = "";
	private String style = "";
	private String script = "";
	
	@Override
	public void dispaly() {
		System.out.println("Simple WebPage.. : " + html + style + script);
	}
	
}
