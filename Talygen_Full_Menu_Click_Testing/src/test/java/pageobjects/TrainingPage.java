package pageobjects;

import static reporting.ComplexReportFactory.getTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.LogStatus;

import utils.WebBasePage;

public class TrainingPage extends WebBasePage{
	WebDriver driver ;
	public TrainingPage(WebDriver driver) {
		super(driver, "TrainingPage");
		this.driver=driver;
		// TODO Auto-generated constructor stub
	}
	public void clickFullMenuDropDown() {
		staticWait(3000);
        click(By.xpath("//span[text()='Full Menu']"), "Full Menu", 30);
        
    }
	/*
	 * Code for click testing of Training submodule for Training
	 */
     public void clickOnTraining()
     {		staticWait(2000);
    	 click(By.xpath("//ul/li[@data-name='Training']/span"),"Training", 30);
    	 
     }
     public void clickOnTrainingSubModule()
     {		staticWait(2000);
    	 click(By.xpath("//div/ul/li/a[@data-original-title='Training']"),"Training SubModule", 30);
    	
    	 try {
    		 WebElement trainingPage = driver.findElement(By.xpath("//div/span[contains(text(),'Training')]"));
    		 if (trainingPage.isDisplayed()) {
				logger.info("Training Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Training Page not opened succesfully");
		}
     }
     public void clickOnPageTour()
     {		staticWait(2000);
    	 click(By.xpath("//div/span/a[@data-original-title='Page Tour']"),"Page Tour", 30);
    	
    	 try {
    		 staticWait(2000);
    		 WebElement tourGuidePopup = driver.findElement(By.xpath("//div[contains(text(),'Search Filters ')]"));
    		 if (tourGuidePopup.isDisplayed()) {
				logger.info("Tour guide opened succesfully");
				click(By.xpath("//*[name()='svg' and @class='guided-tour-icon']"),"Close Tour guide", 30);
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Tour guide not opened succesfully");
		}
     }
     public void clickOnAddTraining()
     {		staticWait(2000);
    	 click(By.xpath("//div/span/a[@data-original-title='Add Training']"),"Add Training", 30);
    	
    	 try {
    		 WebElement addtrainingPage = driver.findElement(By.xpath("//div/span[text()='Manage Training']"));
    		 if (addtrainingPage.isDisplayed()) {
				logger.info("Manage Training Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Manage Training Page not opened succesfully");
		}
     }
     public void clickOnSave()
     {		staticWait(2000);
    	 click(By.xpath("//div/button[@id='btnSave']"),"Save Button", 30);
     }
     public void clickOnCancel()
     {		staticWait(2000);
    	 click(By.xpath("//div/a[@id='aCancel']"),"Cancel Button", 30);
     }
     public void VerifyMandatoryFieldValidation() {
			int i = 0;
			String actualText;
			String expectedText;

			List<WebElement> errorMessageLocator = findMultipleElement(
					By.xpath("//span[contains(@class,'invalid-feedback')]"), 45);
			String[] expectedValue = { "Title","Start Date","Start Time","Duration Hours","Training Type","Venue","Skill","Trainer","Feedback Days","Attendees","Description" };
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
     public void clickOnBackToList()
     {		staticWait(2000);
    	 click(By.xpath("//span/a[text()='Back to list']"),"Back to list", 30);
     }
     public void clickOnCheckBox()
     {		staticWait(2000);
    	 click(By.xpath("//table/thead/tr/th/div[@class='custom-control custom-checkbox']"),"Check Box", 30);
     }
     public void clickOnDelete()
     {		staticWait(2000);
    	 click(By.xpath("//div/span/a[@id='DeleteMultiple']"),"Delete Button", 30);
    	
    	 try {
    		 staticWait(2000);
    		 WebElement notifyMessagePopUp = driver.findElement(By.xpath("//div[contains(text(),'Are you sure you want to delete these record')]"));
    		 if (notifyMessagePopUp.isDisplayed()) {
				logger.info("Delete Notify Message PopUp opened succesfully");
				 click(By.xpath("//div/button[contains(text(),'Cancel')]"),"Cancel Button", 30);
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Delete Notify Message PopUp not opened succesfully");
		}
    	 driver.navigate().refresh();
     }
     /*------------------------------------------------------------------------------------------------------------------------------------------*/
     /*Code for click testing of Training Report */
     public void clickOnTrainingReport()
     {		staticWait(2000);
    	 click(By.xpath("//ul/li/a[@data-original-title='Training Report']"),"Training Report", 30);
    	 try {
    		 WebElement trainingReportPage = driver.findElement(By.xpath("//span[contains(text(),'User Training Report')]"));
    		 if (trainingReportPage.isDisplayed()) {
				logger.info("Training Report Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Training Report Page not opened succesfully");
		}
    	 driver.navigate().refresh();
     }
}
