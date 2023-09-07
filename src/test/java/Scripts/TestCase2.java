package Scripts;

import org.testng.annotations.Test;
import java.io.IOException;
import genericLibrary.BaseClass;
import pom_Pages.SeleniumPage;
import pom_Pages.SkillRaryDemoLoginPage;
import pom_Pages.SkillRary_Loginpage;

public class TestCase2 extends BaseClass{
	@Test
	public void tc2() throws Throwable {
		SkillRary_Loginpage s=new SkillRary_Loginpage(driver);
		s.gearsbutton();
		s.skillrarydemoapplication();
		SkillRaryDemoLoginPage sd=new SkillRaryDemoLoginPage(driver);
		utilities.switchingtabs(driver);
		utilities.dropDown(sd.getCoursedd(),pdata.getPropertydata("coursedd"));
		SeleniumPage sp=new SeleniumPage (driver);
		utilities.dragdrop(driver, sp.getSeleniumtrainingimage(), sp.getMycarttab());
	}

}
