package pageobjects;

import static reporting.ComplexReportFactory.getTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.LogStatus;

import utils.WebBasePage;

public class GeneralPage extends WebBasePage{
	WebDriver driver ;
	public GeneralPage(WebDriver driver) {
		super(driver, "GeneralPage");
		this.driver=driver;
		// TODO Auto-generated constructor stub
	}
	public void clickFullMenuDropDown() {
		staticWait(3000);
        click(By.xpath("//span[text()='Full Menu']"), "Full Menu", 30);
        
    }
	/*
	 * Code for click testing of External Link for General
	 */
     public void clickOnGeneral()
     {		staticWait(2000);
    	 click(By.xpath("//ul/li[@data-name='General']/span"),"General", 30);
    	 
     }
     public void clickOnAddReport()
     {		staticWait(2000);
    	 click(By.xpath("//div/ul/li/a[@data-original-title='Add Report']"),"Add Report", 30);
    	
    	 try {
    		 WebElement addReport = driver.findElement(By.xpath("//div/a/span[text()='GENERAL']"));
    		 if (addReport.isDisplayed()) {
				logger.info("Add report Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Add Report Page not opened succesfully");
		}
     }
     public void clickOnSaveButton()
     {		staticWait(2000);
    	 click(By.xpath("//div/a[@data-original-title='Save']"),"Save Button", 30);
     }
     public void VerifyMandatoryFieldValidation() {
			int i = 0;
			String actualText;
			String expectedText;

			List<WebElement> errorMessageLocator = findMultipleElement(
					By.xpath("//span[contains(@class,'field-validation-valid invalid-feedback')]"), 45);
			String[] expectedValue = { "Report Name","Category"};
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
     {		staticWait(2000);
    	 click(By.xpath("//div/a[@data-original-title='Cancel']"),"Cancel Button", 30);
    	 driver.navigate().refresh();
     }
     /*---------------------------------------------------------------------------------------------------------------------------------*/
     /*Code for click testing of Auto Responder */
     public void clickOnAutoResponder()
     {		staticWait(2000);
    	 click(By.xpath("//div/ul/li/a[@data-original-title='Auto Responder']"),"Auto Responder", 30);
    	
    	 try {
    		 WebElement autoResponder = driver.findElement(By.xpath("//div/span[text()='Auto Responder']"));
    		 if (autoResponder.isDisplayed()) {
				logger.info("Auto Responder Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Auto Responder Page not opened succesfully");
		}
     }
     public void clickOnAddAutoResponder()
     {		staticWait(2000);
    	 click(By.xpath("//div/span/a[@data-original-title='Add New']"),"Add new Auto Responder", 30);
    	
    	 try {
    		 WebElement addautoResponder = driver.findElement(By.xpath("//div/span[text()='Manage Auto Responder']"));
    		 if (addautoResponder.isDisplayed()) {
				logger.info("Manage Auto Responder Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Manage Auto Responder Page not opened succesfully");
		}
     }
     public void clickOnSaveAutoResponder()
     {		staticWait(2000);
    	 click(By.xpath("//div/button[@data-original-title='Save']"),"Save Button", 30);
     }
    
     public void VerifyMandatoryFieldOfAddAutoResponder() {
			int i = 0;
			String actualText;
			String expectedText;

			List<WebElement> errorMessageLocator = findMultipleElement(
					By.xpath("//span[contains(@class,'field-validation-valid invalid-feedback')]"), 45);
			String[] expectedValue = { "Title","Message"};
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
     /*---------------------------------------------------------------------------------------------------------------------------------*/
     /*Code for click testing of Custom Fields */
     public void clickOnCustomFields()
     {		staticWait(2000);
    	 click(By.xpath("//div/ul/li/a[@data-original-title='Custom Fields']"),"Custom Fields", 30);
    	
    	 try {
    		 WebElement customFields = driver.findElement(By.xpath("//div/span[contains(text(),'Custom Field')]"));
    		 if (customFields.isDisplayed()) {
				logger.info("Custom Fields Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Custom Fields Page not opened succesfully");
		}
     }
     public void clickOnAddCustomFields()
     {		staticWait(2000);
    	 click(By.xpath("//div/span/a[@data-original-title='Add Custom Fields']"),"Add Custom Fields", 30);
    	
    	 try {
    		 WebElement addCustomFields = driver.findElement(By.xpath("//div/span[text()='Manage Custom Fields']"));
    		 if (addCustomFields.isDisplayed()) {
				logger.info("Manage Custom Fields Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Manage Custom Fields Page not opened succesfully");
		}
     }
     public void VerifyMandatoryFieldOfAddCustomFields() {
			int i = 0;
			String actualText;
			String expectedText;

			List<WebElement> errorMessageLocator = findMultipleElement(
					By.xpath("//span[contains(@class,'field-validation-valid invalid-feedback')]"), 45);
			String[] expectedValue = { "Module Name","Sub Module Name","Field Name","Length"};
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
     /*---------------------------------------------------------------------------------------------------------------------------------*/
     /*Code for click testing of Custom Reports */
     public void clickOnCustomReports()
     {		staticWait(2000);
    	 click(By.xpath("//div/ul/li/a[@data-original-title='Custom Reports']"),"Custom Reports", 30);
    	
    	 try {
    		 WebElement customReports = driver.findElement(By.xpath("//div/span[contains(text(),'Custom  Report')]"));
    		 if (customReports.isDisplayed()) {
				logger.info("Custom Reports Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Custom Reports Page not opened succesfully");
		}
     }
     public void clickOnAddCustomReports()
     {		staticWait(2000);
    	 click(By.xpath("//div/span/a[@data-original-title='Add Report']"),"Add Custom Reports", 30);
    	
    	 try {
    		 WebElement addCustomReports = driver.findElement(By.xpath("(//div/ul/li/a[@data-original-title='General Settings'])[2]"));
    		 if (addCustomReports.isDisplayed()) {
				logger.info("Manage Custom Reports Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Manage Custom Reports Page not opened succesfully");
		}
     }
     public void VerifyMandatoryFieldOfCustomReports() {
			int i = 0;
			String actualText;
			String expectedText;

			List<WebElement> errorMessageLocator = findMultipleElement(
					By.xpath("//span[contains(@class,'field-validation-valid invalid-feedback')]"), 45);
			String[] expectedValue = { "Report Name","Category"};
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
     /*---------------------------------------------------------------------------------------------------------------------------------*/
     /*Code for click testing of External Link */
     public void clickOnExternalLink()
     {		staticWait(2000);
    	 click(By.xpath("//div/ul/li/a[@data-original-title='External Link']"),"External Link", 30);
    	
    	 try {
    		 WebElement externalLink = driver.findElement(By.xpath("//div/span/span[contains(text(),'External Link')]"));
    		 if (externalLink.isDisplayed()) {
				logger.info("External Link Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("External Link Page not opened succesfully");
		}
    	 driver.navigate().refresh();
     }
     /*---------------------------------------------------------------------------------------------------------------------------------*/
     /*Code for click testing of Passport Information */
     public void clickOnPassportInformation()
     {		staticWait(2000);
    	 click(By.xpath("//div/ul/li/a[@data-original-title='Passport Information']"),"Passport Information", 30);
    	
    	 try {
    		 WebElement passportInformation = driver.findElement(By.xpath("//div/span[contains(text(),'Passport')]"));
    		 if (passportInformation.isDisplayed()) {
				logger.info("Passport Information Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Passport Information Page not opened succesfully");
		}
     }
     public void clickOnAddPassportInformation()
     {		staticWait(2000);
    	 click(By.xpath("//div/span/a[@data-original-title='Add']"),"Add Passport Information", 30);
    	
    	 try {
    		 WebElement addpassportInformation = driver.findElement(By.xpath("//div/h5[contains(text(),'Passport')]"));
    		 if (addpassportInformation.isDisplayed()) {
				logger.info("Add Passport Information Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Add Passport Information Page not opened succesfully");
		}
     }
     public void VerifyMandatoryFieldOfAddPassportInformation() {
			int i = 0;
			String actualText;
			String expectedText;

			List<WebElement> errorMessageLocator = findMultipleElement(
					By.xpath("//span[contains(@class,'field-validation-valid invalid-feedback')]/ancestor::div[@class='form-group']/descendant::span[contains(@class,'text-danger')]"), 45);
			String[] expectedValue = { "User Name","Passport Number","Nationality","Place of Issue","Status"};
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
     /*---------------------------------------------------------------------------------------------------------------------------------*/
     /*Code for click testing of Manage Layout */
     public void clickOnManageLayout()
     {		staticWait(2000);
    	 click(By.xpath("//div/ul/li/a[@data-original-title='Manage Layout']"),"Manage Layout", 30);
    	
    	 try {
    		 WebElement manageLayout = driver.findElement(By.xpath("//div/span[contains(text(),'Manage Layout')]"));
    		 if (manageLayout.isDisplayed()) {
				logger.info("Manage Layout Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Manage Layout Page not opened succesfully");
		}
    	 driver.navigate().refresh();
     }
     /*---------------------------------------------------------------------------------------------------------------------------------*/
     /*Code for click testing of Organization Chart */
     public void clickOnOrganizationChart()
     {		staticWait(2000);
    	 click(By.xpath("//div/ul/li/a[@data-original-title='Organization Chart']"),"Organization Chart", 30);
    	
    	 try {
    		 WebElement OrganizationChart = driver.findElement(By.xpath("//div/span[contains(text(),'Organization Chart')]"));
    		 if (OrganizationChart.isDisplayed()) {
				logger.info("Organization Chart Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Organization Chart Page not opened succesfully");
		}
     }
     public void clickOnChangeRootMember()
     {		staticWait(2000);
    	 click(By.xpath("//div/span/a[@data-original-title='Change Root Member']"),"Change Root Member", 30);
    	
    	 try {
    		 WebElement changeRootMember = driver.findElement(By.xpath("//div/h5[contains(text(),'Replace Root Member With')]"));
    		 if (changeRootMember.isDisplayed()) {
				logger.info("Replace Root Member With Page opened succesfully");
				 click(By.xpath("//div/h5[contains(text(),'Replace Root Member With')]/ancestor::div[@class='modal-content']/descendant::button[@class='close']"),"Close Button", 30);
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Replace Root Member With Page not opened succesfully");
		}
    	 driver.navigate().refresh();
     }
     /*---------------------------------------------------------------------------------------------------------------------------------*/
     /*Code for click testing of Provisional Rights */
     public void clickOnProvisionalRights()
     {		staticWait(2000);
    	 click(By.xpath("//div/ul/li/a[@data-original-title='Provisional Rights']"),"Provisional Rights", 30);
    	
    	 try {
    		 WebElement provisionalRights = driver.findElement(By.xpath("//div/span[contains(text(),'Provisional Rights')]"));
    		 if (provisionalRights.isDisplayed()) {
				logger.info("Provisional Rights Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Provisional Rights Page not opened succesfully");
		}
     }
     public void clickOnAddProvisionalRights()
     {		staticWait(2000);
    	 click(By.xpath("//div/span/a[@data-original-title='Add Provisional Rights']"),"Add Provisional Rights", 30);
    	
    	 try {
    		 WebElement addprovisionalRights = driver.findElement(By.xpath("//div/span[contains(text(),'Provisional Rights')]"));
    		 if (addprovisionalRights.isDisplayed()) {
				logger.info("Add Provisional Rights Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Add Provisional Rights Page not opened succesfully");
		}
     }
     public void VerifyMandatoryFieldOfAddProvisionalRights() {
			int i = 0;
			String actualText;
			String expectedText;

			List<WebElement> errorMessageLocator = findMultipleElement(
					By.xpath("//span[contains(@class,'field-validation-valid invalid-feedback')]/ancestor::div[@class='form-group']/descendant::span[contains(@class,'text-danger')]"), 45);
			String[] expectedValue = { "Assigned From","Assigned To","Effective From ","Effective To "};
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
     {		staticWait(3000);
    	 click(By.xpath("//div[@class='custom-control custom-checkbox']"),"CheckBox ", 30);
     }
     public void clickOnActive()
     {		staticWait(2000);
    	 click(By.xpath("//div/span/a[@data-original-title='Active']"),"Active ", 30);
    	 staticWait(2000);
    	 click(By.xpath("//div/button[@title='Cancel']"),"Cancel Button ", 30);
     }
     public void clickOnInActive()
     {		staticWait(2000);
    	 click(By.xpath("//div/span/a[@data-original-title='Inactive']"),"InActive ", 30);
    	 staticWait(2000);
    	 click(By.xpath("//div/button[@title='Cancel']"),"Cancel Button ", 30);
    	 driver.navigate().refresh();
     }
     /*------------------------------------------------------------------------------------------------------------------------------------------*/
     /*Code for click testing of Rule Engine*/
     public void clickOnRuleEngine()
     {		staticWait(2000);
    	 click(By.xpath("//div/ul/li/a[@data-original-title='Rule Engine']"),"Rule Engine", 30);
    	
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
     public void clickOnCancelRuleEngine()
     {		staticWait(2000);
    	 clickByJavascript(By.xpath("//div/a[@data-original-title='Cancel']"),"cancel Button", 30);
    	 driver.navigate().refresh();
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
     /*Code for click testing of Storage*/
     public void clickOnStorage()
     {		staticWait(2000);
    	 click(By.xpath("//div/ul/li/a[@data-original-title='Storage']"),"Storage", 30);
    	
    	 try {
    		 WebElement storage = driver.findElement(By.xpath("//div/span[text()='Manage Storage']"));
    		 if (storage.isDisplayed()) {
				logger.info("Storage Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Storage Page not opened succesfully");
		}
    	 driver.navigate().refresh();
     }
     /*------------------------------------------------------------------------------------------------------------------------------------------*/
     /*Code for click testing of Tags*/
     public void clickOnTags()
     {		staticWait(2000);
    	 click(By.xpath("//div/ul/li/a[@data-original-title='Tags']"),"Tags", 30);
    	
    	 try {
    		 WebElement tags = driver.findElement(By.xpath("//div/span[text()='Tag Detail']"));
    		 if (tags.isDisplayed()) {
				logger.info("Tags Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Tags Page not opened succesfully");
		}
    	 driver.navigate().refresh();
     }
     /*------------------------------------------------------------------------------------------------------------------------------------------*/
     /*Code for click testing of Working Day*/
     public void clickOnWorkingDay()
     {		staticWait(2000);
    	 click(By.xpath("//div/ul/li/a[@data-original-title='Working Day']"),"Working Day", 30);
    	
    	 try {
    		 WebElement workingDay = driver.findElement(By.xpath("//div/span[text()='Working/Non-Working Day']"));
    		 if (workingDay.isDisplayed()) {
				logger.info("Working Day or Non Working Day Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Working Day or Non Working Day Page not opened succesfully");
		}
     }
     public void clickOnAddWorkingDay()
     {		staticWait(2000);
    	 click(By.xpath("//div/span/a[@data-original-title='Add Working Day']"),"Add Working Day", 30);
    	
    	 try {
    		 WebElement addworkingDay = driver.findElement(By.xpath("//div/span[text()='Manage Working/Non-Working Day']"));
    		 if (addworkingDay.isDisplayed()) {
				logger.info("Manage Working/Non-Working Day Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Manage Working/Non-Working Day Page not opened succesfully");
		}
     }
     public void clickOnSaveOfAddWorkingday()
     {		staticWait(2000);
    	 clickByJavascript(By.xpath("//div/a[@data-original-title='Save']"),"Save Button", 30);
    	 
     }
     public void VerifyMandatoryFielOfAddWorkingDay() {
			int i = 0;
			String actualText;
			String expectedText;

			List<WebElement> errorMessageLocator = findMultipleElement(
					By.xpath("//span[contains(@class,'invalid-feedback')]"), 45);
			String[] expectedValue = { "Date ","Location","Users","Comment" };
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
     /*Code for click testing of Working Week*/
     public void clickOnWorkingWeek()
     {		staticWait(2000);
    	 click(By.xpath("//div/ul/li/a[@data-original-title='Working Week']"),"Working Week", 30);
    	
    	 try {
    		 WebElement workingweek = driver.findElement(By.xpath("//div/span[text()='Setup for the working week']"));
    		 if (workingweek.isDisplayed()) {
				logger.info("Setup for the working week Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Setup for the working week Page not opened succesfully");
		}
    	 driver.navigate().refresh();
     }
}
