package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ClientsPage {
	
	public static WebElement getClientClick (WebDriver driver) {
		WebElement clients = driver.findElement(By.id("nav-bar-clients"));
		return clients;
	}
	
	public static WebElement getAddNewClient(WebDriver driver) {
		WebElement addNewClient = driver.findElement(By.xpath("//i[contains(text(),'library_add')]"));
		return addNewClient;
	}
	
	public static WebElement getClientName (WebDriver driver) {
		WebElement clientName = driver.findElement(By.cssSelector("input[aria-label='Client Name']"));
		return clientName;
	}
	
	public static void setClientName (WebDriver driver, String clientName) {
		getClientName(driver).sendKeys(clientName);
		
	}
	public static WebElement getContactName (WebDriver driver) {
		WebElement contactName = driver.findElement(By.cssSelector("input[aria-label='Contact Name']"));
		return contactName;
	}
	
	public static void setContactName (WebDriver driver, String contactName) {
		getContactName(driver).sendKeys(contactName);
	}
		
	public static WebElement getEmail (WebDriver driver) {
		WebElement email = driver.findElement(By.cssSelector("input[aria-label='E-mail']"));
		return email;
	}

	public static void setEmail (WebDriver driver, String Email) {
		getEmail(driver).sendKeys(Email);
	}
	
	public static WebElement getRegisterNumber (WebDriver driver) {
		WebElement regNumber = driver.findElement(By.cssSelector("input[aria-label='Registry Number']"));
		return regNumber;
	}
	
	public static void setRegNumber (WebDriver driver, String regNumber) {
		getRegisterNumber(driver).sendKeys(regNumber);
	}
	
	public static WebElement getCountries (WebDriver driver) {
		WebElement country = driver.findElement(By.xpath("//div[@class='v-select__slot']//input[@type='text']"));
		return country;
	}
	
	public static void setCountry(WebDriver driver, String countryName) throws InterruptedException
	{   
	Actions builder = new Actions(driver);
	Actions country = builder
	.moveToElement(getCountries(driver))
	.click()
	.sendKeys(countryName);
	country.sendKeys(Keys.DOWN).sendKeys(Keys.RETURN);
	country.perform();
	}
	
	public static WebElement getCity (WebDriver driver) {
		WebElement city = driver.findElement(By.cssSelector("input[aria-label='City']"));
		return city;
	}
	
	public static void setCity(WebDriver driver, String city) {
		getCity(driver).sendKeys(city);
	}
	
	public static WebElement getStreet (WebDriver driver) {
		WebElement street = driver.findElement(By.cssSelector("input[aria-label='Street']"));
		return street;
	}
	
	public static void setStreet (WebDriver driver, String street) {
		getStreet(driver).sendKeys(street);
	}
	
	public static WebElement getZip (WebDriver driver) {
		WebElement zip = driver.findElement(By.cssSelector("input[aria-label='Zip']"));
		return zip;
	}
	
	public static void setZip (WebDriver driver, String zip) {
		getZip(driver).sendKeys(zip);
	}
	
	public static WebElement getCode (WebDriver driver) {
		WebElement code = driver.findElement(By.cssSelector("input[aria-label='Code']"));
		return code;
	}
	
	public static void setCode(WebDriver driver, String code) {
		getCode(driver).sendKeys(code);
	}
	
	public static WebElement getStatusLabel(WebDriver driver){
		WebElement status= driver.findElement(By.xpath("//label[contains(text(),'Status: Active')]"));
		return status;
	}
		
	public static void setStatus(WebDriver driver, String status ){
		String currentStatus = getStatusLabel(driver).getText();
		String cs = currentStatus.split(":")[1].trim();
		if(!status.equals(cs))
			getStatusLabel(driver).click();
	}
	
	public static WebElement getSave(WebDriver driver){
		WebElement saveBtn = driver.findElement(By.xpath("//div[contains(text(),'Save')]"));
		return saveBtn;
	}
	
	
}