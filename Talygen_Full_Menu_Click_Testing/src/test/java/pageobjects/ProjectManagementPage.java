package pageobjects;

import static reporting.ComplexReportFactory.getTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.LogStatus;

import utils.WebBasePage;

public class ProjectManagementPage extends WebBasePage{
	WebDriver driver ;
	public ProjectManagementPage(WebDriver driver) {
		super(driver, "ProjectManagementPage");
		this.driver=driver;
		// TODO Auto-generated constructor stub
	}
	public void clickFullMenuDropDown() {
		staticWait(3000);
        click(By.xpath("//span[text()='Full Menu']"), "Full Menu", 30);
        
    }
	/*
	 * Code for click testing of Project Management
	 */
     public void clickOnProjectManagement()
     {		staticWait(2000);
    	 click(By.xpath("//ul/li[@data-name='Project Management']/span"),"Project Management", 30);
    	 
     }
     public void clickOnGlobalTask()
     {		staticWait(2000);
    	 click(By.xpath("//div/ul/li/a[@data-original-title='Global Task']"),"Global Task", 30);
    	
    	 try {
    		 WebElement manageGlobalTasks = driver.findElement(By.xpath("//div/span[text()='Manage Global Tasks']"));
    		 if (manageGlobalTasks.isDisplayed()) {
				logger.info("Manage Global Tasks Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Manage Global Tasks Page not opened succesfully");
		}
     }
     public void clickOnAddGlobalTask()
     {		staticWait(2000);
    	 click(By.xpath("//div/span/a[@data-original-title='Add Global Task']"),"Add Global Task", 30);
    	
    	 try {
    		 WebElement addGlobalTasks = driver.findElement(By.xpath("//div/span[contains(text(),'Add Global Task')]"));
    		 if (addGlobalTasks.isDisplayed()) {
				logger.info("Add Global Tasks Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Add Global Tasks Page not opened succesfully");
		}
     }
     public void clickOnSaveButton()
     {		staticWait(2000);
    	 click(By.xpath("//div/span/input[@id='btnSave']"),"Save Button", 30);
     }
     public void clickOnCancelButton()
     {		staticWait(3000);
    	 click(By.xpath("//div/a[@data-original-title='Cancel']"),"cancel Button", 30);
    	 driver.navigate().refresh();
     }
     public void clickOnBackToList()
     {		staticWait(2000);
    	 click(By.xpath("//div/span/a[@data-original-title='Back to list']"),"Back to list", 30);
    	 driver.navigate().refresh();
     }
     public void VerifyMandatoryFieldValidation() {
			int i = 0;
			String actualText;
			String expectedText;

			List<WebElement> errorMessageLocator = findMultipleElement(
					By.xpath("//span[contains(@class,'field-validation-valid invalid-feedback')]"), 45);
			String[] expectedValue = { "Task Name","Task Rate" };
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
/*Code for click testing of Project */
public void clickOnProject()
{		staticWait(2000);
	 click(By.xpath("(//div/ul/li/a[@data-original-title='Project'])[2]"),"Project", 30);
	 try {
		 WebElement manageProjectsPage = driver.findElement(By.xpath("//div/span[text()='Manage Projects']"));
		 if (manageProjectsPage.isDisplayed()) {
			logger.info("Manage Projects Page opened succesfully");
		}
	} catch (Exception e) {
		// TODO: handle exception
		logger.info("Manage Projects Page not opened succesfully");
	}
}
public void clickOnPageTour()
{		staticWait(2000);
	 click(By.xpath("//div/span/a[@data-original-title='Page Tour']"),"Page Tour", 30);
	 try {
		 WebElement pageTour = driver.findElement(By.xpath("//div[text()='Widgets ']"));
		 if (pageTour.isDisplayed()) {
			logger.info("Page Tour Page opened succesfully");
			 click(By.xpath("//*[name()='svg' and @class='guided-tour-icon']"),"Close Page Tour Guide PopUp", 30);
		}
	} catch (Exception e) {
		// TODO: handle exception
		logger.info("Page Tour Page not opened succesfully");
	}
}
public void clickOnCardView()
{		staticWait(2000);
	 click(By.xpath("//div/span/a[@data-original-title='Card View']"),"Card View", 30);
}
public void clickOnKanbanView()
{		staticWait(3000);
	 click(By.xpath("//div/span/a[@data-original-title='Kanban View']"),"Kanban View", 30);
}
public void clickOnListView()
{		staticWait(3000);
	 click(By.xpath("//div/span/a[@data-original-title='List View']"),"List View", 30);
}
public void clickOnImport()
{		staticWait(2000);
	 click(By.xpath("//div/span/a[@data-original-title='Import Projects ']"),"Import Projects", 30);
	 try {
		 WebElement importProjects = driver.findElement(By.xpath("//div/h5[text()='Import Projects ']"));
		 if (importProjects.isDisplayed()) {
			logger.info("Import Projectss Page opened succesfully");
			click(By.xpath("//button[@data-original-title='Close']"),"Close Import Projects Popup", 30);
		}
	} catch (Exception e) {
		// TODO: handle exception
		logger.info("Import Projects Page not opened succesfully");
	}
}
public void clickOnAddProject()
{		staticWait(2000);
	 click(By.xpath("//div/span/a[@data-original-title='Add Project']"),"Add Projects", 30);
	 try {
		 WebElement addProjects = driver.findElement(By.xpath("//div/h4[text()='Add Project']"));
		 if (addProjects.isDisplayed()) {
			logger.info("Add ProjectPage opened succesfully");
			staticWait(2000);
			click(By.xpath("//div[@class='modal-header mheader-user']/button[@class='close']"),"Close Add Projects", 30);
		}
	} catch (Exception e) {
		// TODO: handle exception
		logger.info("Add Project Page not opened succesfully");
	}
	 driver.navigate().refresh();
}
public void clickOnManageTemplate()
{		staticWait(2000);
	 click(By.xpath("//div/span/a[@data-original-title='Manage Template']"),"Manage Template", 30);
	 try {
		 staticWait(2000);
		 WebElement manageTemplate = driver.findElement(By.xpath("//div/h4[text()='Template List']"));
		 if (manageTemplate.isDisplayed()) {
			logger.info("Manage Template Page opened succesfully");
			staticWait(2000);
			 click(By.xpath("//div/a[@data-original-title='Cancel']"),"cancel Button", 30);
		}
	} catch (Exception e) {
		// TODO: handle exception
		logger.info("Manage Template Page not opened succesfully");
	}
}
public void clickOnCheckBox()
{		staticWait(3000);
	 click(By.xpath("//table/thead/tr/th/div[@class='custom-control custom-checkbox']"),"CheckBox", 30);
}
public void clickOnAssignTag()
{		staticWait(2000);
	 click(By.xpath("//div/span/a[@data-original-title='Assign Tag']"),"Assign Tag", 30);
	 try {
		 WebElement assignTag = driver.findElement(By.xpath("//div/h4[text()='Assign Tag']"));
		 if (assignTag.isDisplayed()) {
			logger.info("Assign Tag Page opened succesfully");
			staticWait(2000);
			click(By.xpath("//div/a[text()='Cancel']"),"Cancel Button", 30);
		}
	} catch (Exception e) {
		// TODO: handle exception
		logger.info("Assign Tag Page not opened succesfully");
	}
}
public void clickOnUpdateStatus()
{		staticWait(2000);
	 click(By.xpath("//div/span/a[@data-original-title='Update Status']"),"Update Status", 30);
	 try {
		 WebElement updateStatus = driver.findElement(By.xpath("//div/h4[text()='Update Status']"));
		 if (updateStatus.isDisplayed()) {
			logger.info("Update Status Page opened succesfully");
			staticWait(2000);
			click(By.xpath("//div/a[text()='Cancel']"),"Cancel Button", 30);
		}
	} catch (Exception e) {
		// TODO: handle exception
		logger.info("Update Status Page not opened succesfully");
	}
}
public void clickOnDelete()
{		staticWait(2000);
	 click(By.xpath("//div/span/a[@data-original-title='Delete']"),"Delete", 30);
	 try {
		 WebElement delete = driver.findElement(By.xpath("//div[contains(text(),'Project(s) with time tracking cannot be deleted')]"));
		 if (delete.isDisplayed()) {
			logger.info("Delete Popup opened succesfully");
			staticWait(2000);
			click(By.xpath("//div/button[text()=' Cancel']"),"Cancel Button", 30);
		}
	} catch (Exception e) {
		// TODO: handle exception
		logger.info("Delete popup not opened succesfully");
	}
}
/*------------------------------------------------------------------------------------------------------------------------------------------*/
/*Code for click testing of Project Report*/
public void clickOnProjectreport()
{		staticWait(2000);
	 click(By.xpath("(//div/ul/li/a[@data-original-title='Project Report'])[2]"),"Project Report", 30);
	 try {
		 WebElement manageProjectsPage = driver.findElement(By.xpath("//div/span[text()='Project Reports']"));
		 if (manageProjectsPage.isDisplayed()) {
			logger.info("Projects Report Page opened succesfully");
		}
	} catch (Exception e) {
		// TODO: handle exception
		logger.info("Projects REport Page not opened succesfully");
	}
	 driver.navigate().refresh();
}
/*------------------------------------------------------------------------------------------------------------------------------------------*/
/*Code for click testing of Project Request*/
public void clickOnProjectRequest()
{		staticWait(2000);
	 click(By.xpath("//div/ul/li/a[@data-original-title='Project Request']"),"Project Request", 30);
	 try {
		 WebElement projectRequestsPage = driver.findElement(By.xpath("//div/span[text()='Project Request']"));
		 if (projectRequestsPage.isDisplayed()) {
			logger.info("Project Request Page opened succesfully");
		}
	} catch (Exception e) {
		// TODO: handle exception
		logger.info("Project Request Page not opened succesfully");
	}
}
public void clickOnAddOwner()
{		staticWait(2000);
	 click(By.xpath("//div/span/a[@data-original-title='Add Project Request Owner']"),"Add Project Request Owner", 30);
	 try {
		 WebElement addProjectRequestOwnerPage = driver.findElement(By.xpath("//div/h5[text()='Add Project Request Owner']"));
		 if (addProjectRequestOwnerPage.isDisplayed()) {
			logger.info("Add Project Request Owner Page opened succesfully");
			staticWait(2000);
			//clickByJavascript(By.xpath("//div/button[text()=' Cancel']"),"Cancel Button", 30);
		}
	} catch (Exception e) {
		// TODO: handle exception
		logger.info("Add Project Request Owner Page not opened succesfully");
	}
}
public void clickOnExpandAll()
{		staticWait(2000);
	 click(By.xpath("//div/a[text()='Expand All or Collapse All']"),"Expand All or Collapse All", 30);
	 driver.navigate().refresh();
}
/*------------------------------------------------------------------------------------------------------------------------------------------*/
/*Code for click testing of Quotes*/
public void clickOnQuotes()
{		staticWait(2000);
	 click(By.xpath("//div/ul/li/a[@data-original-title='Quotes']"),"Quotes", 30);
	 try {
		 WebElement quotesPage = driver.findElement(By.xpath("//div/span[contains(text(),'Quotes')]"));
		 if (quotesPage.isDisplayed()) {
			logger.info("Quotes Page opened succesfully");
		}
	} catch (Exception e) {
		// TODO: handle exception
		logger.info("Quotes Page not opened succesfully");
	}
}
public void clickOnAddQuotes()
{		staticWait(2000);
	 click(By.xpath("//div/span/a[@data-original-title='Add a Quote']"),"Add Quotes", 30);
	 try {
		 WebElement addQuotesPage = driver.findElement(By.xpath("//div/h5[contains(text(),'Add a Quote')]"));
		 if (addQuotesPage.isDisplayed()) {
			logger.info("Add Quotes Page opened succesfully");
		}
	} catch (Exception e) {
		// TODO: handle exception
		logger.info("Add Quotes Page not opened succesfully");
	}
}
/*------------------------------------------------------------------------------------------------------------------------------------------*/
/*Code for click testing of Requested Time List*/
public void clickOnRequestedTimeList()
{		staticWait(2000);
	 click(By.xpath("//div/ul/li/a[@data-original-title='Requested Time List']"),"Requested Time List", 30);
	 try {
		 WebElement requestedTimeListPage = driver.findElement(By.xpath("//div/span[contains(text(),'Request Time')]"));
		 if (requestedTimeListPage.isDisplayed()) {
			logger.info("Requested Time List Page opened succesfully");
		}
	} catch (Exception e) {
		// TODO: handle exception
		logger.info("Requested Time List Page not opened succesfully");
	}
	 driver.navigate().refresh();
}
/*------------------------------------------------------------------------------------------------------------------------------------------*/
/*Code for click testing of Resource Impact*/
public void clickOnResourceImpact()
{		staticWait(2000);
	 click(By.xpath("//div/ul/li/a[@data-original-title='Resource Impact']"),"Resource Impact", 30);
	 try {
		 WebElement resourceImpactPage = driver.findElement(By.xpath("//div/span[contains(text(),'Resource Impact')]"));
		 if (resourceImpactPage.isDisplayed()) {
			logger.info("Resource Impact Page opened succesfully");
		}
	} catch (Exception e) {
		// TODO: handle exception
		logger.info("Resource Impact Page not opened succesfully");
	}
}
public void clickOnDay()
{		staticWait(2000);
	 click(By.xpath("//div/span/a[@data-original-title='Days']"),"Day", 30);
}
public void clickOnWeek()
{		staticWait(2000);
	 click(By.xpath("//div/span/a[contains(@data-original-title,'Week')]"),"Week", 30);
}
public void clickOnUserGuide()
{		staticWait(2000);
	 click(By.xpath("//div/span/a[@data-original-title='User Guide']"),"User Guide", 30);
	 try {
		 WebElement userGuidePage = driver.findElement(By.xpath("//div/h5[contains(text(),'User Guide')]"));
		 if (userGuidePage.isDisplayed()) {
			logger.info("User Guide Page opened succesfully");
			staticWait(2000);
			click(By.xpath("//div[@aria-describedby='RoadMapUserGuide']//div[@class='modal-content']//button[@data-original-title='Close']"),"Close User Guide", 30);
		}
	} catch (Exception e) {
		// TODO: handle exception
		logger.info("User Guide Page not opened succesfully");
	}
	 driver.navigate().refresh();
}
/*------------------------------------------------------------------------------------------------------------------------------------------*/
/*Code for click testing of Resource Scheduling */
public void clickOnResourceScheduling ()
{		staticWait(2000);
	 click(By.xpath("//div/ul/li/a[@data-original-title='Resource Scheduling ']"),"Resource Scheduling", 30);
	 try {
		 WebElement resourceSchedulingPage = driver.findElement(By.xpath("//div/h5[text()='Resource Filter']"));
		 if (resourceSchedulingPage.isDisplayed()) {
			logger.info("Resource Scheduling Page opened succesfully");
		}
	} catch (Exception e) {
		// TODO: handle exception
		logger.info("Resource Scheduling Page not opened succesfully");
	}
}
/*------------------------------------------------------------------------------------------------------------------------------------------*/
/*Code for click testing of Project Road Map*/
public void clickOnProjectRoadMap()
{		staticWait(2000);
	 click(By.xpath("//div/ul/li/a[@data-original-title='Project Road Map']"),"Project Road Map", 30);
	 try {
		 WebElement projectRoadMapPage = driver.findElement(By.xpath("//div/span[contains(text(),'Project Road Map')]"));
		 if (projectRoadMapPage.isDisplayed()) {
			logger.info("Project Road Map Page opened succesfully");
		}
	} catch (Exception e) {
		// TODO: handle exception
		logger.info("Project Road Map page not opened succesfully");
	}
}
public void clickOnTaskColorScheme()
{		staticWait(2000);
	 click(By.xpath("//div/a[@data-original-title='Task Color Scheme']"),"Task Color Scheme", 30);
	 try {
		 WebElement projectRoadMapPage = driver.findElement(By.xpath("//div[@class='Rm_drop d-block']"));
		 String attributevalue = projectRoadMapPage.getAttribute("class");
		 String expectedValue = "Rm_drop d-block";
		 if (attributevalue.equalsIgnoreCase(expectedValue)) {
			logger.info("Task Color Scheme Popup  opened succesfully");
		}
	} catch (Exception e) {
		// TODO: handle exception
		logger.info("Task Color Scheme Popup not opened succesfully");
	}
}
public void clickOnSetting()
{		staticWait(2000);
	 click(By.xpath("//span/a[@data-original-title='Settings']"),"Setting", 30);
	 try {
		 WebElement setting = driver.findElement(By.xpath("//div[@class='Rm_drop RdSetting d-block']"));
		 String attributevalue = setting.getAttribute("class");
		 String expectedValue = "Rm_drop RdSetting d-block";
		 if (attributevalue.equalsIgnoreCase(expectedValue)) {
			logger.info("Setting Popup  opened succesfully");
		}
	} catch (Exception e) {
		// TODO: handle exception
		logger.info("Setting Popup not opened succesfully");
	}
}
public void clickOnMonth()
{		staticWait(2000);
	 click(By.xpath("//div/span/a[contains(@data-original-title,'Month')]"),"Month", 30);
	 
	}
public void clickOnYear()
{		staticWait(2000);
	 click(By.xpath("//div/span/a[contains(@data-original-title,'Years')]"),"Year", 30);
	 
	}
/*------------------------------------------------------------------------------------------------------------------------------------------*/
/*Code for click testing of Task*/
public void clickOnTask()
{		staticWait(3000);
	 click(By.xpath("//div/ul/li/a[@data-original-title='Task']"),"Task", 30);
	 try {
		 WebElement taskPage = driver.findElement(By.xpath("//div/span[contains(text(),'Total Tasks')]"));
		 if (taskPage.isDisplayed()) {
			logger.info("Task Page opened succesfully");
		}
	} catch (Exception e) {
		// TODO: handle exception
		logger.info("Task page not opened succesfully");
	}
	 driver.navigate().refresh();
}
/*------------------------------------------------------------------------------------------------------------------------------------------*/
/*Code for click testing of To Do List*/
public void clickOnToDoList()
{		staticWait(3000);
	 click(By.xpath("//div/ul/li/a[@data-original-title='To Do List']"),"To Do List", 30);
	 try {
		 WebElement toDoListPage = driver.findElement(By.xpath("//div/span[contains(text(),'Work Load')]"));
		 if (toDoListPage.isDisplayed()) {
			logger.info("To Do List Page opened succesfully");
		}
	} catch (Exception e) {
		// TODO: handle exception
		logger.info("To Do List page not opened succesfully");
	}
}
public void clickOnPastActivities()
{		staticWait(3000);
	 click(By.xpath("//div/span/a[@data-original-title='Past Activities']"),"Past Activities", 30);
	 try {
		 WebElement pastActivitiesPage = driver.findElement(By.xpath("//div/span/a[@data-original-title='Billable']"));
		 if (pastActivitiesPage.isDisplayed()) {
			logger.info("Past Activities Page opened succesfully");
		}
	} catch (Exception e) {
		// TODO: handle exception
		logger.info("Past Activities page not opened succesfully");
	}
}
public void clickOnBillable()
{		staticWait(3000);
	 click(By.xpath("//div/span/a[@data-original-title='Billable']"),"Billable", 30);
	 try {
		 WebElement billablePopUp = driver.findElement(By.xpath("//div/span[text()='Select a record to perform this action.']"));
		 if (billablePopUp.isDisplayed()) {
			logger.info("Billable Clicked succesfully");
		}
	} catch (Exception e) {
		// TODO: handle exception
		logger.info("Billable not Clicked succesfully");
	}
}
public void clickOnCloseNotifyMessage()
{		staticWait(3000);
	 click(By.xpath("//button[@id='closenotifymessage']"),"Close Notify Message popup ", 30);
	 driver.navigate().refresh();
}
public void clickOnNonBillable()
{		staticWait(3000);
	 click(By.xpath("//div/span/a[@data-original-title='  Non-Billable']"),"Non Billable", 30);
	 try {
		 WebElement nonbillablePopUp = driver.findElement(By.xpath("//div/span[text()='Select a record to perform this action.']"));
		 if (nonbillablePopUp.isDisplayed()) {
			logger.info("Billable Clicked succesfully");
		}
	} catch (Exception e) {
		// TODO: handle exception
		logger.info("Billable not Clicked succesfully");
	}
}
public void clickOnDeleteEntry()
{		staticWait(3000);
	 clickByJavascript(By.xpath("//div/span/a[@data-original-title='Delete Entries']"),"Delete Entries", 30);
	 try {
		 WebElement deleteEntriesPopUp = driver.findElement(By.xpath("//div/span[text()='Please select one/multiple checkbox(s) to remove the record(s).']"));
		 if (deleteEntriesPopUp.isDisplayed()) {
			logger.info("Delete Entries Clicked succesfully");
		}
	} catch (Exception e) {
		// TODO: handle exception
		logger.info("Delete Entries not Clicked succesfully");
	}
	 
}
}

