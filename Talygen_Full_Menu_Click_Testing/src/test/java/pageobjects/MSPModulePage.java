package pageobjects;

import static reporting.ComplexReportFactory.getTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.LogStatus;

import utils.WebBasePage;

public class MSPModulePage extends WebBasePage{
WebDriver driver ;
	
	public MSPModulePage(WebDriver driver) {
		super(driver, "MSPModulePage");
		this.driver=driver;
		// TODO Auto-generated constructor stub
	}
	public void clickFullMenuDropDown() {
		staticWait(3000);
        click(By.xpath("//span[text()='Full Menu']"), "Full Menu", 30);
        
    }
	/*
	 * Code for click testing of Add Packages for MSPModule Page
	 */
     public void clickOnMSPModule()
     {		staticWait(2000);
    	 click(By.xpath("//ul/li[@data-name='MSP Module']/span"),"MSP Module", 30);
    	 
     }
     public void clickOnAddPackagesforMSPModule()
     {		staticWait(2000);
    	 click(By.xpath("//div/ul/li/a[@data-original-title='Add Packages']"),"Add Packages", 30);
    	
    	 try {
    		 WebElement packageDetail = driver.findElement(By.xpath("//div/span[contains(text(),'Package Detail')]"));
    		 if (packageDetail.isDisplayed()) {
				logger.info("Package Detail Page opened succesfully");
				click(By.xpath("//div/ul/li/a[text()=' My Products']"),"My Products", 30);
				staticWait(2000);
				click(By.xpath("//div/ul/li/a[text()=' TALYGEN Package']"),"TALYGEN Package", 30);
				
			}
    		 
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Package Detail Page not opened succesfully");
		}
     }
     public void clickOnBackToList()
     {		staticWait(2000);
     JavascriptExecutor js = ((JavascriptExecutor) driver);
     js.executeScript("window.scrollTo(0, -document.body.scrollHeight);");
    	 click(By.xpath("//div/span/a[text()='Back to list']"),"Back to list", 30);
    	 driver.navigate().refresh();
     }
     /*
 	 * Code for click testing of Add Subscription for MSPModule Page
 	 */
      
      public void clickOnAddSubscriptionforMSPModule()
      {		staticWait(2000);
     	 click(By.xpath("//div/ul/li/a[@data-original-title='Add Subscription']"),"Add Subscription", 30);
     	
     	 try {
     		 WebElement addSubscription = driver.findElement(By.xpath("//div/span[contains(text(),'Add Subscription')]"));
     		 if (addSubscription.isDisplayed()) {
 				logger.info("Add Subscription Page opened succesfully");
 				click(By.xpath("//div/ul/li/a[text()=' Packages']"),"Packages", 30);
 				staticWait(2000);
 				click(By.xpath("//div/ul/li/a[text()=' Company Profile']"),"Company Profile", 30);
 				
 			}
     		 
 		} catch (Exception e) {
 			// TODO: handle exception
 			logger.info("Add Subscription Page not opened succesfully");
 		}
      }
      public void clickOnNext()
      {		staticWait(2000);
     	 click(By.xpath("//div/a[@data-original-title='Next']"),"Next Button", 30);
      }
      
      public void VerifyMandatoryFieldValidation() {
			int i = 0;
			String actualText;
			String expectedText;

			List<WebElement> errorMessageLocator = findMultipleElement(
					By.xpath("//span[contains(@class,'invalid-feedback')]"), 45);
			String[] expectedValue = { "Company Name","Contact Person","Contact Nu","Email","Password","Company Address","Country","State","City","ZipCode","Company URL" };
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
     /*
   	 * Code for click testing of Manage Packages for MSPModule Page
   	 */
        
        public void clickOnManagePackagesforMSPModule()
        {		staticWait(2000);
       	 click(By.xpath("//div/ul/li/a[@data-original-title='Manage Packages']"),"Manage Packages", 30);
       	
       	 try {
       		 WebElement managePackages = driver.findElement(By.xpath("//div/span[contains(text(),'Manage Packages')]"));
       		 if (managePackages.isDisplayed()) {
   				logger.info("Manage Packages Page opened succesfully");

   			}
       		 
   		} catch (Exception e) {
   			// TODO: handle exception
   			logger.info("Manage Packages Page not opened succesfully");
   		}
        }
        public void clickOnAddPackages()
        {		staticWait(2000);
       	 click(By.xpath("//div/span/a[@data-original-title='Add Package']"),"Add Packages", 30);
       	
       	 try {
       		 WebElement packageDetail = driver.findElement(By.xpath("//div/span[contains(text(),'Package Detail')]"));
       		 if (packageDetail.isDisplayed()) {
   				logger.info("Package Detail Page opened succesfully");
   				click(By.xpath("//div/ul/li/a[text()=' My Products']"),"My Products", 30);
   				staticWait(2000);
   				click(By.xpath("//div/ul/li/a[text()=' TALYGEN Package']"),"TALYGEN Package", 30);
   				
   			}
       		 
   		} catch (Exception e) {
   			// TODO: handle exception
   			logger.info("Package Detail Page not opened succesfully");
   		}
        }
        
        /*
       	 * Code for click testing of Manage Subscription for MSPModule Page
       	 */
            
            public void clickOnManageSubscriptionforMSPModule()
            {
            	staticWait(3000);
           	 click(By.xpath("//div/ul/li/a[@data-original-title='Manage Subscription']"),"Manage Subscription", 30);
           	
           	 try {
           		 WebElement manageSubscription = driver.findElement(By.xpath("//div/span[contains(text(),'Manage Subscription')]"));
           		 if (manageSubscription.isDisplayed()) {
       				logger.info("Manage Subscription Page opened succesfully");

       			}
           		 
       		} catch (Exception e) {
       			// TODO: handle exception
       			logger.info("Manage Subscription Page not opened succesfully");
       		}
            }
            public void clickOnAddSubscription()
            {		staticWait(2000);
           	 click(By.xpath("//div/span/a[@data-original-title='Add Subscription']"),"Add Subscription", 30);
           	
           	 try {
           		 WebElement addSubscription = driver.findElement(By.xpath("//div/span[contains(text(),'Add Subscription')]"));
           		 if (addSubscription.isDisplayed()) {
       				logger.info("Add Subscription Page opened succesfully");
       			}
           		 
       		} catch (Exception e) {
       			// TODO: handle exception
       			logger.info("Add Subscription Page not opened succesfully");
       		}
           	driver.navigate().refresh();
            }
        
        
        
}
