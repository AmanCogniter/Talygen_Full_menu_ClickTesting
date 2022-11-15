package testcases;

import static reporting.ComplexReportFactory.getTest;

import org.testng.annotations.Test;

import action.BillingAction;
import action.LoginAction;
import utils.WebTestBase;

public class BillingTest extends WebTestBase{
	static String Screenname = "<b>Automate Flag Processing</b>"; 
	/*
	 * Check click testing of Automate Flag Processing Page
	 */
	@Test(priority=0)
	public void ValidateClickTestingOfAutomateFlagProcessingPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Automate Flag Processing");
		BillingAction billingAction = new BillingAction(driver);
		new LoginAction(driver).logoutLogin();
		billingAction.GoToBillingPage();
		billingAction.GoToAutomateFlagProcessingPage();
	}
	/* Test script for checking Click Testing of Billing Rule  Page */
	@Test(priority=1)
	public void ValidateClickTestingOfBillingRulePage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Billing Rule");
		BillingAction billingAction = new BillingAction(driver);
		new LoginAction(driver).logoutLogin();
		billingAction.GoToBillingPage();
		billingAction.GoToBillingRulePage();
	}
	/* Test script for checking Click Testing of Billing Service  Page */
	@Test(priority=2)
	public void ValidateClickTestingOfBillingServicePage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Billing Service");
		BillingAction billingAction = new BillingAction(driver);
		new LoginAction(driver).logoutLogin();
		billingAction.GoToBillingPage();
		billingAction.GoToBillingServicePage();
	}
	/* Test script for checking Click Testing of Billing Setup  Page */
	@Test(priority=3)
	public void ValidateClickTestingOfBillingSetupPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Billing Setup");
		BillingAction billingAction = new BillingAction(driver);
		new LoginAction(driver).logoutLogin();
		billingAction.GoToBillingPage();
		billingAction.GoToBillingSetupPage();
	}
	/* Test script for checking Click Testing of Billing Setup  Page */
	@Test(priority=4)
	public void ValidateClickTestingOfFlagRecordsPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Flag Records");
		BillingAction billingAction = new BillingAction(driver);
		new LoginAction(driver).logoutLogin();
		billingAction.GoToBillingPage();
		billingAction.GoToFlagRecordsPage();
	}
	/* Test script for checking Click Testing of Billing Setup  Page */
	@Test(priority=5)
	public void ValidateClickTestingOfClientReportPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of client report");
		BillingAction billingAction = new BillingAction(driver);
		new LoginAction(driver).logoutLogin();
		billingAction.GoToBillingPage();
		billingAction.GoToClientReportPage();
	}
	/* Test script for checking Click Testing of Add new Invoice  Page */
	@Test(priority=6)
	public void ValidateClickTestingOfAddInvoicePage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of add new invoice");
		BillingAction billingAction = new BillingAction(driver);
		new LoginAction(driver).logoutLogin();
		billingAction.GoToBillingPage();
		billingAction.GoToAddNewInvoicePage();
	}
	/* Test script for checking Click Testing of Import Invoice  Page */
	@Test(priority=7)
	public void ValidateClickTestingOfImportInvoicePage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of import invoice");
		BillingAction billingAction = new BillingAction(driver);
		new LoginAction(driver).logoutLogin();
		billingAction.GoToBillingPage();
		billingAction.GoToImportInvoicePage();
	}
	/* Test script for checking Click Testing of Invoice  Page */
	@Test(priority=8)
	public void ValidateClickTestingOfInvoicePage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of import invoice");
		BillingAction billingAction = new BillingAction(driver);
		new LoginAction(driver).logoutLogin();
		billingAction.GoToBillingPage();
		billingAction.GoToInvoicePage();
	}
	/* Test script for checking Click Testing of Invoice report  Page */
	@Test(priority=9)
	public void ValidateClickTestingOfInvoiceReportPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of invoice report");
		BillingAction billingAction = new BillingAction(driver);
		new LoginAction(driver).logoutLogin();
		billingAction.GoToBillingPage();
		billingAction.GoToInvoiceReportPage();
	}
	/* Test script for checking Click Testing of Process & Reprocess Charges  Page */
	@Test(priority=10)
	public void ValidateClickTestingOfProcessAndReprocessChargesPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Process & Reprocess Charges");
		BillingAction billingAction = new BillingAction(driver);
		new LoginAction(driver).logoutLogin();
		billingAction.GoToBillingPage();
		billingAction.GoToProcessAndReprocessChargesPage();
	}
	/* Test script for checking Click Testing of view hoistory  Page */
	@Test(priority=11)
	public void ValidateClickTestingOfViewHistoryPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of View History");
		BillingAction billingAction = new BillingAction(driver);
		new LoginAction(driver).logoutLogin();
		billingAction.GoToBillingPage();
		billingAction.GoToViewRateSchedulePage();
	}
	/* Test script for checking Click Testing of Received Invoice  Page */
	@Test(priority=12)
	public void ValidateClickTestingOfReceivedInvoicePage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Received Invoice");
		BillingAction billingAction = new BillingAction(driver);
		new LoginAction(driver).logoutLogin();
		billingAction.GoToBillingPage();
		billingAction.GoToReceivedInvoicePage();
	}
}
