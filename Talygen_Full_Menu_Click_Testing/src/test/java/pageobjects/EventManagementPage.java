package pageobjects;

import static reporting.ComplexReportFactory.getTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.relevantcodes.extentreports.LogStatus;

import utils.WebBasePage;

public class EventManagementPage extends WebBasePage{
	WebDriver driver ;
	public EventManagementPage(WebDriver driver) {
		super(driver, "EventManagementPage");
		this.driver=driver;
		// TODO Auto-generated constructor stub
	}
	public void clickFullMenuDropDown() {
		staticWait(3000);
        click(By.xpath("//span[text()='Full Menu']"), "Full Menu", 30);
        
    }
	/*
	 * Code for click testing of Calendar for Event Management
	 */
     public void clickOnEventMangement()
     {		staticWait(2000);
    	 click(By.xpath("//ul/li[@data-name='Event Management']/span"),"Event Management", 30);
    	 
     }
     public void clickOnCalenderforEventMangement()
     {		staticWait(2000);
    	 click(By.xpath("//div/ul/li/a[@data-original-title='Calendar']"),"Calendar", 30);
    	
    	 try {
    		 WebElement calendar = driver.findElement(By.xpath("//div/span[text()='Calendar']"));
    		 if (calendar.isDisplayed()) {
				logger.info("Calendar Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Calendar Page not opened succesfully");
		}
    	 driver.navigate().refresh();
     }
     /*---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
     /*
 	 * Code for click testing of Google Calendar for Event Management
 	 */
     public void clickOnGoogleCalenderforEventMangement()
     {		staticWait(2000);
    	 click(By.xpath("//div/ul/li/a[@data-original-title='Google Calendar']"),"Google Calendar", 30);
    	
    	 try {
    		 WebElement googlecalendar = driver.findElement(By.xpath("//div/span[text()='Manage Calendar']"));
    		 if (googlecalendar.isDisplayed()) {
				logger.info("Manage Calendar Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Manage Calendar Page not opened succesfully");
		}
     }
     public void clickOnSave()
     {		staticWait(2000);
    	 click(By.xpath("//div/button[@data-original-title='Save']"),"Save Button", 30);
     }
     public void clickOnCancel()
     {		staticWait(2000);
    	 click(By.xpath("//div/button[@data-original-title='Cancel']"),"Cancel Button", 30);
    	 driver.navigate().refresh();
     }
     public void VerifyMandatoryFieldValidation() {
			int i = 0;
			String actualText;
			String expectedText;

			List<WebElement> errorMessageLocator = findMultipleElement(
					By.xpath("//span[contains(@class,'field-validation-valid invalid-feedback')]"), 45);
			String[] expectedValue = { "Name","Calendar Id" };
			for (Object expected : expectedValue) {
				WebElement AsteriskField = findElementVisibility(By.xpath("//label[contains(text(),'"+ expected +"')]/ancestor::div[@class='form-group ']/descendant::span[@class='mandatory']"), 45);
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
     /*---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
     /*
 	 * Code for click testing of  Event Management
 	 */
     public void clickOneventMangement()
     {		staticWait(2000);
    	 click(By.xpath("//div/ul/li/a[@data-original-title='Event Management']"),"Event Management", 30);
    	
    	 try {
    		 WebElement eventManagement = driver.findElement(By.xpath("//div/span[text()='Event']"));
    		 if (eventManagement.isDisplayed()) {
				logger.info("Event Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Event Page not opened succesfully");
		}
     }
     public void clickOnFilter()
     {		staticWait(2000);
    	 click(By.xpath("//div/span/a[@data-original-title='Filter']"),"Filter", 30);
    	
    	 try {
    		 WebElement filterPage = driver.findElement(By.xpath("//div/h5/span[text()='Filter']"));
    		 if (filterPage.isDisplayed()) {
				logger.info("Filter Page opened succesfully");
				click(By.xpath("//div/h4[contains(text(),'Search')]/ancestor::div[@class='modal-content']/descendant::button[@class='close']"),"Close button", 30);
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Filter Page not opened succesfully");
		}
     }
     public void clickOnCardView()
     {		staticWait(2000);
    	 click(By.xpath("//div/span/a[@data-original-title='Card View']"),"Card View", 30);
    	
    	 try {
    		 WebElement listViewPage = driver.findElement(By.xpath("//div/span/a[@data-original-title='List View']"));
    		 if (listViewPage.isDisplayed()) {
				logger.info("Card View Page viewed succesfully");
			
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Card View Page not opened succesfully");
		}
     }
     public void clickOnManageView()
     {		staticWait(2000);
    	 click(By.xpath("//div/span/a[@data-original-title='Manage View']"),"Manage view", 30);
    	
    	 try {
    		 WebElement manageViewPage = driver.findElement(By.xpath("//div/h4[text()='Manage View']"));
    		 if (manageViewPage.isDisplayed()) {
				logger.info("Manage View Page opened succesfully");
				staticWait(2000);
				//click(By.xpath("//div/h4[contains(text(),'Manage View')]/ancestor::div[@class='modal-content']/descendant::button[@class='close']/i"),"Close button", 30);
				WebElement closeButton = driver.findElement(By.xpath("//div/h4[contains(text(),'Manage View')]/ancestor::div[@class='modal-content']/descendant::button[@class='close']/i"));
				Actions action=new Actions(driver);
				action.moveToElement(closeButton).click().perform();
				logger.info("Close Manage View Page");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Manage View Page not opened succesfully");
		}
    	 driver.navigate().refresh();
     }
     public void clickOnAddEvent()
     {		staticWait(3000);
    	 click(By.xpath("//div/span/a[@data-original-title='Add Event']"),"Add Event", 30);
    	
    	 try {
    		 WebElement addEvent = driver.findElement(By.xpath("//div/span[text()='Manage Event']"));
    		 if (addEvent.isDisplayed()) {
				logger.info("Manage Event Page opened succesfully");
		
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Manage Event Page not opened succesfully");
		}
     }
     public void clickOnSaveEvent()
     {		staticWait(2000);
    	 click(By.xpath("//div/a[@data-original-title='Save']"),"Save Button", 30);
     }
     public void clickOnCancelEvent()
     {		staticWait(2000);
    	 click(By.xpath("//div/a[@data-original-title='Cancel']"),"Cancel Button", 30);
    	 driver.navigate().refresh();
     }
     public void VerifyMandatoryFieldsOfAddEvent() {
			int i = 0;
			String actualText;
			String expectedText;

			List<WebElement> errorMessageLocator = findMultipleElement(
					By.xpath("//div[contains(@class,'invalid-feedback')]"), 45);
			String[] expectedValue = { "Event Name","Budget","Start Date","End Date","Organizer","Description" };
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
     /*---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
     /*
 	 * Code for click testing of Manage Venue
 	 */
     public void clickOnManageVenue()
     {		staticWait(2000);
    	 click(By.xpath("//div/ul/li/a[@data-original-title='Manage Venue']"),"Manage venue", 30);
    	
    	 try {
    		 WebElement managevenue = driver.findElement(By.xpath("//div/span[text()='Manage Venue']"));
    		 if (managevenue.isDisplayed()) {
				logger.info("Manage Venue Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Manage Venue Page not opened succesfully");
		}
     }
     public void VerifyMandatoryFieldsOfManageVenue() {
			int i = 0;
			String actualText;
			String expectedText;

			List<WebElement> errorMessageLocator = findMultipleElement(
					By.xpath("//span[contains(@class,'invalid-feedback')]"), 45);
			String[] expectedValue = { "Venue","Capacity","Company Location"};
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
     /*---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
     /*
 	 * Code for click testing of User Availability 
 	 */
     public void clickOnUserAvailability ()
     {		staticWait(3000);
    	 click(By.xpath("//div/ul/li/a[@data-original-title='User Availability ']"),"User Availability", 30);
    	
    	 try {
    		 WebElement userAvailability = driver.findElement(By.xpath("//div/span[text()='User Availability ']"));
    		 if (userAvailability.isDisplayed()) {
				logger.info("User Availability Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("User Availability Page not opened succesfully");
		}
     }
     public void clickOnAddUserAvailability ()
     {		staticWait(2000);
    	 click(By.xpath("//div/span/a[@data-original-title='Add New User Status']")," Add User Availability", 30);
    	
    	 try {
    		 WebElement adduserAvailability = driver.findElement(By.xpath("//div/span[text()='Add New User Status']"));
    		 if (adduserAvailability.isDisplayed()) {
				logger.info("Add New User Status Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Add New User Status Page not opened succesfully");
		}
     }
     public void VerifyMandatoryFieldsOfUserAvailability() {
			int i = 0;
			String actualText;
			String expectedText;

			List<WebElement> errorMessageLocator = findMultipleElement(
					By.xpath("//span[contains(@class,'field-validation-valid text-danger')]"), 45);
			String[] expectedValue = { "Title","Start Time","End Time","Start Date "};
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
     /*---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
     /*
 	 * Code for click testing of Dashboard
 	 */
     public void clickOnDashboard ()
     {		staticWait(3000);
    	 click(By.xpath("//span/a[text()='Dashboard']"),"Dashboard", 30);
    	
    	 try {
    		 WebElement dashboard = driver.findElement(By.xpath("//div/span[text()=' Dashboard']"));
    		 if (dashboard.isDisplayed()) {
				logger.info("Dashboard Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Dashboard Page not opened succesfully");
		}
     }
     public void clickOnMyView ()
     {		staticWait(3000);
    	 click(By.xpath("//span/a[text()='My View']"),"My View", 30);
     }
     public void clickOnTeamView ()
     {		staticWait(3000);
    	 click(By.xpath("//span/a[@id='teamview']"),"Team View", 30);
    	
    	 try {
    		 WebElement teamView = driver.findElement(By.xpath("//div/h5/span[text()='Team View']"));
    		 if (teamView.isDisplayed()) {
				logger.info("Team View opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Team View not opened succesfully");
		}
     }
     public void clickOnChangeView ()
     {		staticWait(3000);
    	 click(By.xpath("//div[@id='ddlChangeView']"),"Change View", 30);
    	 click(By.xpath("//div/a[text()='All']"),"All", 30);
    	 
    	 driver.navigate().refresh();
     }
}
