package testcases;

import static reporting.ComplexReportFactory.getTest;

import org.testng.annotations.Test;

import action.GeneralAction;
import action.LoginAction;
import utils.WebTestBase;

public class GeneralTest extends WebTestBase{
	static String Screenname = "<b>General</b>"; 
	/*
	 * Check click testing of Add Report Page
	 */
	@Test(priority=0)
	public void ValidateClickTestingOfAddReportPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Add Report for General");
		GeneralAction generalAction = new GeneralAction(driver);
		new LoginAction(driver).logoutLogin();
		generalAction.GoToGeneralPage();
		generalAction.GoToAddReportPage();
		
	}
	@Test(priority=1)
	public void ValidateClickTestingOfAutoResponderPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Auto Responder for General");
		GeneralAction generalAction = new GeneralAction(driver);
		new LoginAction(driver).logoutLogin();
		generalAction.GoToGeneralPage();
		generalAction.GoToAutoResponderPage();
		
	}
	@Test(priority=2)
	public void ValidateClickTestingOfCustomFieldsPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Custom Fields for General");
		GeneralAction generalAction = new GeneralAction(driver);
		new LoginAction(driver).logoutLogin();
		generalAction.GoToGeneralPage();
		generalAction.GoToCustomFieldsPage();
		
	}
	@Test(priority=3)
	public void ValidateClickTestingOfCustomReportsPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Custom Reports for General");
		GeneralAction generalAction = new GeneralAction(driver);
		new LoginAction(driver).logoutLogin();
		generalAction.GoToGeneralPage();
		generalAction.GoToCustomReportsPage();
		
	}
	@Test(priority=4)
	public void ValidateClickTestingOfExternalLinkPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of External Link for General");
		GeneralAction generalAction = new GeneralAction(driver);
		new LoginAction(driver).logoutLogin();
		generalAction.GoToGeneralPage();
		generalAction.GoToExternalLinkPage();
		
	}
	@Test(priority=5)
	public void ValidateClickTestingOfPassportInformationPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Passport Information for General");
		GeneralAction generalAction = new GeneralAction(driver);
		new LoginAction(driver).logoutLogin();
		generalAction.GoToGeneralPage();
		generalAction.GoToPassportInformationPage();
		
	}
	@Test(priority=6)
	public void ValidateClickTestingOfManageLayoutPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Manage Layout for General");
		GeneralAction generalAction = new GeneralAction(driver);
		new LoginAction(driver).logoutLogin();
		generalAction.GoToGeneralPage();
		generalAction.GoToManageLayoutPage();
		
	}
	@Test(priority=7)
	public void ValidateClickTestingOfOrganizationChartPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Organization Chart for General");
		GeneralAction generalAction = new GeneralAction(driver);
		new LoginAction(driver).logoutLogin();
		generalAction.GoToGeneralPage();
		generalAction.GoToOrganizationChartPage();
		
	}
	@Test(priority=8)
	public void ValidateClickTestingOfProvisionalRightsPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Provisional Rights for General");
		GeneralAction generalAction = new GeneralAction(driver);
		new LoginAction(driver).logoutLogin();
		generalAction.GoToGeneralPage();
		generalAction.GoToProvisionalRightsPage();
		
	}
	@Test(priority=9)
	public void ValidateClickTestingOfRuleEnginePage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Rule Engine for General");
		GeneralAction generalAction = new GeneralAction(driver);
		new LoginAction(driver).logoutLogin();
		generalAction.GoToGeneralPage();
		generalAction.GoToRuleEnginePage();
		
	}
	@Test(priority=10)
	public void ValidateClickTestingOfStoragePage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Storage for General");
		GeneralAction generalAction = new GeneralAction(driver);
		new LoginAction(driver).logoutLogin();
		generalAction.GoToGeneralPage();
		generalAction.GoToStoragePage();
		
	}
	@Test(priority=11)
	public void ValidateClickTestingOfTagsPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Tags for General");
		GeneralAction generalAction = new GeneralAction(driver);
		new LoginAction(driver).logoutLogin();
		generalAction.GoToGeneralPage();
		generalAction.GoToTagsPage();
		
	}
	@Test(priority=12)
	public void ValidateClickTestingOfWorkingDayPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Working Day for General");
		GeneralAction generalAction = new GeneralAction(driver);
		new LoginAction(driver).logoutLogin();
		generalAction.GoToGeneralPage();
		generalAction.GoToWorkingDayPage();
		
	}
	@Test(priority=13)
	public void ValidateClickTestingOfWorkingWeekPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Working week for General");
		GeneralAction generalAction = new GeneralAction(driver);
		new LoginAction(driver).logoutLogin();
		generalAction.GoToGeneralPage();
		generalAction.GoToWorkingweekPage();
		
	}
}
