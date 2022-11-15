package action;

import org.openqa.selenium.WebDriver;
import pageobjects.HRManagementPage;
import pageobjects.HiringPage;

public class HRManagementAction {
	WebDriver driver ; 
	HRManagementPage hRManagementPage;
	HiringPage hiringPage;
	
	public HRManagementAction(WebDriver driver)
	{
		this.driver= driver;
		hRManagementPage= new HRManagementPage(driver);
		hiringPage= new HiringPage(driver);
	}
	
	public void GoToHrManagementPage()
	{
		hRManagementPage.clickFullMenuDropDown();	
		hRManagementPage.clickOnHRManagement();	
		
		
	}
	/*Method  for Attendance for HrManagement*/
	public void GoToAttendancePage()
	{
		
		hRManagementPage.clickOnAttendanceforHRManagement();
		
	}
	/*Method  for Attendance Card Report for HrManagement*/
	public void GoToAttendanceCardReportPage()
	{
		
		hRManagementPage.clickOnAttendanceforHRManagement();
		
	}
	/*Method  for AttendanceInOutReport for HrManagement*/
	public void GoToAttendanceInOutReportPage()
	{
		
		hRManagementPage.clickOnAttendanceInOutReport();
		
	}
	/*Method  for Attendance Approval for HrManagement*/
	public void GoToAttendanceApprovalPage()
	{
		
		hRManagementPage.clickOnAttendanceApproval();
		
	}
	/*Method  for Check-In Flag List for HrManagement*/
	public void GoToCheckInFlagListPage()
	{
		
		hRManagementPage.clickOnCheckInFlagList();
		
	}
	/*Meatod  for Check-In Dispute Approval for HrManagement*/
	public void GoToCheckInDisputeApprovalPage()
	{
		
		hRManagementPage.clickOnDisputeApproval();
		
	}
	/*Method  for Check-In/Out Dispute for HrManagement*/
	public void GoToCheckInOutDisputePage()
	{
		
		hRManagementPage.clickOnCheckInOutDispute();
		
	}
	/*Method  for Group List for HrManagement*/
	public void GoToGroupListPage()
	{
		
		hRManagementPage.clickOnGroupList();
		hRManagementPage.clickOnAddGroupList();
		hRManagementPage.clickOnSaveButton();
		hRManagementPage.VerifyMandatoryFieldValidation();
		hRManagementPage.clickOnCloselButton();
		
	}
	/*Method  for HR report for HrManagement*/
	public void GoToHRReportPage()
	{
		
		hRManagementPage.clickOnHRReport();
		
	}
	/*Method  for Induction Document List for HrManagement*/
	public void GoToInductionDocumentListPage()
	{
		
		hRManagementPage.clickOnInductionDocumentList();
		hRManagementPage.clickOnAddInductionDocumentList();
		hRManagementPage.clickOnSaveAddInductionDocumentList();
		hRManagementPage.VerifyMandatoryFieldOfAddInduction();
		hRManagementPage.clickOnCancelAddInductionDocumentList();
		
	}
	/*Method  for Leave for HrManagement*/
	public void GoToLeavePage()
	{
		
		hRManagementPage.clickOnLeave();
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
	/*Method  for Leave Approval for HrManagement*/
	public void GoToLeaveApprovalPage()
	{
		
		hRManagementPage.clickOnLeaveApproval();
		hRManagementPage.clickOnPageTourForLeaveApproval();
		hRManagementPage.clickOnViewHistory();
		hRManagementPage.clickOnBackList();
		hRManagementPage.clickOnCheckBox();
		hRManagementPage.clickOnReject();
		hRManagementPage.clickOnCloseCommentPopUp();
		hRManagementPage.clickOnApprove();
		hRManagementPage.clickOnCloseCommentPopUp();
	
	}
	/*Method  for Leave Type- Listing for HrManagement*/
	public void GoToLeaveTypeListingPage()
	{
		
		hRManagementPage.clickOnLeaveTypeListing();
		hRManagementPage.clickOnPageTour();
		hRManagementPage.clickOnAddLeaveTypeListing();
		hRManagementPage.clickOnSaveAddLeaveType();
		hRManagementPage.VerifyMandatoryFieldOfAddLeaveType();
		hRManagementPage.clickOnCancelManageAccrual();
		
	}
	/*Method  for Manage Check-In  for HrManagement*/
	public void GoToManageCheckInPage()
	{
		
		hRManagementPage.clickOnManageCheckIn();
		hRManagementPage.clickOnAddManageCheckIn();
		hRManagementPage.clickOnGo();
		hRManagementPage.clickOnClear();
		hRManagementPage.clickOnSendForApproval();
		
		
	}
	/*Method  for Offboard Employee List  for HrManagement*/
	public void GoToOffboardEmployeeListPage()
	{
		
		hRManagementPage.clickOnOffboardEmployeeListforHiring();
		hiringPage.clickOnAddOffboardEmployeeListforHiring();
		hiringPage.clickOnSaveAddConsultantList();
		hiringPage.VerifyMandatoryFieldOfAddOffboardEmployeeList();
		hiringPage.clickOnCancelAddConsultantList();
		
		
	}
	/*Method  for Policy page  for HrManagement*/
	public void GoToPolicyPage()
	{
		
		hRManagementPage.clickOnPolicyforHiring();
		hiringPage.clickOnAddPolicyforHiring();
		hiringPage.clickOnSaveButton();
		hiringPage.clickOnCancelButton();
		hiringPage.clickOnCheckBox();
		hiringPage.clickOnDelete();
		
		
	}
	/*Method  for Resignation page  for HrManagement*/
	public void GoToResignationPage()
	{
		
		hRManagementPage.clickOnResignationforHiring();
		hiringPage.clickOnApplyResignation();
		hiringPage.clickOnSaveManageResignation();
		hiringPage.clickOnCancelManageResignation();
		hiringPage.clickOnAddOffboardEmployeeListforHiring();
		hiringPage.clickOnSaveAddConsultantList();
		hiringPage.VerifyMandatoryFieldOfAddOffboardEmployeeList();
		hiringPage.clickOnCancelAddConsultantList();
		
		
	}
}
