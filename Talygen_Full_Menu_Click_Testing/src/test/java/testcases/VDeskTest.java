package testcases;

import static reporting.ComplexReportFactory.getTest;

import org.testng.annotations.Test;

import action.LoginAction;
import action.VDeskAction;
import utils.WebTestBase;

public class VDeskTest extends WebTestBase{
	static String Screenname = "<b>VDesk</b>"; 
	/*
	 * Check click testing of Application Settings Page
	 */
	@Test(priority=0)
	public void ValidateClickTestingOfApplicationSettingsPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Application Settings page");
		VDeskAction vDeskAction = new VDeskAction(driver);
		new LoginAction(driver).logoutLogin();
		vDeskAction.GoToVDeskPage();
		vDeskAction.GoToApplicationSettingsPage();
		
	}
	/*
	 * Check click testing of Application Summary Page
	 */
	@Test(priority=1)
	public void ValidateClickTestingOfApplicationSummaryPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Application Summary page");
		VDeskAction vDeskAction = new VDeskAction(driver);
		new LoginAction(driver).logoutLogin();
		vDeskAction.GoToVDeskPage();
		vDeskAction.GoToApplicationSummaryPage();
		
	}
	/*
	 * Check click testing of Application Page
	 */
	@Test(priority=2)
	public void ValidateClickTestingOfApplicationPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Application page");
		VDeskAction vDeskAction = new VDeskAction(driver);
		new LoginAction(driver).logoutLogin();
		vDeskAction.GoToVDeskPage();
		vDeskAction.GoToApplicationPage();
		
	}
	/*
	 * Check click testing of Client Log In Page
	 */
	@Test(priority=3)
	public void ValidateClickTestingOfClientLogInPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Client Log In page");
		VDeskAction vDeskAction = new VDeskAction(driver);
		new LoginAction(driver).logoutLogin();
		vDeskAction.GoToVDeskPage();
		vDeskAction.GoToClientLogInPage();
		
	}
	/*
	 * Check click testing of Database Page
	 */
	@Test(priority=4)
	public void ValidateClickTestingOfDatabasePage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Database page");
		VDeskAction vDeskAction = new VDeskAction(driver);
		new LoginAction(driver).logoutLogin();
		vDeskAction.GoToVDeskPage();
		vDeskAction.GoToDatabasePage();
		
	}
	/*
	 * Check click testing of Desktop Clients Page
	 */
	@Test(priority=5)
	public void ValidateClickTestingOfDesktopClientsPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Desktop Clients page");
		VDeskAction vDeskAction = new VDeskAction(driver);
		new LoginAction(driver).logoutLogin();
		vDeskAction.GoToVDeskPage();
		vDeskAction.GoToDesktopClientsPage();
		
	}
	/*
	 * Check click testing of General Settings Page
	 */
	@Test(priority=6)
	public void ValidateClickTestingOfGeneralSettingsPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of General Settings page");
		VDeskAction vDeskAction = new VDeskAction(driver);
		new LoginAction(driver).logoutLogin();
		vDeskAction.GoToVDeskPage();
		vDeskAction.GoToGeneralSettingsPage();
		
	}
	/*
	 * Check click testing of Job Page
	 */
	@Test(priority=7)
	public void ValidateClickTestingOfJobPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Job page");
		VDeskAction vDeskAction = new VDeskAction(driver);
		new LoginAction(driver).logoutLogin();
		vDeskAction.GoToVDeskPage();
		vDeskAction.GoToJobPage();
		
	}
	/*
	 * Check click testing of Jobs Report Page
	 */
	@Test(priority=8)
	public void ValidateClickTestingOfJobsReportPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Jobs Report page");
		VDeskAction vDeskAction = new VDeskAction(driver);
		new LoginAction(driver).logoutLogin();
		vDeskAction.GoToVDeskPage();
		vDeskAction.GoToJobsReportPage();
		
	}
	/*
	 * Check click testing of Logs Page
	 */
	@Test(priority=9)
	public void ValidateClickTestingOfLogsPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Logs page");
		VDeskAction vDeskAction = new VDeskAction(driver);
		new LoginAction(driver).logoutLogin();
		vDeskAction.GoToVDeskPage();
		vDeskAction.GoToLogsPage();
		
	}
	/*
	 * Check click testing of Policies Page
	 */
	@Test(priority=10)
	public void ValidateClickTestingOfPoliciesPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Policies page");
		VDeskAction vDeskAction = new VDeskAction(driver);
		new LoginAction(driver).logoutLogin();
		vDeskAction.GoToVDeskPage();
		vDeskAction.GoToPoliciesPage();
		
	}
	/*
	 * Check click testing of Remote Desktop Page
	 */
	@Test(priority=11)
	public void ValidateClickTestingOfRemoteDesktopPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Remote Desktop page");
		VDeskAction vDeskAction = new VDeskAction(driver);
		new LoginAction(driver).logoutLogin();
		vDeskAction.GoToVDeskPage();
		vDeskAction.GoToRemoteDesktopPage();
		
	}
	/*
	 * Check click testing of Server Details Page
	 */
	@Test(priority=12)
	public void ValidateClickTestingOfServerDetailsPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Server Details page");
		VDeskAction vDeskAction = new VDeskAction(driver);
		new LoginAction(driver).logoutLogin();
		vDeskAction.GoToVDeskPage();
		vDeskAction.GoToServerDetailsPage();
		
	}
	/*
	 * Check click testing of Server Roles Page
	 */
	@Test(priority=13)
	public void ValidateClickTestingOfServerRolesPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Server Roles page");
		VDeskAction vDeskAction = new VDeskAction(driver);
		new LoginAction(driver).logoutLogin();
		vDeskAction.GoToVDeskPage();
		vDeskAction.GoToServerRolesPage();
		
	}
	/*
	 * Check click testing of Server Groups Page
	 */
	@Test(priority=14)
	public void ValidateClickTestingOfServerGroupsPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Server Groups page");
		VDeskAction vDeskAction = new VDeskAction(driver);
		new LoginAction(driver).logoutLogin();
		vDeskAction.GoToVDeskPage();
		vDeskAction.GoToServerGroupsPage();
	}
}
