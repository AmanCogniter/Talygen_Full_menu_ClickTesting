package pageobjects;

import static reporting.ComplexReportFactory.getTest;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.relevantcodes.extentreports.LogStatus;

import utils.WebBasePage;

public class CompanySetupPage extends WebBasePage{
	WebDriver driver ;
	public CompanySetupPage(WebDriver driver) {
		super(driver, "CompanySetupPage");
		this.driver=driver;
		// TODO Auto-generated constructor stub
	}
	public void clickFullMenuDropDown() {
		staticWait(3000);
        click(By.xpath("//span[text()='Full Menu']"), "Full Menu", 30);
        
    }
	/*
	 * Code for click testing of Clients Link for Company Setup
	 */
     public void clickOnCOMPANYSETUPLink()
     {		staticWait(2000);
    	 click(By.xpath("//ul/li[@data-name='COMPANY SETUP']/span"),"COMPANY SETUP", 30);
    	 
     }
     public void clickOnClientforCompanySetup()
     {		staticWait(2000);
    	 click(By.xpath("//div/ul/li/a[@data-original-title='Clients']"),"Client", 30);
    	
    	 try {
    		 WebElement client = driver.findElement(By.xpath("//div/span[text()='Accounts/Clients']"));
    		 if (client.isDisplayed()) {
				logger.info("Client Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Client Page not opened succesfully");
		}
     }
     public void clickOnAddAccount()
     {		staticWait(2000);
    	 click(By.xpath("//div/a[@id='ancCreateDepartment']"),"Add Account", 30);
     
     try {
		 WebElement addAccountPage = driver.findElement(By.xpath("//span[text()='Account Information']"));
		 if (addAccountPage.isDisplayed()) {
			logger.info(" Add Account Page opened succesfully");
		}
	} catch (Exception e) {
		// TODO: handle exception
		logger.info(" Add Account Page not opened succesfully");
	}
     }
     public void clickOnsaveButton()
     {		staticWait(2000);
    	 click(By.xpath("//div/a[@data-original-title='Save']"),"Save Button", 30);
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
					By.xpath("//div[contains(@class,'invalid-feedback')]"), 45);
			String[] expectedValue = { "Account Name"};
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
     public void clickOnPageTourGuide()
     {		staticWait(2000);
    	 clickByJavascript(By.xpath("//span/a[@data-original-title='Page Tour']"),"Page Tour Guide", 30);
    	 click(By.xpath("//*[name()='svg' and @class='guided-tour-icon']"),"Close page tour guide", 30);
     }
     public void clickOnAddClient()
     {		staticWait(3000);
    	 click(By.xpath("//div/a[@data-original-title='Add Client']"),"Add Client", 30);
     
     try {
		 WebElement addClientPage = driver.findElement(By.xpath("//span[text()='Add Client']"));
		 if (addClientPage.isDisplayed()) {
			logger.info(" Add Client Page opened succesfully");
		}
	} catch (Exception e) {
		// TODO: handle exception
		logger.info(" Add Client Page not opened succesfully");
	}
     }
     public void clickOnBacktoList()
     {		staticWait(2000);

    	 click(By.xpath("//span/a[@data-original-title='Back to list']"),"Back to List", 30);
    	 driver.navigate().refresh();
     }
     
     /*----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
     /*
 	 * Code for click testing of Company Directory for Company Setup
 	 */
     public void clickOnCompanyDirectoryforCompanySetup()
     {		staticWait(2000);
    	 click(By.xpath("//div/ul/li/a[@data-original-title='Company Directory ']"),"Company Directory", 30);
    	
    	 try {
    		 WebElement companyDirectory = driver.findElement(By.xpath("//div/span[text()='Company Directory ']"));
    		 if (companyDirectory.isDisplayed()) {
				logger.info("Company Directory Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Company Directory Page not opened succesfully");
		}
    	 driver.navigate().refresh();
     }
     /*----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
     /*
 	 * Code for click testing of Company Setup for Company Setup
 	 */
     public void clickOnCompanySetupforCompanySetup()
     {		staticWait(2000);
    	 click(By.xpath("//div/ul/li/a[@data-original-title='Company Setup']"),"Company Setup", 30);
    	
    	 try {
    		 WebElement companySetup = driver.findElement(By.xpath("//div/span[text()='Company Setup']"));
    		 if (companySetup.isDisplayed()) {
				logger.info("Company setup Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Company setup Page not opened succesfully");
		}
    	 driver.navigate().refresh();
     }
     /*----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
     /*
 	 * Code for click testing of Configuration for Company Setup
 	 */
     public void clickOnConfigurationforCompanySetup()
     {		staticWait(2000);
    	 click(By.xpath("//div/ul/li/a[@data-original-title='Configuration']"),"Configuration", 30);
    	
    	 try {
    		 WebElement configuration = driver.findElement(By.xpath("//div/span[text()='Configuration']"));
    		 if (configuration.isDisplayed()) {
				logger.info("Configuration Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Configuration Page not opened succesfully");
		}
     }
     public void clickOnConfigurationsaveButton()
     {		staticWait(2000);
    	 click(By.xpath("//div/a[@id='hlkSave']"),"Save Button", 30);
    	 driver.navigate().refresh();
     }
     public void clickOnRadioButton()
     {		staticWait(3000);
    	 //click(By.xpath("//label/div/input[@id='rdo_1']"),"Radio Button", 30);
     WebElement radioButton = driver.findElement(By.xpath("//label/div/input[@id='rdo_1']"));
     Actions action=new Actions(driver);
     action.moveToElement(radioButton).click().perform();
     }
     /*----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
     /*
 	 * Code for click testing of Context Menu for Company Setup
 	 */
     public void clickOnContextMenuforCompanySetup()
     {		staticWait(2000);
    	 click(By.xpath("//div/ul/li/a[@data-original-title='Context Menu']"),"context menu", 30);
    	
    	 try {
    		 WebElement contextMenu = driver.findElement(By.xpath("//div/span[text()='Manage Context Menu']"));
    		 if (contextMenu.isDisplayed()) {
				logger.info("Context menu Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Context menu Page not opened succesfully");
		}
    	 driver.navigate().refresh();
     }
     /*----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
     /*
 	 * Code for click testing of HoloidayBank for Company Setup
 	 */
     public void clickOnHolidayBankforCompanySetup()
     {		staticWait(2000);
    	 click(By.xpath("//div/ul/li/a[@data-original-title='Holiday Bank']"),"HoliDay Bank", 30);
    	
    	 try {
    		 WebElement contextMenu = driver.findElement(By.xpath("//div/span[text()='Company Setup']"));
    		 if (contextMenu.isDisplayed()) {
				logger.info("Company Holiday Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Company HoliDay Page not opened succesfully");
		}
     }
     public void clickOnAddHoliDay()
     {		staticWait(3000);
    	 clickByJavascript(By.xpath("//div/span/a[@id='ancCreateHR']"),"Add HoliDay", 30);
     
     try {
		 WebElement companyHolidayPage = driver.findElement(By.xpath("//div/h5[text()='Manage Company Holidays']"));
		 if (companyHolidayPage.isDisplayed()) {
			logger.info(" Company holiday Page opened succesfully");
		}
	} catch (Exception e) {
		// TODO: handle exception
		logger.info(" Company holiday Page not opened succesfully");
	}
     }
     public void clickOnSaveHoliDay()
     {		staticWait(3000);
    	 clickByJavascript(By.xpath("//div/a[@data-original-title='Save']"),"Save HoliDay", 30);
     }
     public void clickOnCancelHoliDay()
     {		staticWait(3000);
    	 clickByJavascript(By.xpath("//div/a[@data-original-title='Cancel']"),"Cancel HoliDay", 30);
     }
     public void VerifyMandatoryFieldValidationOfCompanyHoliDays() {
			int i = 0;
			String actualText;
			String expectedText;

			List<WebElement> errorMessageLocator = findMultipleElement(
					By.xpath("//span[contains(@class,'invalid-feedback')]"), 45);
			String[] expectedValue = { "Name"};
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
     public void clickOnHoliDayBank()
     {		staticWait(3000);
    	 clickByJavascript(By.xpath("//div/span/a[@id='aHolidayBankNew']"),"HoliDay Bank", 30);
     
     try {
		 WebElement holidayBankPage = driver.findElement(By.xpath("//div/h5[text()='Holiday Bank']"));
		 if (holidayBankPage.isDisplayed()) {
			logger.info(" Holiday Bnak Page opened succesfully");
		}
	} catch (Exception e) {
		// TODO: handle exception
		logger.info(" HoliDay bank Page not opened succesfully");
	}
     clickByJavascript(By.xpath("//div/a[@id='btnCancelHB']"),"Close HoliDay Bank Page", 30);
     driver.navigate().refresh();
     }
     /*----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
     /*
 	 * Code for click testing of Manage Subscripton for Company Setup
 	 */
     public void clickOnManageSubscriptionforCompanySetup()
     {		staticWait(2000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='Manage Subscription'])[2]"),"Manage Subscription", 30);
    	
    	 try {
    		 WebElement manageSubscription = driver.findElement(By.xpath("//div/a[text()='Update Billing Information']"));
    		 if (manageSubscription.isDisplayed()) {
				logger.info("Manage Subscription Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Manage Subscription Page not opened succesfully");
		}
    	 clickByJavascript(By.xpath("//div/a[text()='Update Billing Information']"),"Update Billing Information", 30);
    	 clickByJavascript(By.xpath("//div/a[@id='cancel']"),"Cancel button", 30);
    	 driver.navigate().refresh();
     }
     /*----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
     /*
 	 * Code for click testing of Manage Tax for Company Setup
 	 */
     public void clickOnManageTaxforCompanySetup()
     {		staticWait(2000);
    	 click(By.xpath("//div/ul/li/a[@data-original-title='Manage Tax']"),"Manage Tax", 30);
    	
    	 try {
    		 WebElement manageTax = driver.findElement(By.xpath("//div/span[text()='Manage Taxes']"));
    		 if (manageTax.isDisplayed()) {
				logger.info("Manage Tax Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Manage Tax Page not opened succesfully");
		}
    	 
     }
     public void clickOnActionButton()
     {		staticWait(2000);
    	 clickByJavascript(By.xpath("//div/a[@class='action-icon']/i"),"Action Button", 30);
    	
     }
     public void clickOnManageTaxsaveButton()
     {		staticWait(2000);
    	 clickByJavascript(By.xpath("//div/a[@title='Save']"),"Save Button", 30);
    	
     }
     public void clickOnManageCancelButton()
     {		staticWait(2000);
    	 clickByJavascript(By.xpath("//div/a[@title='Cancel']"),"Save Button", 30);
    	 driver.navigate().refresh();
     }
     public void VerifyMandatoryFieldValidationOfManageTax() {
			int i = 0;
			String actualText;
			String expectedText;

			List<WebElement> errorMessageLocator = findMultipleElement(
					By.xpath("//span[contains(@class,'invalid-feedback')]"), 45);
			String[] expectedValue = { "Add Tax Code"};
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
     /*----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
     /*
 	 * Code for click testing of Resourrce approval for Company Setup
 	 */
     public void clickOnResourceApprovalforCompanySetup()
     {		staticWait(2000);
    	 click(By.xpath("//div/ul/li/a[@data-original-title='Resource Approval']"),"Resource Approval", 30);
    	
    	 try {
    		 WebElement resourceApproval = driver.findElement(By.xpath("//div/span[text()='Resource Approval']"));
    		 if (resourceApproval.isDisplayed()) {
				logger.info("Resource approval Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Resource approval Page not opened succesfully");
		}
    	 driver.navigate().refresh();
    	 
     }
     /*----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
     /*
 	 * Code for click testing of Roles for Company Setup
 	 */
     public void clickOnRolesforCompanySetup()
     {		staticWait(2000);
    	 click(By.xpath("//div/ul/li/a[@data-original-title='Roles']"),"Roles", 30);
    	
    	 try {
    		 WebElement roles = driver.findElement(By.xpath("//div/span[text()='Roles']"));
    		 if (roles.isDisplayed()) {
				logger.info("Roles Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Roles Page not opened succesfully");
		}
    	 
     }
     public void clickOnCreateRoles()
     {		staticWait(2000);
    	 click(By.xpath("//div/span/a[@data-original-title='Create Role']"),"Creates Roles", 30);
    	
    	 try {
    		 WebElement createsroles = driver.findElement(By.xpath("//div/span[text()='Roles']"));
    		 if (createsroles.isDisplayed()) {
				logger.info("Create Roles Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Create Roles Page not opened succesfully");
		}
    	 
     }
     public void VerifyMandatoryFieldValidationOfCreateRoles() {
			int i = 0;
			String actualText;
			String expectedText;

			List<WebElement> errorMessageLocator = findMultipleElement(
					By.xpath("//span[contains(@class,'invalid-feedback')]"), 45);
			String[] expectedValue = { "Role Name","Role Type"};
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
     /*----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
     /*
 	 * Code for click testing of User for Company Setup
 	 */
	     public void clickOnUserforCompanySetup()
	     {		staticWait(2000);
	    	 click(By.xpath("//div/ul/li/a[@data-original-title='User']"),"User", 30);
	    	
    	 try {
    		 WebElement user = driver.findElement(By.xpath("//div/span[contains(text(),'Manage Users')]"));
    		 if (user.isDisplayed()) {
				logger.info("User Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("User Page not opened succesfully");
		}
    	 
     }
	     public void clickOnAddUser()
	     {		staticWait(2000);
	    	 click(By.xpath("//span/a[@data-original-title='Add User']"),"Add User", 30);
	    	
    	 try {
    		 WebElement adduser = driver.findElement(By.xpath("//div/span[contains(text(),'Add User')]"));
    		 if (adduser.isDisplayed()) {
				logger.info("Add User Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Add User Page not opened succesfully");
		}
    	 
     }
	     public void clickOnSaveUser()
	     {		staticWait(2000);
	    	 click(By.xpath("//button[@id='btnSave']"),"Save Button", 30);
	     }
	     public void clickOnCancelUser()
	     {		staticWait(2000);
	    	 click(By.xpath("//div/a[@data-original-title='Cancel']"),"Cancel Button", 30);
	    	 driver.navigate().refresh();
	     }
	     public void VerifyMandatoryFieldValidationOfUser() {
				int i = 0;
				String actualText;
				String expectedText;

				List<WebElement> errorMessageLocator = findMultipleElement(
						By.xpath("//span[contains(@class,'invalid-feedback')]"), 45);
				String[] expectedValue = { "User Type","First Name","Last Name","Email","Password","Confirm Password"};
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
	     /*----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
	     /*
	 	 * Code for click testing of Search Vendors for Company Setup
	 	 */
	     public void clickOnSearchVendors()
	     {		staticWait(2000);
	    	 click(By.xpath("//div/ul/li/a[@data-original-title='Search Vendors']"),"Search vendors", 30);
	    	
    	 try {
    		 WebElement searchVendors = driver.findElement(By.xpath("//div/span[contains(text(),'Search Vendors')]"));
    		 if (searchVendors.isDisplayed()) {
				logger.info("Search Vendors Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Search Vendors Page not opened succesfully");
		}
    	 
     }
	     public void clickOnrequestEmployee()
	     {		staticWait(2000);
	    	 click(By.xpath("//div/span/a[@data-original-title='Request Employee']"),"Request Employee", 30);
	    	 String mainId = driver.getWindowHandle();
	    	 Set<String> allId = driver.getWindowHandles();
	    	 for(String id : allId) {
	    		 if(!mainId.equals(id)) {
	    			 driver.switchTo().window(id);
	    		 }
	    	 }
	    	
    	 try {
    		 WebElement requestEmployee = driver.findElement(By.xpath("//div/span[contains(text(),'Request Employee')]"));
    		 if (requestEmployee.isDisplayed()) {
				logger.info("Request Employee Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Request Employee Page not opened succesfully");
		}
    	 driver.switchTo().window(mainId);
    	 
     }
	     public void clickOnAssociateVendors()
	     {		staticWait(2000);
	    	 click(By.xpath("//div/span/a[@data-original-title='Associated Vendors']"),"Associated vendors", 30);
	    	 String mainId = driver.getWindowHandle();
	    	 Set<String> allId = driver.getWindowHandles();
	    	 for(String id : allId) {
	    		 if(!mainId.equals(id)) {
	    			 driver.switchTo().window(id);
	    		 }
	    	 }
	    	
    	 try {
    		 WebElement associatedVendors = driver.findElement(By.xpath("//div/span[contains(text(),'Associated Vendors')]"));
    		 if (associatedVendors.isDisplayed()) {
				logger.info("Associated Vendors Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Associated Vendors Page not opened succesfully");
		}
    	 driver.switchTo().window(mainId); 
     }
	     public void clickOnVendorsListing()
	     {		staticWait(2000);
	    	 click(By.xpath("//div/span/a[@data-original-title='Vendor Listing']"),"Vendor Listing", 30);
	    	 String mainId = driver.getWindowHandle();
	    	 Set<String> allId = driver.getWindowHandles();
	    	 for(String id : allId) {
	    		 if(!mainId.equals(id)) {
	    			 driver.switchTo().window(id);
	    		 }
	    	 }
	    	
    	 try {
    		 WebElement vendorsListing = driver.findElement(By.xpath("//div/span[contains(text(),'Vendor Listing')]"));
    		 if (vendorsListing.isDisplayed()) {
				logger.info(" Vendors listing Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Vendors Listing Page not opened succesfully");
		}
    	 driver.switchTo().window(mainId); 
     }
	     public void clickOnAddVendor()
	     {		staticWait(2000);
	    	 click(By.xpath("//div/span/a[@data-original-title='Add Vendor']"),"Add vendor", 30);
	    	 String mainId = driver.getWindowHandle();
	    	 Set<String> allId = driver.getWindowHandles();
	    	 for(String id : allId) {
	    		 if(!mainId.equals(id)) {
	    			 driver.switchTo().window(id);
	    		 }
	    	 }
	    	
    	 try {
    		 WebElement addvendors = driver.findElement(By.xpath("//div/span[contains(text(),'Add Vendor')]"));
    		 if (addvendors.isDisplayed()) {
				logger.info(" Add Vendor Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Add Vendors Page not opened succesfully");
		}
    	 driver.switchTo().window(mainId); 
     }
	     public void clickOnAssociate()
	     {		staticWait(2000);
	    	 click(By.xpath("//div/span/a[@data-original-title='Click To Associate']"),"Associate", 30);
	    	 click(By.xpath("//button[@id='closenotifymessage']"),"close notify message", 30);
	    	 driver.navigate().refresh();	  
     }
	     

}
