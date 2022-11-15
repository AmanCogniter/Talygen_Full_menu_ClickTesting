package testcases;

import static reporting.ComplexReportFactory.getTest;

import org.testng.annotations.Test;

import action.AppoitmentCalenderAction;
import action.LoginAction;
import action.TicketingAction;
import utils.WebTestBase;

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
}
