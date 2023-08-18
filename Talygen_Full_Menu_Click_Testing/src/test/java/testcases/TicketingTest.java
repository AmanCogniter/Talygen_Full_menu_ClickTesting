package testcases;

import static reporting.ComplexReportFactory.getTest;

import org.testng.annotations.Test;

import action.AppoitmentCalenderAction;
import action.FsmAction;
import action.LoginAction;
import action.TicketingAction;
import utils.WebTestBase;
/**
 * 
 * @author aanand
 *
 */
public class TicketingTest extends WebTestBase{
	static String Screenname = "<b>Ticketing</b>"; 
	/*
	 * Check click testing of Ticketing Sub module Page
	 */
	@Test(priority=0)
	public void ValidateClickTestingOfTicketingPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Ticketing");
		TicketingAction ticketingAction = new TicketingAction(driver);
		new LoginAction(driver).logoutLogin();
		ticketingAction.GoToTicketingPage();
		ticketingAction.GoToTicketingSubModulePage();
		
	}
	/*
	 * Check click testing of Add ticket Page
	 */
	@Test(priority=1)
	public void ValidateClickTestingOfAddTicketPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Add Ticket");
		TicketingAction ticketingAction = new TicketingAction(driver);
		new LoginAction(driver).logoutLogin();
		ticketingAction.GoToTicketingPage();
		ticketingAction.GoToAddTicketPage();
		
	}
	/*
	 * Check click testing of Unassigned ticket Page
	 */
	@Test(priority=2)
	public void ValidateClickTestingOfUnassignedTicketPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Unassigned Ticket");
		TicketingAction ticketingAction = new TicketingAction(driver);
		new LoginAction(driver).logoutLogin();
		ticketingAction.GoToTicketingPage();
		ticketingAction.GoToUnassignedTicketPage();
		
	}
	/*
	 * Check click testing of  Ticket Feedback Page
	 */
	@Test(priority=3)
	public void ValidateClickTestingOfTicketFeedbackPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Ticket Feedback");
		TicketingAction ticketingAction = new TicketingAction(driver);
		new LoginAction(driver).logoutLogin();
		ticketingAction.GoToTicketingPage();
		ticketingAction.GoToTicketFeedbackPage();
		
	}
	/*
	 * Check click testing of Canned Reply Page
	 */
	@Test(priority=4)
	public void ValidateClickTestingOfCannedReplyPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Canned Reply");
		TicketingAction ticketingAction = new TicketingAction(driver);
		new LoginAction(driver).logoutLogin();
		ticketingAction.GoToTicketingPage();
		ticketingAction.GoToCannedReplyPage();
		
	}
	/*
	 * Check click testing of Ticket Report Page
	 */
	@Test(priority=5)
	public void ValidateClickTestingOfTicketReportPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Ticket Report");
		TicketingAction ticketingAction = new TicketingAction(driver);
		new LoginAction(driver).logoutLogin();
		ticketingAction.GoToTicketingPage();
		ticketingAction.GoToTicketReportPage();
		
	}
	/*
	 * Check click testing of Manage Service Board Page
	 */
	@Test(priority=6)
	public void ValidateClickTestingOfManageServiceBoardPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Manage Service Board");
		TicketingAction ticketingAction = new TicketingAction(driver);
		new LoginAction(driver).logoutLogin();
		ticketingAction.GoToTicketingPage();
		ticketingAction.GoToManageServiceBoardPage();
		
	}
	/*
	 * Check click testing of Add ticket Group Page
	 */
	@Test(priority=7)
	public void ValidateClickTestingOfAddticketGroupPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Add ticket Group");
		TicketingAction ticketingAction = new TicketingAction(driver);
		new LoginAction(driver).logoutLogin();
		ticketingAction.GoToTicketingPage();
		ticketingAction.GoToAddticketGroupPage();
		
	}
	/*
	 * Check click testing of Ticket Group Page
	 */
	@Test(priority=8)
	public void ValidateClickTestingOfTicketGroupPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of  ticket Group");
		TicketingAction ticketingAction = new TicketingAction(driver);
		new LoginAction(driver).logoutLogin();
		ticketingAction.GoToTicketingPage();
		ticketingAction.GoToTicketGroupPage();
		
	}
	/*
	 * Check click testing of SLA Page
	 */
	@Test(priority=9)
	public void ValidateClickTestingOfSLAPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of SLA");
		TicketingAction ticketingAction = new TicketingAction(driver);
		new LoginAction(driver).logoutLogin();
		ticketingAction.GoToTicketingPage();
		ticketingAction.GoToSLAPage();
		
	}
	/*
	 * Check click testing of Knowledge Base Page
	 */
	@Test(priority=10)
	public void ValidateClickTestingOfKnowledgeBasePage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Knowledge Base");
		TicketingAction ticketingAction = new TicketingAction(driver);
		new LoginAction(driver).logoutLogin();
		ticketingAction.GoToTicketingPage();
		ticketingAction.GoToKnowledgeBasePage();
		
	}
	/*
	 * Check click testing of Manage Category Page
	 */
	@Test(priority=11)
	public void ValidateClickTestingOfManageCategoryPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Manage Category");
		TicketingAction ticketingAction = new TicketingAction(driver);
		new LoginAction(driver).logoutLogin();
		ticketingAction.GoToTicketingPage();
		ticketingAction.GoToManageCategoryPage();
		
	}
	/*
	 * Check click testing of My Articles Page
	 */
	@Test(priority=12)
	public void ValidateClickTestingOfMyArticlesPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of My Articles");
		TicketingAction ticketingAction = new TicketingAction(driver);
		new LoginAction(driver).logoutLogin();
		ticketingAction.GoToTicketingPage();
		ticketingAction.GoToMyArticlesPage();
		
	}
	/*
	 * Check click testing of Product Page
	 */
	@Test(priority=13)
	public void ValidateClickTestingOfProductPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Product");
		TicketingAction ticketingAction = new TicketingAction(driver);
		new LoginAction(driver).logoutLogin();
		ticketingAction.GoToTicketingPage();
		ticketingAction.GoToProductPage();
		
	}

	/* -------------FSM Test Script----------- */
	@Test(priority=14)
	public void ValidateClickTestingOfCallCenterSyncStatusPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Call Center Sync Status for FSM");
		FsmAction fsmAction = new FsmAction(driver);
		TicketingAction ticketingAction = new TicketingAction(driver);
		new LoginAction(driver).logoutLogin();
		ticketingAction.GoToTicketingPage();
		fsmAction.GoToCallCenterSyncStatusPage();
		
	}
	@Test(priority=15)
	public void ValidateClickTestingOfFormBuilderPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Form Builder for FSM");
		FsmAction fsmAction = new FsmAction(driver);
		TicketingAction ticketingAction = new TicketingAction(driver);
		new LoginAction(driver).logoutLogin();
		ticketingAction.GoToTicketingPage();
		fsmAction.GoToFormBuilderPage();
		
	}
	@Test(priority=16)
	public void ValidateClickTestingOfFSMReportPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of FSM Report for FSM");
		FsmAction fsmAction = new FsmAction(driver);
		TicketingAction ticketingAction = new TicketingAction(driver);
		new LoginAction(driver).logoutLogin();
		ticketingAction.GoToTicketingPage();
		fsmAction.GoToFSMReportPage();
		
	}
	@Test(priority=17)
	public void ValidateClickTestingOfManageMapConfigurationPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Manage Map Configuration for FSM");
		FsmAction fsmAction = new FsmAction(driver);
		TicketingAction ticketingAction = new TicketingAction(driver);
		new LoginAction(driver).logoutLogin();
		ticketingAction.GoToTicketingPage();
		fsmAction.GoToManageMapConfigurationPage();
		
	}
	@Test(priority=18)
	public void ValidateClickTestingOfMapExtentPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Map Extent for FSM");
		FsmAction fsmAction = new FsmAction(driver);
		TicketingAction ticketingAction = new TicketingAction(driver);
		new LoginAction(driver).logoutLogin();
		ticketingAction.GoToTicketingPage();
		fsmAction.GoToMapExtentPage();
		
	}
	@Test(priority=19)
	public void ValidateClickTestingOfServiceAppointmentPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Service Appointment for FSM");
		FsmAction fsmAction = new FsmAction(driver);
		TicketingAction ticketingAction = new TicketingAction(driver);
		new LoginAction(driver).logoutLogin();
		ticketingAction.GoToTicketingPage();
		fsmAction.GoToServiceAppointmentPage();
		
	}
	@Test(priority=20)
	public void ValidateClickTestingOfServiceCrewPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Service Crew for FSM");
		FsmAction fsmAction = new FsmAction(driver);
		TicketingAction ticketingAction = new TicketingAction(driver);
		new LoginAction(driver).logoutLogin();
		ticketingAction.GoToTicketingPage();
		fsmAction.GoToServiceCrewPage();
		
	}
	@Test(priority=21)
	public void ValidateClickTestingOfTechTrackingPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Tech Tracking for FSM");
		FsmAction fsmAction = new FsmAction(driver);
		TicketingAction ticketingAction = new TicketingAction(driver);
		new LoginAction(driver).logoutLogin();
		ticketingAction.GoToTicketingPage();
		fsmAction.GoToTechTrackingPage();
		
	}
	@Test(priority=22)
	public void ValidateClickTestingOfTransformPendingPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Transform Pending for FSM");
		FsmAction fsmAction = new FsmAction(driver);
		TicketingAction ticketingAction = new TicketingAction(driver);
		new LoginAction(driver).logoutLogin();
		ticketingAction.GoToTicketingPage();
		fsmAction.GoToTransformPendingPage();
		
	}
	@Test(priority=23)
	public void ValidateClickTestingOfWorkTypeListingPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Work Type Listing for FSM");
		FsmAction fsmAction = new FsmAction(driver);
		TicketingAction ticketingAction = new TicketingAction(driver);
		new LoginAction(driver).logoutLogin();
		ticketingAction.GoToTicketingPage();
		fsmAction.GoToWorkTypeListingPage();
		
	}
	@Test(priority=24)
	public void ValidateClickTestingOfZoneManagementPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Zone Management for FSM");
		FsmAction fsmAction = new FsmAction(driver);
		TicketingAction ticketingAction = new TicketingAction(driver);
		new LoginAction(driver).logoutLogin();
		ticketingAction.GoToTicketingPage();
		fsmAction.GoToZoneManagementPage();
		
	}
	@Test(priority=25)
	public void ValidateClickTestingOfDashBoardPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of DashBoard for FSM");
		FsmAction fsmAction = new FsmAction(driver);
		TicketingAction ticketingAction = new TicketingAction(driver);
		new LoginAction(driver).logoutLogin();
		ticketingAction.GoToTicketingPage();
		fsmAction.GoToDashBoardPage();
		
	}
	@Test(priority=26)
	public void ValidateClickTestingOfTicketTypeListingPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Ticket Type Listing for FSM");
		FsmAction fsmAction = new FsmAction(driver);
		TicketingAction ticketingAction = new TicketingAction(driver);
		new LoginAction(driver).logoutLogin();
		ticketingAction.GoToTicketingPage();
		fsmAction.GoToTicketTypeListingPageAndValiadteFunctionality();
		
	}
	@Test(priority=27)
	public void ValidateClickTestingOfWorkOrderPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Work Order for FSM");
		FsmAction fsmAction = new FsmAction(driver);
		TicketingAction ticketingAction = new TicketingAction(driver);
		new LoginAction(driver).logoutLogin();
		ticketingAction.GoToTicketingPage();
		fsmAction.GoToWorkOrderPageAndValiadteFunctionality();
		
	}
	@Test(priority=28)
	public void ValidateClickTestingOfIncidentTypePage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Incident Type for FSM");
		FsmAction fsmAction = new FsmAction(driver);
		TicketingAction ticketingAction = new TicketingAction(driver);
		new LoginAction(driver).logoutLogin();
		ticketingAction.GoToTicketingPage();
		fsmAction.GoToIncidentTypePageAndValiadteFunctionality();
		
	}
	@Test(priority=29)
	public void ValidateClickTestingOfResourceTypePage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Resource Type for FSM");
		FsmAction fsmAction = new FsmAction(driver);
		TicketingAction ticketingAction = new TicketingAction(driver);
		new LoginAction(driver).logoutLogin();
		ticketingAction.GoToTicketingPage();
		fsmAction.GoToResourceTypePageAndValiadteFunctionality();
		
	}
}
