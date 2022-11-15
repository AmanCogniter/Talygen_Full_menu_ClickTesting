package action;

import org.openqa.selenium.WebDriver;

import pageobjects.HRManagementPage;
import pageobjects.HiringPage;
import pageobjects.HumanResourcesPage;

public class HumanResourcesAction {
	WebDriver driver ; 
	HumanResourcesPage humanResourcesPage;
	HRManagementPage hRManagementPage;
	HiringPage hiringPage;
	
	public HumanResourcesAction(WebDriver driver)
	{
		this.driver= driver;
		hRManagementPage= new HRManagementPage(driver);
		humanResourcesPage= new HumanResourcesPage(driver);
		hiringPage= new HiringPage(driver);
	}
	
	public void GoToHumanResourcesPage()
	{
		humanResourcesPage.clickFullMenuDropDown();	
		humanResourcesPage.clickOnHumanResources();	
		
		
	}
	/*Method  for Attendance for Human Resources*/
	public void GoToAttendancePage()
	{
		
		humanResourcesPage.clickOnAttendanceforHumanResources();
		
	}
	/*Method  for Attendance Approval for Human Resources*/
	public void GoToAttendanceApprovalPage()
	{
		
		humanResourcesPage.clickOnAttendanceApproval();
		
	}
	/*Meatod  for Candidate List for Human Resources*/
	public void GoToCandidateListPage()
	{
		
		humanResourcesPage.clickOnCandidateList();	
		hiringPage.clickOnAddCandidateListforHiring();
		hiringPage.clickOnSaveButton();
		hiringPage.clickOnCloseNotifyMessageButton();
		hiringPage.VerifyMandatoryFieldValidation();
		hiringPage.clickOnCancelButton();
		hiringPage.clickOnForwardcandidatesCV();
		hiringPage.clickOnGridView();
		hiringPage.clickOnListView();
		hiringPage.clickOnCheckBox();
		hiringPage.clickOnDelete();
		hiringPage.clickOnManageView();
		
	}
	/*Method  for Check-In Flag List for Human Resources*/
	public void GoToCheckInFlagListPage()
	{
		
		humanResourcesPage.clickOnCheckInFlagList();
		
	}
	/*Meatod  for Consultant List for Human Resources*/
	public void GoToConsultantListPage()
	{
		
		humanResourcesPage.clickOnConsultantListforHumanResources();	
		hiringPage.clickOnAddConsultantListforHiring();
		hiringPage.clickOnSaveAddConsultantList();
		hiringPage.VerifyMandatoryFieldOfAddConsultantList();
		hiringPage.clickOnCancelAddConsultantList();
		hiringPage.clickOnCheckBox();
		hiringPage.clickOnDelete();	
	}
	/*Method  for Group List for Human Resources*/
	public void GoToGroupListPage()
	{
		
		humanResourcesPage.clickOnGroupList();
		hRManagementPage.clickOnAddGroupList();
		hRManagementPage.clickOnSaveButton();
		hRManagementPage.VerifyMandatoryFieldValidation();
		hRManagementPage.clickOnCloselButton();
		
	}
	/*Method  for HR Report for Human Resources*/
	public void GoToHRReportPage()
	{
		
		humanResourcesPage.clickOnHRReport();
		
	}
	/*Method  for Induction Document List for  Human Resourcest*/
	public void GoToInductionDocumentListPage()
	{
		
		humanResourcesPage.clickOnInductionDocumentList();
		hRManagementPage.clickOnAddInductionDocumentList();
		hRManagementPage.clickOnSaveAddInductionDocumentList();
		hRManagementPage.VerifyMandatoryFieldOfAddInduction();
		hRManagementPage.clickOnCancelAddInductionDocumentList();
		
	}
	/*Method  for Leave for Human Resources*/
	public void GoToLeavePage()
	{
		
		humanResourcesPage.clickOnLeave();
		hRManagementPage.clickOnPageTour();
		hRManagementPage.clickOnApplyLeave();
		hRManagementPage.clickOnSaveApplyLeave();
		hRManagementPage.VerifyMandatoryFieldOfApplyLeave();
		hRManagementPage.clickOnCancelApplyLeave();
		hRManagementPage.clickOnManageAccrual();
		hRManagementPage.clickOnSaveManageAccrual();
		hRManagementPage.VerifyMandatoryFieldOfManageAccrual();
		hRManagementPage.clickOnCancelManageAccrual();
	}
	/*Method  for Leave Approval for Human Resources*/
	public void GoToLeaveApprovalPage()
	{
		
		humanResourcesPage.clickOnLeaveApproval();
		hRManagementPage.clickOnPageTourForLeaveApproval();
		hRManagementPage.clickOnViewHistory();
		hRManagementPage.clickOnBackList();
		hRManagementPage.clickOnCheckBox();
		hRManagementPage.clickOnReject();
		hRManagementPage.clickOnCloseCommentPopUp();
		hRManagementPage.clickOnApprove();
		hRManagementPage.clickOnCloseCommentPopUp();
	
	}
	/*Method  for Leave Type- Listing for Human Resources*/
	public void GoToLeaveTypeListingPage()
	{
		
		humanResourcesPage.clickOnLeaveTypeListing();
		hRManagementPage.clickOnPageTour();
		hRManagementPage.clickOnAddLeaveTypeListing();
		hRManagementPage.clickOnSaveAddLeaveType();
		hRManagementPage.VerifyMandatoryFieldOfAddLeaveType();
		hRManagementPage.clickOnCancelManageAccrual();
		
	}
	/*Method  for Manage Check-In  for Human Resources*/
	public void GoToManageCheckInPage()
	{
		
		humanResourcesPage.clickOnManageCheckIn();
		hRManagementPage.clickOnAddManageCheckIn();
		hRManagementPage.clickOnGo();
		hRManagementPage.clickOnClear();
		hRManagementPage.clickOnSendForApproval();
		
		
	}
	/*Meatod  for Talent Pool List for Human Resources*/
	public void GoToTalentPoolListPage()
	{
		
		humanResourcesPage.clickOnTalentPoolListforHiring();	
		hiringPage.clickOnAddToTalentPoolListforHiring();
		hiringPage.clickOnSaveButton();
		hiringPage.clickOnCloseNotifyMessageButton();
		hiringPage.VerifyMandatoryFieldOfAddToTalentPoo();
		hiringPage.clickOnCancelButton();
		hiringPage.clickOnManageView();
	}
}
