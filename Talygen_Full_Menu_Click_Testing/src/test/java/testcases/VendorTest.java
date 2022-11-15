package testcases;

import static reporting.ComplexReportFactory.getTest;

import org.testng.annotations.Test;

import action.LoginAction;
import action.VendorAction;
import utils.WebTestBase;

public class VendorTest extends WebTestBase{
	static String Screenname = "<b>Vendor</b>"; 
	/*
	 * Check click testing of Vendor Page
	 */
	@Test(priority=0)
	public void ValidateClickTestingOfTrainingPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Service ");
		VendorAction vendorAction = new VendorAction(driver);
		new LoginAction(driver).logoutLogin();
		vendorAction.GoToVendorPage();
		vendorAction.GoToServicePage();
		
	}
	/*
	 * Check click testing of Vendor Listing Page
	 */
	@Test(priority=1)
	public void ValidateClickTestingOfVendorListingPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Vendor Listing page");
		VendorAction vendorAction = new VendorAction(driver);
		new LoginAction(driver).logoutLogin();
		vendorAction.GoToVendorPage();
		vendorAction.GoToVendorListingePage();
		
	}
}
