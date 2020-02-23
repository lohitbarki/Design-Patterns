package com.decorator.core;

import com.decorator.design.IWebPage;
import com.decorator.model.AuthenticationPage;
import com.decorator.model.AuthorizerPage;
import com.decorator.model.SimpleWebPage;

/**
 * @author Lohit Barki
 *
 * lohit.barki15@gmail.com
 */
public class StartBrowse {
	
	public static void main(String[] args) {
		
		IWebPage page = new SimpleWebPage();
		page = new AuthenticationPage(page);
		page = new AuthorizerPage(page);
		
		page.dispaly();
		
	}
}
