package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utils.WebBasePage;

public class VDeskPage extends WebBasePage{
	WebDriver driver ;
	public VDeskPage(WebDriver driver) {
		super(driver, "VDeskPage");
		this.driver=driver;
		// TODO Auto-generated constructor stub
	}
	public void clickFullMenuDropDown() {
		staticWait(3000);
        click(By.xpath("//span[text()='Full Menu']"), "Full Menu", 30);
        
    }
	/*
	 * Code for click testing of Application Settings for VDesk
	 */
     public void clickOnVDeskPage()
     {		staticWait(2000);
    	 click(By.xpath("//ul/li[@data-name='vDesk']/span"),"VDesk", 30);
    	 
     }
     public void clickOnApplicationSettings()
     {		staticWait(2000);
    	 click(By.xpath("//div/ul/li/a[@data-original-title='Application Settings']"),"Application Settings", 30);
    	
    	 try {
    		 WebElement applicationSettingsPage = driver.findElement(By.xpath("//div/span[text()='Application Settings']"));
    		 if (applicationSettingsPage.isDisplayed()) {
				logger.info("Application Settings Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Application Settings Page not opened succesfully");
		}
     }
     public void clickOnAddApplicationSettings()
     {		staticWait(2000);
    	 click(By.xpath("//div/span/a[@data-original-title='Add Application Settings']"),"Add Application Settings", 30);
    	
    	 try {
    		 WebElement addapplicationSettingsPage = driver.findElement(By.xpath("//div/span[text()='Default Connection Settings']"));
    		 if (addapplicationSettingsPage.isDisplayed()) {
				logger.info("Default Connection Settings Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Default Connection Settings Page not opened succesfully");
		}
    	 driver.navigate().refresh();
     }
     /*--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
     /*
  	 * Code for click testing of Application Summary for VDesk
  	 */
     public void clickOnApplicationSummary()
     {		staticWait(2000);
    	 click(By.xpath("//div/ul/li/a[@data-original-title='Application Summary']"),"Application Summary", 30);
    	
    	 try {
    		 WebElement applicationSummaryPage = driver.findElement(By.xpath("//div/span[text()='Application Total Time Report']"));
    		 if (applicationSummaryPage.isDisplayed()) {
				logger.info("Application Total Time Report Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Application Total Time Report Page not opened succesfully");
		}
    	 driver.navigate().refresh();
     }
     /*--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
     /*
  	 * Code for click testing of Applications for VDesk
  	 */
     public void clickOnApplications()
     {		staticWait(2000);
    	 click(By.xpath("//div/ul/li/a[@data-original-title='Applications']"),"Applications", 30);
    	
    	 try {
    		 WebElement manageApplicationsPage = driver.findElement(By.xpath("//div/span[text()='Manage Applications']"));
    		 if (manageApplicationsPage.isDisplayed()) {
				logger.info("Manage Applications Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Manage Applications Page not opened succesfully");
		}
    	 driver.navigate().refresh();
     }
     /*--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
     /*
  	 * Code for click testing of Client Log In for VDesk
  	 */
     public void clickOnClientLogIn()
     {		staticWait(2000);
    	 click(By.xpath("//div/ul/li/a[@data-original-title='Client Log In']"),"Client Log In", 30);
    	
    	 try {
    		 WebElement clientLoginPage = driver.findElement(By.xpath("//div/span[text()='Client Login ']"));
    		 if (clientLoginPage.isDisplayed()) {
				logger.info("Client Login Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Client Login Page not opened succesfully");
		}
    	 driver.navigate().refresh();
     }
     /*--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
     /*
  	 * Code for click testing of Database for VDesk
  	 */
     public void clickOnDatabase()
     {		staticWait(2000);
    	 click(By.xpath("//div/ul/li/a[@data-original-title='Database']"),"Database", 30);
    	
    	 try {
    		 WebElement databasePage = driver.findElement(By.xpath("//div/span[text()='Database ']"));
    		 if (databasePage.isDisplayed()) {
				logger.info("Database Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Database Page not opened succesfully");
		}
    	 driver.navigate().refresh();
     }
     /*--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
     /*
  	 * Code for click testing of Desktop Clients for VDesk
  	 */
     public void clickOnDesktopClients()
     {		staticWait(2000);
    	 click(By.xpath("//div/ul/li/a[@data-original-title='Desktop Clients']"),"Desktop Clients", 30);
    	
    	 try {
    		 WebElement desktopClientsPage = driver.findElement(By.xpath("//div/span[text()='Desktop Clients']"));
    		 if (desktopClientsPage.isDisplayed()) {
				logger.info("Desktop Clients Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Desktop Clients Page not opened succesfully");
		}
    	 driver.navigate().refresh();
     }
     /*--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
     /*
  	 * Code for click testing of General Settings for VDesk
  	 */
     public void clickOnGeneralSettings()
     {		staticWait(2000);
    	 click(By.xpath("//div/ul/li/a[@data-original-title='General Settings']"),"General Settings", 30);
    	
    	 try {
    		 WebElement generalSettingsPage = driver.findElement(By.xpath("//div/span[text()='General Settings']"));
    		 if (generalSettingsPage.isDisplayed()) {
				logger.info("General Settings Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("General Settings Page not opened succesfully");
		}
    	 driver.navigate().refresh();
     }
     /*--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
     /*
  	 * Code for click testing of Job for VDesk
  	 */
     public void clickOnJob()
     {		staticWait(2000);
    	 click(By.xpath("//div/ul/li/a[@data-original-title='Jobs']"),"Job", 30);
    	
    	 try {
    		 WebElement jobPage = driver.findElement(By.xpath("//div/span[text()='Jobs']"));
    		 if (jobPage.isDisplayed()) {
				logger.info("Job Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Job Page not opened succesfully");
		}
    	 driver.navigate().refresh();
     }
     /*--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
     /*
  	 * Code for click testing of Jobs Report for VDesk
  	 */
     public void clickOnJobsReport()
     {		staticWait(2000);
    	 click(By.xpath("//div/ul/li/a[@data-original-title='Jobs Report']"),"Jobs Report", 30);
    	
    	 try {
    		 WebElement jobsReportPage = driver.findElement(By.xpath("//div/span[text()='Jobs Report']"));
    		 if (jobsReportPage.isDisplayed()) {
				logger.info("Jobs Report Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Jobs Report Page not opened succesfully");
		}
    	 driver.navigate().refresh();
     }
     /*--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
     /*
  	 * Code for click testing of Logs for VDesk
  	 */
     public void clickOnLogsReport()
     {		staticWait(2000);
    	 click(By.xpath("//div/ul/li/a[@data-original-title='Logs']"),"Logs", 30);
    	
    	 try {
    		 WebElement LogsPage = driver.findElement(By.xpath("//div/span[text()='Logs Listing']"));
    		 if (LogsPage.isDisplayed()) {
				logger.info("Logs Listing Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Logs Listing Page not opened succesfully");
		}
    	 driver.navigate().refresh();
     }
     /*--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
     /*
  	 * Code for click testing of Policies for VDesk
  	 */
     public void clickOnPolicies()
     {		staticWait(2000);
    	 click(By.xpath("//div/ul/li/a[@data-original-title='Policies']"),"Policies", 30);
    	 //click(By.xpath("//button[@id='closenotifymessage']"),"close notify message", 30);
    	
    	 try {
    		 WebElement policiesPage = driver.findElement(By.xpath("//div/span[text()='Policies']"));
    		 if (policiesPage.isDisplayed()) {
				logger.info("Policies Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Policies Page not opened succesfully");
		}
     }

public void clickOnAddPolicies()
{		staticWait(2000);
	 click(By.xpath("//div/span/a[@data-original-title='Add policy']"),"Add Policies", 30);
	 
	
	 try {
		 staticWait(2000);
		 WebElement addpoliciesPage = driver.findElement(By.xpath("//div/h4[text()='Add  Policies']"));
		 if (addpoliciesPage.isDisplayed()) {
			logger.info("Add Policies Page opened succesfully");
			 click(By.xpath("//div/a[@title='Close']"),"Close Add Policies", 30);
		}
	} catch (Exception e) {
		// TODO: handle exception
		logger.info("Add Policies Page not opened succesfully");
	}
	 driver.navigate().refresh();
}
/*--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
/*
	 * Code for click testing of Remote Desktop for VDesk
	 */
public void clickOnRemoteDesktop()
{		staticWait(2000);
	 click(By.xpath("//div/ul/li/a[@data-original-title='Remote Desktop']"),"Remote Desktop", 30);
	 //click(By.xpath("//button[@id='closenotifymessage']"),"close notify message", 30);
	 try {
		 WebElement remoteDesktopPage = driver.findElement(By.xpath("//div/span[text()='Remote Desktop']"));
		 if (remoteDesktopPage.isDisplayed()) {
			logger.info("Remote Desktop Page opened succesfully");
		}
	} catch (Exception e) {
		// TODO: handle exception
		logger.info("Remote Desktop Page not opened succesfully");
	}
	 driver.navigate().refresh();
}
/*--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
/*
	 * Code for click testing of Server Details for VDesk
	 */
public void clickOnServerDetails()
{		staticWait(2000);
	 click(By.xpath("//div/ul/li/a[@data-original-title='Server Details']"),"Server Details", 30);
	 try {
		 WebElement serverDetailsPage = driver.findElement(By.xpath("//div/span[text()='Servers']"));
		 if (serverDetailsPage.isDisplayed()) {
			logger.info("Server Details Page opened succesfully");
		}
	} catch (Exception e) {
		// TODO: handle exception
		logger.info("Server Details Page not opened succesfully");
	}
	 driver.navigate().refresh();
}
/*--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
/*
	 * Code for click testing of Server Roles for VDesk
	 */
public void clickOnServerRoles()
{		staticWait(2000);
	 click(By.xpath("//div/ul/li/a[@data-original-title='Server Roles']"),"Server Roles", 30);
	 //click(By.xpath("//button[@id='closenotifymessage']"),"close notify message", 30);
	 try {
		 WebElement serverRolesPage = driver.findElement(By.xpath("//div/span[text()='Servers']"));
		 if (serverRolesPage.isDisplayed()) {
			logger.info("Server Roles Page opened succesfully");
		}
	} catch (Exception e) {
		// TODO: handle exception
		logger.info("Server Roles Page not opened succesfully");
	}
}
public void clickOnAddServerRoles()
{		staticWait(2000);
	 click(By.xpath("//div/span/a[@data-original-title='Add']"),"Add Server Roles", 30);
	 
	
	 try {
		 staticWait(2000);
		 WebElement addServerRolesPage = driver.findElement(By.xpath("//div/h5[text()=' Add New Server']"));
		 if (addServerRolesPage.isDisplayed()) {
			logger.info("Add Server Roles Page opened succesfully");
			 click(By.xpath("//div/a[@title='Cancel']"),"Close Add Policies", 30);
		}
	} catch (Exception e) {
		// TODO: handle exception
		logger.info("Add Server Roles Page not opened succesfully");
	}
	 driver.navigate().refresh();
}
/*--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
/*
	 * Code for click testing of Server Groups for VDesk
	 */
public void clickOnServerGroups()
{		staticWait(2000);
	 click(By.xpath("//div/ul/li/a[@data-original-title='Server Groups']"),"Server Groups", 30);
	 //click(By.xpath("//button[@id='closenotifymessage']"),"close notify message", 30);
	 try {
		 WebElement serverGroupsPage = driver.findElement(By.xpath("//div/span[text()='Server Groups']"));
		 if (serverGroupsPage.isDisplayed()) {
			logger.info("Server Groups Page opened succesfully");
		}
	} catch (Exception e) {
		// TODO: handle exception
		logger.info("Server Groups Page not opened succesfully");
	}
}
public void clickOnAddServerGroups()
{		staticWait(2000);
	 click(By.xpath("//div/span/a[@data-original-title='Add']"),"Add Server Groups", 30);
	 
	
	 try {
		 staticWait(2000);
		 WebElement addServerGroupsPage = driver.findElement(By.xpath("//div/h5[contains(text(),'Server Groups')]"));
		 if (addServerGroupsPage.isDisplayed()) {
			logger.info("Add Server Groups Page opened succesfully");
			 click(By.xpath("//div/a[@title='Close']"),"Close Add Policies", 30);
		}
	} catch (Exception e) {
		// TODO: handle exception
		logger.info("Add Server Groups Page not opened succesfully");
	}
	 driver.navigate().refresh();
}
}
