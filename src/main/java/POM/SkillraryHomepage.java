package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryHomepage {
	//declaration
	//address of gears web element
	@FindBy(xpath="//a[text()=' GEARS ']")
	private WebElement gearsbtn;
	//address of skill rary demo app
	@FindBy(xpath="(//a[text()=' SkillRary Demo APP'])[1]")
	private WebElement skillrarydemoapp;
	//address of search text field
	@FindBy(xpath="//input[@type='search']")
	private WebElement serachtxtf;
	//address of search icon
	@FindBy(xpath="//input[@type='submit']")
	private WebElement serachicon;
	//address of cookies;
	@FindBy(xpath="//a[@class='close_cookies']")
	private WebElement cookies;
	
	//initialization
	public SkillraryHomepage(WebDriver driver) {
		PageFactory.initElements(driver, this);	
	}
	//utilization
	public void gearbutton() {
		gearsbtn.click();
	}
	public void skillrarydemoapp() {
		skillrarydemoapp.click();
	}
	public void serachtxtf() {
		serachtxtf.click();
	}
	public void serachicon() {
		serachicon.click();
	}
	public void cookies() {
		cookies.click();
	}


}
