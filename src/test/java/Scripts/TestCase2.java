package Scripts;

import org.testng.annotations.Test;

import GenericLibrary.BaseClass;
import POM.DemoSkillraryPage;
import POM.DownloadInvoicePage;
import POM.SkillraryHomePage;
import POM.TestingPage;

public class TestCase2 extends BaseClass{
	
	@Test
	public void tc2() throws Throwable
	{
		SkillraryHomePage s=new SkillraryHomePage(driver);
		s.gearsbutton();
		s.skillrarydemoappWebElement();
		utiles.childBrowser(driver);
		DemoSkillraryPage ds=new DemoSkillraryPage(driver);
		utiles.dropDown(ds.getSearchDd(),pdata.getPropertydata("coursedd"));
		
		ds.feedbackButton();
		
		DownloadInvoicePage di=new DownloadInvoicePage(driver);
		di.downloadinvoiceWebElement();
	}

}
