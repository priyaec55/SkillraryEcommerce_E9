package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartPage {
	
	@FindBy(xpath="//i[@class='fa fa-plus']")
	private WebElement plus;
	
	@FindBy(xpath="//button[@ondblclick='addtocart()']")
	private WebElement addtocart;
	
	public AddToCartPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getPlus() {
		return plus;
	}

	public void addtocartWebElement()
	{
		addtocart.click();
	}
	

}
