package testcases;

import static reporting.ComplexReportFactory.getTest;

import org.testng.annotations.Test;

import action.CrmAction;
import action.DisplayScreenAction;
import action.LoginAction;
import utils.WebTestBase;

public class DisplayScreenTest extends WebTestBase{
	static String Screenname = "<b>Display Screen</b>"; 
	/*
	 * Check click testing of Countre Page
	 */
	@Test(priority=0)
	public void ValidateClickTestingOfCounterPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Counter page");
		DisplayScreenAction displayScreenAction = new DisplayScreenAction(driver);
		new LoginAction(driver).logoutLogin();
		displayScreenAction.GoToDisplayScreenPage();
		displayScreenAction.GoToCounterPage();
		
	}
	@Test(priority=1)
	public void ValidateClickTestingOfTokenPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Token page");
		DisplayScreenAction displayScreenAction = new DisplayScreenAction(driver);
		new LoginAction(driver).logoutLogin();
		displayScreenAction.GoToDisplayScreenPage();
		displayScreenAction.GoToTokenPage();
		
	}
}
