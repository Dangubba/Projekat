package appModules;

import org.openqa.selenium.WebDriver;

import pageObjects.ClientsPage;
import utility.Constant;
import utility.ExcelUtils;

public class Client_Test {

    public static void SetUpExcel() throws Exception {
        ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "Clients");
    }

    public static void setNewClientTest (WebDriver driver) throws Exception {
        
        Thread.sleep(2000);
        ClientsPage.getClientClick(driver).click();
        Thread.sleep(2000);
        ClientsPage.getAddNewClient(driver).click();
        
        String clientName = ExcelUtils.getCellData(1, 0);
        String contactName = ExcelUtils.getCellData(1, 1);
        String Email = ExcelUtils.getCellData(1, 2);
        String regNumber = ExcelUtils.getCellData(1, 3);
        String countryName = ExcelUtils.getCellData(1, 4);
        String city = ExcelUtils.getCellData(1, 5);
        String street = ExcelUtils.getCellData(1, 6);
        String zip = ExcelUtils.getCellData(1, 7);
        String code = ExcelUtils.getCellData(1, 8);
        String status = ExcelUtils.getCellData(1, 9);
        
        Thread.sleep(2000);
        ClientsPage.setClientName(driver, clientName);
        ClientsPage.setContactName(driver, contactName);
        ClientsPage.setEmail(driver, Email);
        ClientsPage.setRegNumber(driver, regNumber);
        ClientsPage.setCountry(driver, countryName);
        ClientsPage.setCity(driver, city);
        ClientsPage.setStreet(driver, street);
        ClientsPage.setZip(driver, zip);
        ClientsPage.setCode(driver, code);
        ClientsPage.setStatus(driver, status);
        ClientsPage.getSave(driver).click();
        
}
}
