package testcases;

import static reporting.ComplexReportFactory.getTest;

import org.testng.annotations.Test;

import action.AppoitmentCalenderAction;
import action.LoginAction;
import action.TimeTrackingAction;
import utils.WebTestBase;

public class TimeTrackingTest extends WebTestBase{
	static String Screenname = "<b>Time Tracking</b>"; 
	/*
	 * Check click testing of Audit Rule Page
	 */
	@Test(priority=0)
	public void ValidateClickTestingOfAuditRulePage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Audit Rule for Time Tracking");
		TimeTrackingAction timeTrackingAction = new TimeTrackingAction(driver);
		new LoginAction(driver).logoutLogin();
		timeTrackingAction.GoToTimeTrackingPage();
		timeTrackingAction.GoToAuditRulePage();
		
	}
	/*
	 * Check click testing of Bulk Time Entry Page
	 */
	@Test(priority=1)
	public void ValidateClickTestingOfBulkTimeEntryPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Bulk Time Entry for Time Tracking");
		TimeTrackingAction timeTrackingAction = new TimeTrackingAction(driver);
		new LoginAction(driver).logoutLogin();
		timeTrackingAction.GoToTimeTrackingPage();
		timeTrackingAction.GoToBulkTimeEntryPage();
		
	}
	/*
	 * Check click testing of Flag Track Entry Page
	 */
	@Test(priority=2)
	public void ValidateClickTestingOfFlagTrackEntryPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Flag Track Entry for Time Tracking");
		TimeTrackingAction timeTrackingAction = new TimeTrackingAction(driver);
		new LoginAction(driver).logoutLogin();
		timeTrackingAction.GoToTimeTrackingPage();
		timeTrackingAction.GoToFlagTrackEntryPage();
		
	}
	/*
	 * Check click testing of Project Report Page
	 */
	@Test(priority=3)
	public void ValidateClickTestingOfProjectReportPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Project Report for Time Tracking");
		TimeTrackingAction timeTrackingAction = new TimeTrackingAction(driver);
		new LoginAction(driver).logoutLogin();
		timeTrackingAction.GoToTimeTrackingPage();
		timeTrackingAction.GoToProjectReportPage();
		
	}
	/*
	 * Check click testing of Time Report Page
	 */
	@Test(priority=4)
	public void ValidateClickTestingOfTimeReportPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Time Report for Time Tracking");
		TimeTrackingAction timeTrackingAction = new TimeTrackingAction(driver);
		new LoginAction(driver).logoutLogin();
		timeTrackingAction.GoToTimeTrackingPage();
		timeTrackingAction.GoToTimeReportPage();
		
	}
	/*
	 * Check click testing of Time Approval Page
	 */
	@Test(priority=5)
	public void ValidateClickTestingOfTimeApprovalPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Time Approval for Time Tracking");
		TimeTrackingAction timeTrackingAction = new TimeTrackingAction(driver);
		new LoginAction(driver).logoutLogin();
		timeTrackingAction.GoToTimeTrackingPage();
		timeTrackingAction.GoToTimeApprovalPage();
		
	}
	/*
	 * Check click testing of TimeSheet Page
	 */
	@Test(priority=6)
	public void ValidateClickTestingOfTimeSheetPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of TimeSheet for Time Tracking");
		TimeTrackingAction timeTrackingAction = new TimeTrackingAction(driver);
		new LoginAction(driver).logoutLogin();
		timeTrackingAction.GoToTimeTrackingPage();
		timeTrackingAction.GoToTimeSheetPage();
		
	}
	/*
	 * Check click testing of Time Track Page
	 */
	@Test(priority=7)
	public void ValidateClickTestingOfTimeTrackPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Time Track for Time Tracking");
		TimeTrackingAction timeTrackingAction = new TimeTrackingAction(driver);
		new LoginAction(driver).logoutLogin();
		timeTrackingAction.GoToTimeTrackingPage();
		timeTrackingAction.GoToTimeTrackPage();
		
	}
	/*
	 * Check click testing of Work Diary Page
	 */
	@Test(priority=8)
	public void ValidateClickTestingOfWorkDiaryPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Time Track for Work Diary");
		TimeTrackingAction timeTrackingAction = new TimeTrackingAction(driver);
		new LoginAction(driver).logoutLogin();
		timeTrackingAction.GoToTimeTrackingPage();
		timeTrackingAction.GoToWorkDiaryPage();
		
	}
}
