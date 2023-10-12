package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DownloadInvoicepage {
	
	//declaration
	@FindBy(xpath="//input[@name='downloadInvoice']")
	private WebElement downloadinvoice;
	
	
	//initialization
	public DownloadInvoicepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	
	
	//utilization(BL)
	public void downloadinvoice() {
		downloadinvoice.clear();
	}

}
