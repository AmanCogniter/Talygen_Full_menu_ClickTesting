package testcases;

import static reporting.ComplexReportFactory.getTest;

import org.testng.annotations.Test;

import action.AppoitmentCalenderAction;
import action.LoginAction;
import utils.WebTestBase;

public class AppotmentCalendarTest extends WebTestBase{
	static String Screenname = "<b>Appoitment calender</b>"; 
	/*
	 * Check click testing of Manage External Link Page
	 */
	@Test(priority=0)
	public void ValidateClickTestingOfManageExternalLinkPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of External Link for Appointment");
		AppoitmentCalenderAction appoitmentCalenderAction = new AppoitmentCalenderAction(driver);
		new LoginAction(driver).logoutLogin();
		appoitmentCalenderAction.GoToAppoitmentCalendarPage();
		appoitmentCalenderAction.GoToManageexternalLinkPage();
		
	}
	/* Test script for checking Click Testing of Appoitment Report Page */
	@Test(priority=1)
	public void ValidateClickTestingOfAppoitmentReportPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Appoitmnet Report Page");
		AppoitmentCalenderAction appoitmentCalenderAction = new AppoitmentCalenderAction(driver);
		new LoginAction(driver).logoutLogin();
		appoitmentCalenderAction.GoToAppoitmentCalendarPage();
		appoitmentCalenderAction.GoToAppoitmentServiceReportPage();
		
	}
	/* Test script for checking Click Testing of Consumer List Page */
	@Test(priority=2)
	public void ValidateClickTestingOfConsumerListPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Consumer List Page");
		AppoitmentCalenderAction appoitmentCalenderAction = new AppoitmentCalenderAction(driver);
		new LoginAction(driver).logoutLogin();
		appoitmentCalenderAction.GoToAppoitmentCalendarPage();
		appoitmentCalenderAction.GoToConsumerListPage();
		
	}
	/* Test script for checking Click Testing of Counter Page */
	@Test(priority=3)
	public void ValidateClickTestingOfCounterPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Counter Page");
		AppoitmentCalenderAction appoitmentCalenderAction = new AppoitmentCalenderAction(driver);
		new LoginAction(driver).logoutLogin();
		appoitmentCalenderAction.GoToAppoitmentCalendarPage();
		appoitmentCalenderAction.GoToCounterPage();
		
	}
	/* Test script for checking Click Testing of Course Page */
	@Test(priority=4)
	public void ValidateClickTestingOfCoursePage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Course Page");
		AppoitmentCalenderAction appoitmentCalenderAction = new AppoitmentCalenderAction(driver);
		new LoginAction(driver).logoutLogin();
		appoitmentCalenderAction.GoToAppoitmentCalendarPage();
		appoitmentCalenderAction.GoToCoursePage();
		
	}
	/* Test script for checking Click Testing of Schedule Appointment Page */
	@Test(priority=5)
	public void ValidateClickTestingOfScheduleAppointmentPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Schedule Appointment Page");
		AppoitmentCalenderAction appoitmentCalenderAction = new AppoitmentCalenderAction(driver);
		new LoginAction(driver).logoutLogin();
		appoitmentCalenderAction.GoToAppoitmentCalendarPage();
		appoitmentCalenderAction.GoToScheduleAppointmentPage();
		
	}
	/* Test script for checking Click Testing of Appoitment Service Page Page */
	@Test(priority=6)
	public void ValidateClickTestingOfAppoitmentServicePage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Appoitment Service Page Page");
		AppoitmentCalenderAction appoitmentCalenderAction = new AppoitmentCalenderAction(driver);
		new LoginAction(driver).logoutLogin();
		appoitmentCalenderAction.GoToAppoitmentCalendarPage();
		appoitmentCalenderAction.GoToAppoitmentServicePage();
		
	}
	/* Test script for checking Click Testing of Token Page */
	@Test(priority=7)
	public void ValidateClickTestingOfTokenPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Token Page");
		AppoitmentCalenderAction appoitmentCalenderAction = new AppoitmentCalenderAction(driver);
		new LoginAction(driver).logoutLogin();
		appoitmentCalenderAction.GoToAppoitmentCalendarPage();
		appoitmentCalenderAction.GoToTokenPage();
		
	}
}
