package pageObjects;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
public class LogIn {

	private static WebElement web_element = null;

	public static WebElement eMail(WebDriver driver){
	   web_element = driver.findElement(By.xpath("//input[@id='login-form-email']"));
	   return web_element;
	   
	   }
	
	
	

	public static WebElement password(WebDriver driver){
	   web_element = driver.findElement(By.xpath("//input[@id='login-pass']"));
	   return web_element;
	   }

	public static WebElement btn_LogIn(WebDriver driver){

	   web_element = driver.findElement(By.xpath("//div[@class='v-btn__content']"));
	   return web_element;
	   }
	
	
	}




