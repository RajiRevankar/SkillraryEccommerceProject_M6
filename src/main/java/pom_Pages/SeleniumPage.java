package pom_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SeleniumPage {
	//declaration
	
	//address of selenium training
	@FindBy(xpath="(//a[text()='Selenium Training'])[2]")
	private WebElement seleniumtrainingimage;
	
	//address of mycart
	@FindBy(id="mycart")
	private WebElement mycarttab;
	
	@FindBy(xpath="(//i[@class='fa fa-facebook'])[2]")
	private WebElement facebook;
	
	//initialization
	public SeleniumPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	//utilization
	public WebElement getSeleniumtrainingimage() {
		return seleniumtrainingimage;
	}
	public WebElement getMycarttab() {
		return mycarttab;
	}
	public WebElement getFacebook() {
		return facebook;
	}
	public void facebookicon() {
		facebook.click();
	}
	
	
	
	
	
	

}
