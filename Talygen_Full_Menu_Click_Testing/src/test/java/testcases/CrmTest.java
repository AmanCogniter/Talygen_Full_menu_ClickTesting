package testcases;

import static reporting.ComplexReportFactory.getTest;

import org.testng.annotations.Test;

import action.CompanySetupAction;
import action.CrmAction;
import action.LoginAction;
import utils.WebTestBase;

public class CrmTest extends WebTestBase{
	static String Screenname = "<b>Accounts</b>"; 
	/*
	 * Check click testing of Accounts Page
	 */
	@Test(priority=0)
	public void ValidateClickTestingOfAccountsPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Accounts page");
		CrmAction crmAction = new CrmAction(driver);
		new LoginAction(driver).logoutLogin();
		crmAction.GoToCRMPage();
		crmAction.GoToAccountsPage();
		
	}
	/*
	 * Check click testing of Brand Page
	 */
	@Test(priority=1)
	public void ValidateClickTestingOfBrandPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Brand page");
		CrmAction crmAction = new CrmAction(driver);
		new LoginAction(driver).logoutLogin();
		crmAction.GoToCRMPage();
		crmAction.GoToBrandPage();
		
	}
	/*
	 * Check click testing of Campaign Page
	 */
	@Test(priority=2)
	public void ValidateClickTestingOfCampaignPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Campaign page");
		CrmAction crmAction = new CrmAction(driver);
		new LoginAction(driver).logoutLogin();
		crmAction.GoToCRMPage();
		crmAction.GoToCampaignPage();
		
	}
	/*
	 * Check click testing of Communication Page
	 */
	@Test(priority=3)
	public void ValidateClickTestingOfCommunicationPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Communication page");
		CrmAction crmAction = new CrmAction(driver);
		new LoginAction(driver).logoutLogin();
		crmAction.GoToCRMPage();
		crmAction.GoToCommunicationPage();
		
	}
	/*
	 * Check click testing of Contacts Page
	 */
	@Test(priority=4)
	public void ValidateClickTestingOfContactsPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Contacts page");
		CrmAction crmAction = new CrmAction(driver);
		new LoginAction(driver).logoutLogin();
		crmAction.GoToCRMPage();
		crmAction.GoToContactPage();
		
	}
	/*
	 * Check click testing of Contracts Page
	 */
	@Test(priority=5)
	public void ValidateClickTestingOfContractsPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Contracts page");
		CrmAction crmAction = new CrmAction(driver);
		new LoginAction(driver).logoutLogin();
		crmAction.GoToCRMPage();
		crmAction.GoToContractPage();
		
	}
	/*
	 * Check click testing of CRM Report Page
	 */
	@Test(priority=6)
	public void ValidateClickTestingOfCRMReportPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of CRM Report page");
		CrmAction crmAction = new CrmAction(driver);
		new LoginAction(driver).logoutLogin();
		crmAction.GoToCRMPage();
		crmAction.GoToCRMReportPage();
		
	}
	/*
	 * Check click testing of Deals Page
	 */
	@Test(priority=7)
	public void ValidateClickTestingOfDEalsPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Deals page");
		CrmAction crmAction = new CrmAction(driver);
		new LoginAction(driver).logoutLogin();
		crmAction.GoToCRMPage();
		crmAction.GoToDealsPage();
		
	}
	/*
	 * Check click testing of Goods Inward Page
	 */
	@Test(priority=8)
	public void ValidateClickTestingOfgoodsInwardPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Goods Inward page");
		CrmAction crmAction = new CrmAction(driver);
		new LoginAction(driver).logoutLogin();
		crmAction.GoToCRMPage();
		crmAction.GoToGoodsInwardPage();
		
	}
	/*
	 * Check click testing of Invoice Page
	 */
	@Test(priority=9)
	public void ValidateClickTestingOfInvoicePage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Invoice page");
		CrmAction crmAction = new CrmAction(driver);
		new LoginAction(driver).logoutLogin();
		crmAction.GoToCRMPage();
		crmAction.GoToInvoicePage();
		
	}
	/*
	 * Check click testing of Product Type Page
	 */
	@Test(priority=10)
	public void ValidateClickTestingOfProductTypePage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Product Type page");
		CrmAction crmAction = new CrmAction(driver);
		new LoginAction(driver).logoutLogin();
		crmAction.GoToCRMPage();
		crmAction.GoToProductTypePage();
		
	}
	/*
	 * Check click testing of Lead Page
	 */
	@Test(priority=11)
	public void ValidateClickTestingOfLeadPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Lead page");
		CrmAction crmAction = new CrmAction(driver);
		new LoginAction(driver).logoutLogin();
		crmAction.GoToCRMPage();
		crmAction.GoToLeadPage();
		
	}
	/*
	 * Check click testing of Manage Proiduct Page
	 */
	@Test(priority=12)
	public void ValidateClickTestingOfManageProductPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Manage Product page");
		CrmAction crmAction = new CrmAction(driver);
		new LoginAction(driver).logoutLogin();
		crmAction.GoToCRMPage();
		crmAction.GoToManageProductPage();
		
	}
	/*
	 * Check click testing of Price Book Page
	 */
	@Test(priority=13)
	public void ValidateClickTestingOfPriceBookPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Price Book page");
		CrmAction crmAction = new CrmAction(driver);
		new LoginAction(driver).logoutLogin();
		crmAction.GoToCRMPage();
		crmAction.GoToPriceBookPage();
		
	}
	/*
	 * Check click testing of Product Page
	 */
	@Test(priority=14)
	public void ValidateClickTestingOfProductPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Product page");
		CrmAction crmAction = new CrmAction(driver);
		new LoginAction(driver).logoutLogin();
		crmAction.GoToCRMPage();
		crmAction.GoToProductPage();
		
	}
	/*
	 * Check click testing of Purchase Order Page
	 */
	@Test(priority=15)
	public void ValidateClickTestingOfPurchaseOrderPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Purchase Order page");
		CrmAction crmAction = new CrmAction(driver);
		new LoginAction(driver).logoutLogin();
		crmAction.GoToCRMPage();
		crmAction.GoToPurchaseOrderPage();
		
	}
	/*
	 * Check click testing of Quote Page
	 */
	@Test(priority=16)
	public void ValidateClickTestingOfQuotePage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Quote page");
		CrmAction crmAction = new CrmAction(driver);
		new LoginAction(driver).logoutLogin();
		crmAction.GoToCRMPage();
		crmAction.GoToQuotePage();
		
	}
	/*
	 * Check click testing of Sales Order Page
	 */
	@Test(priority=17)
	public void ValidateClickTestingOfSalesOrderPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Order page");
		CrmAction crmAction = new CrmAction(driver);
		new LoginAction(driver).logoutLogin();
		crmAction.GoToCRMPage();
		crmAction.GoToSalesOrderPage();
		
	}
	/*
	 * Check click testing of Stages Page
	 */
	@Test(priority=18)
	public void ValidateClickTestingOfStagesPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Stage page");
		CrmAction crmAction = new CrmAction(driver);
		new LoginAction(driver).logoutLogin();
		crmAction.GoToCRMPage();
		crmAction.GoToStagePage();
		
	}
	/*
	 * Check click testing of Vendor Page
	 */
	@Test(priority=19)
	public void ValidateClickTestingOfVendorPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Vendor page");
		CrmAction crmAction = new CrmAction(driver);
		new LoginAction(driver).logoutLogin();
		crmAction.GoToCRMPage();
		crmAction.GoToVendorPage();
		
	}
	
	
	
}
