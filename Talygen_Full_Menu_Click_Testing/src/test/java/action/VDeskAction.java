package action;

import org.openqa.selenium.WebDriver;

import pageobjects.CrmPage;
import pageobjects.VDeskPage;

public class VDeskAction {
	WebDriver driver ; 
	VDeskPage vDeskPage;
	
	public VDeskAction(WebDriver driver)
	{
		this.driver= driver;
		vDeskPage= new VDeskPage(driver);
	}
	
	public void GoToVDeskPage()
	{
		vDeskPage.clickFullMenuDropDown();	
		vDeskPage.clickOnVDeskPage();	
		
		
	}
	/*Method  for Application Settings Page */
	public void GoToApplicationSettingsPage()
	{
		
		vDeskPage.clickOnApplicationSettings();	
		vDeskPage.clickOnAddApplicationSettings();
	}
	/*Method  for Application Summary Page */
	public void GoToApplicationSummaryPage()
	{
		
		vDeskPage.clickOnApplicationSummary();	
	
	}
	/*Method  for Application Page */
	public void GoToApplicationPage()
	{
		
		vDeskPage.clickOnApplications();	
	
	}
	/*Method  for Client Log In Page */
	public void GoToClientLogInPage()
	{
		
		vDeskPage.clickOnClientLogIn();	
	
	}
	/*Method  for Database Page */
	public void GoToDatabasePage()
	{
		
		vDeskPage.clickOnDatabase();	
	
	}
	/*Method  for Desktop Clients Page */
	public void GoToDesktopClientsPage()
	{
		
		vDeskPage.clickOnDesktopClients();	
	
	}
	/*Method  for General Settings Page */
	public void GoToGeneralSettingsPage()
	{
		
		vDeskPage.clickOnGeneralSettings();	
	
	}
	/*Method  for Job Page */
	public void GoToJobPage()
	{
		
		vDeskPage.clickOnJob();	
	
	}
	/*Method  for Jobs Report Page */
	public void GoToJobsReportPage()
	{
		
		vDeskPage.clickOnJobsReport();	
	
	}
	/*Method  for Logs Page */
	public void GoToLogsPage()
	{
		
		vDeskPage.clickOnLogsReport();	
	
	}
	/*Method  for Policies Page */
	public void GoToPoliciesPage()
	{
		
		vDeskPage.clickOnPolicies();
		vDeskPage.clickOnAddPolicies();
	
	}
	/*Method  for Remote Desktop Page */
	public void GoToRemoteDesktopPage()
	{
		
		vDeskPage.clickOnRemoteDesktop();
	
	}
	/*Method  for Server Details Page */
	public void GoToServerDetailsPage()
	{
		
		vDeskPage.clickOnServerDetails();
	
	}
	/*Method  for Server Roles Page */
	public void GoToServerRolesPage()
	{
		
		vDeskPage.clickOnServerRoles();
		vDeskPage.clickOnAddServerRoles();
	
	}
	/*Method  for Server Groups Page */
	public void GoToServerGroupsPage()
	{
		
		vDeskPage.clickOnServerGroups();
		vDeskPage.clickOnAddServerGroups();
	
	}
}
