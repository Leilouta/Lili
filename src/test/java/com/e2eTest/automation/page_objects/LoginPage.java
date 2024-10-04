package com.e2eTest.automation.page_objects;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import com.e2eTest.automation.utils.BasePage;
import com.e2eTest.automation.utils.Setup;


public class LoginPage extends BasePage{ 
	

/*Retrieve element*/ 
	@FindBy(how = How.XPATH,using="//input[@name='username']")
	private static WebElement email;
	
	@FindBy(how = How.XPATH,using="//input[@name='password']")
	private static WebElement password;
	
	@FindBy(how = How.XPATH,using="//button[@type='submit']")
	private static WebElement btnLogin;
	
	
	
	public LoginPage() {
		super(Setup.getDriver());	
	}
	
	
	public static WebElement getEmail() {
		return email; 
	}
	
	public static WebElement getPassword() {
		return password; 
	}
	
	public static WebElement getBtnLogin() {
		return btnLogin; 
	}

	}
	

