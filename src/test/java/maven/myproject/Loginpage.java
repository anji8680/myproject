package maven.myproject;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObject.Amazonhomepage;
import pageObject.Amazonsigninpage;
import resources.Base;

public class Loginpage extends Base {
	 public WebDriver driver;

	@BeforeTest
	public void vist() throws IOException {
		driver = intializeDriver();
		driver.get(prop.getProperty("url"));
		//("https://www.amazon.in/");
		Amazonhomepage a = new Amazonhomepage(driver);
		a.signinIcon().click();
	}

	@Test
	public void Login() {
		Amazonsigninpage as = new Amazonsigninpage(driver);
		as.mobileNumbertextfield().sendKeys("0000000000");
		as.continueButton().click();
	}

	@Test
	public void loginSuccessful() {
		Amazonsigninpage as = new Amazonsigninpage(driver);
		as.emailRadiobutton().click();

	}

	@AfterTest
	public void tearDown() {
		driver.close();
	}

}
