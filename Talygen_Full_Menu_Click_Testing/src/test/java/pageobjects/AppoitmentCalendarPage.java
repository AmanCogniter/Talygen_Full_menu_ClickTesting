package pageobjects;

import static reporting.ComplexReportFactory.getTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.LogStatus;

import utils.WebBasePage;

public class AppoitmentCalendarPage extends WebBasePage{
	WebDriver driver ;
	public AppoitmentCalendarPage(WebDriver driver) {
		super(driver, "AppoitmentCalendarPage");
		this.driver=driver;
		// TODO Auto-generated constructor stub
	}
	public void clickFullMenuDropDown() {
		staticWait(3000);
        click(By.xpath("//span[text()='Full Menu']"), "Full Menu", 30);
        
    }
	/*
	 * Code for click testing of External Link for appoitment
	 */
     public void clickAppoitmentCalendarLink()
     {		staticWait(2000);
    	 click(By.xpath("//ul/li[@data-name='Appointment Calendar']/span"),"Appoitment Calendar", 30);
    	 
     }
     public void clickOnExternalLinkforAppointment()
     {		staticWait(2000);
    	 click(By.xpath("//div/ul/li/a[@data-original-title='External Link for Appointment ']"),"External Link for Appointment", 30);
    	
    	 try {
    		 WebElement manageExternalLink = driver.findElement(By.xpath("//div/span[text()='Manage External Link']"));
    		 if (manageExternalLink.isDisplayed()) {
				logger.info("Manage External Link Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Manage External Link Page not opened succesfully");
		}
     }
     public void clickOnSaveButton()
     {		staticWait(2000);
    	 click(By.xpath("//div/a[@id='btnSave']"),"Save Button", 30);
    	 try {
    		 WebElement manageExternalLink = driver.findElement(By.xpath("//div/span[contains(text(),'External Link has been successfully updated')]"));
    		 if (manageExternalLink.isDisplayed()) {
				logger.info("Save button clicked succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Save button not clicked");
		}
    	 
     }
     public void clickOnPreviewButton()
     {		staticWait(2000);
    	 clickByJavascript(By.xpath("//div/a[@data-original-title='Preview']"),"Preview Button", 30);
    	 try {
    		 WebElement preview = driver.findElement(By.xpath("//div/h5[text()='Preview']"));
    		 if (preview.isDisplayed()) {
				logger.info("Preview Page displayed succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Preview Page not displayed");
		}
    	 click(By.xpath("(//div/button[@data-original-title='Close'])[1]"),"Close Button", 30);
    	 driver.navigate().refresh();
     }
     /*---------------------------------------------------------------------------------------------------------------------------------*/
     /*Code for click testing of Appoitment Report */
     public void clickAppoitmentReportLink()
     {		staticWait(2000);
    	 click(By.xpath("//ul/li/a[@data-original-title='Appointment Report']"),"Appoitment Report", 30);
    	 try {
    		 WebElement appoitmentReport = driver.findElement(By.xpath("//div/span[text()='Appointment Service Report ']"));
    		 if (appoitmentReport.isDisplayed()) {
				logger.info("Appointment Service Report Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Appointment Service Report Page not opened succesfully");
		}
     }
     public void clickOnSearchButton()
     {		staticWait(2000);
    	 clickByJavascript(By.xpath("//div/a[@id='aSearch']"),"Search Button", 30);
    	 try {
    		 WebElement appoitmentReport = driver.findElement(By.xpath("//div[@id='viewer_pageviewheaderContainer']"));
    		 if (appoitmentReport.isDisplayed()) {
				logger.info("Search Button clicked succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Search Button not clicked succesfully");
		}
     }
     public void clickOnClearButton()
     {		staticWait(2000);
    	 clickByJavascript(By.xpath("//div/a[@id='Clear']"),"Clear Button", 30);
    	 driver.navigate().refresh(); 
     }
     /*---------------------------------------------------------------------------------------------------------------------------------*/
     /*Code for click testing of Appoitment Report */
     public void clickOnConsumerList()
     {		staticWait(2000);
    	 click(By.xpath("//ul/li/a[@data-original-title='Consumer List']"),"Consumer list", 30);
    	 try {
    		 WebElement consumerList = driver.findElement(By.xpath("//div/span[text()='Consumer List']"));
    		 if (consumerList.isDisplayed()) {
				logger.info("Consumer list Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Consumer List Page not opened succesfully");
		}
     }
     public void clickOnExpand()
     {		staticWait(3000);
    	 click(By.xpath("//span[@class='ancExpandAllCollapseAll collapsed']/i"),"Expand", 30);
     }
     public void clickOnSendEmailt()
     {		staticWait(2000);
    	 click(By.xpath("//span/a[@id='Sendmail']"),"Send Email", 30);
    	 try {
    		 WebElement sendEmail = driver.findElement(By.xpath("//div/h5[text()='Send Email']"));
    		 if (sendEmail.isDisplayed()) {
				logger.info("Send EamilPage opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Send Email Page not opened succesfully");
		}
     }
     public void clickOnCheckBox()
     {		staticWait(2000);
    	 click(By.xpath("//table[@class='table-sorting table tablesorter table-bordered mb-0']/thead/tr/th/div"),"CheckBox", 30);
     }
     public void clickOncancelButton()
     {		staticWait(2000);
    	 click(By.xpath("//div/a[@id='aCancel']"),"Cancel Button", 30);
    	 driver.navigate().refresh();
     }
     /*-------------------------------------------------------------------------------------------------------------------------------------*/
     /*Code for click testing of Counter */
     public void clickOnCounter()
     {		staticWait(2000);
    	 click(By.xpath("(//ul/li/a[@data-original-title='Counter'])[2]"),"Counter", 30);
    	 try {
    		 WebElement counterPage = driver.findElement(By.xpath("//table/thead/tr/th/span[@id='CounterName']"));
    		 if (counterPage.isDisplayed()) {
				logger.info("Counter Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Counter Page not opened succesfully");
		}
     }
     public void clickOnAddCounter()
     {		staticWait(2000);
    	 clickByJavascript(By.xpath("//span/a[@id='CounterId']"),"Add counter", 30);
     
     try {
		 WebElement addCounterPage = driver.findElement(By.xpath("//span[text()=' Add Counter']"));
		 if (addCounterPage.isDisplayed()) {
			logger.info(" Add Counter Page opened succesfully");
		}
	} catch (Exception e) {
		// TODO: handle exception
		logger.info(" Add Counter Page not opened succesfully");
	}
     }
     public void clickOnCounterSaveButton()
     {		staticWait(2000);
    	 click(By.xpath("//div/a[@data-original-title='Save']"),"Save Button", 30);
     }
     public void VerifyMandatoryFieldValidation() {
			int i = 0;
			String actualText;
			String expectedText;

			List<WebElement> errorMessageLocator = findMultipleElement(
					By.xpath("//span[contains(@class,'field-validation-valid invalid-feedback')]"), 45);
			String[] expectedValue = { "Counter","Department" };
			for (Object expected : expectedValue) {
				WebElement AsteriskField = findElementVisibility(By.xpath("//label[contains(text(),'"+ expected +"')]/ancestor::div[@class='form-group']/descendant::span[@class='text-danger']"), 45);
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
     public void clickOnCancelButton()
     {		staticWait(2000);
    	 click(By.xpath("//div/a[@data-original-title='Cancel']"),"Cancel", 30);
    	 driver.navigate().refresh();
     }
     /*------------------------------------------------------------------------------------------------------------------------------------------*/
     /*Code for click testing of Course */
     public void clickOnCourse()
     {		staticWait(2000);
    	 click(By.xpath("//ul/li/a[@data-original-title='Course']"),"Course", 30);
    	 try {
    		 WebElement counterPage = driver.findElement(By.xpath("//div/span[text()='Course']"));
    		 if (counterPage.isDisplayed()) {
				logger.info("Course Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Course Page not opened succesfully");
		}
     }
     public void clickOnExpandButton()
     {		staticWait(2000);
    	 clickByJavascript(By.xpath("//div/a[text()='Expand All or Collapse All']"),"Expand All or Collapse All", 30);
    	 driver.navigate().refresh();
     }
     /*------------------------------------------------------------------------------------------------------------------------------------------*/
     /*Code for click testing of Schedule Appointment */
     public void clickOnScheduleAppointment()
     {		staticWait(2000);
    	 click(By.xpath("//ul/li/a[@data-original-title='Schedule Appointment']"),"Schedule Appointment", 30);
    	 try {
    		 WebElement counterPage = driver.findElement(By.xpath("//div/span[text()='Schedule Appointment']"));
    		 if (counterPage.isDisplayed()) {
				logger.info("Schedule Appointment Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Schedule Appointment Page not opened succesfully");
		}
    	 driver.navigate().refresh();
     }
     /*------------------------------------------------------------------------------------------------------------------------------------------*/
     /*Code for click testing of Appointment Servicet */
     public void clickOnAppointmentService()
     {		staticWait(2000);
    	 click(By.xpath("//ul/li/a[@data-original-title='Appointment Service']"),"Appointment Service", 30);
    	 try {
    		 WebElement counterPage = driver.findElement(By.xpath("//div/span[text()='Service']"));
    		 if (counterPage.isDisplayed()) {
				logger.info("Appointment Service Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Appointment Service Page not opened succesfully");
		}
     }
     public void clickOnAddAppointmentService()
     {		staticWait(2000);
    	 click(By.xpath("//span/a[@id='ancCreateServiceMaster']"),"Add Appointment Service", 30);
     
     try {
		 WebElement addCounterPage = driver.findElement(By.xpath("//div/h5[text()='Manage Service']"));
		 if (addCounterPage.isDisplayed()) {
			logger.info(" Add Appointment Service Page opened succesfully");
		}
	} catch (Exception e) {
		// TODO: handle exception
		logger.info(" Add Appointment Service Page not opened succesfully");
	}
     }
     public void VerifyMandatoryFieldValidationofAddAppointmentService() {
			int i = 0;
			String actualText;
			String expectedText;

			List<WebElement> errorMessageLocator = findMultipleElement(
					By.xpath("//span[contains(@class,'field-validation-valid invalid-feedback')]"), 45);
			String[] expectedValue = { "Name","User" };
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
     public void clickOnUserGuide()
     {		staticWait(2000);
    	 click(By.xpath("//span[@id='userGuideCA']/a[text()='User Guide']"),"Open UserGuide", 30);
    	 click(By.xpath("//span[@id='userGuideCA']/a[text()='User Guide']"),"Close UserGuide", 30);
     }
     /*-----------------------------------------------------------------------------------------------------------------------------------------------*/
     /*Code for click testing of Token */
     public void clickOnToken()
     {		staticWait(2000);
    	 click(By.xpath("(//ul/li/a[@data-original-title='Token'])[2]"),"Token", 30);
    	 try {
    		 WebElement Token = driver.findElement(By.xpath("//table/thead/tr//th/span[text()='Token Number']"));
    		 if (Token.isDisplayed()) {
				logger.info("Token Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Token Page not opened succesfully");
		}
     }
     public void clickOnTokenCheckBox()
     {		staticWait(2000);
    	 click(By.xpath("//table[@id='tblticketlistigdata']/thead/tr/th/div"),"Token Check Box", 30);
     }
     public void clickOnConfiguration()
     {		staticWait(2000);
    	 click(By.xpath("//span/a[@id='TokenNum']"),"Add Configuration", 30);
     }
     public void clickOnAddTokenNumberSaveButton()
     {		staticWait(3000);
    	 click(By.xpath("(//div/a[@data-original-title='Save'])[2]"),"Save Button", 30);
     }
     public void VerifyMandatoryFieldValidationofconfiguration() {
			int i = 0;
			String actualText;
			String expectedText;

			List<WebElement> errorMessageLocator = findMultipleElement(
					By.xpath("(//span[contains(@class,'invalid-feedback')])[2]"), 45);
			String[] expectedValue = { "Token Number" };
			for (Object expected : expectedValue) {
				WebElement AsteriskField = findElementVisibility(By.xpath("(//label[contains(text(),'"+ expected +"')]/ancestor::div[@class='form-group']/descendant::span[@class='text-danger'])[2]"), 45);
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
     public void clickOnCloseButton()
     {		staticWait(2000);
    	 click(By.xpath("//button[@data-original-title='Close']"),"Close Button", 30);
     }
     public void clickOnAddToken()
     {		staticWait(2000);
    	 click(By.xpath("//a[text()='Add Token']"),"Add token", 30);
     }
     public void VerifyMandatoryFieldValidationofAddToken() {
			int i = 0;
			String actualText;
			String expectedText;

			List<WebElement> errorMessageLocator = findMultipleElement(
					By.xpath("//span[contains(@class,'invalid-feedback')]"), 45);
			String[] expectedValue = { "Client Mobile Number","Counter","Officer","From Time","To Time" };
			for (Object expected : expectedValue) {
				WebElement AsteriskField = findElementVisibility(By.xpath("//label[contains(text(),'"+ expected +"')]/ancestor::div[@class='form-group']/descendant::span[@class='text-danger']"), 45);
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
