package pageobjects;

import static reporting.ComplexReportFactory.getTest;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.LogStatus;

import utils.StopWatch;
import utils.WebBasePage;

public class IntegrationPage extends WebBasePage{
	WebDriver driver ;
	
	public IntegrationPage(WebDriver driver) {
		super(driver, "IntegrationPage");
		this.driver=driver;
		// TODO Auto-generated constructor stub
	}
	public void clickFullMenuDropDown() {
		staticWait(3000);
        click(By.xpath("//span[text()='Full Menu']"), "Full Menu", 30);
        
    }
	/*
	 * Code for click testing of External Link for Integration Page
	 */
     public void clickOnIntegration()
     {		staticWait(2000);
    	 click(By.xpath("//ul/li[@data-name='Integration']/span"),"Integration", 30);
    	 
     }
     public void clickOnBasecampforIntegration()
     {		staticWait(2000);
    	 click(By.xpath("//div/ul/li/a[@data-original-title='Basecamp']"),"Basecamp", 30);
    	
    	 try {
    		 WebElement basecamp = driver.findElement(By.xpath("//div/h3[contains(text(),'Basecamp Integration')]"));
    		 if (basecamp.isDisplayed()) {
				logger.info("Basecamp Integration Page opened succesfully");
				/*
				 * long start = System.currentTimeMillis();
				 * 
				 * driver.get("https://basecamp.talygen.com/authenticate.aspx");
				 * 
				 * long finish = System.currentTimeMillis(); long totalTime = finish - start;
				 * System.out.println("Total Time for page load - "+totalTime);
				 */
				StopWatch pageLoad = new StopWatch();
				pageLoad.start();
		        //Open your web app (In my case, I opened facebook)
		        driver.get("https://basecamp.talygen.com/authenticate.aspx");
		        // Wait for the required any element (I am waiting for Login button in fb)
		        WebDriverWait wait = new WebDriverWait(driver, 10);
		        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div/h3[contains(text(),'Basecamp Integration')]")));

		        pageLoad.stop();
		        //Get the time
		        float pageLoadTime_ms = pageLoad.getElapsedTime();
		        float pageLoadTime_Seconds = pageLoadTime_ms/1000;
		        System.out.println("Total Page Load Time: " + pageLoadTime_ms + " milliseconds");
		        System.out.println("Total Page Load Time: " + pageLoadTime_Seconds + " seconds");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Basecamp Integration Page not opened succesfully");
		}
    	 driver.navigate().back();
     }
     /*------------------------------------------------------------------------------------------------------------------------------------------*/
     /*Code for click testing of Connector */
     public void clickOnConnector()
     {		staticWait(2000);
     click(By.xpath("(//div/ul/li/a[@data-original-title='Connector'])[2]"),"Connector", 30);
    	
    	 try {
    		 WebElement connector = driver.findElement(By.xpath("//div/a/span[text()='Status Code Mapping']"));
    		 if (connector.isDisplayed()) {
				logger.info("Connector Page opened succesfully");
			}
    	 }
		 catch (Exception e) {
			// TODO: handle exception
			logger.info("Connector Page not opened succesfully");
		}
    	 
     }
     /*------------------------------------------------------------------------------------------------------------------------------------------*/
     /*Code for click testing of Email */
     public void clickOnEmail()
     {		staticWait(2000);
     click(By.xpath("//div/ul/li/a[@data-original-title='Email']"),"Email", 30);
    	
    	 try {
    		 WebElement email = driver.findElement(By.xpath("//div/span[text()='Email Account Configuration']"));
    		 if (email.isDisplayed()) {
				logger.info("Email Account Configuration Page opened succesfully");
			}
    	 }
		 catch (Exception e) {
			// TODO: handle exception
			logger.info("Email Account Configuration Page not opened succesfully");
		}
    	 driver.navigate().refresh(); 
     }
     /*------------------------------------------------------------------------------------------------------------------------------------------*/
     /*Code for click testing of FreshBooks */
     public void clickOnFreshBooksforIntegration()
     {		staticWait(2000);
    	 click(By.xpath("//div/ul/li/a[@data-original-title='FreshBooks']"),"FreshBooks", 30);
    	
    	 try {
    		 WebElement freshBooks = driver.findElement(By.xpath("//div/h3[contains(text(),'Freshbook Integration')]"));
    		 if (freshBooks.isDisplayed()) {
				logger.info("Freshbook Integration Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Freshbook Integration Page not opened succesfully");
		}
    	 driver.navigate().back();
     }
     /*------------------------------------------------------------------------------------------------------------------------------------------*/
     /*Code for click testing of FreshBooks */
     public void clickOnGPSTrackingforIntegration()
     {		staticWait(2000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='GPS Tracking'])[2]"),"GPS Tracking", 30);
    	
    	 try {
    		 WebElement gPSTracking = driver.findElement(By.xpath("//div/span[contains(text(),'Device List')]"));
    		 if (gPSTracking.isDisplayed()) {
				logger.info("GPS Tracking Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("GPS Tracking Page not opened succesfully");
		}
    	 
     }
     public void clickOnAddDeviceIntegrationforIntegration()
     {		staticWait(2000);
    	 click(By.xpath("//div/span/a[@id='ancCreateJob']"),"Add Device Integration", 30);
    	
    	 try {
    		 WebElement addDeviceIntegration = driver.findElement(By.xpath("//div/span[contains(text(),'Manage Device')]"));
    		 if (addDeviceIntegration.isDisplayed()) {
				logger.info("Manage Device Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Manage Device Page not opened succesfully");
		}
    	 
     }
     public void clickOnBackToList()
     {		staticWait(2000);
    	 click(By.xpath("//div/span/a[@data-original-title='Back to list']"),"Back To List", 30);
    	 driver.navigate().refresh();
     }
     /*------------------------------------------------------------------------------------------------------------------------------------------*/
     /*Code for click testing of IVR */
     public void clickOnIVRforIntegration()
     {		staticWait(2000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='IVR'])[2]"),"IVR", 30);
    	
    	 try {
    		 WebElement iVR = driver.findElement(By.xpath("//div/span[contains(text(),'Add IVR')]"));
    		 if (iVR.isDisplayed()) {
				logger.info("Add IVR Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Add IVR Page not opened succesfully");
		}
    	 
     }
     public void clickOnAddChildIVRforIntegration()
     {		staticWait(2000);
    	 clickByJavascript(By.xpath("(//div/a[@data-original-title='Add Child'])[2]"),"Add Child", 30);
    	
    	 try {
    		 WebElement addChild = driver.findElement(By.xpath("//div[@class='numberingstab col-lg-1 bg-numbr1 p-3 text-center d-flex align-items-center']/h2[text()='1.1']"));
    		 if (addChild.isDisplayed()) {
				logger.info("Add child added succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Add child not added succesfully");
		}
    	 
     }
     public void clickOnDeleteButttonforIntegration()
     {		staticWait(2000);
    	 clickByJavascript(By.xpath("(//a[@data-original-title='Delete'])[3]"),"Delete Button", 30);
     }
     public void clickOnAddMoreIVRforIntegration()
     {		staticWait(2000);
    	 clickByJavascript(By.xpath("//div/span/a[@data-original-title='Add More']"),"Add More", 30);
    	
    	 try {
    		 WebElement addMore = driver.findElement(By.xpath("//div[@class='numberingstab col-lg-1 bg-numbr1 p-3 text-center d-flex align-items-center']/h2[text()='2']"));
    		 if (addMore.isDisplayed()) {
				logger.info("Add More added succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Add More  not added succesfully");
		}
    	 
     }
     
     public void clickOnConfirmationPopUpforIntegration()
     {		staticWait(2000);
     Alert alert = driver.switchTo().alert();
     alert.accept();
     }
     public void clickOnSaveforIntegration()
     {		staticWait(2000);
    	 clickByJavascript(By.xpath("//div/a[@data-original-title='Save']"),"Save Button", 30);
     }
     public void clickOnCancelforIntegration()
     {		staticWait(2000);
    	 clickByJavascript(By.xpath("//div/a[@data-original-title='Cancel']"),"Cancel Button", 30);
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
     /*------------------------------------------------------------------------------------------------------------------------------------------*/
     /*Code for click testing of Microsoft Project Plan */
     public void clickOnMicrosoftProjectPlanforIntegration()
     {		staticWait(2000);
    	 click(By.xpath("//div/ul/li/a[@data-original-title='Microsoft Project Plan']"),"Microsoft Project Plan", 30);
    	
    	 try {
    		 WebElement microsoftProjectPlan = driver.findElement(By.xpath("//div/span[contains(text(),'Upload Microsoft project plan file')]"));
    		 if (microsoftProjectPlan.isDisplayed()) {
				logger.info("Microsoft Project Plan Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Microsoft Project Plan Page not opened succesfully");
		}
    	 
     }
     public void clickOnImportforIntegration()
     {		staticWait(2000);
    	 click(By.xpath("//div/button[@id='import']"),"Import", 30);
    	
    	 try {
    		 WebElement importButton = driver.findElement(By.xpath("//div/span[contains(text(),'Field upload file is mandatory')]"));
    		 if (importButton.isDisplayed()) {
				logger.info("Notify message popup open succesfully");
				staticWait(2000);
				click(By.xpath("//button[@id='closenotifymessage']"),"Close Notify Message", 30);
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Notify message popup not open succesfully");
		}
    	 
     }
     /*------------------------------------------------------------------------------------------------------------------------------------------*/
     /*Code for click testing of QuickBooks */
     public void clickOnQuickBooksforIntegration()
     {		staticWait(2000);
    	 click(By.xpath("//div/ul/li/a[@data-original-title='QuickBooks']"),"QuickBooks", 30);
    	
    	 try {
    		 WebElement quickBooksLogin = driver.findElement(By.xpath("//fieldset/legend[contains(text(),'QuickBooks Login')]"));
    		 if (quickBooksLogin.isDisplayed()) {
				logger.info("QuickBooks Login Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("QuickBooks Login Page not opened succesfully");
		}
    	 driver.navigate().back();
     }
     /*------------------------------------------------------------------------------------------------------------------------------------------*/
     /*Code for click testing of SalesForce */
     public void clickOnSalesForceforIntegration()
     {		staticWait(2000);
    	 click(By.xpath("//div/ul/li/a[@data-original-title='Salesforce']"),"Salesforce", 30);
    	
    	 try {
    		 WebElement salesforce = driver.findElement(By.xpath("//div/span[contains(text(),'Group Event')]"));
    		 if (salesforce.isDisplayed()) {
				logger.info("Group Event Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Group Event Page not opened succesfully");
		}
    	 driver.navigate().refresh();
     }
     /*------------------------------------------------------------------------------------------------------------------------------------------*/
     /*Code for click testing of Trello */
     public void clickOnTrelloforIntegration()
     {		staticWait(2000);
    	 click(By.xpath("//div/ul/li/a[@data-original-title='Trello']"),"Trello", 30);
    	
    	 try {
    		 WebElement trelloAccount = driver.findElement(By.xpath("//div/span[contains(text(),'Trello Account')]"));
    		 if (trelloAccount.isDisplayed()) {
				logger.info("Trello Account Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Trello Account Page not opened succesfully");
		}
     }
     public void clickOnAuthenticateforIntegration()
     {		staticWait(2000);
    	 click(By.xpath("//div/button[contains(@id,'btnSave')]"),"Save Button", 30);
     }
     public void VerifyMandatoryFieldOfTrello() {
			int i = 0;
			String actualText;
			String expectedText;

			List<WebElement> errorMessageLocator = findMultipleElement(
					By.xpath("//span[contains(@class,'invalid-feedback')]"), 45);
			String[] expectedValue = { "Trello Key","Trello Token","Organization Name" };
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
				//driver.navigate().refresh();
			}
			driver.navigate().refresh();
		}
     /*------------------------------------------------------------------------------------------------------------------------------------------*/
     /*Code for click testing of Twilio */
     public void clickOnTwilioforIntegration()
     {		staticWait(2000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='Twilio'])[2]"),"Twilio", 30);
    	
    	 try {
    		 WebElement twilioList = driver.findElement(By.xpath("//div/span[contains(text(),'Twilio List')]"));
    		 if (twilioList.isDisplayed()) {
				logger.info("Twilio List Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Twilio List Page not opened succesfully");
		}
     }
     public void clickOnAddNewTwilioforIntegration()
     {		staticWait(2000);
    	 click(By.xpath("//div/span/a[@data-original-title='Add Twilio']"),"Add New", 30);
    	
    	 try {
    		 WebElement twilioAccount = driver.findElement(By.xpath("//div/span[contains(text(),'Twilio Account')]"));
    		 if (twilioAccount.isDisplayed()) {
				logger.info("Twilio Account Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Twilio Account Page not opened succesfully");
		}
     }
     public void VerifyMandatoryFieldOfTwilio() {
			int i = 0;
			String actualText;
			String expectedText;

			List<WebElement> errorMessageLocator = findMultipleElement(
					By.xpath("//span[contains(@class,'invalid-feedback')]"), 45);
			String[] expectedValue = { "Title","Account SID","Auth Token" };
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
     /*Code for click testing of Unified Setup */
     public void clickOnUnifiedSetupforIntegration()
     {		staticWait(2000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='Unified Setup'])[2]"),"Unified Setup", 30);
    	
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
     /*Code for click testing of Unified Setup */
     public void clickOnSetupforIntegration()
     {		staticWait(2000);
    	 click(By.xpath("(//a[text()='Setup'])[2]"),"Setup", 30);
    	
    	 try {
    		 WebElement unifiedSetup = driver.findElement(By.xpath("//div/h5[contains(text(),'Package Plan')]"));
    		 if (unifiedSetup.isDisplayed()) {
				logger.info("Package Plan Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Package Plan Page not opened succesfully");
		}
    	 click(By.xpath("//button[@data-original-title='Close']"),"Close Package Plan", 30);
    	 driver.navigate().refresh();
     }
     
     
     }
