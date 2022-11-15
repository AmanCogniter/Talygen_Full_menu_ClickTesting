package testcases;

import static reporting.ComplexReportFactory.getTest;

import org.testng.annotations.Test;

import action.IntegrationAction;
import action.LoginAction;
import action.ProjectManagementAction;
import utils.WebTestBase;

public class ProjectManagementTest extends WebTestBase{
	static String Screenname = "<b>Project Management</b>"; 
	/*
	 * Check click testing of Global Task Page
	 */
	@Test(priority=0)
	public void ValidateClickTestingOfGlobalTaskPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Global Task for Project Management");
		ProjectManagementAction projectManagementAction = new ProjectManagementAction(driver);
		new LoginAction(driver).logoutLogin();
		projectManagementAction.GoToProjectManagementPage();
		projectManagementAction.GoToGlobalTaskPage();
		
	}
	/*
	 * Check click testing of Project Page
	 */
	@Test(priority=1)
	public void ValidateClickTestingOfProjectPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Global Task for Project Management");
		ProjectManagementAction projectManagementAction = new ProjectManagementAction(driver);
		new LoginAction(driver).logoutLogin();
		projectManagementAction.GoToProjectManagementPage();
		projectManagementAction.GoToProjectPage();
		
	}
	/*
	 * Check click testing of Project Report Page
	 */
	@Test(priority=2)
	public void ValidateClickTestingOfProjectReportPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Global Task for Project Management");
		ProjectManagementAction projectManagementAction = new ProjectManagementAction(driver);
		new LoginAction(driver).logoutLogin();
		projectManagementAction.GoToProjectManagementPage();
		projectManagementAction.GoToProjectReportPage();
		
	}
	/*
	 * Check click testing of Project Request Page
	 */
	@Test(priority=3)
	public void ValidateClickTestingOfProjectRequestPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Global Task for Project Management");
		ProjectManagementAction projectManagementAction = new ProjectManagementAction(driver);
		new LoginAction(driver).logoutLogin();
		projectManagementAction.GoToProjectManagementPage();
		projectManagementAction.GoToProjectRequestPage();
		
	}
	/*
	 * Check click testing of Quotes Page
	 */
	@Test(priority=4)
	public void ValidateClickTestingOfQuotesPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Quotes for Project Management");
		ProjectManagementAction projectManagementAction = new ProjectManagementAction(driver);
		new LoginAction(driver).logoutLogin();
		projectManagementAction.GoToProjectManagementPage();
		projectManagementAction.GoToQuotesPage();
		
	}
	/*
	 * Check click testing of Requested Time List Page
	 */
	@Test(priority=5)
	public void ValidateClickTestingOfRequestedTimeListPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Requested Time List for Project Management");
		ProjectManagementAction projectManagementAction = new ProjectManagementAction(driver);
		new LoginAction(driver).logoutLogin();
		projectManagementAction.GoToProjectManagementPage();
		projectManagementAction.GoToRequestedTimeListPage();
		
	}
	/*
	 * Check click testing of Resource Impact Page
	 */
	@Test(priority=6)
	public void ValidateClickTestingOfResourceImpactPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Resource Impact for Project Management");
		ProjectManagementAction projectManagementAction = new ProjectManagementAction(driver);
		new LoginAction(driver).logoutLogin();
		projectManagementAction.GoToProjectManagementPage();
		projectManagementAction.GoToResourceImpactPage();
		
	}
	/*
	 * Check click testing of Resource Scheduling Page
	 */
	@Test(priority=7)
	public void ValidateClickTestingOfResourceSchedulingPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Resource Scheduling for Project Management");
		ProjectManagementAction projectManagementAction = new ProjectManagementAction(driver);
		new LoginAction(driver).logoutLogin();
		projectManagementAction.GoToProjectManagementPage();
		projectManagementAction.GoToResourceSchedulingPage();
		
	}
	/*
	 * Check click testing of Project Road Map Page
	 */
	@Test(priority=8)
	public void ValidateClickTestingOfTaskPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Task Map for Project Management");
		ProjectManagementAction projectManagementAction = new ProjectManagementAction(driver);
		new LoginAction(driver).logoutLogin();
		projectManagementAction.GoToProjectManagementPage();
		projectManagementAction.GoToTaskPage();
		
	}
	/*
	 * Check click testing of To Do List Page
	 */
	@Test(priority=9)
	public void ValidateClickTestingOfToDoListPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of To Do List for Project Management");
		ProjectManagementAction projectManagementAction = new ProjectManagementAction(driver);
		new LoginAction(driver).logoutLogin();
		projectManagementAction.GoToProjectManagementPage();
		projectManagementAction.GoToToDoListPage();
		
	}
}
