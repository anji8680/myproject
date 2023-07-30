package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazonhomepage {
	
	public WebDriver driver;
	
	//we can create the Page object model in two ways the below one(Pagefactory model) is one way
	
	public Amazonhomepage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="nav-link-accountList-nav-line-1")
	WebElement signinicon;
	
	
	
	public WebElement signinIcon() {
		return signinicon;
	}

}
