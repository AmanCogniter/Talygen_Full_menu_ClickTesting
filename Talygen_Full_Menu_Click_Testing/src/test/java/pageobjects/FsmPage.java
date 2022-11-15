package pageobjects;

import static reporting.ComplexReportFactory.getTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.relevantcodes.extentreports.LogStatus;

import utils.WebBasePage;

public class FsmPage extends WebBasePage{
	WebDriver driver ;
	public FsmPage(WebDriver driver) {
		super(driver, "FsmPage");
		this.driver=driver;
		// TODO Auto-generated constructor stub
	}
	public void clickFullMenuDropDown() {
		staticWait(3000);
        click(By.xpath("//span[text()='Full Menu']"), "Full Menu", 30);
        
    }
	/*
	 * Code for click testing of Add Ticket for fsm
	 */
     public void clickOnFSMLink()
     {		staticWait(2000);
    	 click(By.xpath("//ul/li[@data-name='FSM']/span"),"FSM", 30);
    	 
     }
     public void clickOnAddTicket()
     {		staticWait(2000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='Add Ticket'])[2]"),"Add Ticket", 30);
    	
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
     public void clickOnSaveAsDraftButton()
     {		staticWait(2000);
    	 click(By.xpath("//div/a[@id='btnSaveDraft']"),"Save Button", 30);
    	 try {
    		 WebElement saveAsDraft = driver.findElement(By.xpath("//div/span[contains(text(),'Please correct the highlighted errors')]"));
    		 if (saveAsDraft.isDisplayed()) {
				logger.info("Save As Draft button clicked succesfully");
				click(By.xpath("//button[@id='closenotifymessage']"),"Close Notify Message", 30);
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Save As Draft button not clicked");
		}
    	 
     }
     public void VerifyMandatoryFieldValidation() {
			int i = 0;
			String actualText;
			String expectedText;

			List<WebElement> errorMessageLocator = findMultipleElement(
					By.xpath("//span[contains(@class,'invalid-feedback')]"), 45);
			String[] expectedValue = { "Subject","Assigned To Department","Priority"};
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
     public void clickOnCancelButton()
     {		staticWait(3000);
    	 click(By.xpath("//div/a[@data-original-title='Click here to cancel ticket']"),"Cancel", 30);
    	 driver.navigate().refresh();
     }
     /*------------------------------------------------------------------------------------------------------------------------------------------*/
     /*Code for click testing of  Call Center Sync Status */
     public void clickOnCallCenterSyncStatus()
     {		staticWait(2000);
    	 click(By.xpath("//div/ul/li/a[@data-original-title=' Call Center Sync Status']"),"Call Center Sync Status", 30);
    	
    	 try {
    		 WebElement callCenterSyncStatus = driver.findElement(By.xpath("//div/span[text()=' Call Center Sync Status']"));
    		 if (callCenterSyncStatus.isDisplayed()) {
				logger.info("Call Center Sync Status Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Call Center Sync Status Page not opened succesfully");
		}
    	 driver.navigate().refresh();
     }
     /*------------------------------------------------------------------------------------------------------------------------------------------*/
     /*Code for click testing of Connector */
     public void clickOnConnector()
     {		staticWait(2000);
     click(By.xpath("(//div/ul/li/a[@data-original-title='Connector'])[3]"),"Connector", 30);
    	
    	 try {
    		 WebElement connector = driver.findElement(By.xpath("//div/a/span[text()='Status Code Mapping']"));
    		 if (connector.isDisplayed()) {
				logger.info("Connector Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Connector Page not opened succesfully");
		}
     }
     public void clickOnStatusCodeMapping()
     {		staticWait(2000);
     WebElement goTo = driver.findElement(By.xpath("//div/ul/li/a[text()='Go To ']"));
     Actions action=new Actions(driver);
     action.moveToElement(goTo).build().perform();
    	 click(By.xpath("//ul/li/a[text()='Status Code Mapping']"),"Status Code Mapping", 30);
    	
    	 try {
    		 WebElement statusCodeMapping = driver.findElement(By.xpath("//div/h2[text()='Status Code Mapping']"));
    		 if (statusCodeMapping.isDisplayed()) {
				logger.info("Status Code Mapping Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Status Code Mapping Page not opened succesfully");
		}
     }
     public void clickOnTicketTypeMapping()
     {		staticWait(2000);
     WebElement goTo = driver.findElement(By.xpath("//div/ul/li/a[text()='Go To ']"));
     Actions action=new Actions(driver);
     action.moveToElement(goTo).build().perform();
    	 click(By.xpath("//ul/li/a[text()='Ticket Type Mapping']"),"Ticket Type Mapping", 30);
    	
    	 try {
    		 WebElement ticketTypeMapping = driver.findElement(By.xpath("//div/h2[text()='Ticket Type Mapping']"));
    		 if (ticketTypeMapping.isDisplayed()) {
				logger.info("Ticket Type Mapping Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Ticket Type Mapping Page not opened succesfully");
		}
     }
     public void clickOnSuppressCode()
     {		staticWait(2000);
     WebElement goTo = driver.findElement(By.xpath("//div/ul/li/a[text()='Go To ']"));
     Actions action=new Actions(driver);
     action.moveToElement(goTo).build().perform();
    	 click(By.xpath("//ul/li/a[text()='Suppress Code']"),"Suppress Code", 30);
    	
    	 try {
    		 WebElement suppressCode = driver.findElement(By.xpath("//div/h2[text()='Suppress Code']"));
    		 if (suppressCode.isDisplayed()) {
				logger.info("Suppress Code Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Suppress Code Page not opened succesfully");
		}
     }
     public void clickOnInvoiceGroupings()
     {		staticWait(2000);
     WebElement goTo = driver.findElement(By.xpath("//div/ul/li/a[text()='Go To ']"));
     Actions action=new Actions(driver);
     action.moveToElement(goTo).build().perform();
    	 click(By.xpath("//ul/li/a[text()='Invoice Groupings']"),"Invoice Groupings", 30);
    	
    	 try {
    		 WebElement suppressCode = driver.findElement(By.xpath("//div/h2[text()='Invoice Groupings Mapping']"));
    		 if (suppressCode.isDisplayed()) {
				logger.info("Invoice Groupings Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Invoice Groupings Page not opened succesfully");
		}
     }
     public void clickOnWorkCode()
     {		staticWait(2000);
     WebElement goTo = driver.findElement(By.xpath("//div/ul/li/a[text()='Go To ']"));
     Actions action=new Actions(driver);
     action.moveToElement(goTo).build().perform();
    	 click(By.xpath("//ul/li/a[text()='Work Code']"),"Work Code", 30);
    	
    	 try {
    		 WebElement workCode = driver.findElement(By.xpath("//div/h2[text()='Work Code']"));
    		 if (workCode.isDisplayed()) {
				logger.info("Work Code Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Work Code Page not opened succesfully");
		}
     }
     public void clickOnWorkCodeCategory()
     {		staticWait(2000);
     WebElement goTo = driver.findElement(By.xpath("//div/ul/li/a[text()='Go To ']"));
     Actions action=new Actions(driver);
     action.moveToElement(goTo).build().perform();
    	 click(By.xpath("//ul/li/a[text()='Work Code Category']"),"Work Code Category", 30);
    	
    	 try {
    		 WebElement workCodeCategory = driver.findElement(By.xpath("//div/h2[text()='Work Code Category']"));
    		 if (workCodeCategory.isDisplayed()) {
				logger.info("Work Code Category Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Work Code Category Page not opened succesfully");
		}
     }
     public void clickOnCounty()
     {		staticWait(2000);
     WebElement goTo = driver.findElement(By.xpath("//div/ul/li/a[text()='Go To ']"));
     Actions action=new Actions(driver);
     action.moveToElement(goTo).build().perform();
    	 click(By.xpath("//ul/li/a[text()='County']"),"County", 30);
    	
    	 try {
    		 WebElement County = driver.findElement(By.xpath("//div/h2[text()='County']"));
    		 if (County.isDisplayed()) {
				logger.info("County Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("County Page not opened succesfully");
		}
     }
     public void clickOnContractUtilityCDCMapping()
     {		staticWait(2000);
     WebElement goTo = driver.findElement(By.xpath("//div/ul/li/a[text()='Go To ']"));
     Actions action=new Actions(driver);
     action.moveToElement(goTo).build().perform();
    	 click(By.xpath("//ul/li/a[text()='Contract/Utility/CDC Mapping']"),"Contract/Utility/CDC Mapping", 30);
    	
    	 try {
    		 WebElement contractUtilityCDCMapping = driver.findElement(By.xpath("//div/h2[text()='Contract/Utility/CDC Mapping']"));
    		 if (contractUtilityCDCMapping.isDisplayed()) {
				logger.info("Contract/Utility/CDC Mapping Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Contract/Utility/CDC Mapping Page not opened succesfully");
		}
     }
     public void clickOnStatusCode()
     {		staticWait(2000);
     WebElement goTo = driver.findElement(By.xpath("//div/ul/li/a[text()='Go To ']"));
     Actions action=new Actions(driver);
     action.moveToElement(goTo).build().perform();
    	 click(By.xpath("//ul/li/a[text()='Status Code']"),"Status Code", 30);
    	
    	 try {
    		 WebElement statusCode = driver.findElement(By.xpath("//div/h2[text()='Status']"));
    		 if (statusCode.isDisplayed()) {
				logger.info("Status Code Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Status Code Page not opened succesfully");
		}
     }
     public void clickOnStatusCodeCDCMapping()
     {		staticWait(2000);
     WebElement goTo = driver.findElement(By.xpath("//div/ul/li/a[text()='Go To ']"));
     Actions action=new Actions(driver);
     action.moveToElement(goTo).build().perform();
    	 click(By.xpath("//ul/li/a[text()='Status Code/CDC Mapping']"),"Status Code/CDC Mapping", 30);
    	
    	 try {
    		 WebElement statusCodeCDCMapping = driver.findElement(By.xpath("//div/h2[text()='Status Code/CDC Mapping']"));
    		 if (statusCodeCDCMapping.isDisplayed()) {
				logger.info("Status Code CDC Mapping Page opened succesfully");
				
	
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Status Code/CDC MappingPage not opened succesfully");
		}
    	 driver.navigate().back();
    	 staticWait(2000);
    	 driver.navigate().refresh();
     }
     
     /*------------------------------------------------------------------------------------------------------------------------------------------*/
     /*Code for click testing of Field Service Ticket */
     public void clickOnFieldServiceTicket()
     {		staticWait(2000);
    	 click(By.xpath("//div/ul/li/a[@data-original-title='Field Service Ticket']"),"Field Service Ticket", 30);
    	
    	 try {
    		 WebElement fieldServiceTicket = driver.findElement(By.xpath("//div/span[text()='Field Service Ticket']"));
    		 if (fieldServiceTicket.isDisplayed()) {
				logger.info("Field Service Ticket Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Field Service Ticket Page not opened succesfully");
		}
     }
     public void clickOnCollapseMap()
     {		staticWait(2000);
    	 click(By.xpath("//div/a/span[text()='Collapse Map']"),"Collapse map", 30);
     }
     public void clickOnAssignTicket()
     {		staticWait(2000);
    	 click(By.xpath("//div/span/a[@data-original-title='Assign Ticket']"),"Assign Ticket", 30);
    	
    	 try {
    		 WebElement assignTicket = driver.findElement(By.xpath("//div/span[contains(text(),'Please select one/multiple checkbox(s) to assign ticket')]"));
    		 if (assignTicket.isDisplayed()) {
				logger.info("Assign Ticket Page opened succesfully");
				 click(By.xpath("//button[@id='closenotifymessage']"),"Close Notify Message", 30);
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Assign Ticket Page not opened succesfully");
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
     public void clickOnUpdateStatus()
     {		staticWait(2000);
    	 click(By.xpath("//div/span/a[@data-original-title='Update Status']"),"Update Status", 30);
    	
    	 try {
    		 WebElement updateStatus = driver.findElement(By.xpath("//div/span[text()='Please select one/multiple checkbox(s) to change the status.']"));
    		 if (updateStatus.isDisplayed()) {
				logger.info("Update Statust Clicked succesfully");
				 click(By.xpath("//button[@id='closenotifymessage']"),"Close Notify Message", 30);
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Update Status Clicked succesfully");
		}
     }
     public void clickOnAssignTag()
     {		staticWait(2000);
    	 click(By.xpath("//div/span/a[@data-original-title='Assign Tag']"),"Assign Tag", 30);
    	
    	 try {
    		 WebElement assignTag = driver.findElement(By.xpath("//div/span[text()='Please select one/multiple checkbox(s) to assign tag.']"));
    		 if (assignTag.isDisplayed()) {
				logger.info("Assign Tag Clicked succesfully");
				 click(By.xpath("//button[@id='closenotifymessage']"),"Close Notify Message", 30);
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Assign Tag Clicked succesfully");
		}
     }
     public void clickOnListView()
     {		staticWait(3000);
    	 click(By.xpath("//div/span/a[@data-original-title='List View']"),"List View", 30);
     }
     public void clickOnAddTicketOfFieldServiceTicket()
     {		staticWait(2000);
    	 click(By.xpath("//div/span/a[@data-original-title='Add Ticket']"),"Add Ticket", 30);
    	
    	 try {
    		 WebElement addTicket = driver.findElement(By.xpath("//div/span[text()='Add Ticket']"));
    		 if (addTicket.isDisplayed()) {
				logger.info("Add Ticket Page opened succesfully");
		
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Add Ticket page not opened succesfully");
		}
     }
     /*------------------------------------------------------------------------------------------------------------------------------------------*/
     /*Code for click testing of Form Builder */
     public void clickOnFormBuilder()
     {		staticWait(2000);
    	 click(By.xpath("//div/ul/li/a[@data-original-title='Form Builder']"),"Form Builder", 30);
    	
    	 try {
    		 WebElement formBuilder = driver.findElement(By.xpath("//div/span[text()='Form Builder']"));
    		 if (formBuilder.isDisplayed()) {
				logger.info("Form Builder Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Form Builder Page not opened succesfully");
		}
     }
     public void clickOnAddFormBuilder()
     {		staticWait(2000);
    	 click(By.xpath("//div/span/a[@data-original-title='Add']"),"Add Form Builder", 30);
    	
    	 try {
    		 WebElement addformBuilder = driver.findElement(By.xpath("//div/h5[text()='Add Form']"));
    		 if (addformBuilder.isDisplayed()) {
				logger.info("Add Form Builder Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Add Form Builder Page not opened succesfully");
		}
     }
     public void clickOnNext()
     {		staticWait(2000);
    	 clickByJavascript(By.xpath("//div/a[@title='Next']"),"Next", 30);
     }
     public void VerifyMandatoryFielOfAddFormBuilder() {
			int i = 0;
			String actualText;
			String expectedText;

			List<WebElement> errorMessageLocator = findMultipleElement(
					By.xpath("//span[contains(@class,'invalid-feedback')]"), 45);
			String[] expectedValue = { "Form Name","Module" };
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
     public void clickOnClose()
     {		staticWait(2000);
    	 clickByJavascript(By.xpath("//div/a[@title='Close']"),"Close", 30);
    	 driver.navigate().refresh();
     }
     /*------------------------------------------------------------------------------------------------------------------------------------------*/
     /*Code for click testing of FSM Report */
     public void clickOnFSMReport()
     {		staticWait(2000);
    	 click(By.xpath("//div/ul/li/a[@data-original-title='FSM Report']"),"FSM Report", 30);
    	
    	 try {
    		 WebElement fSMReport = driver.findElement(By.xpath("//div/span[text()='Field Service Ticket Report']"));
    		 if (fSMReport.isDisplayed()) {
				logger.info("FSM Report Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("FSM Report Page not opened succesfully");
		}
    	 driver.navigate().refresh();
     }
     /*------------------------------------------------------------------------------------------------------------------------------------------*/
     /*Code for click testing of Manage Map Configuration */
     public void clickOnManageMapConfiguration()
     {		staticWait(2000);
    	 click(By.xpath("//div/ul/li/a[@data-original-title='Manage Map Configuration']"),"Manage Map Configuration", 30);
    	
    	 try {
    		 WebElement manageMapConfiguration = driver.findElement(By.xpath("//div/span[text()='Map Accounts']"));
    		 if (manageMapConfiguration.isDisplayed()) {
				logger.info("Manage Map Configuration Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Manage Map Configuration Page not opened succesfully");
		}
     }
     public void clickOnAddManageMapConfiguration()
     {		staticWait(2000);
    	 click(By.xpath("//div/span/a[@data-original-title='Add New']"),"Add Manage Map Configuration", 30);
    	
    	 try {
    		 WebElement addManageMapConfiguration = driver.findElement(By.xpath("//div/h4[text()=' Manage Map']"));
    		 if (addManageMapConfiguration.isDisplayed()) {
				logger.info("Add Manage Map Configuration Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Add Manage Map Configuration Page not opened succesfully");
		}
     }
     public void clickOnSaveManageMapConfiguration()
     {		staticWait(2000);
    	 clickByJavascript(By.xpath("//div/a[@data-original-title='Save']"),"Save Button", 30);
     }
     public void clickOnCloseManageMapConfiguration()
     {		staticWait(2000);
    	 clickByJavascript
    	 (By.xpath("//div/a[@data-original-title='Cancel']"),"Cancel button", 30);
    	 driver.navigate().refresh();
     }
     public void VerifyMandatoryFielOfAddManageMapConfiguration() {
			int i = 0;
			String actualText;
			String expectedText;

			List<WebElement> errorMessageLocator = findMultipleElement(
					By.xpath("//div[contains(@class,'invalid-feedback')]"), 45);
			String[] expectedValue = { "Title","API Key" };
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
     /*------------------------------------------------------------------------------------------------------------------------------------------*/
     /*Code for click testing of Map Extent*/
     public void clickOnMapExtent()
     {		staticWait(2000);
    	 click(By.xpath("//div/ul/li/a[@data-original-title='Map Extent']"),"Map Extent", 30);
    	
    	 try {
    		 WebElement mapExtent = driver.findElement(By.xpath("//div/span[text()=' Map']"));
    		 if (mapExtent.isDisplayed()) {
				logger.info("Map Extent Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Map Extent Page not opened succesfully");
		}
     }
     public void clickOnAddMapExtent()
     {		staticWait(2000);
    	 click(By.xpath("//div/span/a[@data-original-title='Add New']"),"Add Map Extent", 30);
    	
    	 try {
    		 WebElement mapExtent = driver.findElement(By.xpath("//div/h4[text()='Alert']"));
    		 if (mapExtent.isDisplayed()) {
				logger.info("Add Map Extent Clicked succesfully");
				click(By.xpath("//div/button[@title='OK']"),"Ok Button", 30);
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Map Extent not clicked succesfully");
		}
    	 driver.navigate().refresh();
     }
     /*------------------------------------------------------------------------------------------------------------------------------------------*/
     /*Code for click testing of Rule Engine*/
     public void clickOnRuleEngine()
     {		staticWait(2000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='Rule Engine'])[2]"),"Rule Engine", 30);
    	
    	 try {
    		 WebElement ruleEngine = driver.findElement(By.xpath("//div/span[text()='Rule Engine']"));
    		 if (ruleEngine.isDisplayed()) {
				logger.info("Rule Engine Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Rule Engine Page not opened succesfully");
		}
     }
     public void clickOnAddRuleEngine()
     {		staticWait(2000);
    	 click(By.xpath("//div/span/a[@data-original-title='Add Rule']"),"Add Rule", 30);
    	
    	 try {
    		 WebElement addruleEngine = driver.findElement(By.xpath("//div/span[text()='Add Rule']"));
    		 if (addruleEngine.isDisplayed()) {
				logger.info("Add Rule Engine Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Add Rule Engine Page not opened succesfully");
		}
     }
     public void clickOnSaveRuleEngine()
     {		staticWait(2000);
    	 clickByJavascript(By.xpath("//div/a[@data-original-title='Save']"),"Save Button", 30);
    	 click(By.xpath("//div/button[@id='closenotifymessage']"),"Close notify message", 30);
     }
     public void VerifyMandatoryFielOfRuleEngine() {
			int i = 0;
			String actualText;
			String expectedText;

			List<WebElement> errorMessageLocator = findMultipleElement(
					By.xpath("//span[contains(@class,'invalid-feedback')]"), 45);
			String[] expectedValue = { "Rule Name","Select Module","Select Action","Description" };
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
     /*Code for click testing of Service Appointment*/
     public void clickOnServiceAppointment()
     {		staticWait(2000);
    	 click(By.xpath("//div/ul/li/a[@data-original-title='Service Appointment']"),"Service Appointment", 30);
    	
    	 try {
    		 WebElement serviceAppointment = driver.findElement(By.xpath("//div/span[text()='Service Appointment']"));
    		 if (serviceAppointment.isDisplayed()) {
				logger.info("Service Appointment Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Service Appointment Page not opened succesfully");
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
     public void clickOnAddServiceAppointment()
     {		staticWait(2000);
    	 click(By.xpath("//div/span/a[@data-original-title='Add Service Appointment']"),"Add Service Appointment", 30);
    	
    	 try {
    		 WebElement addserviceAppointment = driver.findElement(By.xpath("//div/span[text()='Manage Service Appointment']"));
    		 if (addserviceAppointment.isDisplayed()) {
				logger.info("Manage Service Appointment Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Manage Service Appointment Page not opened succesfully");
		}
     }
     public void VerifyMandatoryFielOfAddserviceAppointment() {
			int i = 0;
			String actualText;
			String expectedText;

			List<WebElement> errorMessageLocator = findMultipleElement(
					By.xpath("//div[contains(@class,'invalid-feedback')]"), 45);
			String[] expectedValue = { "Account"};
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
     public void clickOnGaintChart()
     {		staticWait(2000);
    	 click(By.xpath("//div/span/a[@data-original-title='Gantt Chart']"),"Gant Chart", 30);
    	 click(By.xpath("//div/span/a[@data-original-title='List View']"),"List View", 30);
    	
     }
     public void clickOnSetting()
     {		staticWait(2000);
    	 click(By.xpath("(//div/span/a[@data-original-title='Setting'])[2]"),"Setting", 30);
    	 click(By.xpath("//div/a[@id='ancDefaultViewClose']"),"Close Setting", 30);
    	
     }
     /*------------------------------------------------------------------------------------------------------------------------------------------*/
     /*Code for click testing of Service Crew*/
     public void clickOnServiceCrew()
     {		staticWait(2000);
    	 click(By.xpath("//div/ul/li/a[@data-original-title='Service Crew']"),"Service Crew", 30);
    	
    	 try {
    		 WebElement ServiceCrew = driver.findElement(By.xpath("//div/span[text()='Crew']"));
    		 if (ServiceCrew.isDisplayed()) {
				logger.info("Service Crew Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Service Crew Page not opened succesfully");
		}
     }
     public void clickOnAddServiceCrew()
     {		staticWait(2000);
    	 click(By.xpath("//div/span/a[@data-original-title='Add']"),"Add Service Crew", 30);
    	
    	 try {
    		 WebElement addServiceCrew = driver.findElement(By.xpath("//div/h4[text()='Add Fsm Crew']"));
    		 if (addServiceCrew.isDisplayed()) {
				logger.info("Add Fsm Crew Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Add Fsm Crew Page not opened succesfully");
		}
     }
     public void clickOnSaveServiceCrew()
     {		staticWait(2000);
    	 click(By.xpath("//div/a[@id='btnSave']"),"Save Service Crew", 30);
     }
     public void clickOnCancelServiceCrew()
     {		staticWait(2000);
    	 click(By.xpath("//div/a[@id='btnCancel']"),"Cancel", 30);
    	 driver.navigate().refresh();
     }
     public void VerifyMandatoryFielOfAddServiceCrew() {
			int i = 0;
			String actualText;
			String expectedText;

			List<WebElement> errorMessageLocator = findMultipleElement(
					By.xpath("//span[contains(@class,'invalid-feedback')]"), 45);
			String[] expectedValue = { "Crew Name","Crew Size","Service Territory"};
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
     /*------------------------------------------------------------------------------------------------------------------------------------------*/
     /*Code for click testing of Service Resources*/
     public void clickOnServiceResources()
     {		staticWait(2000);
    	 click(By.xpath("//div/ul/li/a[@data-original-title='Service Resource']"),"Service Resource", 30);
    	
    	 try {
    		 WebElement serviceResource = driver.findElement(By.xpath("//div/span[text()='Resource']"));
    		 if (serviceResource.isDisplayed()) {
				logger.info("Service Resource Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Service Resource Page not opened succesfully");
		}
     }
     public void clickOnAddServiceResource()
     {		staticWait(2000);
    	 click(By.xpath("//div/span/a[@data-original-title='Add']"),"Add Service Crew", 30);
    	
    	 try {
    		 WebElement addServiceCrew = driver.findElement(By.xpath("//div/h4[text()='Add Fsm Resource']"));
    		 if (addServiceCrew.isDisplayed()) {
				logger.info("Add Fsm Resource Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Add Fsm Resource Page not opened succesfully");
		}
     }
     public void VerifyMandatoryFielOfAddServiceResource() {
			int i = 0;
			String actualText;
			String expectedText;

			List<WebElement> errorMessageLocator = findMultipleElement(
					By.xpath("//span[contains(@class,'invalid-feedback')]"), 45);
			String[] expectedValue = { "Resource Name","User","Resource Type","Service Territory"};
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
     /*------------------------------------------------------------------------------------------------------------------------------------------*/
     /*Code for click testing of Service Territory*/
     public void clickOnServiceTerritory()
     {		staticWait(2000);
    	 click(By.xpath("//div/ul/li/a[@data-original-title='Service Territory']"),"Service Territory", 30);
    	
    	 try {
    		 WebElement serviceTerritory = driver.findElement(By.xpath("//div/span[text()='Service Territory List']"));
    		 if (serviceTerritory.isDisplayed()) {
				logger.info("Service Territory Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Service Territory Page not opened succesfully");
		}
     }
     public void clickOnAddServiceTerritory()
     {		staticWait(2000);
    	 click(By.xpath("//div/span/a[@data-original-title='Add']"),"Add Service Territory", 30);
    	
    	 try {
    		 WebElement addServiceCrew = driver.findElement(By.xpath("//div/h4[text()='Add Service Territory']"));
    		 if (addServiceCrew.isDisplayed()) {
				logger.info("Add Service Territory Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Add Service Territory Page not opened succesfully");
		}
     }
     public void VerifyMandatoryFielOfAddServiceTerritory() {
			int i = 0;
			String actualText;
			String expectedText;

			List<WebElement> errorMessageLocator = findMultipleElement(
					By.xpath("//span[contains(@class,'invalid-feedback')]"), 45);
			String[] expectedValue = { "Territory Name"};
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
     /*------------------------------------------------------------------------------------------------------------------------------------------*/
     /*Code for click testing of Tech Tracking*/
     public void clickOnTechTracking()
     {		staticWait(2000);
    	 click(By.xpath("//div/ul/li/a[@data-original-title='Tech Tracking']"),"Tech Tracking", 30);
    	
    	 try {
    		 WebElement techTracking = driver.findElement(By.xpath("//div/span[text()='Tech Tracking']"));
    		 if (techTracking.isDisplayed()) {
				logger.info("Tech Tracking Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Tech Tracking Page not opened succesfully");
		}
    	 driver.navigate().refresh();
     }
     /*------------------------------------------------------------------------------------------------------------------------------------------*/
     /*Code for click testing of Ticketing*/
     public void clickOnTicketing()
     {		staticWait(2000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='Ticketing'])[2]"),"Ticketing", 30);
    	
    	 try {
    		 WebElement ticketing = driver.findElement(By.xpath("//div/span[text()='Ticketing']"));
    		 if (ticketing.isDisplayed()) {
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
    		 WebElement addticketing = driver.findElement(By.xpath("//div/span[text()='Add Ticket']"));
    		 if (addticketing.isDisplayed()) {
				logger.info("Add Ticketing Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Add Ticketing Page not opened succesfully");
		}
     }
     public void clickOnCheckBox()
     {		staticWait(2000);
    	 click(By.xpath("//div[@class='custom-control custom-checkbox']"),"CheckBox", 30);
     }
     public void clickOnUpdateStatusOfTicketing()
     {		staticWait(2000);
    	 click(By.xpath("//div/span/a[@data-original-title='Update Status']"),"Update Status", 30);
    	
    	 try {
    		 WebElement updateStatus = driver.findElement(By.xpath("//div/h5[text()='Update Status']"));
    		 if (updateStatus.isDisplayed()) {
				logger.info("Update Statust Clicked succesfully");
			
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Update Status Clicked succesfully");
		}
     }
     public void clickOnCancel()
     {		staticWait(2000);
    	 click(By.xpath("//div/a[@id='abtnUpdateTicketStatusCancel']"),"Cancel Button", 30);
    	 driver.navigate().refresh();
     }
     /*------------------------------------------------------------------------------------------------------------------------------------------*/
     /*Code for click testing of Transform Pending*/
     public void clickOnTransformPending()
     {		staticWait(2000);
    	 click(By.xpath("//div/ul/li/a[@data-original-title='Transform Pending']"),"Transform Pending", 30);
    	
    	 try {
    		 WebElement transformPending = driver.findElement(By.xpath("//div/span[text()='Transform Pending']"));
    		 if (transformPending.isDisplayed()) {
				logger.info("Transform Pending Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Transform Pending Page not opened succesfully");
		}
    	 driver.navigate().refresh();
     }
     /*------------------------------------------------------------------------------------------------------------------------------------------*/
     /*Code for click testing of Unassigned Tickets*/
     public void clickOnUnassignedTickets()
     {		staticWait(2000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='Unassigned Tickets'])[2]"),"Unassigned Tickets", 30);
    	
    	 try {
    		 WebElement unassignedTickets = driver.findElement(By.xpath("//div/span[text()='Field Service Ticket']"));
    		 if (unassignedTickets.isDisplayed()) {
				logger.info("Unassigned Tickets Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Unassigned Tickets Page not opened succesfully");
		}
     }
     /*------------------------------------------------------------------------------------------------------------------------------------------*/
     /*Code for click testing of Work Type Listing*/
     public void clickOnWorkTypeListing()
     {		staticWait(2000);
    	 click(By.xpath("//div/ul/li/a[@data-original-title='Work Type Listing']"),"Work Type Listing", 30);
    	
    	 try {
    		 WebElement workTypeListing = driver.findElement(By.xpath("//div/span[text()='Work Type']"));
    		 if (workTypeListing.isDisplayed()) {
				logger.info("Work Type Listing Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Work Type Listing Page not opened succesfully");
		}
     }
     public void clickOnAddWorkTypeListing()
     {		staticWait(2000);
    	 click(By.xpath("//div/span/a[@data-original-title='Add']"),"Add Work Type Listing", 30);
    	
    	 try {
    		 WebElement addworkTypeListing = driver.findElement(By.xpath("//div/span[text()='Manage Work Type']"));
    		 if (addworkTypeListing.isDisplayed()) {
				logger.info("Manage Work Type Listing Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Manage Work Type Listing Page not opened succesfully");
		}
     }
     public void clickOnSaveAddWorkTypeListing()
     {		staticWait(2000);
    	 click(By.xpath("//div/a[@data-original-title='Save']"),"Save Button", 30);
     }
     public void clickOnCancelAddWorkTypeListing()
     {		staticWait(2000);
    	 click(By.xpath("//div/a[@data-original-title='Cancel']"),"Cancel Button", 30);
    	 driver.navigate().refresh();
     }
     public void VerifyMandatoryFielOfAddWorkTypeListing() {
			int i = 0;
			String actualText;
			String expectedText;

			List<WebElement> errorMessageLocator = findMultipleElement(
					By.xpath("//span[contains(@class,'invalid-feedback')]"), 45);
			String[] expectedValue = { "Work Type Name","Duration Type","Max Duration"};
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
     /*------------------------------------------------------------------------------------------------------------------------------------------*/
     /*Code for click testing of Zone Management*/
     public void clickOnZoneManagement()
     {		staticWait(2000);
    	 click(By.xpath("//div/ul/li/a[@data-original-title='Zone Management']"),"Zone Management", 30);
    	
    	 try {
    		 WebElement zoneManagement = driver.findElement(By.xpath("//div/span[text()='Zone Management']"));
    		 if (zoneManagement.isDisplayed()) {
				logger.info("Zone Management Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Zone Management Page not opened succesfully");
		}
     }
     public void clickOnImport()
     {		staticWait(2000);
    	 click(By.xpath("//div/span/a[@data-original-title='Import']"),"Import", 30);
    	
    	 try {
    		 WebElement importzoneManagement = driver.findElement(By.xpath("//div/h5[text()='Upload']"));
    		 if (importzoneManagement.isDisplayed()) {
				logger.info("Upload Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Upload Page not opened succesfully");
		}
     }
     public void clickOnCancelImport()
     {		staticWait(2000);
    	 clickByJavascript(By.xpath("(//div/a[@data-original-title='Cancel'])[2]"),"Cancel Button", 30);
    	 driver.navigate().refresh();
     }
     /*------------------------------------------------------------------------------------------------------------------------------------------*/
     /*Code for click testing of DashBoard*/
     public void clickOnDashBoard()
     {		staticWait(2000);
    	 click(By.xpath("//div//span/a[text()='Dashboard']"),"DashBoard", 30);
    	
    	 try {
    		 WebElement DashBoard = driver.findElement(By.xpath("//div/span[text()='Dashboard']"));
    		 if (DashBoard.isDisplayed()) {
				logger.info("DashBoard Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("DashBoard Page not opened succesfully");
		}
     }
     public void clickOnAddMore()
     {		staticWait(2000);
    	 click(By.xpath("//div/a[@data-original-title='Add More']"),"Add More", 30);
    	
    	 try {
    		 WebElement addMore = driver.findElement(By.xpath("//div/h5[contains(text(),'Add')]"));
    		 if (addMore.isDisplayed()) {
				logger.info("Add more Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Add more Page not opened succesfully");
		}
     }
     public void clickOnCancelButtonOfAddMore()
     {		staticWait(2000);
    	 click(By.xpath("//div/a[contains(text(),'Cancel')]"),"Cancel Button", 30);
    	 driver.navigate().refresh();
     }
}
