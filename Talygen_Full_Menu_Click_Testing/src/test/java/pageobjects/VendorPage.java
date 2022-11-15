package pageobjects;

import static reporting.ComplexReportFactory.getTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.LogStatus;

import utils.WebBasePage;

public class VendorPage extends WebBasePage{
	WebDriver driver ;
	public VendorPage(WebDriver driver) {
		super(driver, "VendorPage");
		this.driver=driver;
		// TODO Auto-generated constructor stub
	}
	public void clickFullMenuDropDown() {
		staticWait(3000);
        click(By.xpath("//span[text()='Full Menu']"), "Full Menu", 30);
        
    }
	/*
	 * Code for click testing of Service for Vendor
	 */
     public void clickOnVendor()
     {		staticWait(2000);
    	 click(By.xpath("//ul/li[@data-name='Vendor']/span"),"Vendor", 30);
    	 
     }
     public void clickOnService()
     {		staticWait(2000);
    	 click(By.xpath("//div/ul/li/a[@data-original-title='Service']"),"Service", 30);
    	
    	 try {
    		 WebElement servicePage = driver.findElement(By.xpath("//div/span[contains(text(),'Vendor Services')]"));
    		 if (servicePage.isDisplayed()) {
				logger.info("Vendor Services Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Vendor Services Page not opened succesfully");
		}
    	 driver.navigate().refresh();
     }
     /*------------------------------------------------------------------------------------------------------------------------------------------*/
     /*Code for click testing of Vendor Listing */
     public void clickOnVendorListing()
     {		staticWait(2000);
    	 click(By.xpath("//ul/li/a[@data-original-title='Vendor Listing']"),"Vendor Listing", 30);
    	 try {
    		 WebElement vendorListingPage = driver.findElement(By.xpath("//span[contains(text(),'Vendor Listing')]"));
    		 if (vendorListingPage.isDisplayed()) {
				logger.info("Vendor Listing Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Vendor Listing Page not opened succesfully");
		}
     }
     public void clickOnAddVendorListing()
     {		staticWait(2000);
    	 click(By.xpath("//div/span/a[@data-original-title='Add vendor']"),"Add Vendor Listing", 30);
    	 try {
    		 WebElement addvendorListingPage = driver.findElement(By.xpath("//span[contains(text(),'Add Vendor')]"));
    		 if (addvendorListingPage.isDisplayed()) {
				logger.info("Add Vendor Listing Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Add Vendor Listing Page not opened succesfully");
		}
     }
     public void clickOnSave()
     {		staticWait(2000);
    	 click(By.xpath("//div/button[@id='SaveArticle']"),"Save Button", 30);
     }
     public void clickOnBackToList()
     {		staticWait(2000);
    	 click(By.xpath("//span/a[text()='Back to list']"),"Back to list", 30);
    	 driver.navigate().refresh();
     }
     public void VerifyMandatoryFieldOfVendor() {
			int i = 0;
			String actualText;
			String expectedText;

			List<WebElement> errorMessageLocator = findMultipleElement(
					By.xpath("//span[contains(@class,'invalid-feedback')]"), 45);
			String[] expectedValue = { "Company Name","First Name","Last Name","Email","Password","Confirm Password","Country","State","City","Address 1","Phone Number"};
			for (Object expected : expectedValue) {
				WebElement AsteriskField = findElementVisibility(By.xpath("//label[contains(text(),'"+ expected +"')]/ancestor::div[@class='form-group']/descendant::span[@class='mandatory']"), 45);
				if (AsteriskField != null) {
					getTest().log(LogStatus.PASS, "The Asterisk symbol is displayed for " + expected + " field");
					logger.info("The Asterisk symbol is displayed for " + expected + " field");
				} else {
					getTest().log(LogStatus.FAIL, "The Asterisk symbol is not displayed for " + expected + " field");
					logger.info("The Asterisk symbol is not displayed for " + expected + " field");
					takeScreenshot(expected.toString());
				}

				List<WebElement> expectedElements = errorMessageLocator;
				for (WebElement element : expectedElements) {
					i++;
					actualText = element.getText();
					expectedText = expected.toString();

					if (actualText.indexOf(expectedText) != -1) {
						getTest().log(LogStatus.PASS,
								"Error message for \"" + expected + "\" field is displayed as expected");
						logger.info("Error message for \"" + expected + "\" field is displayed as expected");
						i = 0;
						break;
					} else if (i == expectedValue.length && !element.getText().contains(expectedText)) {
						getTest().log(LogStatus.FAIL, "Error message for \"" + expected + "\" field is not displayed");
						logger.info("Error message for \"" + expected + "\" field is displayed as expected");
						takeScreenshot(expectedText);
					}
				}

			}
			driver.navigate().refresh();
		}
    
}
