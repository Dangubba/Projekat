package appModules;

import org.openqa.selenium.WebDriver;

import pageObjects.BusinessPage;
import utility.Constant;
import utility.ExcelUtils;

public class Business_Test {
	
	public static void SetUpExcel() throws Exception {
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "Business");

	}

	public static String AddNewBusiness(WebDriver driver) throws Exception {

		

		String businessName = ExcelUtils.getCellData(1, 0);
		String streetName = ExcelUtils.getCellData(1, 3);
		String zipNumber = ExcelUtils.getCellData(1, 4);
		String countryName = ExcelUtils.getCellData(1, 1);
		String cityName = ExcelUtils.getCellData(1, 2);
		String regNumber = ExcelUtils.getCellData(1, 5);
		
		
		Thread.sleep(2000);
		BusinessPage.setBusiness(driver);
		Thread.sleep(2000);
		BusinessPage.setNewBusiness(driver);
		Thread.sleep(2000);
		BusinessPage.setBusinessName(driver, businessName);
		BusinessPage.SetCountry(driver, countryName);
		BusinessPage.setCity(driver, cityName);
		BusinessPage.setStreet(driver, streetName);
		BusinessPage.setZip(driver, zipNumber);
		BusinessPage.setRegistryNumber(driver, regNumber);
		Thread.sleep(2000);
		BusinessPage.setBankAccount(driver);
		
		
		String BankName = ExcelUtils.getCellData(1, 6);
		String AccountNumber = ExcelUtils.getCellData(1, 7);
		String SwiftNumber = ExcelUtils.getCellData(1, 8);
		String PaymentInstruction = ExcelUtils.getCellData(1, 9);
		String Currency = ExcelUtils.getCellData(1, 10);
		
		
		
		BusinessPage.setBankName(driver, BankName);
		BusinessPage.setAccountNumber(driver, AccountNumber);
		BusinessPage.setSwiftNumber(driver, SwiftNumber);
		BusinessPage.setPaymentInstruction(driver, PaymentInstruction);
		BusinessPage.setCurrency(driver, Currency);
		BusinessPage.setBankAccountSave(driver);
		BusinessPage.setSave(driver);
		
		
		return "Pass";

	}

}
