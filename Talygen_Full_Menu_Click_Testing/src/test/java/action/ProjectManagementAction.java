package action;

import org.openqa.selenium.WebDriver;

import pageobjects.AppoitmentCalendarPage;
import pageobjects.ProjectManagementPage;

public class ProjectManagementAction {
	WebDriver driver ; 
	ProjectManagementPage projectManagementPage;
	
	public ProjectManagementAction(WebDriver driver)
	{
		this.driver= driver;
		projectManagementPage= new ProjectManagementPage(driver);
	}
	
	public void GoToProjectManagementPage()
	{
		projectManagementPage.clickFullMenuDropDown();	
		projectManagementPage.clickOnProjectManagement();	
		
		
	}
	/*Method  for Global Task */
	public void GoToGlobalTaskPage()
	{
		
		projectManagementPage.clickOnGlobalTask();	
		projectManagementPage.clickOnAddGlobalTask();
		projectManagementPage.clickOnSaveButton();
		projectManagementPage.VerifyMandatoryFieldValidation();
		projectManagementPage.clickOnCancelButton();
		
		
	}
	/*Method  for Project */
	public void GoToProjectPage()
	{
		
		projectManagementPage.clickOnProject();	
		projectManagementPage.clickOnPageTour();
		projectManagementPage.clickOnCardView();
		projectManagementPage.clickOnKanbanView();
		projectManagementPage.clickOnListView();
		projectManagementPage.clickOnImport();
		projectManagementPage.clickOnManageTemplate();
		projectManagementPage.clickOnCheckBox();
		projectManagementPage.clickOnAssignTag();
		projectManagementPage.clickOnUpdateStatus();
		projectManagementPage.clickOnDelete();
		projectManagementPage.clickOnAddProject();
		
		
	}
	/*Method  for Project Report */
	public void GoToProjectReportPage()
	{
		
		projectManagementPage.clickOnProjectreport();	
		
	}
	/*Method  for Project Request */
	public void GoToProjectRequestPage()
	{
		
		projectManagementPage.clickOnProjectRequest();	
		projectManagementPage.clickOnAddOwner();
		projectManagementPage.clickOnCancelButton();
		projectManagementPage.clickOnExpandAll();
		
		
	}
	/*Method  for Quotes */
	public void GoToQuotesPage()
	{
		
		projectManagementPage.clickOnQuotes();	
		projectManagementPage.clickOnAddQuotes();
		projectManagementPage.clickOnCancelButton();
		projectManagementPage.clickOnExpandAll();
		}
	/*Method  for Requested Time List */
	public void GoToRequestedTimeListPage()
	{
		
		projectManagementPage.clickOnRequestedTimeList();	
		
	}
	/*Method  for Resource Impact */
	public void GoToResourceImpactPage()
	{
		
		projectManagementPage.clickOnResourceImpact();	
		projectManagementPage.clickOnDay();
		projectManagementPage.clickOnWeek();
		projectManagementPage.clickOnUserGuide();
		}
	/*Method  for Resource Scheduling */
	public void GoToResourceSchedulingPage()
	{
		
		projectManagementPage.clickOnResourceScheduling();	
		projectManagementPage.clickOnCancelButton();
	}
	/*Method  for Project Road Map */
	public void GoToProjectRoadMapPage()
	{
		
		projectManagementPage.clickOnProjectRoadMap();	
		projectManagementPage.clickOnTaskColorScheme();
		projectManagementPage.clickOnSetting();
		projectManagementPage.clickOnDay();
		projectManagementPage.clickOnWeek();
		projectManagementPage.clickOnMonth();
		projectManagementPage.clickOnYear();
		projectManagementPage.clickOnUserGuide();
		}
	/*Method  for Task */
	public void GoToTaskPage()
	{
		
		projectManagementPage.clickOnTask();	
		
	}
	/*Method  for To Do List */
	public void GoToToDoListPage()
	{
		
		projectManagementPage.clickOnToDoList();	
		projectManagementPage.clickOnCardView();
		projectManagementPage.clickOnKanbanView();
		projectManagementPage.clickOnListView();
		projectManagementPage.clickOnPastActivities();
		projectManagementPage.clickOnBillable();
		projectManagementPage.clickOnCloseNotifyMessage();
		projectManagementPage.clickOnNonBillable();
		projectManagementPage.clickOnCloseNotifyMessage();
		projectManagementPage.clickOnDeleteEntry();
		projectManagementPage.clickOnCloseNotifyMessage();
		projectManagementPage.clickOnBackToList();
		}
}
