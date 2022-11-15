package pageobjects;

import static reporting.ComplexReportFactory.getTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.LogStatus;

import utils.WebBasePage;

public class TicketingPage extends WebBasePage{
	WebDriver driver ;
	public TicketingPage(WebDriver driver) {
		super(driver, "TicketingPage");
		this.driver=driver;
		// TODO Auto-generated constructor stub
	}
	public void clickFullMenuDropDown() {
		staticWait(3000);
        click(By.xpath("//span[text()='Full Menu']"), "Full Menu", 30);
        
    }
	/*
	 * Code for click testing of Ticketing
	 */
     public void clickOnTicketingLink()
     {		staticWait(2000);
    	 click(By.xpath("//ul/li[@data-name='Ticketing']/span"),"Ticketing", 30);
    	 
     }
     public void clickOnTicketing()
     {		staticWait(2000);
    	 click(By.xpath("//div/ul/li/a[@data-original-title='Ticketing']"),"Ticketing Sub Module", 30);
    	
    	 try {
    		 WebElement manageExternalLink = driver.findElement(By.xpath("//div/span[text()='Ticketing']"));
    		 if (manageExternalLink.isDisplayed()) {
				logger.info("Ticketing Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Ticketing Page not opened succesfully");
		}
     }
     public void clickOnAddTicketing()
     {		staticWait(2000);
    	 click(By.xpath("//div/span/a[@data-original-title='Add Ticket']"),"Add Ticket", 30);
    	
    	 try {
    		 WebElement addTicket = driver.findElement(By.xpath("//div/span[text()='Add Ticket']"));
    		 if (addTicket.isDisplayed()) {
				logger.info("Add Ticket Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Add Ticket Page not opened succesfully");
		}
     }
     public void clickOnSaveAsDraft()
     {		staticWait(2000);
    	 click(By.xpath("//div/a[@id='btnSaveDraft']"),"Save As Draft", 30);
    
     }
     public void clickOnCancelAddTicketing()
     {		staticWait(2000);
    	 click(By.xpath("//div/a[@id='btnCancel']"),"Cancel button", 30);
    
     }
     public void clickOnCloseNotifyMessage()
     {		staticWait(3000);
     	 click(By.xpath("//button[@id='closenotifymessage']"),"Close Notify Message popup ", 30);
     	
     }
     public void VerifyMandatoryFieldValidation() {
			int i = 0;
			String actualText;
			String expectedText;

			List<WebElement> errorMessageLocator = findMultipleElement(
					By.xpath("//span[contains(@class,'invalid-feedback')]"), 45);
			String[] expectedValue = { "Subject","Assigned To Department","Priority" };
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
     public void clickOnCheckBox()
     {		staticWait(2000);
         
    	 click(By.xpath("//div[@class='custom-control custom-checkbox']"),"Check Box", 30);
     }
     public void clickOnUpdateStatus()
     {		staticWait(2000);
    	 click(By.xpath("//div/span/a[@data-original-title='Update Status']"),"Update Status", 30);
    	
    	 try {
    		 staticWait(2000);
    		 WebElement confirmationPopUp = driver.findElement(By.xpath("//div/h5[text()='Update Status']"));
    		 if (confirmationPopUp.isDisplayed()) {
				logger.info("Update Status Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Update Status Page not opened succesfully");
		}
     }
     public void clickOnCancelButtonOfUpdateStatus()
     {		staticWait(2000);
    	 click(By.xpath("//div/a[@id='abtnUpdateTicketStatusCancel']"),"Cancel button", 30);
    	 driver.navigate().refresh();
     }
     /*------------------------------------------------------------------------------------------------------------------------------------------*/
     /*Code for click testing of Add Ticket */
     public void clickOnAddTicket()
     {		staticWait(2000);
    	 click(By.xpath("//ul/li/a[@data-original-title='Add Ticket']"),"Add Ticket", 30);
    	 try {
    		 WebElement addTicketPage = driver.findElement(By.xpath("//div/span[text()='Add Ticket']"));
    		 if (addTicketPage.isDisplayed()) {
				logger.info("Add Ticket Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Add Ticket Page not opened succesfully");
		}
     }
     public void VerifyMandatoryFieldOfAddTicket() {
			int i = 0;
			String actualText;
			String expectedText;

			List<WebElement> errorMessageLocator = findMultipleElement(
					By.xpath("//span[contains(@class,'invalid-feedback')]"), 45);
			String[] expectedValue = { "Subject","Assigned To Department","Priority" };
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
     /*------------------------------------------------------------------------------------------------------------------------------------------*/
     /*Code for click testing of Unassigned Tickets */
     public void clickOnUnassignedTickets()
     {		staticWait(2000);
    	 click(By.xpath("//ul/li/a[@data-original-title='Unassigned Tickets']"),"Unassigned Tickets", 30);
    	 try {
    		 WebElement unassignedTicketsPage = driver.findElement(By.xpath("//div/span[text()='Ticketing']"));
    		 if (unassignedTicketsPage.isDisplayed()) {
				logger.info("Ticketing Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Ticketing Page not opened succesfully");
		}
     }
     /*------------------------------------------------------------------------------------------------------------------------------------------*/
     /*Code for click testing of Ticket Feedback */
     public void clickOnTicketFeedback()
     {		staticWait(2000);
    	 click(By.xpath("//ul/li/a[@data-original-title='Ticket Feedback']"),"Ticket Feedback", 30);
    	 try {
    		 WebElement ticketFeedbackPage = driver.findElement(By.xpath("//div/span[text()='Feedback']"));
    		 if (ticketFeedbackPage.isDisplayed()) {
				logger.info("Ticket Feedback Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Ticket Feedback Page not opened succesfully");
		}
     }
     public void clickOnAddFeedback()
     {		staticWait(2000);
    	 click(By.xpath("//div/span/a[@data-original-title='Add Feedback']"),"Add Feedback", 30);
    	 try {
    		 WebElement addFeedbackPage = driver.findElement(By.xpath("//div/span[text()='Add Feedback']"));
    		 if (addFeedbackPage.isDisplayed()) {
				logger.info("Add Feedback Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Add Feedback Page not opened succesfully");
		}
     }
     public void clickOnSaveAddFeedback()
     {		staticWait(2000);
    	 click(By.xpath("//div/a[@id='aFeedbackTicketSave']"),"Save Button", 30);
    
     }
     public void clickOnCancelAddFeedback()
     {		staticWait(2000);
    	 click(By.xpath("//div/a[@id='gobacktolistscreen']"),"Cancel Button", 30);
    
     }
     public void VerifyMandatoryFieldOfAddFeedback() {
			int i = 0;
			String actualText;
			String expectedText;

			List<WebElement> errorMessageLocator = findMultipleElement(
					By.xpath("//span[contains(@class,'invalid-feedback')]"), 45);
			String[] expectedValue = { "Feedback Name","Feedback Question","Answering Type" };
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
     public void clickOnActive()
     {		staticWait(2000);
    	 click(By.xpath("//div/span/a[@data-original-title='Active']"),"Active", 30);
    	 try {
    		 staticWait(2000);
    		 WebElement active = driver.findElement(By.xpath("//div[contains(text(),'Are you sure you want to mark the selected status from')]"));
    		 if (active.isDisplayed()) {
				logger.info("Notify Message PopUp opened succesfully");
				staticWait(2000);
				click(By.xpath("//div/button[@title='Cancel']"),"Cancel Button", 30);
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Notify Message PopUp not opened succesfully");
		}
     }
     public void clickOnInActive()
     {		staticWait(2000);
    	 click(By.xpath("//div/span/a[@data-original-title='Inactive']"),"InActive", 30);
    	 try {
    		 staticWait(2000);
    		 WebElement inactive = driver.findElement(By.xpath("//div[contains(text(),'Are you sure you want to mark the selected status from')]"));
    		 if (inactive.isDisplayed()) {
				logger.info("Notify Message PopUp opened succesfully");
				staticWait(2000);
				click(By.xpath("//div/button[text()=' Cancel']"),"Cancel Button", 30);
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Notify Message PopUp not opened succesfully");
		}
     }
     public void clickOnDelete()
     {		staticWait(2000);
    	 click(By.xpath("//div/span/a[@id='DeleteMultiple']"),"Delete", 30);
    	 try {
    		 staticWait(2000);
    		 WebElement delete = driver.findElement(By.xpath("//div[contains(text(),'Are you sure you want to ')]"));
    		 if (delete.isDisplayed()) {
				logger.info("Notify Message PopUp opened succesfully");
				staticWait(2000);
				click(By.xpath("//div/button[text()=' Cancel']"),"Cancel Button", 30);
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Notify Message PopUp not opened succesfully");
		}
    	 driver.navigate().refresh();
     }
     /*------------------------------------------------------------------------------------------------------------------------------------------*/
     /*Code for click testing of Canned Reply */
     public void clickOnCannedReply()
     {		staticWait(2000);
    	 click(By.xpath("//ul/li/a[@data-original-title='Canned Reply']"),"Canned Reply", 30);
    	 try {
    		 WebElement cannedReplyPage = driver.findElement(By.xpath("//div/span[text()='Canned Reply Template']"));
    		 if (cannedReplyPage.isDisplayed()) {
				logger.info("Canned Reply Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Canned Reply Page not opened succesfully");
		}
     }
     public void clickOnAddCannedReply()
     {		staticWait(2000);
    	 click(By.xpath("//div/span/a[@data-original-title='New canned reply']"),"New canned reply", 30);
    	 try {
    		 WebElement newCannedReplyPage = driver.findElement(By.xpath("//div/h5[text()='Manage Canned Reply Template']"));
    		 if (newCannedReplyPage.isDisplayed()) {
				logger.info("New canned reply Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("New canned reply Page not opened succesfully");
		}
     }
     public void clickOnSaveNewCannedReply()
     {		staticWait(2000);
    	 click(By.xpath("//div/a[@id='btnSave']"),"Save Button", 30);
    
     }
     public void clickOnCancelNewCannedReply()
     {		staticWait(2000);
    	 click(By.xpath("//div/a[@id='ancgotolistscreen']"),"Cancel Button", 30);
    
     }
     public void VerifyMandatoryFieldOfManageCannedReplyTemplate() {
			int i = 0;
			String actualText;
			String expectedText;

			List<WebElement> errorMessageLocator = findMultipleElement(
					By.xpath("//span[contains(@class,'invalid-feedback')]"), 45);
			String[] expectedValue = { "Canned Reply Name","Status","Description" };
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
     /*------------------------------------------------------------------------------------------------------------------------------------------*/
     /*Code for click testing of Ticket Report */
     public void clickOnTicketReport()
     {		staticWait(2000);
    	 click(By.xpath("//ul/li/a[@data-original-title='Ticket Report']"),"Ticket Report", 30);
    	 try {
    		 WebElement cannedReplyPage = driver.findElement(By.xpath("//div/span[text()='Ticket Detail Report']"));
    		 if (cannedReplyPage.isDisplayed()) {
				logger.info("Ticket Detail Report Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Ticket Detail Report Page not opened succesfully");
		}
    	 driver.navigate().refresh();
     }
     /*------------------------------------------------------------------------------------------------------------------------------------------*/
     /*Code for click testing of Manage Service Board */
     public void clickOnManageServiceBoard()
     {		staticWait(2000);
    	 click(By.xpath("//ul/li/a[@data-original-title='Manage Service Board']"),"Manage Service Board", 30);
    	 try {
    		 WebElement manageServiceBoardPage = driver.findElement(By.xpath("//div/span[text()='Ticket Service Board']"));
    		 if (manageServiceBoardPage.isDisplayed()) {
				logger.info("Manage Service Board Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Manage Service Board Page not opened succesfully");
		}
     }
     public void clickOnAddManageServiceBoard()
     {		staticWait(2000);
    	 click(By.xpath("//div/span/a[@data-original-title='Add Ticket Service Board']"),"Add Ticket Service Board", 30);
    	 try {
    		 WebElement addmanageServiceBoardPage = driver.findElement(By.xpath("//div/span[text()='Add']"));
    		 if (addmanageServiceBoardPage.isDisplayed()) {
				logger.info("Add Ticket Service Board Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Add Ticket Service Board Page not opened succesfully");
		}
     }
     public void clickOnSave()
     {		staticWait(2000);
    	 click(By.xpath("//div/a[@data-original-title='Save']"),"Save Button", 30);
    
     }
     public void clickOnCancel()
     {		staticWait(3000);
    	 click(By.xpath("//div/a[@data-original-title='Cancel']"),"Cancel Button", 30);
    	 driver.navigate().refresh();
     }
     public void clickOnCancelForAddTicket()
     {		staticWait(3000);
    	 click(By.xpath("//div/a[@data-original-title='Click here to cancel ticket']"),"Cancel Button", 30);
    	 driver.navigate().refresh();
     }
     public void VerifyMandatoryFieldOfAddManageServiceBoard() {
			int i = 0;
			String actualText;
			String expectedText;

			List<WebElement> errorMessageLocator = findMultipleElement(
					By.xpath("//span[contains(@class,'invalid-feedback')]"), 45);
			String[] expectedValue = { "Ticket Service Board Name","Description"};
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
     /*------------------------------------------------------------------------------------------------------------------------------------------*/
     /*Code for click testing of Add ticket Group */
     public void clickOnAddticketGroup()
     {		staticWait(2000);
    	 click(By.xpath("//ul/li/a[@data-original-title='Add ticket Group']"),"Add ticket Group", 30);
    	 try {
    		 WebElement addticketGroupPage = driver.findElement(By.xpath("//div/span[text()='Add']"));
    		 if (addticketGroupPage.isDisplayed()) {
				logger.info("Add ticket Group Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Add ticket Group Page not opened succesfully");
		}
     }
     public void VerifyMandatoryFieldOAddticketGroup() {
			int i = 0;
			String actualText;
			String expectedText;

			List<WebElement> errorMessageLocator = findMultipleElement(
					By.xpath("//span[contains(@class,'invalid-feedback')]"), 45);
			String[] expectedValue = { "Ticket Group Name","Description"};
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
     /*------------------------------------------------------------------------------------------------------------------------------------------*/
     /*Code for click testing of Ticket Group */
     public void clickOnTicketGroup()
     {		staticWait(2000);
    	 click(By.xpath("//ul/li/a[@data-original-title='Ticket Group']"),"Ticket Group", 30);
    	 try {
    		 WebElement ticketGroupPage = driver.findElement(By.xpath("//div/span[text()='Ticket Group']"));
    		 if (ticketGroupPage.isDisplayed()) {
				logger.info("Ticket Group Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Ticket Group Page not opened succesfully");
		}
     }
     public void clickOnAddTicketGroup()
     {		staticWait(2000);
    	 click(By.xpath("//div/span/a[@data-original-title='Add Group']"),"Add Ticket Group", 30);
    	 try {
    		 WebElement addticketGroupPage = driver.findElement(By.xpath("//div/span[text()='Add']"));
    		 if (addticketGroupPage.isDisplayed()) {
				logger.info("Add Group Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Add Group Page not opened succesfully");
		}
     }
     /*------------------------------------------------------------------------------------------------------------------------------------------*/
     /*Code for click testing of SLA */
     public void clickOnSLA()
     {		staticWait(2000);
    	 click(By.xpath("//ul/li/a[@data-original-title='SLA']"),"SLA", 30);
    	 try {
    		 WebElement ticketGroupPage = driver.findElement(By.xpath("//div/span[text()='SLA']"));
    		 if (ticketGroupPage.isDisplayed()) {
				logger.info("SLA Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("SLA Page not opened succesfully");
		}
     }
     public void clickOnAddSLA()
     {		staticWait(2000);
    	 click(By.xpath("//div/span/a[@data-original-title='Add New']"),"Add SLA", 30);
    	 try {
    		 WebElement addSLA = driver.findElement(By.xpath("//div/span[text()='Add SLA']"));
    		 if (addSLA.isDisplayed()) {
				logger.info("Add SLA Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Add SLA Page not opened succesfully");
		}
     }
     public void VerifyMandatoryFieldOfSLA() {
			int i = 0;
			String actualText;
			String expectedText;

			List<WebElement> errorMessageLocator = findMultipleElement(
					By.xpath("//span[contains(@class,'invalid-feedback')]"), 45);
			String[] expectedValue = { "Policy Name","Policy Date ","Status","Description"};
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
     public void clickOnCheckBoxOfSLA()
     {		staticWait(2000);
         JavascriptExecutor js = ((JavascriptExecutor) driver);
         js.executeScript("window.scrollTo(0, -document.body.scrollHeight);");
    	 click(By.xpath("//div[@class='custom-control custom-checkbox']"),"Check Box", 30);
     }
     /*------------------------------------------------------------------------------------------------------------------------------------------*/
     /*Code for click testing of Knowledge Base */
     public void clickOnKnowledgeBase()
     {		staticWait(2000);
    	 click(By.xpath("//ul/li/a[@data-original-title='Knowledge Base']"),"Knowledge Base", 30);
    	 try {
    		 WebElement knowledgeBasePage = driver.findElement(By.xpath("//div/span[text()='Knowledge Base']"));
    		 if (knowledgeBasePage.isDisplayed()) {
				logger.info("Knowledge Base Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Knowledge Base Page not opened succesfully");
		}
     }
     public void clickOnAddKnowledgeBase()
     {		staticWait(2000);
    	 click(By.xpath("//div/span/a[@data-original-title='Add Ticket']"),"Add Ticket", 30);
    	 try {
    		 WebElement addknowledgeBasePage = driver.findElement(By.xpath("//div/span[text()='Add Ticket']"));
    		 if (addknowledgeBasePage.isDisplayed()) {
				logger.info("Add Ticket Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Add Ticket Page not opened succesfully");
		}
     }
     public void clickOnCancelAddTicket()
     {		staticWait(2000);
    	 click(By.xpath("//div/a[@data-original-title='Click here to cancel ticket']"),"Cancel button", 30);
    
     }
     public void clickOnExpandAllCollapseAll()
     {		staticWait(2000);
    	 click(By.xpath("//div/a[@class='ancExpandAllCollapseAll']"),"Expand All Collapse All", 30);
    	 driver.navigate().refresh();
     }
     /*------------------------------------------------------------------------------------------------------------------------------------------*/
     /*Code for click testing of Manage Category */
     public void clickOnManageCategory()
     {		staticWait(2000);
    	 click(By.xpath("//ul/li/a[@data-original-title='Manage Category']"),"Manage Category", 30);
    	 try {
    		 WebElement manageCategoryPage = driver.findElement(By.xpath("//div/span[text()='Manage Category']"));
    		 if (manageCategoryPage.isDisplayed()) {
				logger.info("Manage Category Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Manage Category Page not opened succesfully");
		}
     }
     public void clickOnAddManageCategory()
     {		staticWait(2000);
    	 click(By.xpath("//div/span/a[@data-original-title='Add New']"),"Add New", 30);
    	 try {
    		 WebElement manageCategoryPage = driver.findElement(By.xpath("//div/h5[text()='Add a New category']"));
    		 if (manageCategoryPage.isDisplayed()) {
				logger.info("Add a New category Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Add a New category Page not opened succesfully");
		}
     }
     public void clickOnUserGuide()
     {		staticWait(2000);
    	 click(By.xpath("(//span/a[text()='User Guide'])[2]"),"User Guide", 30);
    	 try {
    		 staticWait(2000);
    		 WebElement userGuidePage = driver.findElement(By.xpath("//div/strong[text()='Category Name']"));
    		 if (userGuidePage.isDisplayed()) {
				logger.info("User Guide popUp opened succesfully");
				//staticWait(2000);
				click(By.xpath("(//span/a[text()='User Guide'])[2]"),"Closed User Guide", 30);
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("User Guide popUp not opened succesfully");
		}
     }
     public void clickOnSaveAddNewcategory()
     {	 staticWait(2000);
    	 click(By.xpath("//div/a[@id='SaveCategory']"),"Save button", 30);
    
     }
     public void clickOnCancelAddNewcategory()
     {	 staticWait(2000);
    	 click(By.xpath("//div/a[@id='cancel']"),"Cancel button", 30);
    	 driver.navigate().refresh();
     }
     public void VerifyMandatoryFieldOfAddManageCategory() {
			int i = 0;
			String actualText;
			String expectedText;

			List<WebElement> errorMessageLocator = findMultipleElement(
					By.xpath("//span[contains(@class,'invalid-feedback')]"), 45);
			String[] expectedValue = { "Category Name","Status"};
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
     /*------------------------------------------------------------------------------------------------------------------------------------------*/
     /*Code for click testing of My Articles */
     public void clickOnMyArticles()
     {		staticWait(2000);
    	 click(By.xpath("//ul/li/a[@data-original-title='My Articles']"),"My Articles", 30);
    	 try {
    		 WebElement myArticlesPage = driver.findElement(By.xpath("//div/span[text()='Manage Articles']"));
    		 if (myArticlesPage.isDisplayed()) {
				logger.info("Manage Articles Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Manage Articles Page not opened succesfully");
		}
     }
     public void clickOnAddMyArticles()
     {		staticWait(2000);
    	 click(By.xpath("//div/span/a[@data-original-title='Add Article']"),"Add Article", 30);
    	 try {
    		 WebElement myArticlesPage = driver.findElement(By.xpath("//div/span[text()='Add Article']"));
    		 if (myArticlesPage.isDisplayed()) {
				logger.info("Manage Articles Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Manage Articles Page not opened succesfully");
		}
     }
     public void clickOnSaveAddArticle()
     {	 staticWait(2000);
    	 click(By.xpath("//div/a[@id='SaveArticle']"),"Save button", 30);
    
     }
     public void VerifyMandatoryFieldOfAddArticle() {
			int i = 0;
			String actualText;
			String expectedText;

			List<WebElement> errorMessageLocator = findMultipleElement(
					By.xpath("//span[contains(@class,'invalid-feedback')]"), 45);
			String[] expectedValue = { "Title","Category","Assign To","Short Description","Description"};
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
     public void clickOnCheckBoxOfMyArticles()
     {	 staticWait(2000);
    	 click(By.xpath("//div[@class='custom-control custom-checkbox']"),"Check Box", 30);
    
     }
     public void clickOnDeleteMyArticles()
     {		staticWait(2000);
    	 click(By.xpath("//div/span/a[@data-original-title='Delete']"),"Delete", 30);
    	 try {
    		 staticWait(2000);
    		 WebElement deleteNotifymessagePopUp = driver.findElement(By.xpath("//div[text()='Are you sure you want to delete these record(s)?']"));
    		 if (deleteNotifymessagePopUp.isDisplayed()) {
				logger.info("Delete Notify Message PopUp opened succesfully");
				click(By.xpath("//div/button[@title='Cancel']"),"Cancel Button", 30);
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Delete Notify Message PopUp not opened succesfully");
		}
     }
     public void clickOnCloneButton()
     {		staticWait(2000);
    	 click(By.xpath("//div/span/a[@data-original-title='Clone']"),"Clone Button", 30);
    	 try {
    		 staticWait(2000);
    		 WebElement cloneNotifyMessagePopUp = driver.findElement(By.xpath("//div/h5[text()='Clone']"));
    		 if (cloneNotifyMessagePopUp.isDisplayed()) {
				logger.info("Clone Notify Message PopUp opened succesfully");
				
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Clone Notify Message PopUp not opened succesfully");
		}
     }
     public void clickOnUserGuideOfClone()
     {		staticWait(2000);
    	 click(By.xpath("(//span/a[text()='User Guide'])[2]"),"User Guide", 30);
    	 try {
    		 staticWait(2000);
    		 WebElement userGuidePage = driver.findElement(By.xpath("//div[contains(text(),'The ‘Clone’ is meant to copy the Article in another Category. Select the Category and Save it')]"));
    		 if (userGuidePage.isDisplayed()) {
				logger.info("User Guide popUp opened succesfully");
				//staticWait(2000);
				click(By.xpath("(//span/a[text()='User Guide'])[2]"),"Closed User Guide", 30);
				click(By.xpath("//div/a[@id='Cancel']"),"Cancel Button", 30);
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("User Guide popUp not opened succesfully");
		}
     }
     public void clickOnMoveButton()
     {		staticWait(2000);
    	 click(By.xpath("//div/span/a[@data-original-title='Move']"),"Move Button", 30);
    	 try {
    		 staticWait(2000);
    		 WebElement moveNotifyMessagePopUp = driver.findElement(By.xpath("//div/h5[text()='Move']"));
    		 if (moveNotifyMessagePopUp.isDisplayed()) {
				logger.info("Move Notify Message PopUp opened succesfully");
				
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Move Notify Message PopUp not opened succesfully");
		}
     }
     public void clickOnUserGuideOfMove()
     {		staticWait(2000);
    	 click(By.xpath("(//span/a[text()='User Guide'])[2]"),"User Guide", 30);
    	 try {
    		 staticWait(2000);
    		 WebElement userGuidePage = driver.findElement(By.xpath("//div[contains(text(),'The ‘Move’ is meant to shift the Article to another Category')]"));
    		 if (userGuidePage.isDisplayed()) {
				logger.info("User Guide popUp opened succesfully");
				//staticWait(2000);
				click(By.xpath("(//span/a[text()='User Guide'])[2]"),"Closed User Guide", 30);
				click(By.xpath("//div/a[@id='Cancel']"),"Cancel Button", 30);
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("User Guide popUp not opened succesfully");
		}
    	 driver.navigate().refresh();
     }
     /*------------------------------------------------------------------------------------------------------------------------------------------*/
     /*Code for click testing of Product */
     public void clickOnProduct()
     {		staticWait(2000);
     JavascriptExecutor js = (JavascriptExecutor) driver;
     WebElement Element = driver.findElement(By.xpath("//ul/li/a[@data-original-title='Add ticket Group']"));
     js.executeScript("arguments[0].scrollIntoView();", Element);
    	 click(By.xpath("//ul/li/a[@data-original-title='Product']"),"Product", 30);
    	 try {
    		 WebElement productPage = driver.findElement(By.xpath("//div/span[text()='Product']"));
    		 if (productPage.isDisplayed()) {
				logger.info("Product Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Product Page not opened succesfully");
		}
     }
     public void clickOnAddProduct()
     {		staticWait(2000);
    	 click(By.xpath("//div/span/a[@data-original-title='Add New']"),"Add Product", 30);
    	 try {
    		 WebElement addProductPage = driver.findElement(By.xpath("//div/span[text()='Manage Product']"));
    		 if (addProductPage.isDisplayed()) {
				logger.info("Add product Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Add Product Page not opened succesfully");
		}
     }
     public void clickOnSaveProduct()
     {	 staticWait(2000);
    	 click(By.xpath("//div/button[@id='btnSubmit']"),"Save button", 30);
    
     }
     public void clickOnCancelProduct()
     {	 staticWait(2000);
    	 click(By.xpath("//div/a[@data-original-title='Cancel']"),"Cancel button", 30);
    
     }
     public void VerifyMandatoryFieldOfAddProduct() {
			int i = 0;
			String actualText;
			String expectedText;

			List<WebElement> errorMessageLocator = findMultipleElement(
					By.xpath("//span[contains(@class,'invalid-feedback')]"), 45);
			String[] expectedValue = { "Product Name"};
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
