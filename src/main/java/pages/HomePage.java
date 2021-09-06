package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase {

	public HomePage(WebDriver driver) {
		super(driver);
	}
	@FindBy(linkText = "Input Forms") WebElement inputFormsLink;
	@FindBy(linkText = "Simple Form Demo") WebElement simpleFormLink;
	@FindBy (id = "at-cv-lightbox-close")WebElement closePopup;
	
	public void closePopup() {
		closePopup.click();
	}
	
	public void clickInputFormsLink() {
		inputFormsLink.click();
	}
	
	public void clickSimpleFormLink() {
		simpleFormLink.click();
	}

}
