package com.e2eTest.automation.utils;


import java.time.Duration;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.PageFactory;



public class BasePage {

    protected WebDriver driver; 
  

    public BasePage(WebDriver driver) {
        this.driver = driver; 
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
        PageFactory.initElements(driver, this);
    }

}