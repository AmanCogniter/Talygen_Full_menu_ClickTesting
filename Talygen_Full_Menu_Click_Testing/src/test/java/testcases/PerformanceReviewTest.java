package testcases;

import static reporting.ComplexReportFactory.getTest;

import org.testng.annotations.Test;

import action.IntegrationAction;
import action.LoginAction;
import action.PerformanceReviewAction;
import utils.WebTestBase;

public class PerformanceReviewTest extends WebTestBase{
	static String Screenname = "<b>Performance Review</b>"; 
	/*
	 * Check click testing of Performance Review Page
	 */
	@Test(priority=0)
	public void ValidateClickTestingOfPerformanceReviewPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of PerformanceReview ");
		PerformanceReviewAction performanceReviewAction = new PerformanceReviewAction(driver);
		new LoginAction(driver).logoutLogin();
		performanceReviewAction.GoToPerformanceReviewPage();
		performanceReviewAction.GoToPerformanceReviewSubModulePage();
		
	}
	/*
	 * Check click testing of Performance Review Report Page
	 */
	@Test(priority=1)
	public void ValidateClickTestingOfPerformanceReviewReportPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Performance Review Report");
		PerformanceReviewAction performanceReviewAction = new PerformanceReviewAction(driver);
		new LoginAction(driver).logoutLogin();
		performanceReviewAction.GoToPerformanceReviewPage();
		performanceReviewAction.GoToPerformanceReviewReportPage();
		
	}
	/*
	 * Check click testing of Provide Feedback Page
	 */
	@Test(priority=2)
	public void ValidateClickTestingOfProvideFeedbackPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Provide Feedback");
		PerformanceReviewAction performanceReviewAction = new PerformanceReviewAction(driver);
		new LoginAction(driver).logoutLogin();
		performanceReviewAction.GoToPerformanceReviewPage();
		performanceReviewAction.GoToProvideFeedbackPage();
		
	}
	/*
	 * Check click testing of Provide Review Page
	 */
	@Test(priority=3)
	public void ValidateClickTestingOfProvideReviewPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Provide Review");
		PerformanceReviewAction performanceReviewAction = new PerformanceReviewAction(driver);
		new LoginAction(driver).logoutLogin();
		performanceReviewAction.GoToPerformanceReviewPage();
		performanceReviewAction.GoToProvideReviewPage();
		
	}
	/*
	 * Check click testing of Review Page
	 */
	@Test(priority=4)
	public void ValidateClickTestingOfReviewPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Review");
		PerformanceReviewAction performanceReviewAction = new PerformanceReviewAction(driver);
		new LoginAction(driver).logoutLogin();
		performanceReviewAction.GoToPerformanceReviewPage();
		performanceReviewAction.GoToReviewPage();
		
	}
}
