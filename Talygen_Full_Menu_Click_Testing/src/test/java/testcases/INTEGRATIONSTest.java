package testcases;

import static reporting.ComplexReportFactory.getTest;

import org.testng.annotations.Test;

import action.INTEGRATIONSAction;
import action.LoginAction;
import utils.WebTestBase;

public class INTEGRATIONSTest extends WebTestBase{
	static String Screenname = "<b>INTEGRATIONS</b>"; 
	/*
	 * Check click testing of Connector Page
	 */
	@Test(priority=3)
	public void ValidateClickTestingOfConnectorPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Connector page");
		INTEGRATIONSAction iNTEGRATIONSAction = new INTEGRATIONSAction(driver);
		new LoginAction(driver).logoutLogin();
		iNTEGRATIONSAction.GoToINTEGRATIONSPage();
		iNTEGRATIONSAction.CheckGoToConnectorPage();
		
	}
	/*
	 * Check click testing of GPS Tracking Page
	 */
	@Test(priority=1)
	public void ValidateClickTestingOfGPSTrackingPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of GPS Tracking page");
		INTEGRATIONSAction iNTEGRATIONSAction = new INTEGRATIONSAction(driver);
		new LoginAction(driver).logoutLogin();
		iNTEGRATIONSAction.GoToINTEGRATIONSPage();
		iNTEGRATIONSAction.CheckGoToGPSTrackingPage();
		
	}
	/*
	 * Check click testing of Twilio Page
	 */
	@Test(priority=2)
	public void ValidateClickTestingOfTwilioPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Twilio page");
		INTEGRATIONSAction iNTEGRATIONSAction = new INTEGRATIONSAction(driver);
		new LoginAction(driver).logoutLogin();
		iNTEGRATIONSAction.GoToINTEGRATIONSPage();
		iNTEGRATIONSAction.CheckGoToTwilioPage();
		
	}
}
