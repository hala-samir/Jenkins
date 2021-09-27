package tests;

import org.testng.annotations.Test;

import pages.HomePage;
import pages.SimpleForm;

public class FillFormParallelTest extends TestBase4ParallelTesting {
	HomePage homePg;
	SimpleForm formPg;

	@Test
	public void fillFormSucessfully() {
		homePg=new HomePage(getDriver());
		homePg.closePopup();
		homePg.clickInputFormsLink();
		homePg.clickSimpleFormLink();
		formPg= new SimpleForm(getDriver());
		formPg.fillForm("Welcome");
		formPg.clickSubmit();
	}

}
