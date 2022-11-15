package pageobjects;

import static reporting.ComplexReportFactory.getTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.LogStatus;

import utils.WebBasePage;

public class ApprovalPage extends WebBasePage{
	WebDriver driver ;
	public ApprovalPage(WebDriver driver) {
		super(driver, "ApprovalPage");
		this.driver=driver;
		// TODO Auto-generated constructor stub
	}
	public void clickFullMenuDropDown() {
		staticWait(3000);
        click(By.xpath("//span[text()='Full Menu']"), "Full Menu", 30);
        
    }
	/*
	 * Code for click testing of Approval Chain for Approval
	 */
     public void clickOnApprovalLink()
     {		staticWait(2000);
    	 click(By.xpath("//ul/li[@data-name='Approval']/span"),"Approval", 30);
    	 
     }
     public void clickOnApprovalChain()
     {		staticWait(2000);
    	 click(By.xpath("//div/ul/li/a[@data-original-title='Approval Chain ']"),"Approval chain", 30);
    	
    	 try {
    		 WebElement manageExternalLink = driver.findElement(By.xpath("//div/span[contains(text(),'Approval Chain')]"));
    		 if (manageExternalLink.isDisplayed()) {
				logger.info("Approval chain Page displayed succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Approval chain Page not displayed succesfully");
		}
     }
     public void clickOnExpandButton()
     {		staticWait(2000);
    	 clickByJavascript(By.xpath("//div/a[text()='Expand All or Collapse All']"),"Expand All or Collapse All", 30);
     }
     public void clickOnPageTour()
     {		staticWait(2000);
    	 clickByJavascript(By.xpath("//a[@id='PageTour']"),"Page tour", 30);
    	
    	 try {
    		 WebElement manageExternalLink = driver.findElement(By.xpath("//div[text()='Search Filters ']"));
    		 if (manageExternalLink.isDisplayed()) {
				logger.info("Page Tour displayed succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Page Tour not displayed succesfully");
		}
    	 click(By.xpath("//*[name()='svg' and @class='guided-tour-icon']"),"Close tour page", 30);
     }
     public void clickOnAddApprovalChain()
     {		staticWait(2000);
    	 click(By.xpath("//a[@data-original-title='Add Approval Chain']"),"Add Approval chain", 30);
    	
    	 try {
    		 WebElement manageExternalLink = driver.findElement(By.xpath("//div/span[text()='Add Approval Chain']"));
    		 if (manageExternalLink.isDisplayed()) {
				logger.info("Add Approval chain Page displayed succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info(" Add Approval chain Page not displayed succesfully");
		}
     }
     public void clickOnSaveButton()
     {		staticWait(2000);
    	 click(By.xpath("//div/a[@id='btnSave']"),"Save Button", 30);
     }
     public void VerifyMandatoryFieldValidation() {
			int i = 0;
			String actualText;
			String expectedText;

			List<WebElement> errorMessageLocator = findMultipleElement(
					By.xpath("//span[contains(@class,'invalid-feedback')]"), 45);
			String[] expectedValue = { "Approval Chain Name","Select Approval Group" };
			for (Object expected : expectedValue) {
				WebElement AsteriskField = findElementVisibility(By.xpath("//label[contains(text(),'"+ expected +"')]/ancestor::div[@class='form-group']/descendant::span[text()='*']"), 45);
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
    	 click(By.xpath("//div/a[@data-original-title='Cancel']"),"Cancel button", 30);
    	 driver.navigate().refresh();
     }
     /*--------------------------------------------------------------------------------------------------------------------------------------*/
     /*Code for click testing of Appointment Servicet */
     public void clickOnApprovalGroup()
     {		staticWait(2000);
    	 click(By.xpath("//ul/li/a[@data-original-title='Approval Group']"),"Approval Group", 30);
    	 try {
    		 WebElement counterPage = driver.findElement(By.xpath("//div/span[contains(text(),'Approval Group')]"));
    		 if (counterPage.isDisplayed()) {
				logger.info("Approval Group Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Approval Group Page not opened succesfully");
		}
     }
     public void clickOnAddApprovalGroup()
     {		staticWait(2000);
    	 click(By.xpath("//a[@data-original-title='Add Approval Group']"),"Add Approval Group", 30);
    	
    	 try {
    		 WebElement addApprovalPage = driver.findElement(By.xpath("//div/span[contains(text(),'Approval Group')]"));
    		 if (addApprovalPage.isDisplayed()) {
				logger.info("Approval Group Page displayed succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Approval Group Page not displayed succesfully");
		}
     }
     public void VerifyMandatoryFieldOfApprovalGroup() {
			int i = 0;
			String actualText;
			String expectedText;

			List<WebElement> errorMessageLocator = findMultipleElement(
					By.xpath("//span[contains(@class,'invalid-feedback')]"), 45);
			String[] expectedValue = { "Approval Group Name","Users" };
			for (Object expected : expectedValue) {
				WebElement AsteriskField = findElementVisibility(By.xpath("//label[contains(text(),'"+ expected +"')]/ancestor::div[@class='form-group']/descendant::span[text()='*']"), 45);
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
  /*----------------------------------------------------------------------------------------------------------------------------------------------------*/
     /*Code for click testing of Approval Report Page */
     public void clickOnApprovalReport()
     {		staticWait(2000);
    	 click(By.xpath("//ul/li/a[@data-original-title='Approval Report']"),"Approval Report", 30);
    	 try {
    		 WebElement approvalReport = driver.findElement(By.xpath("//div/span[text()='Approval Reports']"));
    		 if (approvalReport.isDisplayed()) {
				logger.info("Approval Report Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Approval Report Page not opened succesfully");
		}
     }
     public void clickOnSearchButton()
     {		staticWait(2000);
    	 clickByJavascript(By.xpath("//div/a[@id='Search']"),"Search button", 30);
    	 try {
    		 WebElement reportPage = driver.findElement(By.xpath("//div[@id='viewer_pageviewheaderContainer']"));
    		 if (reportPage.isDisplayed()) {
				logger.info("Approval Report dispalyed succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Approval Report not dispalyed succesfully");
		}
    	 
     }
     public void clickOnClearButton()
     {		staticWait(2000);
    	 clickByJavascript(By.xpath("//div/a[@id='Clear']"),"Clear button", 30);
    	 driver.navigate().refresh();
     }
     /*----------------------------------------------------------------------------------------------------------------------------------------------------*/
     /*Code for click testing of Approval Rule Page */
     public void clickOnApprovalRule()
     {		staticWait(2000);
    	 click(By.xpath("//ul/li/a[@data-original-title='Approval Rule']"),"Approval Rule", 30);
    	 try {
    		 WebElement approvalReport = driver.findElement(By.xpath("//div/span[contains(text(),'Approval Rule')]"));
    		 if (approvalReport.isDisplayed()) {
				logger.info("Approval Rule Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Approval Rule Page not opened succesfully");
		}
     }
     public void clickOnAddApprovalRule()
     {		staticWait(2000);
    	 click(By.xpath("//a[@data-original-title='Add New Rule']"),"Add Approval Rule", 30);
     }
     public void VerifyMandatoryFieldOfApprovalRule() {
			int i = 0;
			String actualText;
			String expectedText;

			List<WebElement> errorMessageLocator = findMultipleElement(
					By.xpath("//span[contains(@class,'invalid-feedback')]"), 45);
			String[] expectedValue = { "Rule Name","Please Select Project","Users","Select Approval Chain" };
			for (Object expected : expectedValue) {
				WebElement AsteriskField = findElementVisibility(By.xpath("//label[contains(text(),'"+ expected +"')]/ancestor::div[@class='form-group']/descendant::span[text()='*']"), 45);
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
