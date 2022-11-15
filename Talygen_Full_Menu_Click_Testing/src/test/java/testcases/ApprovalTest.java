package testcases;

import static reporting.ComplexReportFactory.getTest;

import org.testng.annotations.Test;

import action.AppoitmentCalenderAction;
import action.ApprovalAction;
import action.LoginAction;
import utils.WebTestBase;

public class ApprovalTest extends WebTestBase{
	static String Screenname = "<b>Approval</b>"; 
	/*
	 * Check click testing of Approval chain Page
	 */
	@Test(priority=0)
	public void ValidateClickTestingOfApprovalChainPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Approval chain");
		ApprovalAction approvalAction = new ApprovalAction(driver);
		new LoginAction(driver).logoutLogin();
		approvalAction.GoToApprovalPage();
		approvalAction.GoToApprovalChain();
	}
	/* Test script for checking Click Testing of Approval group  Page */
	@Test(priority=1)
	public void ValidateClickTestingOfApprovalGroupPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Approval Group Page");
		ApprovalAction approvalAction = new ApprovalAction(driver);
		new LoginAction(driver).logoutLogin();
		approvalAction.GoToApprovalPage();
		approvalAction.GoToApprovalGroup();
		
	}
	/* Test script for checking Click Testing of Approval Report  Page */
	@Test(priority=2)
	public void ValidateClickTestingOfApprovalReportPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Approval Report Page");
		ApprovalAction approvalAction = new ApprovalAction(driver);
		new LoginAction(driver).logoutLogin();
		approvalAction.GoToApprovalPage();
		approvalAction.GoToApprovalReport();
		
	}
	/* Test script for checking Click Testing of Approval Rule  Page */
	@Test(priority=3)
	public void ValidateClickTestingOfApprovalRulePage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Approval Rule Page");
		ApprovalAction approvalAction = new ApprovalAction(driver);
		new LoginAction(driver).logoutLogin();
		approvalAction.GoToApprovalPage();
		approvalAction.GoToApprovalRule();
		
	}
}
