package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestingPage {

	@FindBy(xpath="(//i[@class='fa fa-facebook'])[2]")
	private WebElement Fb;
	
	public TestingPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	public WebElement getFb() {
		return Fb;
	}

	public void FbWebElement()
	{
		Fb.click();
	}
}
