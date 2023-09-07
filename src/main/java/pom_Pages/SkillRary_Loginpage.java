package pom_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillRary_Loginpage {
	//Declaration
	//address of gears
	@FindBy(xpath="//a[text()=' GEARS ']")
	private WebElement gearbtn;
	//address of skillrary demoapp
	@FindBy(xpath="(//a[text()=' SkillRary Demo APP'])[2]")
	private WebElement skillrarydemoapp;
	//address of search textfield
	@FindBy(xpath="//input[@name='q']")
	private WebElement searchtb;
	//address of search icon
	@FindBy(xpath="//input[@value='go']")
	private WebElement searchbtn;
	
	//initialisation
	public SkillRary_Loginpage (WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	//utilisation
	public void gearsbutton() {
		gearbtn.click();
	}
	public void skillrarydemoapplication() {
		skillrarydemoapp.click();
	}
	public void searchTextbox(String name) {
		searchtb.sendKeys(name);
	}
	public void gobutton() {
		searchbtn.click();
	}
}
