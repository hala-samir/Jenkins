package tests;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.SimpleForm;

public class FormPageTest extends TestBase {
	HomePage homePg;
	SimpleForm formPg;
	
	@Test
	public void fillFormSucessfully() {
		homePg=new HomePage(driver);
		homePg.closePopup();
		homePg.clickInputFormsLink();
		homePg.clickSimpleFormLink();
		formPg= new SimpleForm(driver);
		formPg.fillForm("Welcome");
		formPg.clickSubmit();
	}

}
