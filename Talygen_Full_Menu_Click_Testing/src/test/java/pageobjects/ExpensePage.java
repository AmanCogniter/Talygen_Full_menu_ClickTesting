package pageobjects;

import static reporting.ComplexReportFactory.getTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.LogStatus;

import utils.WebBasePage;

public class ExpensePage extends WebBasePage{
	WebDriver driver ;
	public ExpensePage(WebDriver driver) {
		super(driver, "ExpensePage");
		this.driver=driver;
		// TODO Auto-generated constructor stub
	}
	public void clickFullMenuDropDown() {
		staticWait(3000);
        click(By.xpath("//span[text()='Full Menu']"), "Full Menu", 30);
        
    }
	/*
	 * Code for click testing of Add Expense for Expense
	 */
     public void clickOnExpense()
     {		staticWait(2000);
    	 click(By.xpath("//ul/li[@data-name='Expense ']/span"),"Expense", 30);
    	 
     }
     public void clickOnAddExpense()
     {		staticWait(2000);
    	 click(By.xpath("//div/ul/li/a[@data-original-title='Add Expense']"),"Add Expense", 30);
    	
    	 try {
    		 WebElement addExpense = driver.findElement(By.xpath("//div/span[text()='Manage Expenses']"));
    		 if (addExpense.isDisplayed()) {
				logger.info("Manage Expense Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Manage Expense Page not opened succesfully");
		}
     }
     public void clickOnSaveAsDraft()
     {		staticWait(2000);
    	 click(By.xpath("//div/a[@data-original-title='Save As Draft']"),"Save AsDraft", 30);
     }
     public void clickOnCancel()
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
			String[] expectedValue = { "Title","Date ","Project","Category","Amount","Currency" };
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
     /*------------------------------------------------------------------------------------------------------------------------------------------*/
     /*Code for click testing of Bulk Upload Expense */
     public void clickOnBulkUploadExpense()
     {		staticWait(2000);
    	 click(By.xpath("//div/ul/li/a[@data-original-title='Bulk Upload Expense']"),"Bulk Upload Expense", 30);
    	
    	 try {
    		 WebElement bulkUploadExpense = driver.findElement(By.xpath("//div/span[text()='Bulk Upload']"));
    		 if (bulkUploadExpense.isDisplayed()) {
				logger.info("Bulk upload Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Bulk upload Page not opened succesfully");
		}
     }
     public void clickOnPageTourGuide()
     {		staticWait(2000);
    	 click(By.xpath("//div/span/a[@data-original-title='Page Tour']"),"Page Tour", 30);
    	
    	 try {
    		 WebElement pageTour = driver.findElement(By.xpath("//div[text()='Sample File ']"));
    		 if (pageTour.isDisplayed()) {
				logger.info("Page Tour Guide opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Page Tour Guide not opened succesfully");
		}
    	 click(By.xpath("//*[name()='svg' and @class='guided-tour-icon']"),"Close Page Tour", 30);
    	 driver.navigate().refresh();
     }
     /*------------------------------------------------------------------------------------------------------------------------------------------*/
     /*Code for click testing of Expense Approval */
     public void clickOnExpenseApproval()
     {		staticWait(2000);
    	 click(By.xpath("//div/ul/li/a[@data-original-title='Expense Approval']"),"Expense Approval", 30);
    	
    	 try {
    		 WebElement expenseApproval = driver.findElement(By.xpath("//div/span[contains(text(),'Expense Approval')]"));
    		 if (expenseApproval.isDisplayed()) {
				logger.info("Expense Approval Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Expense Approval Page not opened succesfully");
		}
     }
     public void clickOnPageTourGuideOfExpenseApproval()
     {		staticWait(2000);
    	 click(By.xpath("//div/span/a[@data-original-title='Page Tour']"),"Page Tour", 30);
    	
    	 try {
    		 WebElement pageTour = driver.findElement(By.xpath("//div[text()='Search Filters ']"));
    		 if (pageTour.isDisplayed()) {
				logger.info("Page Tour Guide opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Page Tour Guide not opened succesfully");
		}
    	 click(By.xpath("//*[name()='svg' and @class='guided-tour-icon']"),"Close Page Tour", 30);
     }
     public void clickOnViewHistory()
     {		staticWait(2000);
    	 click(By.xpath("//div/span/a[@data-original-title='View History']"),"View History", 30);
    	
    	 try {
    		 WebElement viewHistory = driver.findElement(By.xpath("//div/span[contains(text(),'Expense Approval')]"));
    		 if (viewHistory
    				 .isDisplayed()) {
				logger.info("Expense Approval History Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Expense Approval History Page not opened succesfully");
		}
    	 driver.navigate().refresh();
     }
     /*------------------------------------------------------------------------------------------------------------------------------------------*/
     /*Code for click testing of Expense Report */
     public void clickOnExpenseReport()
     {		staticWait(2000);
    	 click(By.xpath("//div/ul/li/a[@data-original-title='Expense Report']"),"Expense Report", 30);
    	
    	 try {
    		 WebElement expenseReport = driver.findElement(By.xpath("//div/span[contains(text(),'Expense Reports')]"));
    		 if (expenseReport.isDisplayed()) {
				logger.info("Expense Report Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Expense Report Page not opened succesfully");
		}
    	 driver.navigate().refresh();
     }
     /*------------------------------------------------------------------------------------------------------------------------------------------*/
     /*Code for click testing of Expense */
     public void clickOnExpenses()
     {		staticWait(2000);
    	 click(By.xpath("//div/ul/li/a[@data-original-title='Expenses']"),"Expenses", 30);
    	
    	 try {
    		 WebElement expenses = driver.findElement(By.xpath("//div/span[contains(text(),'Expense')]"));
    		 if (expenses.isDisplayed()) {
				logger.info("Expense Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Expense Page not opened succesfully");
		}
     }
     public void clickOnCardView()
     {		staticWait(2000);
    	 click(By.xpath("//div/span/a[@data-original-title='Card View']"),"Card View", 30);
     }
     public void clickOnListView()
     {		staticWait(2000);
    	 click(By.xpath("//div/span/a[@data-original-title='List View']"),"List View", 30);
     }
     public void clickOnKanbanView()
     {		staticWait(2000);
    	 click(By.xpath("//div/span/a[@data-original-title='Kanban View']"),"Kanban View", 30);
     }
     public void clickOnAddExpenses()
     {		staticWait(2000);
    	 click(By.xpath("//div/span/a[@data-original-title='Add Expense']"),"Add Expenses", 30);
    	
    	 try {
    		 WebElement addExpenses = driver.findElement(By.xpath("//div/span[contains(text(),'Manage Expenses')]"));
    		 if (addExpenses.isDisplayed()) {
				logger.info("Manage Expenses Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Manage Expenses Page not opened succesfully");
		}
     }
     /*------------------------------------------------------------------------------------------------------------------------------------------*/
     /*Code for click testing of Project */
     public void clickOnProject()
     {		staticWait(2000);
    	 click(By.xpath("//div/ul/li/a[@data-original-title='Project']"),"Project", 30);
    	
    	 try {
    		 WebElement project = driver.findElement(By.xpath("//div/span[contains(text(),'Manage Projects')]"));
    		 if (project.isDisplayed()) {
				logger.info("Manage Projects Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Manage Projects Page not opened succesfully");
		}
     }
     public void clickOnPageTourGuideOfProject()
     {		staticWait(2000);
    	 click(By.xpath("//div/span/a[@data-original-title='Page Tour']"),"Page Tour", 30);
    	
    	 try {
    		 WebElement pageTour = driver.findElement(By.xpath("//div[text()='Widgets ']"));
    		 if (pageTour.isDisplayed()) {
				logger.info("Page Tour Guide opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Page Tour Guide not opened succesfully");
		}
    	 click(By.xpath("//*[name()='svg' and @class='guided-tour-icon']"),"Close Page Tour", 30);
     }
     public void clickOnImport()
     {		staticWait(2000);
    	 click(By.xpath("//div/span/a[@data-original-title='Import Projects ']"),"Import Project", 30);
    	
    	 try {
    		 WebElement importproject = driver.findElement(By.xpath("//div/h5[contains(text(),'Import Projects ')]"));
    		 if (importproject.isDisplayed()) {
				logger.info("Manage Projects Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Manage Projects Page not opened succesfully");
		}
    	 click(By.xpath("//div/h5[contains(text(),'Import Projects ')]/ancestor::div[@class='modal-content']/descendant::button[@data-original-title='Close']"),"Close Import Product", 30);
     }
     public void clickOnAddProject()
     {		staticWait(2000);
    	 click(By.xpath("//div/span/a[@data-original-title='Add Project']"),"Add Project", 30);
    	
    	 try {
    		 WebElement addproject = driver.findElement(By.xpath("//div/h4[contains(text(),'Add Project')]"));
    		 if (addproject.isDisplayed()) {
				logger.info("Manage Projects Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Manage Projects Page not opened succesfully");
		}
    	 staticWait(2000);
    	 click(By.xpath("//div/h4[contains(text(),'Add Project')]/preceding-sibling::button[@type='button']"),"Close Add Project", 30);
     }
     public void clickOnManageTemplate()
     {		staticWait(2000);
    	 click(By.xpath("//div/span/a[@data-original-title='Manage Template']"),"Manage Template", 30);
    	
    	 try {
    		 WebElement manageTemplate = driver.findElement(By.xpath("//div/h4[contains(text(),'Template List')]"));
    		 if (manageTemplate.isDisplayed()) {
				logger.info("manageTemplate Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("manageTemplate Page not opened succesfully");
		}
    	 staticWait(2000);
    	 click(By.xpath("//div/h4[contains(text(),'Template List')]/ancestor::div[@class='modal-content']/descendant::button[@type='button']"),"Close Manage Template", 30);
    	 driver.navigate().refresh();
     }
     /*---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
     /*
 	 * Code for click testing of Dashboard
 	 */
     public void clickOnDashboard ()
     {		staticWait(3000);
    	 click(By.xpath("//span/a[text()='Dashboard']"),"Dashboard", 30);
    	
    	 try {
    		 WebElement dashboard = driver.findElement(By.xpath("//div/span[text()='Expense Dashboard']"));
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
