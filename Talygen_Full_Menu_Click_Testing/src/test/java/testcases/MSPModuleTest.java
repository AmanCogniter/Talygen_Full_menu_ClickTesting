package testcases;

import static reporting.ComplexReportFactory.getTest;

import org.testng.annotations.Test;

import action.LoginAction;
import action.MSPModuleAction;
import utils.WebTestBase;

public class MSPModuleTest extends WebTestBase{
	static String Screenname = "<b>MSP Module</b>"; 
	/*
	 * Check click testing of Add Packages Page
	 */
	@Test(priority=0)
	public void ValidateClickTestingOfAddPackagesPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Add Packages for MSP ModulePage");
		MSPModuleAction mSPModuleAction = new MSPModuleAction(driver);
		new LoginAction(driver).logoutLogin();
		mSPModuleAction.GoToMSPModulePage();
		mSPModuleAction.GoToAddPackagesPage();
		
	}
	/*
	 * Check click testing of Add Subscription Page
	 */
	@Test(priority=1)
	public void ValidateClickTestingOfAddSubscriptionPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Add Subscription for MSP ModulePage");
		MSPModuleAction mSPModuleAction = new MSPModuleAction(driver);
		new LoginAction(driver).logoutLogin();
		mSPModuleAction.GoToMSPModulePage();
		mSPModuleAction.GoToAddSubscriptionPage();
		
	}
	/*
	 * Check click testing of Manage Packages Page
	 */
	@Test(priority=2)
	public void ValidateClickTestingOfManagePackagesPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Manage Packages for MSP ModulePage");
		MSPModuleAction mSPModuleAction = new MSPModuleAction(driver);
		new LoginAction(driver).logoutLogin();
		mSPModuleAction.GoToMSPModulePage();
		mSPModuleAction.GoToManagePackagesPage();
		
	}
	/*
	 * Check click testing of Manage Subscription Page
	 */
	@Test(priority=3)
	public void ValidateClickTestingOfManageSubscriptionPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Manage Subscription for MSP ModulePage");
		MSPModuleAction mSPModuleAction = new MSPModuleAction(driver);
		new LoginAction(driver).logoutLogin();
		mSPModuleAction.GoToMSPModulePage();
		mSPModuleAction.GoToManageSubscriptionPage();
		
	}
}
