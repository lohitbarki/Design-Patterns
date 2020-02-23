package com.decorator.model;

import com.decorator.design.IWebPage;
import com.decorator.design.WebPageDecorator;

/**
 * @author Lohit Barki
 *
 * lohit.barki15@gmail.com
 */
public class AuthorizerPage extends WebPageDecorator{

	public AuthorizerPage(IWebPage page) {
		super(page);
	}

		
	public void authorize() {
		System.out.println("Authorizing..");
	}
	
	@Override
	public void dispaly() {
		super.display();
		authorize();
	}

}
