package testcases;

import static reporting.ComplexReportFactory.getTest;

import org.testng.annotations.Test;

import action.CompanySetupAction;
import action.LoginAction;
import utils.WebTestBase;

public class CompanySetUpTest extends WebTestBase{
	static String Screenname = "<b>Client</b>"; 
	/*
	 * Check click testing of Client Page
	 */
	@Test(priority=0)
	public void ValidateClickTestingOfClientPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Client page");
		CompanySetupAction companySetupAction = new CompanySetupAction(driver);
		new LoginAction(driver).logoutLogin();
		companySetupAction.GoToCompantSetupPage();
		companySetupAction.GoToClientPage();
		
	}
	/* Test script for checking Click Testing of Company Directory Page */
	@Test(priority=1)
	public void ValidateClickTestingOfCompanyDirectoryPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Company Directory page");
		CompanySetupAction companySetupAction = new CompanySetupAction(driver);
		new LoginAction(driver).logoutLogin();
		companySetupAction.GoToCompantSetupPage();
		companySetupAction.GoToCompanyDirectoryPage();
		
	}
	/* Test script for checking Click Testing of Company Setup Page */
	@Test(priority=2)
	public void ValidateClickTestingOfCompanySetupPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Company SetUp page");
		CompanySetupAction companySetupAction = new CompanySetupAction(driver);
		new LoginAction(driver).logoutLogin();
		companySetupAction.GoToCompantSetupPage();
		companySetupAction.GoToCompanysetupPage();
		
	}
	/* Test script for checking Click Testing of Configuration Page */
	@Test(priority=3)
	public void ValidateClickTestingOfConfigurationPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Configuration page");
		CompanySetupAction companySetupAction = new CompanySetupAction(driver);
		new LoginAction(driver).logoutLogin();
		companySetupAction.GoToCompantSetupPage();
		companySetupAction.GoToConfigurationPage();
		
	}
	/* Test script for checking Click Testing of Configuration Page */
	@Test(priority=4)
	public void ValidateClickTestingOfContextMenuPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of ContextMenu page");
		CompanySetupAction companySetupAction = new CompanySetupAction(driver);
		new LoginAction(driver).logoutLogin();
		companySetupAction.GoToCompantSetupPage();
		companySetupAction.GoToContextMenuPage();
		
	}
	/* Test script for checking Click Testing of HoliDay Bank Page */
	@Test(priority=5)
	public void ValidateClickTestingOfHoliDayBankPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of HoliDay Bank page");
		CompanySetupAction companySetupAction = new CompanySetupAction(driver);
		new LoginAction(driver).logoutLogin();
		companySetupAction.GoToCompantSetupPage();
		companySetupAction.GoToHolidayBankPage();
		
	}
	/* Test script for checking Click Testing of Manage Subscription Page */
	@Test(priority=6)
	public void ValidateClickTestingOfManageSubscriptionPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Manage Subscription page");
		CompanySetupAction companySetupAction = new CompanySetupAction(driver);
		new LoginAction(driver).logoutLogin();
		companySetupAction.GoToCompantSetupPage();
		companySetupAction.GoToManageSubscriptionPage();
		
	}
	/* Test script for checking Click Testing of Manage Tax Page */
	@Test(priority=7)
	public void ValidateClickTestingOfManageTaxPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Manage Tax page");
		CompanySetupAction companySetupAction = new CompanySetupAction(driver);
		new LoginAction(driver).logoutLogin();
		companySetupAction.GoToCompantSetupPage();
		companySetupAction.GoToManageTaxPage();
		
	}
	/* Test script for checking Click Testing of Resource Approval Page */
	@Test(priority=8)
	public void ValidateClickTestingOfResourceApprovalPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Resource Approval page");
		CompanySetupAction companySetupAction = new CompanySetupAction(driver);
		new LoginAction(driver).logoutLogin();
		companySetupAction.GoToCompantSetupPage();
		companySetupAction.GoToResourceApprovalPage();
		
	}
	/* Test script for checking Click Testing of Roles Page */
	@Test(priority=9)
	public void ValidateClickTestingOfRolesPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Roles page");
		CompanySetupAction companySetupAction = new CompanySetupAction(driver);
		new LoginAction(driver).logoutLogin();
		companySetupAction.GoToCompantSetupPage();
		companySetupAction.GoToRolesPage();
		
	}
	/* Test script for checking Click Testing of User Page */
	@Test(priority=10)
	public void ValidateClickTestingOfUserPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of User page");
		CompanySetupAction companySetupAction = new CompanySetupAction(driver);
		new LoginAction(driver).logoutLogin();
		companySetupAction.GoToCompantSetupPage();
		companySetupAction.GoToUserPage();
		
	}
	/* Test script for checking Click Testing of Search vendors Page */
	@Test(priority=11)
	public void ValidateClickTestingOfSearchVendorsPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Search Vendors page");
		CompanySetupAction companySetupAction = new CompanySetupAction(driver);
		new LoginAction(driver).logoutLogin();
		companySetupAction.GoToCompantSetupPage();
		companySetupAction.GoToSearchVendorsPage();
		
	}
}
