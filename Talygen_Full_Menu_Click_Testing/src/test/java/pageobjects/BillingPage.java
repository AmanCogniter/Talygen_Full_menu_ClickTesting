package pageobjects;

import static reporting.ComplexReportFactory.getTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.relevantcodes.extentreports.LogStatus;

import utils.WebBasePage;

public class BillingPage extends WebBasePage{
	WebDriver driver ;
	private static String fileDownloadpath = "C:\\Users\\aanand\\Downloads";
	public BillingPage(WebDriver driver) {
		super(driver, "BillingPage");
		this.driver=driver;
		// TODO Auto-generated constructor stub
	}
	public void clickFullMenuDropDown() {
		staticWait(3000);
        click(By.xpath("//span[text()='Full Menu']"), "Full Menu", 30);
        
    }
	/*
	 * Code for click testing of Automate Flag Processing for Billing
	 */
     public void clickOnBillingLink()
     {		staticWait(2000);
    	 click(By.xpath("//ul/li[@data-name='Billing']/span"),"Billing", 30);
    	 
     }
     public void clickOnAutomateFlagProcessing()
     {		staticWait(2000);
    	 click(By.xpath("//div/ul/li/a[@data-original-title='Automate Flag Processing']"),"Automate Flag Processing", 30);
    	
    	 try {
    		 WebElement automateFlagProcessing = driver.findElement(By.xpath("//div/span[text()='Automate Flag Processing']"));
    		 if (automateFlagProcessing.isDisplayed()) {
				logger.info("Automate Flag Processing Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Automate Flag Processing Page not opened succesfully");
		}
     }
     public void clickOnAddNewAutomateFlagProcessing()
     {		staticWait(2000);
    	 click(By.xpath("//span/a[@data-original-title='Add New']"),"Add New Automate Flag Processing", 30);
    	 try {
    		 WebElement productsGroupList = driver.findElement(By.xpath("//div/span[text()='Add']"));
    		 if (productsGroupList.isDisplayed()) {
				logger.info("Add New Automate Flag Processing Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Add New Automate Flag Processing Page not opened succesfully");
		} 
     }
     public void clickOnSaveButton()
     {		staticWait(3000);
    	 clickByJavascript(By.xpath("//div/a[@id='btnSaveFlagData']"),"Save Button", 30);
    	 click(By.xpath("//button[@id='closenotifymessage']"),"Close notify message popup", 30);
    	 
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
			String[] expectedValue = { "RuleName" };
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
     public void clickOnBillingRule()
     {		staticWait(2000);
    	 click(By.xpath("//div/ul/li/a[@data-original-title='Billing Rule']"),"Billing Rule", 30);
    	
    	 try {
    		 WebElement productsGroupList = driver.findElement(By.xpath("//div/span[text()='Manage Billing Rule']"));
    		 if (productsGroupList.isDisplayed()) {
				logger.info("Manage Billing Rule Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Manage Billing Rule Page not opened succesfully");
		}
     }
     public void clickOnAddNewBillingRule()
     {		staticWait(2000);
    	 click(By.xpath("//span/a[@data-original-title='Add Billing Rule']"),"Add Billing Rule", 30);
    	 try {
    		 WebElement billingRule = driver.findElement(By.xpath("//div/span[text()='Add']"));
    		 if (billingRule.isDisplayed()) {
				logger.info("Add Billing Rule Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Add Billing Rule Page not opened succesfully");
		} 
     }
     public void clickOnNextButton()
     {		staticWait(3000);
    	 clickByJavascript(By.xpath("//div/a[@id='btnSaveAndNext']"),"Next Button", 30);
    	 click(By.xpath("//button[@id='closenotifymessage']"),"Close notify message popup", 30);
    	 
     }
     public void VerifyMandatoryFieldValidationOfAddBillingRulePage() {
			int i = 0;
			String actualText;
			String expectedText;

			List<WebElement> errorMessageLocator = findMultipleElement(
					By.xpath("//span[contains(@class,'invalid-feedback')]"), 45);
			String[] expectedValue = { "Billing Rule Name","Client Name","Group By For Applying Charge","Select Utility Name" };
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
     public void clickOnExportToExcel()
     {		staticWait(2000);
    	 click(By.xpath("//span/a[@data-original-title='Export To Excel']"),"Export to excel", 30);
    	 
    	 Assert.assertTrue(isFileDownloaded(fileDownloadpath, "BillingRuleExport.xlsx"), "Failed to download Expected document");
    	 logger.info("File successfully Export to Excel");
			/*
			 * try { WebElement productsGroupList =
			 * driver.findElement(By.xpath("//div/span[text()='Add']")); if
			 * (productsGroupList.isDisplayed()) {
			 * logger.info("Add New Automate Flag Processing Page opened succesfully"); } }
			 * catch (Exception e) { // TODO: handle exception
			 * logger.info("Add New Automate Flag Processing Page not opened succesfully");
			 * }
			 */
    	 driver.navigate().refresh();
     }
     public void clickOnBillingService()
     {		staticWait(2000);
    	 click(By.xpath("//div/ul/li/a[@data-original-title='Billing Services']"),"Billing Service", 30);
    	
    	 try {
    		 WebElement billingService = driver.findElement(By.xpath("//div/span[text()='Billing Service']"));
    		 if (billingService.isDisplayed()) {
				logger.info("Billing Service Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Billing Service Page not opened succesfully");
		}
     }
     public void clickOnAddNewBillingService()
     {		staticWait(2000);
    	 click(By.xpath("//span/a[@data-original-title='Add Service']"),"Add Billing Service", 30);
    	 try {
    		 WebElement billingService = driver.findElement(By.xpath("//div/span[text()='Add Service']"));
    		 if (billingService.isDisplayed()) {
				logger.info("Add Billing service Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Add Billing service Page not opened succesfully");
		} 
     }
     public void clickOnSaveButtonOfBillingService()
     {		staticWait(3000);
    	 clickByJavascript(By.xpath("//div/a[@id='btnSave']"),"Save Button", 30);
    	 click(By.xpath("//button[@id='closenotifymessage']"),"Close notify message popup", 30);
    	 
     }
     public void VerifyMandatoryFieldValidationOfAddBillingServicePage() {
			int i = 0;
			String actualText;
			String expectedText;

			List<WebElement> errorMessageLocator = findMultipleElement(
					By.xpath("//span[contains(@class,'invalid-feedback')]"), 45);
			String[] expectedValue = { "Category Name","Select Setup","Service Name "};
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
     public void clickOnBillingSetup()
     {		staticWait(2000);
    	 click(By.xpath("//div/ul/li/a[@data-original-title='Billing Setup']"),"Billing Setup", 30);
    	
    	 try {
    		 WebElement billingSetup = driver.findElement(By.xpath("//div/span[text()='Billing Setup']"));
    		 if (billingSetup.isDisplayed()) {
				logger.info("Billing Setup Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Billing Setup Page not opened succesfully");
		}
     }
     public void clickOnAddNewBillingSetup()
     {		staticWait(2000);
    	 click(By.xpath("//div/a[@data-original-title='Add Setup']"),"Add Billing Setup", 30);
    	 try {
    		 WebElement billingSetup = driver.findElement(By.xpath("//div/span[text()='Add Setup']"));
    		 if (billingSetup.isDisplayed()) {
				logger.info("Add Billing setupe Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Add Billing setup Page not opened succesfully");
		} 
     }
     public void clickOnImport()
     {		staticWait(2000);
    	 click(By.xpath("//div/a[@data-original-title='Import']"),"Import", 30);
     }
     public void VerifyMandatoryFieldValidationOfAddBillingSetupPage() {
			int i = 0;
			String actualText;
			String expectedText;

			List<WebElement> errorMessageLocator = findMultipleElement(
					By.xpath("//span[contains(@class,'invalid-feedback')]"), 45);
			String[] expectedValue = { "Upload a File"};
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
     public void clickOnFlagRecords()
     {		staticWait(2000);
    	 click(By.xpath("//div/ul/li/a[@data-original-title='Flag Records']"),"Flag Records", 30);
    	
    	 try {
    		 WebElement flagRecords = driver.findElement(By.xpath("//div/span[text()='Flag Records']"));
    		 if (flagRecords.isDisplayed()) {
				logger.info("Flag Record Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Flag Record Page not opened succesfully");
		}
     }
     public void clickOnProcess()
     {		staticWait(2000);
    	 clickByJavascript(By.xpath("//span/a[@data-original-title='Process']"),"Process", 30);
    	 click(By.xpath("//button[@id='closenotifymessage']"),"Close notify message", 30);
     }
     public void clickOnDoNotBill()
     {		staticWait(2000);
    	 clickByJavascript(By.xpath("//span/a[@data-original-title='Do Not Bill']"),"Do not bill", 30);
    	 click(By.xpath("//button[@id='closenotifymessage']"),"Close notify message", 30);
     }
     public void clickOnUpdate()
     {		staticWait(2000);
    	 clickByJavascript(By.xpath("//span/a[@data-original-title='Update']"),"Update", 30);
    	 click(By.xpath("//button[@id='closenotifymessage']"),"Close notify message", 30);
     }
     public void clickOnFlagSummaryReport()
     {		staticWait(2000);
    	 clickByJavascript(By.xpath("//span/a[@data-original-title='Flag Summary Report']"),"Flag Summary Report", 30);
    	
    	 try {
    		 WebElement AccountDetailReport = driver.findElement(By.xpath("//div/span[text()='Account Detail Report']"));
    		 if (AccountDetailReport.isDisplayed()) {
				logger.info("Account Detail Report Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Account Detail Report Page not opened succesfully");
		}
     }
     public void clickOnInvoiceDetailReport()
     {		staticWait(2000);
    	 clickByJavascript(By.xpath("//div/ul/li/a[@id='aInvoiceDetail']"),"Invoice Detail Report", 30);
    	
    	 try {
    		 WebElement invoiceDetailReport = driver.findElement(By.xpath("//div/span[text()='Invoice Details Report']"));
    		 if (invoiceDetailReport.isDisplayed()) {
				logger.info("Invoice Detail Report Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Invoice Detail Report Page not opened succesfully");
		}
    	 driver.navigate().refresh();
     }
     public void clickOnClientReport()
     {		staticWait(2000);
    	 click(By.xpath("//div/ul/li/a[@data-original-title='Client Report']"),"client report", 30);
    	
    	 try {
    		 WebElement billingSetup = driver.findElement(By.xpath("//div/span[text()='Client Report']"));
    		 if (billingSetup.isDisplayed()) {
				logger.info("Client Report Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Client Report Page not opened succesfully");
		}
     }
     public void clickOnSearch()
     {		staticWait(2000);
    	 clickByJavascript(By.xpath("//div/a[@id='aSearch']"),"Search button", 30);
    	 try {
    		 WebElement clientReport = driver.findElement(By.xpath("//div[@id='viewer_logo']"));
    		 if (clientReport.isDisplayed()) {
				logger.info("Client Report Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Client Report Page not opened succesfully");
		}
     }
     public void clickOnClearButton()
     {		staticWait(2000);
    	 clickByJavascript(By.xpath("//a[@id='Clear']"),"Clear button", 30);
     }
     public void clickOnAddNewInvoice()
     {		staticWait(2000);
    	 click(By.xpath("//div/ul/li/a[@data-original-title='Add New Invoice']"),"Add New Invoice", 30);
    	
    	 try {
    		 WebElement billingSetup = driver.findElement(By.xpath("//div/span[text()=' Add Invoice']"));
    		 if (billingSetup.isDisplayed()) {
				logger.info("Add Invoice Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Add Invoice Page not opened succesfully");
		}
    	 driver.navigate().refresh();
     }
     public void clickOnAddInvoiceSaveButton()
     {		staticWait(2000);
    	 click(By.xpath("//div/a[@id='aSave']"),"Save button", 30);
    	 click(By.xpath("//button[@id='closenotifymessage']"),"Close notify message popup", 30);
     }
     public void VerifyMandatoryFieldValidationOfAddInvoicePage() {
			int i = 0;
			String actualText;
			String expectedText;

			List<WebElement> errorMessageLocator = findMultipleElement(
					By.xpath("//span[contains(@class,'invalid-feedback')]"), 45);
			String[] expectedValue = { "Bill To"};
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
				driver.navigate().refresh();

			}
		}
     public void clickOnImportInvoice()
     {		staticWait(2000);
    	 click(By.xpath("//div/ul/li/a[@data-original-title='Import Invoice']"),"Import Invoice", 30);
    	
    	 try {
    		 WebElement billingSetup = driver.findElement(By.xpath("//div/span[contains(text(),'Manage  Invoice Files')]"));
    		 if (billingSetup.isDisplayed()) {
				logger.info("Import invoice Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Import invoice Page not opened succesfully");
		}
     }
     public void clickOnImportManageInvoiceFiles()
     {		staticWait(2000);
    	 click(By.xpath("//span/a[@data-original-title='Import']"),"Import", 30);
    	
    	 try {
    		 WebElement importInvoice = driver.findElement(By.xpath("//div/span[contains(text(),'Import')]"));
    		 if (importInvoice.isDisplayed()) {
				logger.info("Import Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Import Page not opened succesfully");
		}
     }
     public void clickOnInvoice()
     {		staticWait(2000);
    	 click(By.xpath("//div/ul/li/a[@data-original-title='Invoice']"),"Invoice", 30);
    	
    	 try {
    		 WebElement billingSetup = driver.findElement(By.xpath("//div/span[contains(text(),'Invoice')]"));
    		 if (billingSetup.isDisplayed()) {
				logger.info("invoice Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("invoice Page not opened succesfully");
		}
     }
     public void clickOnPageTour()
     {		staticWait(2000);
     clickByJavascript(By.xpath("//div/span/a[@data-original-title='Page Tour']"),"Page tour", 30);
     click(By.xpath("//*[name()='svg' and @class='guided-tour-icon']"),"Close tour guide", 30);
     }
     public void clickOnManualInvoice()
     {		staticWait(2000);
    	 click(By.xpath("//div//a[@data-original-title='Manual Invoice']"),"Manual Invoice", 30);
    	
    	 try {
    		 WebElement manualInvoice = driver.findElement(By.xpath("//div/span[contains(text(),' Add Invoice')]"));
    		 if (manualInvoice.isDisplayed()) {
				logger.info("Manual invoice Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Manual invoice Page not opened succesfully");
		}
     }
     public void clickOnAddManualInvoiceSaveButton()
     {		staticWait(3000);
    	 clickByJavascript(By.xpath("//div/a[@id='aSave']"),"Save Button", 30);
    	 click(By.xpath("//button[@id='closenotifymessage']"),"Close notify message popup", 30);
    	 
     }
     public void clickOnInvoiceREport()
     {		staticWait(2000);
    	 click(By.xpath("//div/ul/li/a[@data-original-title='Invoice Report']"),"Invoice report", 30);
    	
    	 try {
    		 WebElement Invoicereport = driver.findElement(By.xpath("//div/span[contains(text(),'Invoice')]"));
    		 if (Invoicereport.isDisplayed()) {
				logger.info("Invoice report Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Invoice report Page not opened succesfully");
		}
     }
     public void clickOnClearButtonofInvoiceReport()
     {		staticWait(2000);
    	 clickByJavascript(By.xpath("//a[@id='aClear']"),"Clear button", 30);
    	 driver.navigate().refresh();
     }
    
     public void clickOnProcessAndReprocessCharges()
     {		staticWait(2000);
    	 click(By.xpath("//div/ul/li/a[@data-original-title='Process & Reprocess Charges']"),"Process & Reprocess Charges", 30);
    	
    	 try {
    		 WebElement ProcessAndReprocessCharges = driver.findElement(By.xpath("//div/span[contains(text(),'Process & Reprocess Charges')]"));
    		 if (ProcessAndReprocessCharges.isDisplayed()) {
				logger.info("Process And Reprocess Charges Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Process And Reprocess Charges Page not opened succesfully");
		}
     }	
     public void clickOnViewQueueList()
     {		staticWait(2000);
    	 clickByJavascript(By.xpath("//span/a[@data-original-title='View Queue List']"),"View Queue List", 30);
    	 try {
    		 WebElement queueList = driver.findElement(By.xpath("//h5/span[text()='Queue List']"));
    		 if (queueList.isDisplayed()) {
				logger.info("Queue List Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Queue List Page not opened succesfully");
		}
    	 driver.navigate().refresh();
     }
     public void clickOnRateSchedule()
     {		staticWait(2000);
    	 clickByJavascript(By.xpath("//div/ul/li/a[@data-original-title='Rate Schedule']"),"Rate Schedul", 30);
    	 try {
    		 WebElement RateSchedul = driver.findElement(By.xpath("//div/span[text()='Rate Schedule']"));
    		 if (RateSchedul.isDisplayed()) {
				logger.info("Rate Schedul Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Rate Schedul Page not opened succesfully");
		}
     }
     public void clickOnAddRateSchedule()
     {		staticWait(2000);
    	 clickByJavascript(By.xpath("//span/a[@data-original-title='Add Rate Schedule ']"),"Add Rate Schedul", 30);
    	 try {
    		 WebElement addRateSchedul = driver.findElement(By.xpath("//div/h5[text()='Add Rate']"));
    		 if (addRateSchedul.isDisplayed()) {
				logger.info("Rate Schedul Page opened succesfully");
				click(By.xpath("//div/h5[text()='Add Rate']/ancestor::div[@class='modal-content']/descendant::button[@data-original-title='Close']"),"Close add rate page", 30);
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Rate Schedul Page not opened succesfully");
		}
     }
     public void clickOnUpdateRateSchedul()
     {		staticWait(2000);
    	 click(By.xpath("//span/a[@data-original-title='Update']"),"Upadte", 30);
    	 click(By.xpath("//button[@id='closenotifymessage']"),"Close notify message popup", 30);
     }
     public void clickOnCopyRate()
     {		staticWait(2000);
    	 click(By.xpath("//span/a[@data-original-title='Copy Rate']"),"Upadte", 30);
    	 click(By.xpath("//button[@id='closenotifymessage']"),"Close notify message popup", 30);
     }
     public void clickOnViewHistory()
     {		staticWait(2000);
    	 clickByJavascript(By.xpath("//div/span/a[@data-original-title='View History']"),"View History", 30);
    	 try {
    		 WebElement viewHistory = driver.findElement(By.xpath("//div/span[text()='Rate Schedule History']"));
    		 if (viewHistory.isDisplayed()) {
				logger.info("view History Page opened succesfully");
				
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("view History Page not opened succesfully");
		}
    	 driver.navigate().refresh();
     }
     public void clickOnReceivedInvoice()
     {		staticWait(2000);
    	 click(By.xpath("//div/ul/li/a[@data-original-title='Received Invoice']"),"Received Invoice", 30);
    	
    	 try {
    		 WebElement receivedInvoice = driver.findElement(By.xpath("//div/span[contains(text(),'Invoice')]"));
    		 if (receivedInvoice.isDisplayed()) {
				logger.info("Received Invoice Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Received Invoice Page not opened succesfully");
		}
    	 driver.navigate().refresh();
     }
     
}
