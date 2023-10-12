package GenericLibrary;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtilities {
	
	public void dropDown(WebElement ele, String text)
		{
	
	Select s=new Select(ele);
	s.selectByVisibleText(text);
		}
	
	public void mouseOver(WebDriver driver,WebElement ele)
	{
		Actions a=new Actions(driver);
		a.moveToElement(ele).perform();
	}
	
	public void rightClicking(WebDriver driver,WebElement ele)
	{
		Actions a=new Actions(driver);
		a.contextClick(ele).perform();
	}
	
	public void doubleClicking(WebDriver driver,WebElement ele)
	{
		Actions a=new Actions(driver);
		a.doubleClick(ele).perform();
	}
	
	public void dragAndDropping(WebDriver driver,WebElement ele1,WebElement ele2)
	{
		Actions a=new Actions(driver);
		a.dragAndDrop(ele1,ele2).perform();
	}
	
	public void frams(WebDriver driver,String value)
	{
		driver.switchTo().frame(value);
	}
	
	public void frams(WebDriver driver)
	{
		driver.switchTo().defaultContent();
	}
	
	public void scrolling(WebDriver driver,int x,int y)
	{
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy("+x+","+y+")");
	
	
	}
	
	public void scrolling(WebDriver driver,WebElement ele)
	{
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView();",ele);
	}
	
	public void popUp(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
	
	public void childBrowser(WebDriver driver) 
	{
		
	Set<String> child = driver.getWindowHandles(); 
	for (String b : child) 
	{
		driver.switchTo().window(b); 
		} 
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
