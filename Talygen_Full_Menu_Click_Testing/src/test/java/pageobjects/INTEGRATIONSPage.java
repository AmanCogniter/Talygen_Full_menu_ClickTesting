package pageobjects;

import static reporting.ComplexReportFactory.getTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.LogStatus;

import utils.WebBasePage;

public class INTEGRATIONSPage extends WebBasePage{
WebDriver driver ;
	
	public INTEGRATIONSPage(WebDriver driver) {
		super(driver, "INTEGRATIONSPage");
		this.driver=driver;
		// TODO Auto-generated constructor stub
	}
	public void clickFullMenuDropDown() {
		staticWait(3000);
        click(By.xpath("//span[text()='Full Menu']"), "Full Menu", 30);
        
    }
	/*
	 * Code for click testing of Connector for Integration Page
	 */
     public void clickOnIntegration()
     {		staticWait(2000);
     JavascriptExecutor js = (JavascriptExecutor) driver;
     WebElement Element = driver.findElement(By.xpath("//ul/li[@data-name='CRM']/span"));
     js.executeScript("arguments[0].scrollIntoView();", Element);
    	 click(By.xpath("//ul/li[@data-name='INTEGRATIONS']/span"),"Integration", 30);
    	 
     }
     public void clickOnConnector()
     {		staticWait(2000);
     click(By.xpath("//div/ul/li/a[@data-original-title='Connector']"),"Connector", 30);
    	
    	 try {
    		 WebElement connector = driver.findElement(By.xpath("//div/a/span[text()='Status Code Mapping']"));
    		 if (connector.isDisplayed()) {
				logger.info("Connector Page opened succesfully");
			}
    	 }
		 catch (Exception e) {
			// TODO: handle exception
			logger.info("Connector Page not opened succesfully");
		}
    	 
     }
     /*------------------------------------------------------------------------------------------------------------------------------------------*/
     /*Code for click testing of FreshBooks */
     public void clickOnGPSTrackingforIntegration()
     {		staticWait(2000);
    	 click(By.xpath("//div/ul/li/a[@data-original-title='GPS Tracking']"),"GPS Tracking", 30);
    	
    	 try {
    		 WebElement gPSTracking = driver.findElement(By.xpath("//div/span[contains(text(),'Device List')]"));
    		 if (gPSTracking.isDisplayed()) {
				logger.info("GPS Tracking Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("GPS Tracking Page not opened succesfully");
		}
    	 
     }
     public void clickOnAddDeviceIntegrationforIntegration()
     {		staticWait(2000);
    	 click(By.xpath("//div/span/a[@id='ancCreateJob']"),"Add Device Integration", 30);
    	
    	 try {
    		 WebElement addDeviceIntegration = driver.findElement(By.xpath("//div/span[contains(text(),'Manage Device')]"));
    		 if (addDeviceIntegration.isDisplayed()) {
				logger.info("Manage Device Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Manage Device Page not opened succesfully");
		}
    	 
     }
     public void clickOnBackToList()
     {		staticWait(2000);
    	 click(By.xpath("//div/span/a[@data-original-title='Back to list']"),"Back To List", 30);
    	 driver.navigate().refresh();
     }
     /*------------------------------------------------------------------------------------------------------------------------------------------*/
     /*Code for click testing of Twilio */
     public void clickOnTwilioforIntegration()
     {		staticWait(2000);
    	 click(By.xpath("//div/ul/li/a[@data-original-title='Twilio']"),"Twilio", 30);
    	
    	 try {
    		 WebElement twilioList = driver.findElement(By.xpath("//div/span[contains(text(),'Twilio List')]"));
    		 if (twilioList.isDisplayed()) {
				logger.info("Twilio List Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Twilio List Page not opened succesfully");
		}
     }
     public void clickOnAddNewTwilioforIntegration()
     {		staticWait(2000);
    	 click(By.xpath("//div/span/a[@data-original-title='Add Twilio']"),"Add New", 30);
    	
    	 try {
    		 WebElement twilioAccount = driver.findElement(By.xpath("//div/span[contains(text(),'Twilio Account')]"));
    		 if (twilioAccount.isDisplayed()) {
				logger.info("Twilio Account Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Twilio Account Page not opened succesfully");
		}
     }
     public void clickOnAuthenticateforIntegration()
     {		staticWait(2000);
    	 click(By.xpath("//div/button[contains(@id,'btnSave')]"),"Save Button", 30);
     }
     public void clickOnCancelforIntegration()
     {		staticWait(2000);
    	 clickByJavascript(By.xpath("//div/a[@data-original-title='Cancel']"),"Cancel Button", 30);
    	 driver.navigate().refresh();
     }
     public void VerifyMandatoryFieldOfTwilio() {
			int i = 0;
			String actualText;
			String expectedText;

			List<WebElement> errorMessageLocator = findMultipleElement(
					By.xpath("//span[contains(@class,'invalid-feedback')]"), 45);
			String[] expectedValue = { "Title","Account SID","Auth Token" };
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
