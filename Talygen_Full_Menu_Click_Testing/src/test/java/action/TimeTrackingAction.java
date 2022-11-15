package action;

import org.openqa.selenium.WebDriver;

import pageobjects.AppoitmentCalendarPage;
import pageobjects.TimeTrackingPage;

public class TimeTrackingAction {
	WebDriver driver ; 
	TimeTrackingPage timeTrackingPage;
	
	public TimeTrackingAction(WebDriver driver)
	{
		this.driver= driver;
		timeTrackingPage= new TimeTrackingPage(driver);
	}
	
	public void GoToTimeTrackingPage()
	{
		timeTrackingPage.clickFullMenuDropDown();	
		timeTrackingPage.clickOnTimeTracking();	
		
		
	}
	/*Meatod  for Audit Rule for Time Tracking*/
	public void GoToAuditRulePage()
	{
		
		timeTrackingPage.clickOnAuditRule();	
		timeTrackingPage.clickOnAddAuditRule();
		timeTrackingPage.clickOnSaveButton();
		timeTrackingPage.VerifyMandatoryFieldValidation();
		timeTrackingPage.clickOnCancelButton();
		timeTrackingPage.clickOnCheckBox();
		timeTrackingPage.clickOnRemove();
	
	}

/*Meatod  for Bulk Time Entry for Time Tracking*/
public void GoToBulkTimeEntryPage()
{
	
	timeTrackingPage.clickOnBulkTimeEntry();	
	timeTrackingPage.clickOnFillTimeEntry();
	timeTrackingPage.clickOnCloseNotifyMessagePopup();
}
/*Meatod  for Flag Track Entry for Time Tracking*/
public void GoToFlagTrackEntryPage()
{
	
	timeTrackingPage.clickOnFlagTrackEntry();
}
/*Meatod  for Project Report for Time Tracking*/
public void GoToProjectReportPage()
{
	
	timeTrackingPage.clickOnProjectReport();
}
/*Meatod  for Time Report for Time Tracking*/
public void GoToTimeReportPage()
{
	
	timeTrackingPage.clickOnTimeReport();
}
/*Meatod  for Time Approval for Time Tracking*/
public void GoToTimeApprovalPage()
{
	
	timeTrackingPage.clickOnTimeApproval();
	timeTrackingPage.clickOnViewHistory();
	timeTrackingPage.clickOnBackToList();
	
}
/*Meatod  for Timesheet for Time Tracking*/
public void GoToTimeSheetPage()
{
	
	timeTrackingPage.clickOnTimesheet();
	//timeTrackingPage.clickOnsaveAsDraft();
	//timeTrackingPage.clickOnSendForApproval();
	
}
/*Meatod  for Time Track for Time Tracking*/
public void GoToTimeTrackPage()
{
	
	timeTrackingPage.clickOnTimeTrack();	
	timeTrackingPage.clickOnHideTimeTracking();
	timeTrackingPage.clickOnListing();
	timeTrackingPage.clickOnBillable();
	timeTrackingPage.clickOnNonBillable();
	timeTrackingPage.clickOnDeleteEntries();
	timeTrackingPage.clickOnCalendarView();

}
/*Meatod  for Work Diary for Time Tracking*/
public void GoToWorkDiaryPage()
{
	
	timeTrackingPage.clickOnWorkDiary();
	timeTrackingPage.clickOnAction();
	timeTrackingPage.clickOnViewFlaggedScreenshot();
	
}
}
