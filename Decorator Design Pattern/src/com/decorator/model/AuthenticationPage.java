package com.decorator.model;

import com.decorator.design.IWebPage;
import com.decorator.design.WebPageDecorator;

/**
 * @author Lohit Barki
 *
 * lohit.barki15@gmail.com
 */
public class AuthenticationPage extends WebPageDecorator{

	public AuthenticationPage(IWebPage page) {
		super(page);
	}

	public void authenticate() {
		System.out.println("Authenticating..");	
	}
	
	@Override
	public void dispaly() {
		super.display();
		authenticate();
	}

}
