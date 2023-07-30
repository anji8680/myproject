package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Amazonsigninpage {

	public WebDriver driver;
	
	////we can create the Page object model in two ways the below one is another way
	By mobilenumbertextfield=By.xpath("//input[@type=\"email\"]");
	By continuebutton=By.xpath("//input[@type=\"submit\"]");
	By emailradiobutton=By.cssSelector("input[value=\"email\"]");
	
	public Amazonsigninpage(WebDriver driver) {
		this.driver=driver;
	}
	
	public WebElement mobileNumbertextfield() {
		return driver.findElement(mobilenumbertextfield);
	}
	
	public WebElement continueButton() {
		return driver.findElement(continuebutton);
	}
	
	public WebElement emailRadiobutton() {
		return driver.findElement(emailradiobutton);
	}
}
