package Scripts;

import org.testng.annotations.Test;

import genericLibrary.BaseClass;
import pom_Pages.AddToCartPage;
import pom_Pages.SkillRaryDemoLoginPage;
import pom_Pages.SkillRary_Loginpage;

public class TestCase1 extends BaseClass{
	@Test
	public void tc1() {
		SkillRary_Loginpage s=new SkillRary_Loginpage(driver);
		s.gearsbutton();
		s.skillrarydemoapplication();
		utilities.switchingtabs(driver);
		SkillRaryDemoLoginPage sd=new SkillRaryDemoLoginPage(driver);
		utilities.mouseHover(driver, sd.getCoursetab());
		sd.seleniumtrainingtab();
		AddToCartPage d=new AddToCartPage(driver);
		utilities.doubleClick(driver, d.getAddbtn());
		d.addtocartbtn();
		utilities.alertPopup(driver);
		
	}

}
