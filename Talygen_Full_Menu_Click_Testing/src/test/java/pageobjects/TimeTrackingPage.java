package pageobjects;

import static reporting.ComplexReportFactory.getTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.LogStatus;

import utils.WebBasePage;

public class TimeTrackingPage extends WebBasePage{
	WebDriver driver ;
	public TimeTrackingPage(WebDriver driver) {
		super(driver, "TimeTrackingPage");
		this.driver=driver;
		// TODO Auto-generated constructor stub
	}
	public void clickFullMenuDropDown() {
		staticWait(3000);
        click(By.xpath("//span[text()='Full Menu']"), "Full Menu", 30);
        
    }
	/*
	 * Code for click testing of Audit Rule for Time Tracking
	 */
     public void clickOnTimeTracking()
     {		staticWait(2000);
    	 click(By.xpath("//ul/li[@data-name='Time Tracking']/span"),"Time Tracking", 30);
    	 
     }
     public void clickOnAuditRule()
     {		staticWait(2000);
    	 click(By.xpath("//div/ul/li/a[@data-original-title='Audit Rule']"),"Audit Rule", 30);
    	
    	 try {
    		 WebElement auditRulePage = driver.findElement(By.xpath("//div/span[contains(text(),'Audit Rule')]"));
    		 if (auditRulePage.isDisplayed()) {
				logger.info("Audit Rule Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Audit Rule Page not opened succesfully");
		}
     }
     public void clickOnAddAuditRule()
     {		staticWait(2000);
    	 click(By.xpath("//div/span/a[@data-original-title='Add New Rule']"),"Add Audit Rule", 30);
    	
    	 try {
    		 WebElement addauditRulePage = driver.findElement(By.xpath("//div/span[contains(text(),'Audit Rule')]"));
    		 if (addauditRulePage.isDisplayed()) {
				logger.info("Add Audit Rule Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Add Audit Rule Page not opened succesfully");
		}
     }
     public void clickOnSaveButton()
     {		staticWait(2000);
    	 click(By.xpath("//div/a[@data-original-title='Save']"),"Save Button", 30);
     }
     public void clickOnCancelButton()
     {		staticWait(2000);
    	 click(By.xpath("//div/a[text()='Cancel']"),"Cancel Button", 30);
     }
     public void VerifyMandatoryFieldValidation() {
			int i = 0;
			String actualText;
			String expectedText;

			List<WebElement> errorMessageLocator = findMultipleElement(
					By.xpath("//span[contains(@class,'invalid-feedback')]"), 45);
			String[] expectedValue = { "Rule Name","User","Rule Type" };
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
     public void clickOnCheckBox()
     {		staticWait(2000);
    	 click(By.xpath("//table/thead/tr/th/div[@class='custom-control custom-checkbox']"),"Check Box", 30);
     }
     public void clickOnRemove()
     {		staticWait(2000);
    	 click(By.xpath("//div/span/a[@id='DeleteMultiple']"),"Delete Button", 30);
    	
    	 try {
    		 staticWait(2000);
    		 WebElement notifyMessagePopUp = driver.findElement(By.xpath("//div[contains(text(),'Are you sure you want to delete these record')]"));
    		 if (notifyMessagePopUp.isDisplayed()) {
				logger.info("Delete Notify Message PopUp opened succesfully");
				 click(By.xpath("(//div/button[contains(text(),'Cancel')])[2]"),"Cancel Button", 30);
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Delete Notify Message PopUp not opened succesfully");
		}
    	 driver.navigate().refresh();
     }
     /*------------------------------------------------------------------------------------------------------------------------------------------*/
     /*Code for click testing of Bulk Time Entry */
     public void clickOnBulkTimeEntry()
     {		staticWait(2000);
    	 click(By.xpath("//ul/li/a[@data-original-title='Bulk Time Entry']"),"Bulk Time Entry", 30);
    	 try {
    		 WebElement bulkTimeEntryPage = driver.findElement(By.xpath("//div/span[text()='Bulk Time Entry']"));
    		 if (bulkTimeEntryPage.isDisplayed()) {
				logger.info("Bulk Time Entry Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Bulk Time Entry Page not opened succesfully");
		}
     }
     public void clickOnFillTimeEntry()
     {		staticWait(2000);
    	 click(By.xpath("//div/span/a[@data-original-title='Click here to fill time entry.']"),"Fill Time Entry", 30);
    	 try {
    		 WebElement fillTimeEntryPage = driver.findElement(By.xpath("//div/span[text()='Please correct the highlighted errors shown.']"));
    		 if (fillTimeEntryPage.isDisplayed()) {
				logger.info("Fill Time Entry notify message popup opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Fill Time Entry notify message popup not opened succesfully");
		}
     }
     public void clickOnCloseNotifyMessagePopup()
     {		staticWait(2000);
    	 click(By.xpath("//button[@id='closenotifymessage']"),"Close Notify Message PopUp", 30);
    	 driver.navigate().refresh();
     }
     /*------------------------------------------------------------------------------------------------------------------------------------------*/
     /*Code for click testing of Flag Track Entry */
     public void clickOnFlagTrackEntry()
     {		staticWait(3000);
    	 click(By.xpath("//ul/li/a[@data-original-title='Flag Track Entry']"),"Flag Track Entry", 30);
    	 try {
    		 staticWait(2000);
    		 WebElement flagTrackEntryPage = driver.findElement(By.xpath("//div/span[contains(text(),'Flag Track Entry')]"));
    		 if (flagTrackEntryPage.isDisplayed()) {
				logger.info("Flag Track Entry Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Flag Track Entry Page not opened succesfully");
		}
    	 driver.navigate().refresh();
     }
     /*------------------------------------------------------------------------------------------------------------------------------------------*/
     /*Code for click testing of Project Report */
     public void clickOnProjectReport()
     {		staticWait(2000);
    	 click(By.xpath("//ul/li/a[@data-original-title='Project Report']"),"Project Report", 30);
    	 try {
    		 WebElement projectReportPage = driver.findElement(By.xpath("//div/span[contains(text(),'Project Reports')]"));
    		 if (projectReportPage.isDisplayed()) {
				logger.info("Project Report Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Project Report Page not opened succesfully");
		}
    	 driver.navigate().refresh();
     }
     /*------------------------------------------------------------------------------------------------------------------------------------------*/
     /*Code for click testing of Time Report */
     public void clickOnTimeReport()
     {		staticWait(2000);
    	 click(By.xpath("//ul/li/a[@data-original-title='Time Report']"),"Time Report", 30);
    	 try {
    		 WebElement timeReportPage = driver.findElement(By.xpath("//div/span[contains(text(),'Project Reports')]"));
    		 if (timeReportPage.isDisplayed()) {
				logger.info("Project Report Page opened succesfully");
				driver.navigate().refresh();
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Project Report Page not opened succesfully");
		}
    	 
     }
     /*------------------------------------------------------------------------------------------------------------------------------------------*/
     /*Code for click testing of Time Approval */
     public void clickOnTimeApproval()
     {		staticWait(2000);
    	 click(By.xpath("//ul/li/a[@data-original-title='Time Approval']"),"Time Approval", 30);
    	 try {
    		 WebElement timeApprovalPage = driver.findElement(By.xpath("//div/span[contains(text(),'Timesheet Approvals')]"));
    		 if (timeApprovalPage.isDisplayed()) {
				logger.info("Time Approval Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Time Approval Page not opened succesfully");
		}
     }
     public void clickOnViewHistory()
     {		staticWait(2000);
    	 click(By.xpath("//div/span/a[@data-original-title='View History']"),"View History", 30);
    	 try {
    		 WebElement viewHistoryPage = driver.findElement(By.xpath("//span[contains(text(),'Timesheet Approvals History')]"));
    		 if (viewHistoryPage.isDisplayed()) {
				logger.info("Timesheet Approvals History Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Timesheet Approvals History Page not opened succesfully");
		}
     }
     public void clickOnBackToList()
     {		staticWait(2000);
    	 click(By.xpath("//a/span[text()='Back to list']"),"Back to list", 30);
    	 driver.navigate().refresh();
     }
     /*------------------------------------------------------------------------------------------------------------------------------------------*/
     /*Code for click testing of Timesheet */
     public void clickOnTimesheet()
     {		staticWait(2000);
    	 click(By.xpath("//ul/li/a[@data-original-title='Timesheet']"),"Timesheet", 30);
    	 try {
    		 WebElement timesheetPage = driver.findElement(By.xpath("//span[contains(text(),'General Timesheet')]"));
    		 if (timesheetPage.isDisplayed()) {
				logger.info("Timesheet Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Timesheet Page not opened succesfully");
		}
    	 driver.navigate().refresh();
     }
     public void clickOnsaveAsDraft()
     {		staticWait(2000);
    	 click(By.xpath("//div/a[@id='btnSaveAsDraft']"),"Save As Draft", 30);
    	 try {
    		 WebElement saveAsDraftNotifyMessage = driver.findElement(By.xpath("//div/span[contains(text(),'Please enter hour(s)')]"));
    		 if (saveAsDraftNotifyMessage.isDisplayed()) {
				logger.info("Save As draft notify message popup opened succesfully");
				 click(By.xpath("//button[@id='closenotifymessage']"),"Close notify message popup", 30);
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Save As draft notify message popup not opened succesfully");
		}
     }
     public void clickOnSendForApproval()
     {		staticWait(2000);
    	 click(By.xpath("//div/span/a[@data-original-title='Send For Approval']"),"Send For Approval", 30);
    	 try {
    		 WebElement sendForApprovalNotifyMessage = driver.findElement(By.xpath("//div/span[contains(text(),'Please enter hour(s)')]"));
    		 if (sendForApprovalNotifyMessage.isDisplayed()) {
				logger.info("Send For Approval notify message popup opened succesfully");
				 click(By.xpath("//button[@id='closenotifymessage']"),"Close notify message popup", 30);
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Send For Approval notify message popup not opened succesfully");
		}
     }
     /*------------------------------------------------------------------------------------------------------------------------------------------*/
     /*Code for click testing of Time Track */
     public void clickOnTimeTrack()
     {		staticWait(2000);
    	 click(By.xpath("//ul/li/a[@data-original-title='Time Track']"),"Time Track", 30);
    	 try {
    		 WebElement timeTrackPage = driver.findElement(By.xpath("//span[contains(text(),'Track Time')]"));
    		 if (timeTrackPage.isDisplayed()) {
				logger.info("Time Track Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Time Track Page not opened succesfully");
		}
     }
     public void clickOnHideTimeTracking()
     {		staticWait(2000);
    	 click(By.xpath("//div/a[@id='aHide']"),"Hide Time Tracking", 30);
     }
     public void clickOnListing()
     {		staticWait(2000);
    	 click(By.xpath("//div/span/a[@data-original-title='Listing']"),"Listing", 30);
    	 try {
    		 WebElement listingPage = driver.findElement(By.xpath("//span[contains(text(),' Activities Completed by You')]"));
    		 if (listingPage.isDisplayed()) {
				logger.info("Listing Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Listing Page not opened succesfully");
		}
     }
     public void clickOnBillable()
     {		staticWait(2000);
    	 click(By.xpath("//div/span/a[@data-original-title='Billable']"),"Billable", 30);
    	 try {
    		 WebElement billableNotifyMessage = driver.findElement(By.xpath("//div/span[contains(text(),'Please select record(s) for further action!')]"));
    		 if (billableNotifyMessage.isDisplayed()) {
				logger.info("Billable notify message popup opened succesfully");
				 click(By.xpath("//button[@id='closenotifymessage']"),"Close notify message popup", 30);
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Billable notify message popup not opened succesfully");
		}
     }
     public void clickOnNonBillable()
     {		staticWait(2000);
    	 click(By.xpath("//div/span/a[@data-original-title='  Non-Billable']"),"Non-Billable", 30);
    	 try {
    		 WebElement nonBillableNotifyMessage = driver.findElement(By.xpath("//div/span[contains(text(),'Please select record(s) for further action!')]"));
    		 if (nonBillableNotifyMessage.isDisplayed()) {
				logger.info("Non Billable notify message popup opened succesfully");
				 click(By.xpath("//button[@id='closenotifymessage']"),"Close notify message popup", 30);
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Non Billable notify message popup not opened succesfully");
		}
     }
     public void clickOnDeleteEntries()
     {		staticWait(2000);
    	 click(By.xpath("//div/span/a[@data-original-title='Delete Entries']"),"Delete Entries", 30);
    	 try {
    		 WebElement deleteEntriesNotifyMessage = driver.findElement(By.xpath("//div/span[contains(text(),'Please select record(s) for further action!')]"));
    		 if (deleteEntriesNotifyMessage.isDisplayed()) {
				logger.info("Delete Entries notify message popup opened succesfully");
				 click(By.xpath("//button[@id='closenotifymessage']"),"Close notify message popup", 30);
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Delete Entries notify message popup not opened succesfully");
		}
     }
     public void clickOnCalendarView()
     {		staticWait(2000);
    	 click(By.xpath("(//div/span/a[@data-original-title='Calendar View'])[2]"),"Calendar View", 30);
    	 try {
    		 WebElement calendarViewPage = driver.findElement(By.xpath("//span[contains(text(),'Calendar View')]"));
    		 if (calendarViewPage.isDisplayed()) {
				logger.info("Calendar View Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Calendar View Page not opened succesfully");
		}
    	 driver.navigate().refresh();
     }
     /*------------------------------------------------------------------------------------------------------------------------------------------*/
     /*Code for click testing of Work Diary */
     public void clickOnWorkDiary()
     {		staticWait(2000);
    	 click(By.xpath("//ul/li/a[@data-original-title='Work Diary']"),"Work Diary", 30);
    	 try {
    		 WebElement workDiaryPage = driver.findElement(By.xpath("//span[contains(text(),'Work Diary')]"));
    		 if (workDiaryPage.isDisplayed()) {
				logger.info("Work Diary Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Work Diary Page not opened succesfully");
		}
     }
     public void clickOnAction()
     {		staticWait(2000);
    	 click(By.xpath("//div/span/a[@data-original-title='Action']"),"Action", 30);
    	 try {
    		 staticWait(2000);
    		 WebElement actionDropDownPage = driver.findElement(By.xpath("//span/a[@data-original-title='Select All']"));
    		 if (actionDropDownPage.isDisplayed()) {
				logger.info("Action Drop Down Menu opened succesfully");
				 click(By.xpath("//i[@id='closeaction']")," Close Action Drop Down", 30);
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Action Drop Down Menu not opened succesfully");
		}
     }
     public void clickOnViewFlaggedScreenshot()
     {		staticWait(2000);
    	 click(By.xpath("//div/span/a[@data-original-title='View Flagged Screenshot']"),"View Flagged Screenshot", 30);
    	 try {
    		 WebElement viewFlaggedScreenshotPage = driver.findElement(By.xpath("//span[contains(text(),'Flagged  Screenshot')]"));
    		 if (viewFlaggedScreenshotPage.isDisplayed()) {
				logger.info("View Flagged Screenshot Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("View Flagged Screenshot Page not opened succesfully");
		}
    	 driver.navigate().refresh();
     }
}
