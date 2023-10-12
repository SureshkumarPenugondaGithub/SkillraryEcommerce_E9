package genricLibrary;


import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtilities {
	//1. Handling drop down
	public void dropdown(WebElement ele,String text) {
	Select a =new Select(ele);
	a.selectByVisibleText(text);
	}
	//2.Handling mouse over
	public void mouseover(WebDriver driver,WebElement ele) {
		Actions a=new Actions(driver);
		a.moveToElement(ele).perform();
	}
	//3.Handling right click
	public void rightclick(WebDriver driver,WebElement ele) {
		Actions a=new Actions(driver);
		a.contextClick(ele).perform();
	}
	//4. Handling double click
	public void doubleclick(WebDriver driver,WebElement ele) {
		Actions a=new Actions(driver);
		a.doubleClick(ele).perform();		
	}
	//5.Handling drag and drop
	public void dragAndDrop(WebDriver driver,WebElement ele1,WebElement ele2) {
		Actions a=new Actions(driver);
		a.dragAndDrop(ele1, ele2);
	}
	//6.handling frames
	public void frames(WebDriver driver, String value) {
		driver.switchTo().frame(value);
	}
	//7.handling default content
	public void frames(WebDriver driver) {
		driver.switchTo().defaultContent();
	}
	//8.handling scrolling
	public void scrolling(WebDriver driver, int x,int y) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy("+ x +","+ y +")");
	}
	//8.handling scrolling
		public void scrolling(WebDriver driver,WebElement ele) {
			JavascriptExecutor js=(JavascriptExecutor) driver;
			js.executeScript("argument[0].scrollIntoView();",ele);
		}
	
	
	//.Alter pop up
	public void alterpopup(WebDriver driver) {
		driver.switchTo().alert().accept();
	}
	//.Alter pop up
		public void childbrowser(WebDriver driver) {
			Set<String> child=driver.getWindowHandles();
			for(String b:child) {
				driver.switchTo().window(b);
				
			}
		}
		
	
	
}