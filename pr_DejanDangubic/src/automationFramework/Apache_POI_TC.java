package automationFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.*;

import pageObjects.*;

import utility.Constant;

// Import Package utility.*

import utility.ExcelUtils;
import appModules.Business_Test;
import appModules.Client_Test;
import appModules.SignIn_Action;

public class Apache_POI_TC {

	private static WebDriver driver = null;

	public static void main(String[] args) throws Exception {

		// This is to open the Excel file. Excel path, file name and the sheet name are
		// parameters to this method

		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "Signin");

		driver = new ChromeDriver();

		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get(Constant.URL);

		SignIn_Action.Execute(driver);
		ExcelUtils.setCellData("Pass", 1, 3);
		Thread.sleep(2000);

		Business_Test.SetUpExcel();

		Business_Test.AddNewBusiness(driver);

		Client_Test.SetUpExcel();
		Client_Test.setNewClientTest(driver);

	}

}