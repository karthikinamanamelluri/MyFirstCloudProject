package com.java.ohrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {
	WebDriver driver;
	public WebElement Username(){
		return driver.findElement(By.xpath("//input[@id='txtUsername']"));
		
	}
	public void Enterusername(String Value){
		Username().sendKeys(Value);
	}
public WebElement Password(){
	return driver.findElement(By.xpath("//input[@id='txtPassword']"));
	
}
public void Enterpassword(String Value){
	Password().sendKeys(Value);
	
}
public WebElement login(){
	return driver.findElement(By.xpath("//input[@value='LOGIN']"));
}
public void clicklogin(){
	login().click();
}
}
