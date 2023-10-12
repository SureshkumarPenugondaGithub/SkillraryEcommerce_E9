package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartPage {
	//declaration
	@FindBy(xpath="(//span[@class='input-group-btn'])[3]")
	private WebElement plusicon;
	@FindBy(xpath="//button[text()=' Add to Cart']")
	private WebElement addTocart;
	
	//initialization
	public AddToCartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	//utilization
	public WebElement plusicon() {
		return plusicon;
	}
	//business library
	public void addTocart() {
		 addTocart.clear();
	}
}
