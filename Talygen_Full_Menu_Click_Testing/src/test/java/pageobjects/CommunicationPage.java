package pageobjects;

import static reporting.ComplexReportFactory.getTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.LogStatus;

import utils.WebBasePage;

public class CommunicationPage extends WebBasePage{
	WebDriver driver ;
	public CommunicationPage(WebDriver driver) {
		super(driver, "CommunicationPage");
		this.driver=driver;
		// TODO Auto-generated constructor stub
	}
	public void clickFullMenuDropDown() {
		staticWait(3000);
        click(By.xpath("//span[text()='Full Menu']"), "Full Menu", 30);
        
    }
	/*
	 * Code for click testing of IVR for Cummunication
	 */
     public void clickOnCummunicationLink()
     {		staticWait(3000);
    	 click(By.xpath("//ul/li[@data-name='Communication']/span"),"Communication", 30);
    	 
     }
     public void clickOnIVR()
     {		staticWait(3000);
    	 click(By.xpath("//ul/li/a[@data-original-title='IVR']"),"IVR", 30);
    	
    	 try {
    		 WebElement ivr = driver.findElement(By.xpath("//div/span[text()='Add IVR']"));
    		 if (ivr.isDisplayed()) {
				logger.info("IVR Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("IVR Page not opened succesfully");
		}
     }

		
		/*
		 * public void clickOnAddNewMore() { staticWait(2000);
		 * click(By.xpath("//span/a[@data-original-title='Add More']"),"Add More", 30);
		 * try { WebElement addMore=
		 * driver.findElement(By.xpath("//div/span[text()='Add']")); if
		 * (addMore.isDisplayed()) { logger.info("Add More Page opened succesfully"); }
		 * } catch (Exception e) { // TODO: handle exception
		 * logger.info("Add More Page not opened succesfully"); } }
		 */
		/*
		 * public void clickOnDeleteAddMoreButton() { staticWait(3000);
		 * clickByJavascript(By.xpath("//div/a[@id='btnSave']"),"Delete add more Button"
		 * , 30);
		 * 
		 * 
		 * }
		 */
     public void clickOnSaveButton()
     {		staticWait(3000);
    	 clickByJavascript(By.xpath("//div/a[@id='btnSave']"),"Save Button", 30);
   
    	 
     }
     public void clickOnCancelButton()
     {		staticWait(2000);
    	 click(By.xpath("//div/a[@data-original-title='Cancel']"),"Cancel Button", 30);
    	 driver.navigate().refresh();
     }
     public void VerifyMandatoryFieldValidation() {
			int i = 0;
			String actualText;
			String expectedText;

			List<WebElement> errorMessageLocator = findMultipleElement(
					By.xpath("//span[contains(@class,'invalid-feedback')]"), 45);
			String[] expectedValue = { "Title","Phone Number","Status" };
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
		}
     public void clickOnMeetingRecordingList()
     {		staticWait(2000);
    	 click(By.xpath("//ul/li/a[@data-original-title='Meeting Recording List']"),"Meeting Recording List", 30);
    	
    	 try {
    		 WebElement meetingRecordingList = driver.findElement(By.xpath("//div/span[contains(text(),'Video Recording List')]"));
    		 if (meetingRecordingList.isDisplayed()) {
				logger.info("Meeting Recording List Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Meeting Recording List Page not opened succesfully");
		}
    	 driver.navigate().refresh();
     }
     public void clickOnMeetings()
     {		staticWait(2000);
    	 click(By.xpath("//ul/li/a[@data-original-title='Meetings']"),"Meeting", 30);
    	
    	 try {
    		 WebElement meeting = driver.findElement(By.xpath("//div/span[contains(text(),'Calendar')]"));
    		 if (meeting.isDisplayed()) {
				logger.info("Meeting Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Meeting Page not opened succesfully");
		}
    	 driver.navigate().refresh();
     }
     public void clickOnUnifiedSetup()
     {		staticWait(2000);
    	 click(By.xpath("//ul/li/a[@data-original-title='Unified Setup']"),"Unified Setup", 30);
    	
    	 try {
    		 WebElement unifiedSetup = driver.findElement(By.xpath("//div/span[contains(text(),'Unified Communication')]"));
    		 if (unifiedSetup.isDisplayed()) {
				logger.info("Unified Communication Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Unified Communication Page not opened succesfully");
		}
     }
     public void clickOnSetup()
     {		staticWait(2000);
    	 click(By.xpath("//span/a[text()='Setup']"),"Setup", 30);
    	
    	 try {
    		 WebElement setup = driver.findElement(By.xpath("//div/h5[contains(text(),' Package Plan')]"));
    		 if (setup.isDisplayed()) {
				logger.info("Package Plan Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Package Plan Page not opened succesfully");
		}
    	 clickByJavascript(By.xpath("//button[@data-original-title='Close']"),"Close Setup", 30);
    	 driver.navigate().refresh();
     }
     

     public void clickOnVideoRecordingList()
     {		staticWait(2000);
    	 click(By.xpath("//ul/li/a[@data-original-title='Video Recording List']"),"Video Recording List", 30);
    	
    	 try {
    		 WebElement videoRecordingList = driver.findElement(By.xpath("//div/span[contains(text(),'Video Recording List')]"));
    		 if (videoRecordingList.isDisplayed()) {
				logger.info("Video Recording List Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Video Recording List Page not opened succesfully");
		}
    	 driver.navigate().refresh();
     }
}
