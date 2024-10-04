package com.e2eTest.automation.page_objects;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


import com.e2eTest.automation.utils.BasePage;
import com.e2eTest.automation.utils.Setup;
public class PageHome extends BasePage{

	
	/*Retrieve element*/ 
	@FindBy(how = How.XPATH,using="/html[1]/body[1]/div[1]/div[1]/div[1]/aside[1]/nav[1]/div[2]/ul[1]/li[1]/a[1]")
	private static WebElement admin;
	@FindBy(how = How.XPATH,using="/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]")
	private static WebElement username;
	@FindBy(how = How.XPATH,using="//button[@type=\"submit\"]")
	private static WebElement btnSearch;


	public PageHome() {
		super(Setup.getDriver());
	
	}
	












	public static WebElement getAdmin() {
		
		return admin;
	}

	public static WebElement getUsername() {
		
		return username;
	}
	
	public static WebElement geBouttonSearch() {
		
		return btnSearch;
	}
	
}
	

