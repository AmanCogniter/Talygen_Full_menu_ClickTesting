package testcases;

import static reporting.ComplexReportFactory.getTest;

import org.testng.annotations.Test;

import action.IntegrationAction;
import action.LoginAction;
import utils.WebTestBase;

public class IntegrationTest extends WebTestBase{
	static String Screenname = "<b>Integration</b>"; 
	/*
	 * Check click testing of Basecamp Page
	 */
	@Test(priority=0)
	public void ValidateClickTestingOfBasecampPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Basecamp for Integration");
		IntegrationAction integrationAction = new IntegrationAction(driver);
		new LoginAction(driver).logoutLogin();
		integrationAction.GoToIntegrationPage();
		integrationAction.GoToBasecampPage();
		
	}
	/*
	 * Check click testing of Connector Page
	 */
	//@Test(priority=1)
	public void ValidateClickTestingOfConnectorPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Connector for Integration");
		IntegrationAction integrationAction = new IntegrationAction(driver);
		new LoginAction(driver).logoutLogin();
		integrationAction.GoToIntegrationPage();
		integrationAction.CheckGoToConnectorPage();
		
	}
	/*
	 * Check click testing of Email Page
	 */
	@Test(priority=2)
	public void ValidateClickTestingOfEmailPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Eamil for Integration");
		IntegrationAction integrationAction = new IntegrationAction(driver);
		new LoginAction(driver).logoutLogin();
		integrationAction.GoToIntegrationPage();
		integrationAction.CheckGoToEmailPage();
		
	}
	/*
	 * Check click testing of FreshBook Page
	 */
	@Test(priority=3)
	public void ValidateClickTestingOfFreshBookPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of FreshBook for Integration");
		IntegrationAction integrationAction = new IntegrationAction(driver);
		new LoginAction(driver).logoutLogin();
		integrationAction.GoToIntegrationPage();
		integrationAction.GoToFreshBookPage();
		
	}
	/*
	 * Check click testing of GPS Tracking Page
	 */
	@Test(priority=4)
	public void ValidateClickTestingOfGPSTrackingPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of GPS Tracking for Integration");
		IntegrationAction integrationAction = new IntegrationAction(driver);
		new LoginAction(driver).logoutLogin();
		integrationAction.GoToIntegrationPage();
		integrationAction.CheckGoToGPSTrackingPage();
		
	}
	/*
	 * Check click testing of IVR Page
	 */
	@Test(priority=5)
	public void ValidateClickTestingOfIVrPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of IVR for Integration");
		IntegrationAction integrationAction = new IntegrationAction(driver);
		new LoginAction(driver).logoutLogin();
		integrationAction.GoToIntegrationPage();
		integrationAction.CheckGoToIVRPage();
		
	}
	/*
	 * Check click testing of Microsoft Project Plan Page
	 */
	@Test(priority=6)
	public void ValidateClickTestingOfMicrosoftProjectPlanPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Microsoft Project Plan for Integration");
		IntegrationAction integrationAction = new IntegrationAction(driver);
		new LoginAction(driver).logoutLogin();
		integrationAction.GoToIntegrationPage();
		integrationAction.CheckGoToMicrosoftProjectPlanPage();
		
	}
	/*
	 * Check click testing of QuickBooks Page
	 */
	@Test(priority=7)
	public void ValidateClickTestingOfQuickBooksPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of QuickBooks for Integration");
		IntegrationAction integrationAction = new IntegrationAction(driver);
		new LoginAction(driver).logoutLogin();
		integrationAction.GoToIntegrationPage();
		integrationAction.CheckGoToQuickBooksPage();
		
	}
	/*
	 * Check click testing of Sales Force Page
	 */
	@Test(priority=8)
	public void ValidateClickTestingOfSalesForcePage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Sales Force for Integration");
		IntegrationAction integrationAction = new IntegrationAction(driver);
		new LoginAction(driver).logoutLogin();
		integrationAction.GoToIntegrationPage();
		integrationAction.CheckGoToSalesForcePage();
		
	}
	/*
	 * Check click testing of Trello Page
	 */
	@Test(priority=9)
	public void ValidateClickTestingOfTrelloPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Trello for Integration");
		IntegrationAction integrationAction = new IntegrationAction(driver);
		new LoginAction(driver).logoutLogin();
		integrationAction.GoToIntegrationPage();
		integrationAction.CheckGoToTrelloPage();
		
	}
	/*
	 * Check click testing of Twilio Page
	 */
	@Test(priority=10)
	public void ValidateClickTestingOfTwilioPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Twilio for Integration");
		IntegrationAction integrationAction = new IntegrationAction(driver);
		new LoginAction(driver).logoutLogin();
		integrationAction.GoToIntegrationPage();
		integrationAction.CheckGoToTwilioPage();
		
	}
	/*
	 * Check click testing of Unified Setup Page
	 */
	@Test(priority=11)
	public void ValidateClickTestingOfUnifiedSetupPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Unified Setup for Integration");
		IntegrationAction integrationAction = new IntegrationAction(driver);
		new LoginAction(driver).logoutLogin();
		integrationAction.GoToIntegrationPage();
		integrationAction.CheckGoToUnifiedSetupPage();
		
	}
}
