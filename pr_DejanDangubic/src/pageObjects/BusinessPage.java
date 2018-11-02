package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class BusinessPage {

	private static WebElement element = null;

	public static WebElement getBusiness(WebDriver driver) {

		element = driver.findElement(By.xpath("//a[@id='nav-bar-business']//div[@class='v-btn__content']"));

		return element;
	}
	public static void setBusiness(WebDriver driver)
	{
		getBusiness(driver).click();
	}
	

	public static WebElement getNewBusiness(WebDriver driver) {

		element = driver.findElement(By.xpath("//i[contains(text(),'library_add')]"));

		return element;

	}
	public static void setNewBusiness(WebDriver driver)
	{
		getNewBusiness(driver).click();
	}

	public static WebElement getBusinessName(WebDriver driver) {
		
		element = driver.findElement(By.xpath("//input[@id='business-form-name']"));

		return element;

	}
	public static void setBusinessName(WebDriver driver, String BusinessName)
	{
		getBusinessName(driver).sendKeys(BusinessName);
	}

	public static WebElement getCountries(WebDriver driver) {
		element.clear();
		element = driver.findElement(By.xpath("//input[@id='business-form-country']"));

		return element;

	}
	public static void SetCountry(WebDriver driver, String countryName) throws InterruptedException
	{   
	Actions builder = new Actions(driver);
	Actions country = builder
	.moveToElement(getCountries(driver))
	.click()
	.sendKeys(countryName);
	country.sendKeys(Keys.DOWN).sendKeys(Keys.RETURN);
	country.perform();
	}

	public static WebElement getCity(WebDriver driver) {
		element.clear();
		element = driver.findElement(By.xpath("//input[@id='business-form-city']"));

		return element;

	}
	public static void setCity(WebDriver driver, String City)
	{
		getCity(driver).sendKeys(City);
	}

	public static WebElement getStreet(WebDriver driver) {
		element.clear();

		element = driver.findElement(By.xpath("//input[@id='business-form-street']"));

		return element;

	}
	public static void setStreet(WebDriver driver, String Street)
	{
		getStreet(driver).sendKeys(Street);
	}

	public static WebElement getZip(WebDriver driver) {
		element.clear();

		element = driver.findElement(By.xpath("//input[@id='business-form-zip']"));

		return element;

	}
	public static void setZip(WebDriver driver, String Zip)
	{
		getZip(driver).sendKeys(Zip);
	}

	public static WebElement getRegistryNumber(WebDriver driver) {
		element.clear();

		element = driver.findElement(By.xpath("//input[@id='business-form-reg-num']"));

		return element;

	}
	public static void setRegistryNumber(WebDriver driver, String RegistryNumber)
	{
		getRegistryNumber(driver).sendKeys(RegistryNumber);
	}

	public static WebElement getBankAccount(WebDriver driver) {

		element = driver.findElement(By.xpath("//button[@id='business-form-add-bank-btn']//div[@class='v-btn__content']"));

		return element;

	}
	public static void setBankAccount(WebDriver driver) {
		getBankAccount(driver).click();
		
	}
	

	public static WebElement getBankName(WebDriver driver) {

		element = driver.findElement(By.xpath("//input[@id='bank-dialog-name']"));

		return element;

	}
	public static void setBankName(WebDriver driver, String BankName)
	{
		getBankName(driver).sendKeys(BankName);
	}

	public static WebElement getAccountNumber(WebDriver driver) {

		element = driver.findElement(By.xpath("//input[@id='bank-dialog-num']"));

		return element;

	}
	public static void setAccountNumber(WebDriver driver, String AccountNumber)
	{
		getAccountNumber(driver).sendKeys(AccountNumber);
	}

	public static WebElement getSwiftNumber(WebDriver driver) {

		element = driver.findElement(By.xpath("//input[@id='bank-dialog-swf-num']"));

		return element;

	}
	public static void setSwiftNumber(WebDriver driver, String SwiftNumber)
	{
		getSwiftNumber(driver).sendKeys(SwiftNumber);
	}

	public static WebElement getPaymentInstruction(WebDriver driver) {

		element = driver.findElement(By.xpath("//textarea[@id='bank-dialog-pay-inst']"));

		return element;

	}
	public static void setPaymentInstruction(WebDriver driver, String PaymentInstruction)
	{
		getPaymentInstruction(driver).sendKeys(PaymentInstruction);
	}

	public static WebElement getCurrency(WebDriver driver) {

		element = driver.findElement(By.xpath("//label[contains(text(),'Currency')]"));

		return element;

	}
	public static void setCurrency (WebDriver driver, String currencyName) throws InterruptedException {
        Actions builder = new Actions(driver);
        Actions currency = builder
                .moveToElement(getCurrency(driver))
                .click()
                .sendKeys(currencyName);
                currency.sendKeys(Keys.DOWN).sendKeys(Keys.RETURN);
                currency.perform();        
    }

	public static WebElement getBankAccountSave(WebDriver driver) {

		element = driver.findElement(By.xpath("//div[contains(text(),'Add bank account')]"));

		return element;

	}
	public static void setBankAccountSave(WebDriver driver)
	{
		getBankAccountSave(driver).click();
	}

	public static WebElement getSave(WebDriver driver) {
		

		element = driver.findElement(By.cssSelector("#business-form-save-btn > div"));

		return element;

	}
	public static void setSave(WebDriver driver)
	{
		getSave(driver).click();
	}
	
	
}
