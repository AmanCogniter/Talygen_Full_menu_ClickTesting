package pageobjects;

import static reporting.ComplexReportFactory.getTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.LogStatus;

import utils.WebBasePage;

public class DisplayScreenPage extends WebBasePage{
	WebDriver driver ;
	public DisplayScreenPage(WebDriver driver) {
		super(driver, "DisplayScreenPage");
		this.driver=driver;
		// TODO Auto-generated constructor stub
	}
	public void clickFullMenuDropDown() {
		staticWait(3000);
        click(By.xpath("//span[text()='Full Menu']"), "Full Menu", 30);
        
    }
	/*
	 * Code for click testing of Counter for DisplayScreen
	 */
     public void clickOnDisplayScreen()
     {		staticWait(2000);
    	 click(By.xpath("//ul/li[@data-name='Display Screen']/span"),"Display Screen", 30);
    	 
     }
     public void clickOnCounter()
     {		staticWait(2000);
    	 click(By.xpath("//div/ul/li/a[@data-original-title='Counter']"),"Counter", 30);
    	
    	 try {
    		 WebElement CounterPage = driver.findElement(By.xpath("//div/span/a[text()='Add Counter']"));
    		 if (CounterPage.isDisplayed()) {
				logger.info("Counter Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Counter Page not opened succesfully");
		}
     }
     public void clickOnAddCounter()
     {		staticWait(2000);
    	 click(By.xpath("//div/span/a[text()='Add Counter']"),"Add Counter", 30);
    	
    	 try {
    		 WebElement addCounterPage = driver.findElement(By.xpath("//div/span[text()=' Add Counter']"));
    		 if (addCounterPage.isDisplayed()) {
				logger.info(" Add Counter Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Add Counter Page not opened succesfully");
		}
     }
     public void clickOnSaveCounter()
     {		staticWait(2000);
    	 click(By.xpath("//div/a[@data-original-title='Save']"),"Save Button", 30);
     }
     public void clickOnCancelCounter()
     {		staticWait(2000);
    	 click(By.xpath("//div/a[@data-original-title='Cancel']"),"Cancel Button", 30);
    	 driver.navigate().refresh();
     }
     public void VerifyMandatoryFieldOfCounter() {
			int i = 0;
			String actualText;
			String expectedText;

			List<WebElement> errorMessageLocator = findMultipleElement(
					By.xpath("//span[contains(@class,'invalid-feedback')]"), 45);
			String[] expectedValue = { "Counter","Department"};
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
     /*
 	 * Code for click testing of Token for DisplayScreen
 	 */
     public void clickOnToken()
     {		staticWait(2000);
    	 click(By.xpath("//div/ul/li/a[@data-original-title='Token']"),"Token", 30);
    	
    	 try {
    		 WebElement tokenPage = driver.findElement(By.xpath("//div/span/a[text()='Add Token']"));
    		 if (tokenPage.isDisplayed()) {
				logger.info("Token Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Token Page not opened succesfully");
		}
     }
     public void clickOnAddToken()
     {		staticWait(2000);
    	 click(By.xpath("//div/span/a[text()='Add Token']"),"Add Token", 30);
    	
    	 try {
    		 WebElement addtokenPage = driver.findElement(By.xpath("//div/span[text()='Add Token']"));
    		 if (addtokenPage.isDisplayed()) {
				logger.info("Add Token Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Add Token Page not opened succesfully");
		}
     }
     public void VerifyMandatoryFieldOfToken() {
			int i = 0;
			String actualText;
			String expectedText;

			List<WebElement> errorMessageLocator = findMultipleElement(
					By.xpath("//span[contains(@class,'invalid-feedback')]"), 45);
			String[] expectedValue = { "Client Mobile Number","Counter","Officer","From Time","To Time"};
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
     public void clickOnConfiguration()
     {		staticWait(2000);
    	 click(By.xpath("//div/span/a[text()='Configuration']"),"Configuration", 30);
    	
    	 try {
    		 WebElement configurationPage = driver.findElement(By.xpath("//div/h5[text()='Add Token Number']"));
    		 if (configurationPage.isDisplayed()) {
				logger.info("Configuration Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Configuration Page not opened succesfully");
		}
     }
     public void clickOnSaveAddTokenNumber()
     {		staticWait(2000);
    	 click(By.xpath("(//div/a[@data-original-title='Save'])[2]"),"Save Button", 30);
     }
     public void clickOnCloseAddTokenNumber()
     {		staticWait(3000);
    	 click(By.xpath("//div/h5[text()='Add Token Number']/ancestor::div[@class='modal-content']/descendant::button[@data-original-title='Close']"),"Close Button", 30);
    	 driver.navigate().refresh();
     }
     public void VerifyMandatoryFieldOfConfiguration() {
			int i = 0;
			String actualText;
			String expectedText;

			List<WebElement> errorMessageLocator = findMultipleElement(
					By.xpath("(//span[contains(@class,'invalid-feedback')])[2]"), 45);
			String[] expectedValue = { "Token Number"};
			for (Object expected : expectedValue) {
				WebElement AsteriskField = findElementVisibility(By.xpath("(//label[contains(text(),'"+ expected +"')]/ancestor::div[@class='form-group']/descendant::span[@class='text-danger'])[2]"), 45);
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
