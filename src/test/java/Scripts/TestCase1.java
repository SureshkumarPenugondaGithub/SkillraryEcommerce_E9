package Scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import POM.SkillraryHomepage;
import POM.TestingPage;
import POM.demoSkillrarypage;
import genricLibrary.BaseClass;

public class TestCase1 extends BaseClass {
	@Test
	public void tc1() throws Throwable {
		SkillraryHomepage s=new SkillraryHomepage(driver);
		s.gearbutton();
		s.skillrarydemoapp();
		utilities.childbrowser(driver);
		demoSkillrarypage ds=new demoSkillrarypage(driver);
		utilities.dropdown(ds.getSelectDd(),pdata.getPropertydata("coursedd") );
		TestingPage tp=new TestingPage(driver);
		utilities.scrolling(driver,tp.getFbIcon());
		tp.fbIconWebElement();

		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	
	

}
