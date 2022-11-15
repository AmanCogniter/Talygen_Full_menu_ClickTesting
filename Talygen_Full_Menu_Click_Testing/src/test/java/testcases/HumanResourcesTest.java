package testcases;

import static reporting.ComplexReportFactory.getTest;

import org.testng.annotations.Test;

import action.HumanResourcesAction;
import action.LoginAction;
import utils.WebTestBase;

public class HumanResourcesTest extends WebTestBase{
	static String Screenname = "<b>Human Resources</b>"; 
	/*
	 * Check click testing of Attendance Page
	 */
	@Test(priority=0)
	public void ValidateClickTestingOfAttendancePage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Attendance for Human Resources");
		HumanResourcesAction humanResourcesAction = new HumanResourcesAction(driver);
		new LoginAction(driver).logoutLogin();
		humanResourcesAction.GoToHumanResourcesPage();
		humanResourcesAction.GoToAttendancePage();
		
	}
	/*
	 * Check click testing of Attendance Approval Page
	 */
	@Test(priority=1)
	public void ValidateClickTestingOfAttendanceApprovalPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Attendance Approval for Human Resources");
		HumanResourcesAction humanResourcesAction = new HumanResourcesAction(driver);
		new LoginAction(driver).logoutLogin();
		humanResourcesAction.GoToHumanResourcesPage();
		humanResourcesAction.GoToAttendanceApprovalPage();
		
	}
	/*
	 * Check click testing of Candidate List Page
	 */
	@Test(priority=2)
	public void ValidateClickTestingOfCandidateListPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Candidate List for Human Resources");
		HumanResourcesAction humanResourcesAction = new HumanResourcesAction(driver);
		new LoginAction(driver).logoutLogin();
		humanResourcesAction.GoToHumanResourcesPage();
		humanResourcesAction.GoToCandidateListPage();
		
	}
	/*
	 * Check click testing of Check-In Flag List Page
	 */
	@Test(priority=3)
	public void ValidateClickTestingOfCheckInFlagListPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Check-In Flag List for Human Resources");
		HumanResourcesAction humanResourcesAction = new HumanResourcesAction(driver);
		new LoginAction(driver).logoutLogin();
		humanResourcesAction.GoToHumanResourcesPage();
		humanResourcesAction.GoToCheckInFlagListPage();
		
	}
	/*
	 * Check click testing of Consultant List  Page
	 */
	@Test(priority=4)
	public void ValidateClickTestingOfConsultantListPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Consultant List  for Human Resources");
		HumanResourcesAction humanResourcesAction = new HumanResourcesAction(driver);
		new LoginAction(driver).logoutLogin();
		humanResourcesAction.GoToHumanResourcesPage();
		humanResourcesAction.GoToConsultantListPage();
		
	}
	/*
	 * Check click testing of Group List  Page
	 */
	@Test(priority=5)
	public void ValidateClickTestingOfGroupListPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Group List  for Human Resources");
		HumanResourcesAction humanResourcesAction = new HumanResourcesAction(driver);
		new LoginAction(driver).logoutLogin();
		humanResourcesAction.GoToHumanResourcesPage();
		humanResourcesAction.GoToGroupListPage();
		
	}
	/*
	 * Check click testing of HR Report  Page
	 */
	@Test(priority=6)
	public void ValidateClickTestingOfHRReportPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of HR Report for Human Resources");
		HumanResourcesAction humanResourcesAction = new HumanResourcesAction(driver);
		new LoginAction(driver).logoutLogin();
		humanResourcesAction.GoToHumanResourcesPage();
		humanResourcesAction.GoToHRReportPage();
		
	}
	/*
	 * Check click testing of Induction Document List  Page
	 */
	@Test(priority=7)
	public void ValidateClickTestingOfInductionDocumentListPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Induction Document List for Human Resources");
		HumanResourcesAction humanResourcesAction = new HumanResourcesAction(driver);
		new LoginAction(driver).logoutLogin();
		humanResourcesAction.GoToHumanResourcesPage();
		humanResourcesAction.GoToInductionDocumentListPage();
		
	}
	/*
	 * Check click testing of Leave  Page
	 */
	@Test(priority=8)
	public void ValidateClickTestingOfLeavePage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Leave for Human Resources");
		HumanResourcesAction humanResourcesAction = new HumanResourcesAction(driver);
		new LoginAction(driver).logoutLogin();
		humanResourcesAction.GoToHumanResourcesPage();
		humanResourcesAction.GoToLeavePage();
		
	}
	/*
	 * Check click testing of Leave Approval Page
	 */
	@Test(priority=9)
	public void ValidateClickTestingOfLeaveApprovalPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Leave Approval for Human Resources");
		HumanResourcesAction humanResourcesAction = new HumanResourcesAction(driver);
		new LoginAction(driver).logoutLogin();
		humanResourcesAction.GoToHumanResourcesPage();
		humanResourcesAction.GoToLeaveApprovalPage();
		
	}
	/*
	 * Check click testing of Leave Type- Listing Page
	 */
	@Test(priority=10)
	public void ValidateClickTestingOfLeaveTypeListingPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Leave Type- Listing for Human Resources");
		HumanResourcesAction humanResourcesAction = new HumanResourcesAction(driver);
		new LoginAction(driver).logoutLogin();
		humanResourcesAction.GoToHumanResourcesPage();
		humanResourcesAction.GoToLeaveTypeListingPage();
		
	}
	/*
	 * Check click testing of Manage Check-In Page
	 */
	@Test(priority=11)
	public void ValidateClickTestingOfManageCheckInPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Manage Check-In for Human Resources");
		HumanResourcesAction humanResourcesAction = new HumanResourcesAction(driver);
		new LoginAction(driver).logoutLogin();
		humanResourcesAction.GoToHumanResourcesPage();
		humanResourcesAction.GoToManageCheckInPage();
		
	}
	/*
	 * Check click testing of Talent Pool List Page
	 */
	@Test(priority=12)
	public void ValidateClickTestingOfTalentPoolListPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Talent Pool List for Human Resources");
		HumanResourcesAction humanResourcesAction = new HumanResourcesAction(driver);
		new LoginAction(driver).logoutLogin();
		humanResourcesAction.GoToHumanResourcesPage();
		humanResourcesAction.GoToTalentPoolListPage();
		
	}
}
