package pom_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartPage {
	//declaration
	//address of +icon
	@FindBy(id="add")
	private WebElement addbtn;
	//adress of add to cart button
	@FindBy(xpath="//button[text()=' Add to Cart']")
	private WebElement addtocartbtn;
	
	//initialisation
	public AddToCartPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	//
	//utilisation
    public WebElement getAddbtn() {
		return addbtn;
	}
    public void addtocartbtn() {
    	addtocartbtn.click();
    }

	
	
	

}
