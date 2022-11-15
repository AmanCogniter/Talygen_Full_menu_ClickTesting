package testcases;

import static reporting.ComplexReportFactory.getTest;

import org.testng.annotations.Test;

import action.HRManagementAction;
import action.LoginAction;
import utils.WebTestBase;

public class HRManagementTest extends WebTestBase{
	static String Screenname = "<b>Hr Management</b>"; 
	/*
	 * Check click testing of Attendance Page
	 */
	@Test(priority=0)
	public void ValidateClickTestingOfAttendancePage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Attendance for HR Management");
		HRManagementAction hRManagementAction = new HRManagementAction(driver);
		new LoginAction(driver).logoutLogin();
		hRManagementAction.GoToHrManagementPage();
		hRManagementAction.GoToAttendancePage();
		
	}
	/*
	 * Check click testing of Attendance Card Report Page
	 */
	@Test(priority=1)
	public void ValidateClickTestingOfAttendanceCardReportPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Attendance Card Report for HR Management");
		HRManagementAction hRManagementAction = new HRManagementAction(driver);
		new LoginAction(driver).logoutLogin();
		hRManagementAction.GoToHrManagementPage();
		hRManagementAction.GoToAttendanceCardReportPage();
		
	}
	/*
	 * Check click testing of Attendance In-Out Report Page
	 */
	@Test(priority=2)
	public void ValidateClickTestingOfAttendanceInOutReportPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Attendance In-Out Report for HR Management");
		HRManagementAction hRManagementAction = new HRManagementAction(driver);
		new LoginAction(driver).logoutLogin();
		hRManagementAction.GoToHrManagementPage();
		hRManagementAction.GoToAttendanceInOutReportPage();
		
	}
	/*
	 * Check click testing of AttendanceApproval Page
	 */
	@Test(priority=3)
	public void ValidateClickTestingOfAttendanceApprovalPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Attendance Approval for HR Management");
		HRManagementAction hRManagementAction = new HRManagementAction(driver);
		new LoginAction(driver).logoutLogin();
		hRManagementAction.GoToHrManagementPage();
		hRManagementAction.GoToAttendanceApprovalPage();
		
	}
	/*
	 * Check click testing of Check-In Flag List Page
	 */
	@Test(priority=4)
	public void ValidateClickTestingOfCheckInFlagListPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Check-In Flag List for HR Management");
		HRManagementAction hRManagementAction = new HRManagementAction(driver);
		new LoginAction(driver).logoutLogin();
		hRManagementAction.GoToHrManagementPage();
		hRManagementAction.GoToCheckInFlagListPage();
		
	}
	/*
	 * Check click testing of Dispute Approval Page
	 */
	@Test(priority=5)
	public void ValidateClickTestingOfDisputeApprovalPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Dispute Approval for HR Management");
		HRManagementAction hRManagementAction = new HRManagementAction(driver);
		new LoginAction(driver).logoutLogin();
		hRManagementAction.GoToHrManagementPage();
		hRManagementAction.GoToCheckInDisputeApprovalPage();
		
	}
	/*
	 * Check click testing of Check-In/Out Dispute Page
	 */
	@Test(priority=6)
	public void ValidateClickTestingOfCheckInOutDisputePage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Check-In/Out Dispute for HR Management");
		HRManagementAction hRManagementAction = new HRManagementAction(driver);
		new LoginAction(driver).logoutLogin();
		hRManagementAction.GoToHrManagementPage();
		hRManagementAction.GoToCheckInOutDisputePage();
		
	}
	/*
	 * Check click testing of Group List Page
	 */
	@Test(priority=7)
	public void ValidateClickTestingOfGroupListPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Group List for HR Management");
		HRManagementAction hRManagementAction = new HRManagementAction(driver);
		new LoginAction(driver).logoutLogin();
		hRManagementAction.GoToHrManagementPage();
		hRManagementAction.GoToGroupListPage();
		
	}
	/*
	 * Check click testing of HR Report Page
	 */
	@Test(priority=8)
	public void ValidateClickTestingOfHrReportPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of HR Report for HR Management");
		HRManagementAction hRManagementAction = new HRManagementAction(driver);
		new LoginAction(driver).logoutLogin();
		hRManagementAction.GoToHrManagementPage();
		hRManagementAction.GoToHRReportPage();
		
	}
	/*
	 * Check click testing of Induction Document List Page
	 */
	@Test(priority=9)
	public void ValidateClickTestingOfInductionDocumentListPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Induction Document List for HR Management");
		HRManagementAction hRManagementAction = new HRManagementAction(driver);
		new LoginAction(driver).logoutLogin();
		hRManagementAction.GoToHrManagementPage();
		hRManagementAction.GoToInductionDocumentListPage();
		
	}
	
	/*
	 * Check click testing of Leave Page
	 */
	@Test(priority=10)
	public void ValidateClickTestingOfLeavePage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Leave for HR Management");
		HRManagementAction hRManagementAction = new HRManagementAction(driver);
		new LoginAction(driver).logoutLogin();
		hRManagementAction.GoToHrManagementPage();
		hRManagementAction.GoToLeavePage();
		
	}
	/*
	 * Check click testing of Leave Approval Page
	 */
	@Test(priority=11)
	public void ValidateClickTestingOfLeaveApprovalPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Leave Approval for HR Management");
		HRManagementAction hRManagementAction = new HRManagementAction(driver);
		new LoginAction(driver).logoutLogin();
		hRManagementAction.GoToHrManagementPage();
		hRManagementAction.GoToLeaveApprovalPage();
		
	}
	/*
	 * Check click testing of Leave Type- Listing Page
	 */
	@Test(priority=12)
	public void ValidateClickTestingOfLeaveTypeListingPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Leave Type- Listing for HR Management");
		HRManagementAction hRManagementAction = new HRManagementAction(driver);
		new LoginAction(driver).logoutLogin();
		hRManagementAction.GoToHrManagementPage();
		hRManagementAction.GoToLeaveTypeListingPage();
		
	}
	/*
	 * Check click testing of Manage Check-In Page
	 */
	@Test(priority=13)
	public void ValidateClickTestingOfManageCheckInPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Manage Check-In for HR Management");
		HRManagementAction hRManagementAction = new HRManagementAction(driver);
		new LoginAction(driver).logoutLogin();
		hRManagementAction.GoToHrManagementPage();
		hRManagementAction.GoToManageCheckInPage();
		
	}
	/*
	 * Check click testing of Offboard Employee List Page
	 */
	@Test(priority=14)
	public void ValidateClickTestingOfOffboardEmployeeListPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Offboard Employee List for HR Management");
		HRManagementAction hRManagementAction = new HRManagementAction(driver);
		new LoginAction(driver).logoutLogin();
		hRManagementAction.GoToHrManagementPage();
		hRManagementAction.GoToOffboardEmployeeListPage();
		
	}
	/*
	 * Check click testing of Policy Page
	 */
	@Test(priority=15)
	public void ValidateClickTestingOfPolicyPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Policy for HR Management");
		HRManagementAction hRManagementAction = new HRManagementAction(driver);
		new LoginAction(driver).logoutLogin();
		hRManagementAction.GoToHrManagementPage();
		hRManagementAction.GoToPolicyPage();
		
	}
	/*
	 * Check click testing of Resignation Page
	 */
	@Test(priority=16)
	public void ValidateClickTestingOfResignationPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Resignation for HR Management");
		HRManagementAction hRManagementAction = new HRManagementAction(driver);
		new LoginAction(driver).logoutLogin();
		hRManagementAction.GoToHrManagementPage();
		hRManagementAction.GoToResignationPage();
		
	}
}
