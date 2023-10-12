package Scripts;

import org.testng.annotations.Test;

import GenericLibrary.BaseClass;
import POM.DemoSkillraryPage;
import POM.SkillraryHomePage;
import POM.TestingPage;

public class TestCase1 extends BaseClass {
	
	@Test
	public void tc1() throws Throwable
	
	{
		
		SkillraryHomePage s=new SkillraryHomePage(driver);
		s.gearsbutton();
		s.skillrarydemoappWebElement();
		utiles.childBrowser(driver);
		DemoSkillraryPage ds=new DemoSkillraryPage(driver);
		utiles.dropDown(ds.getSearchDd(),pdata.getPropertydata("coursedd"));
		TestingPage tp=new TestingPage(driver);
		utiles.scrolling(driver, tp.getFb());
		tp.FbWebElement();
		
	}

}
