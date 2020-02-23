package com.decorator.design;

/**
 * @author Lohit Barki
 *
 * lohit.barki15@gmail.com
 */
public abstract class WebPageDecorator implements IWebPage{
	
	private IWebPage webPage;
	
	public WebPageDecorator(IWebPage page) {
		this.webPage = page;
	}
	
	public void display() {
		this.webPage.dispaly();
	}
}
