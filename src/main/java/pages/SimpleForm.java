package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SimpleForm extends PageBase{
	public JavascriptExecutor js;

	public SimpleForm(WebDriver driver) {
		super(driver);
	}

	@FindBy (id="user-message")
	WebElement userMsg;
	@FindBy(xpath = "//button[text()='Show Message']")
	WebElement submitName;
	@FindBy (id="user-message")
	public WebElement fullMsg;

	public void fillForm(String msg){
		userMsg.sendKeys(msg);		
	}

	public void clickSubmit() {		
		submitName.click();
	}
	public String msg() {
		return fullMsg.getText();
	}

}
