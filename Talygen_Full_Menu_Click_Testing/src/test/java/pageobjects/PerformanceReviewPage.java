package pageobjects;

import static reporting.ComplexReportFactory.getTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.LogStatus;

import utils.WebBasePage;

public class PerformanceReviewPage extends WebBasePage{
    WebDriver driver ;
	
	public PerformanceReviewPage(WebDriver driver) {
		super(driver, "PerformanceReviewPage");
		this.driver=driver;
		// TODO Auto-generated constructor stub
	}
	public void clickFullMenuDropDown() {
		staticWait(3000);
        click(By.xpath("//span[text()='Full Menu']"), "Full Menu", 30);
        
    }
	/*
	 * Code for click testing of Performance Review SubModule for Performance Review Module
	 */
     public void clickOnPerformanceReview()
     {		staticWait(2000);
    	 click(By.xpath("//div/ul/li[@data-name='Performance Review']/span"),"Performance Review", 30);
    	 
     }
     public void clickOnPerformanceReviewSubModule()
     {		staticWait(2000);
     click(By.xpath("//div/ul/li/a[@data-original-title='Performance Review']"),"Performance Review sub Module", 30);
    	
    	 try {
    		 WebElement performanceReview = driver.findElement(By.xpath("//div/span[text()='Performance Review']"));
    		 if (performanceReview.isDisplayed()) {
				logger.info("Performance Review Page opened succesfully");
			}
    	 }
		 catch (Exception e) {
			// TODO: handle exception
			logger.info("Performance Review Page not opened succesfully");
		}
    	 driver.navigate().refresh(); 
     }
     /*
 	 * Code for click testing of Performance Review Report for Performance Review 
 	 */
      
      public void clickOnPerformanceReviewReport()
      {		staticWait(2000);
      click(By.xpath("//div/ul/li/a[@data-original-title='Performance Review Report']"),"Performance Review Report", 30);
     	
     	 try {
     		 WebElement performanceReviewReport = driver.findElement(By.xpath("//div/span[text()='Skill Report']"));
     		 if (performanceReviewReport.isDisplayed()) {
 				logger.info("Performance Review Report Page opened succesfully");
 				clickByJavascript(By.xpath("//div/a[@id='aSearch']"),"Search Button", 30);
 				clickByJavascript(By.xpath("//div/a[@id='Clear']"),"Clear Button", 30);
 			}
     	 }
 		 catch (Exception e) {
 			// TODO: handle exception
 			logger.info("Performance Review Report Page not opened succesfully");
 		}
     	driver.navigate().refresh(); 
      }
      /*
   	 * Code for click testing of Provide Feedback for Performance Review 
   	 */
        
        public void clickOnProvideFeedback()
        {		staticWait(2000);
        click(By.xpath("//div/ul/li/a[@data-original-title='Provide Feedback']"),"Provide Feedback", 30);
       	
       	 try {
       		 WebElement provideFeedback = driver.findElement(By.xpath("//div/span[text()='Feedback Listing']"));
       		 if (provideFeedback.isDisplayed()) {
   				logger.info("Feedback Listing Page opened succesfully");
   			}
       	 }
   		 catch (Exception e) {
   			// TODO: handle exception
   			logger.info("Feedback Listing Page not opened succesfully");
   		}
       	driver.navigate().refresh();
        }
        /*
       	 * Code for click testing of Provide Review for Performance Review 
       	 */
            
            public void clickOnProvideReview()
            {		staticWait(2000);
            click(By.xpath("//div/ul/li/a[@data-original-title='Provide Review']"),"Provide Review", 30);
           	
           	 try {
           		 WebElement provideReview = driver.findElement(By.xpath("//div/input[@id='search']"));
           		 if (provideReview.isDisplayed()) {
       				logger.info("Provide Review Page opened succesfully");
       			}
           	 }
       		 catch (Exception e) {
       			// TODO: handle exception
       			logger.info("Provide Review Page not opened succesfully");
       		}
           	driver.navigate().refresh();
            }
            /*
           	 * Code for click testing of Review for Performance Review 
           	 */
                
                public void clickOnReview()
                {		staticWait(2000);
                click(By.xpath("//div/ul/li/a[@data-original-title='Review']"),"Review", 30);
               	
               	 try {
               		 WebElement review = driver.findElement(By.xpath("//div/span[text()='Review']"));
               		 if (review.isDisplayed()) {
           				logger.info("Review Page opened succesfully");
           			}
               	 }
           		 catch (Exception e) {
           			// TODO: handle exception
           			logger.info("Review Page not opened succesfully");
           		}
               	 
                }
                public void clickOnAddReview()
                {		staticWait(2000);
                click(By.xpath("//div/span/a[@data-original-title='Add Review']"),"Add Review", 30);
               	
               	 try {
               		 WebElement addReview = driver.findElement(By.xpath("//div/h5[text()='Manage Review']"));
               		 if (addReview.isDisplayed()) {
           				logger.info("Manage Review Page opened succesfully");
           			}
               	 }
           		 catch (Exception e) {
           			// TODO: handle exception
           			logger.info("Manage Review Page not opened succesfully");
           		}
               	 
                }
                public void clickOnSave()
                {		staticWait(2000);
                clickByJavascript(By.xpath("//div/a[@data-original-title='Save']"),"Save Button", 30);
                //staticWait(2000);
                click(By.xpath("//button[@title='OK']"),"OK Button", 30);
                }
                public void clickOnCancel()
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
        			String[] expectedValue = { "Title","Start Date","End Date","Status","Review Template" };
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
}
