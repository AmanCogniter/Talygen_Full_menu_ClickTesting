package testcases;

import static reporting.ComplexReportFactory.getTest;

import org.testng.annotations.Test;

import action.FsmAction;
import action.LoginAction;
import utils.WebTestBase;

public class FsmTest extends WebTestBase{
	static String Screenname = "<b>FSM</b>"; 
	/*
	 * Check click testing of Add Ticket Page
	 */
	@Test(priority=0)
	public void ValidateClickTestingOfAddTicketPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Add Ticket for FSM");
		FsmAction fsmAction = new FsmAction(driver);
		new LoginAction(driver).logoutLogin();
		fsmAction.GoToFSMPage();
		fsmAction.GoToAddTicketPage();
		
	}
	@Test(priority=1)
	public void ValidateClickTestingOfCallCenterSyncStatusPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Call Center Sync Status for FSM");
		FsmAction fsmAction = new FsmAction(driver);
		new LoginAction(driver).logoutLogin();
		fsmAction.GoToFSMPage();
		fsmAction.GoToCallCenterSyncStatusPage();
		
	}
	//@Test(priority=2)
	public void ValidateClickTestingOfConnectorPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Connector for FSM");
		FsmAction fsmAction = new FsmAction(driver);
		new LoginAction(driver).logoutLogin();
		fsmAction.GoToFSMPage();
		fsmAction.CheckGoToConnectorPage();
		
	}
	@Test(priority=3)
	public void ValidateClickTestingOfFieldServiceTicketPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Field Service Ticket for FSM");
		FsmAction fsmAction = new FsmAction(driver);
		new LoginAction(driver).logoutLogin();
		fsmAction.GoToFSMPage();
		fsmAction.GoToFieldServiceTicketPage();
		
	}
	@Test(priority=4)
	public void ValidateClickTestingOfFormBuilderPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Form Builder for FSM");
		FsmAction fsmAction = new FsmAction(driver);
		new LoginAction(driver).logoutLogin();
		fsmAction.GoToFSMPage();
		fsmAction.GoToFormBuilderPage();
		
	}
	@Test(priority=5)
	public void ValidateClickTestingOfFSMReportPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of FSM Report for FSM");
		FsmAction fsmAction = new FsmAction(driver);
		new LoginAction(driver).logoutLogin();
		fsmAction.GoToFSMPage();
		fsmAction.GoToFSMReportPage();
		
	}
	@Test(priority=6)
	public void ValidateClickTestingOfManageMapConfigurationPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Manage Map Configuration for FSM");
		FsmAction fsmAction = new FsmAction(driver);
		new LoginAction(driver).logoutLogin();
		fsmAction.GoToFSMPage();
		fsmAction.GoToManageMapConfigurationPage();
		
	}
	@Test(priority=7)
	public void ValidateClickTestingOfMapExtentPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Map Extent for FSM");
		FsmAction fsmAction = new FsmAction(driver);
		new LoginAction(driver).logoutLogin();
		fsmAction.GoToFSMPage();
		fsmAction.GoToMapExtentPage();
		
	}
	@Test(priority=8)
	public void ValidateClickTestingOfRuleEnginePage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Rule Engine for FSM");
		FsmAction fsmAction = new FsmAction(driver);
		new LoginAction(driver).logoutLogin();
		fsmAction.GoToFSMPage();
		fsmAction.GoToRuleEnginePage();
		
	}
	@Test(priority=9)
	public void ValidateClickTestingOfServiceAppointmentPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Service Appointment for FSM");
		FsmAction fsmAction = new FsmAction(driver);
		new LoginAction(driver).logoutLogin();
		fsmAction.GoToFSMPage();
		fsmAction.GoToServiceAppointmentPage();
		
	}
	@Test(priority=10)
	public void ValidateClickTestingOfServiceCrewPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Service Crew for FSM");
		FsmAction fsmAction = new FsmAction(driver);
		new LoginAction(driver).logoutLogin();
		fsmAction.GoToFSMPage();
		fsmAction.GoToServiceCrewPage();
		
	}
	@Test(priority=11)
	public void ValidateClickTestingOfServiceResourcePage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Service Resource for FSM");
		FsmAction fsmAction = new FsmAction(driver);
		new LoginAction(driver).logoutLogin();
		fsmAction.GoToFSMPage();
		fsmAction.GoToServiceResourcePage();
		
	}
	@Test(priority=12)
	public void ValidateClickTestingOfServiceTerritoryePage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Service Territory for FSM");
		FsmAction fsmAction = new FsmAction(driver);
		new LoginAction(driver).logoutLogin();
		fsmAction.GoToFSMPage();
		fsmAction.GoToServiceTerritoryPage();
		
	}
	@Test(priority=13)
	public void ValidateClickTestingOfTechTrackingPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Tech Tracking for FSM");
		FsmAction fsmAction = new FsmAction(driver);
		new LoginAction(driver).logoutLogin();
		fsmAction.GoToFSMPage();
		fsmAction.GoToTechTrackingPage();
		
	}
	@Test(priority=14)
	public void ValidateClickTestingOfTicketingPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Ticketing for FSM");
		FsmAction fsmAction = new FsmAction(driver);
		new LoginAction(driver).logoutLogin();
		fsmAction.GoToFSMPage();
		fsmAction.GoToTicketingPage();
		
	}
	@Test(priority=15)
	public void ValidateClickTestingOfTransformPendingPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Transform Pending for FSM");
		FsmAction fsmAction = new FsmAction(driver);
		new LoginAction(driver).logoutLogin();
		fsmAction.GoToFSMPage();
		fsmAction.GoToTransformPendingPage();
		
	}
	@Test(priority=16)
	public void ValidateClickTestingOfunassignedTicketPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of unassigned ticket for FSM");
		FsmAction fsmAction = new FsmAction(driver);
		new LoginAction(driver).logoutLogin();
		fsmAction.GoToFSMPage();
		fsmAction.GoToFieldUnassignedTicketsPage();
		
	}
	@Test(priority=17)
	public void ValidateClickTestingOfWorkTypeListingPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Work Type Listing for FSM");
		FsmAction fsmAction = new FsmAction(driver);
		new LoginAction(driver).logoutLogin();
		fsmAction.GoToFSMPage();
		fsmAction.GoToWorkTypeListingPage();
		
	}
	@Test(priority=18)
	public void ValidateClickTestingOfZoneManagementPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Zone Management for FSM");
		FsmAction fsmAction = new FsmAction(driver);
		new LoginAction(driver).logoutLogin();
		fsmAction.GoToFSMPage();
		fsmAction.GoToZoneManagementPage();
		
	}
	@Test(priority=19)
	public void ValidateClickTestingOfDashBoardPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of DashBoard for FSM");
		FsmAction fsmAction = new FsmAction(driver);
		new LoginAction(driver).logoutLogin();
		fsmAction.GoToFSMPage();
		fsmAction.GoToDashBoardPage();
		
	}
}
