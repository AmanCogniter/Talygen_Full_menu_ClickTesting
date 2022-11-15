package testcases;

import static reporting.ComplexReportFactory.getTest;

import org.testng.annotations.Test;

import action.CommunicationAction;
import action.LoginAction;
import utils.WebTestBase;

public class CommunicationTest extends WebTestBase{
	static String Screenname = "<b>Communication</b>"; 
	/*
	 * Check click testing of IVRPage
	 */
	@Test(priority=0)
	public void ValidateClickTestingOfIVRPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of IVR");
		CommunicationAction communicationAction = new CommunicationAction(driver);
		new LoginAction(driver).logoutLogin();
		communicationAction.GoToCommunicationPage();
		communicationAction.GoToIVRPage();
	}
	/*
	 * Check click testing of Meeting Recording ListPage
	 */
	@Test(priority=1)
	public void ValidateClickTestingOfMeetingRecordingListPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Meeting Recording List");
		CommunicationAction communicationAction = new CommunicationAction(driver);
		new LoginAction(driver).logoutLogin();
		communicationAction.GoToCommunicationPage();
		communicationAction.GoToMeetingRecordingListPage();
	}
	/*
	 * Check click testing of Meetings Page
	 */
	@Test(priority=2)
	public void ValidateClickTestingOfMeetingsPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Meetings");
		CommunicationAction communicationAction = new CommunicationAction(driver);
		new LoginAction(driver).logoutLogin();
		communicationAction.GoToCommunicationPage();
		communicationAction.GoToMeetingsPage();
	}
	/*
	 * Check click testing of UnifiedSetup Page
	 */
	@Test(priority=3)
	public void ValidateClickTestingOfUnifiedSetupPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of UnifiedSetup");
		CommunicationAction communicationAction = new CommunicationAction(driver);
		new LoginAction(driver).logoutLogin();
		communicationAction.GoToCommunicationPage();
		communicationAction.GoToUnifiedSetupPage();
	}
	/*
	 * Check click testing of Video Recording List Page
	 */
	@Test(priority=4)
	public void ValidateClickTestingOfVideoRecordingListPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Video Recording List");
		CommunicationAction communicationAction = new CommunicationAction(driver);
		new LoginAction(driver).logoutLogin();
		communicationAction.GoToCommunicationPage();
		communicationAction.GoToVideoRecordingListPage();
	}
}
