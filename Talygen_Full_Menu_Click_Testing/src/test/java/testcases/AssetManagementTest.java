package testcases;

import static reporting.ComplexReportFactory.getTest;

import org.testng.annotations.Test;

import action.AssetManagementAstion;
import action.LoginAction;
import utils.WebTestBase;

public class AssetManagementTest extends WebTestBase{
	static String Screenname = "<b>Group List</b>"; 
	/*
	 * Check click testing of Group List Page
	 */
	@Test(priority=0)
	public void ValidateClickTestingOfGroupListPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Group List");
		AssetManagementAstion assetManagementAstion = new AssetManagementAstion(driver);
		new LoginAction(driver).logoutLogin();
		assetManagementAstion.GoToAssetManagementPage();
		assetManagementAstion.GoToGroupListPage();
	}
	/* Test script for checking Click Testing of Return Product  Page */
	@Test(priority=1)
	public void ValidateClickTestingOfReturnListPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Product Return");
		AssetManagementAstion assetManagementAstion = new AssetManagementAstion(driver);
		new LoginAction(driver).logoutLogin();
		assetManagementAstion.GoToAssetManagementPage();
		assetManagementAstion.GoToRerturnListPage();
	}
	/* Test script for checking Click Testing of Missing Product Page */
	@Test(priority=2)
	public void ValidateClickTestingOfMissingProductPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Misssing Product");
		AssetManagementAstion assetManagementAstion = new AssetManagementAstion(driver);
		new LoginAction(driver).logoutLogin();
		assetManagementAstion.GoToAssetManagementPage();
		assetManagementAstion.GoToMissingProductPage();
	}
	/* Test script for checking Click Testing of Products Scan Summary Page */
	@Test(priority=3)
	public void ValidateClickTestingOfProductsScanSummaryPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Products Scan Summary");
		AssetManagementAstion assetManagementAstion = new AssetManagementAstion(driver);
		new LoginAction(driver).logoutLogin();
		assetManagementAstion.GoToAssetManagementPage();
		assetManagementAstion.GoToProductsScanSummaryPage();
	}
	/* Test script for checking Click Testing of RFID Asset Listing Page */
	@Test(priority=4)
	public void ValidateClickTestingOfRFIDAssetListingPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of RFID Asset Listing");
		AssetManagementAstion assetManagementAstion = new AssetManagementAstion(driver);
		new LoginAction(driver).logoutLogin();
		assetManagementAstion.GoToAssetManagementPage();
		assetManagementAstion.GoToRFIDAssetListingPage();
	}
	/* Test script for checking Click Testing of Scanned Items Page */
	@Test(priority=5)
	public void ValidateClickTestingOfScannedItemsPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Scanned Items");
		AssetManagementAstion assetManagementAstion = new AssetManagementAstion(driver);
		new LoginAction(driver).logoutLogin();
		assetManagementAstion.GoToAssetManagementPage();
		assetManagementAstion.GoToScennedItemsPage();
	}
	/* Test script for checking Click Testing of Scanned Items Page */
	@Test(priority=6)
	public void ValidateClickTestingOfScannedItemsStatusPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Scanned Items Status");
		AssetManagementAstion assetManagementAstion = new AssetManagementAstion(driver);
		new LoginAction(driver).logoutLogin();
		assetManagementAstion.GoToAssetManagementPage();
		assetManagementAstion.GoToScennedItemsStatusPage();
	}
	/* Test script for checking Click Testing of Scanned Items Page */
	@Test(priority=7)
	public void ValidateClickTestingOfManageProductPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Managed Product");
		AssetManagementAstion assetManagementAstion = new AssetManagementAstion(driver);
		new LoginAction(driver).logoutLogin();
		assetManagementAstion.GoToAssetManagementPage();
		assetManagementAstion.GoToManageProductPage();
	}
	/* Test script for checking Click Testing of  Product Write-Off Page */
	@Test(priority=8)
	public void ValidateClickTestingOfProductWriteOffPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Product Write Off");
		AssetManagementAstion assetManagementAstion = new AssetManagementAstion(driver);
		new LoginAction(driver).logoutLogin();
		assetManagementAstion.GoToAssetManagementPage();
		assetManagementAstion.GoToProductWriteOffPage();
	}
	/* Test script for checking Click Testing of My Product Page */
	@Test(priority=9)
	public void ValidateClickTestingOfMyProductPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of My Product");
		AssetManagementAstion assetManagementAstion = new AssetManagementAstion(driver);
		new LoginAction(driver).logoutLogin();
		assetManagementAstion.GoToAssetManagementPage();
		assetManagementAstion.GoToMyProductPage();
	}
	/* Test script for checking Click Testing of Product ReportPage */
	@Test(priority=10)
	public void ValidateClickTestingOfProductReportPage()                                         
	{
		test=getTest(Screenname + ": Validation Check of click testing of Product Report");
		AssetManagementAstion assetManagementAstion = new AssetManagementAstion(driver);
		new LoginAction(driver).logoutLogin();
		assetManagementAstion.GoToAssetManagementPage();
		assetManagementAstion.GoToProductReportPage();
	}
	/* Test script for checking Click Testing of Product Assignment */
	@Test(priority=11)
	public void ValidateClickTestingOfProductAssignmentPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Product Assignment");
		AssetManagementAstion assetManagementAstion = new AssetManagementAstion(driver);
		new LoginAction(driver).logoutLogin();
		assetManagementAstion.GoToAssetManagementPage();
		assetManagementAstion.GoToProductAssignmentPage();
	}
	/* Test script for checking Click Testing of Product Container */
	@Test(priority=12)
	public void ValidateClickTestingOfProductContainerPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Product Container");
		AssetManagementAstion assetManagementAstion = new AssetManagementAstion(driver);
		new LoginAction(driver).logoutLogin();
		assetManagementAstion.GoToAssetManagementPage();
		assetManagementAstion.GoToProductContainerPage();
	}
	/* Test script for checking Click Testing of Product Type */
	@Test(priority=13)
	public void ValidateClickTestingOfProductTyperPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Product Type");
		AssetManagementAstion assetManagementAstion = new AssetManagementAstion(driver);
		new LoginAction(driver).logoutLogin();
		assetManagementAstion.GoToAssetManagementPage();
		assetManagementAstion.GoToProductTypePage();
	}
	/* Test script for checking Click Testing of Dashboard */
	@Test(priority=14)
	public void ValidateClickTestingOfDashboardPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Dashboard");
		AssetManagementAstion assetManagementAstion = new AssetManagementAstion(driver);
		new LoginAction(driver).logoutLogin();
		assetManagementAstion.GoToAssetManagementPage();
		assetManagementAstion.GoToAssetManagementDashboard();
	}
}
