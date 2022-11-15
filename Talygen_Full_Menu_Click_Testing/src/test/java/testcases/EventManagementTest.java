package testcases;

import static reporting.ComplexReportFactory.getTest;

import org.testng.annotations.Test;

import action.EventManagementAction;
import action.LoginAction;
import utils.WebTestBase;

public class EventManagementTest extends WebTestBase{
	static String Screenname = "<b>Event Management</b>"; 
	/*
	 * Check click testing of Calendar Page
	 */
	@Test(priority=0)
	public void ValidateClickTestingOfCalendarPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Calendar for Event Management");
		EventManagementAction eventManagementAction = new EventManagementAction(driver);
		new LoginAction(driver).logoutLogin();
		eventManagementAction.GoToEventManagementPage();
		eventManagementAction.GoToCalendarPage();
		
	}
	@Test(priority=1)
	public void ValidateClickTestingOfGoogleCalendarPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Google Calendar for Event Management");
		EventManagementAction eventManagementAction = new EventManagementAction(driver);
		new LoginAction(driver).logoutLogin();
		eventManagementAction.GoToEventManagementPage();
		eventManagementAction.GoToGoogleCalendarPage();
		
	}
	@Test(priority=2)
	public void ValidateClickTestingOfEventManagementPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of  Event Management Page");
		EventManagementAction eventManagementAction = new EventManagementAction(driver);
		new LoginAction(driver).logoutLogin();
		eventManagementAction.GoToEventManagementPage();
		eventManagementAction.GoToeventManagementPage();
		
	}
	@Test(priority=3)
	public void ValidateClickTestingOfManageVenuePage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Manage Venue Page");
		EventManagementAction eventManagementAction = new EventManagementAction(driver);
		new LoginAction(driver).logoutLogin();
		eventManagementAction.GoToEventManagementPage();
		eventManagementAction.GoToManageVenuePage();
		
	}
	@Test(priority=4)
	public void ValidateClickTestingOfUserAvailabilityPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of User Availability Page");
		EventManagementAction eventManagementAction = new EventManagementAction(driver);
		new LoginAction(driver).logoutLogin();
		eventManagementAction.GoToEventManagementPage();
		eventManagementAction.GoToUserAvailabilityPage();
		
	}
	@Test(priority=4)
	public void ValidateClickTestingOfDashBoardPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of DashBoard Page");
		EventManagementAction eventManagementAction = new EventManagementAction(driver);
		new LoginAction(driver).logoutLogin();
		eventManagementAction.GoToEventManagementPage();
		eventManagementAction.GoToDashBoardPage();
		
	}
}
