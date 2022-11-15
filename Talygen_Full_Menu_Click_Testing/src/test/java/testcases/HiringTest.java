package testcases;

import static reporting.ComplexReportFactory.getTest;

import org.testng.annotations.Test;

import action.HiringAction;
import action.LoginAction;
import utils.WebTestBase;

public class HiringTest extends WebTestBase{
	static String Screenname = "<b>Hiring</b>"; 
	/*
	 * Check click testing of Candidate List Page
	 */
	@Test(priority=0)
	public void ValidateClickTestingOfCandidateListPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Candidate List for Hiring");
		HiringAction hiringAction = new HiringAction(driver);
		new LoginAction(driver).logoutLogin();
		hiringAction.GoToHiringPage();
		hiringAction.GoToCandidateListPage();
		
	}
	/*
	 * Check click testing of Consultant List Page
	 */
	@Test(priority=1)
	public void ValidateClickTestingOfConsultantListListPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Consultant List for Hiring");
		HiringAction hiringAction = new HiringAction(driver);
		new LoginAction(driver).logoutLogin();
		hiringAction.GoToHiringPage();
		hiringAction.GoToConsultantListPage();
		
	}
	/*
	 * Check click testing of Group List Page
	 */
	@Test(priority=2)
	public void ValidateClickTestingOfGroupListListPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Group List for Hiring");
		HiringAction hiringAction = new HiringAction(driver);
		new LoginAction(driver).logoutLogin();
		hiringAction.GoToHiringPage();
		hiringAction.GoToGroupListPage();
		
	}
	/*
	 * Check click testing of Job List Page
	 */
	@Test(priority=3)
	public void ValidateClickTestingOfjobListListPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Job List for Hiring");
		HiringAction hiringAction = new HiringAction(driver);
		new LoginAction(driver).logoutLogin();
		hiringAction.GoToHiringPage();
		hiringAction.GoToJobListPage();
		
	}
	/*
	 * Check click testing of Job Post Report Page
	 */
	@Test(priority=4)
	public void ValidateClickTestingOfjobPostReportPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Job Post Report for Hiring");
		HiringAction hiringAction = new HiringAction(driver);
		new LoginAction(driver).logoutLogin();
		hiringAction.GoToHiringPage();
		hiringAction.GoToJobPostReportPage();
		
	}
	/*
	 * Check click testing of Job Requisitiont Page
	 */
	@Test(priority=5)
	public void ValidateClickTestingOfJobRequisitionPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Job Requisition for Hiring");
		HiringAction hiringAction = new HiringAction(driver);
		new LoginAction(driver).logoutLogin();
		hiringAction.GoToHiringPage();
		hiringAction.GoToJobRequisitionPage();
		
	}
	/*
	 * Check click testing of Offboard Employee List Page
	 */
	@Test(priority=6)
	public void ValidateClickTestingOfOffboardEmployeeListPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Offboard Employee List for Hiring");
		HiringAction hiringAction = new HiringAction(driver);
		new LoginAction(driver).logoutLogin();
		hiringAction.GoToHiringPage();
		hiringAction.GoToOffboardEmployeeListPage();
		
	}
	/*
	 * Check click testing of Policy Page
	 */
	@Test(priority=7)
	public void ValidateClickTestingOfPolicyPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Policy for Hiring");
		HiringAction hiringAction = new HiringAction(driver);
		new LoginAction(driver).logoutLogin();
		hiringAction.GoToHiringPage();
		hiringAction.GoToPolicyPage();
		
	}
	/*
	 * Check click testing of Resignation Page
	 */
	@Test(priority=8)
	public void ValidateClickTestingOfResignationPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Resignation for Hiring");
		HiringAction hiringAction = new HiringAction(driver);
		new LoginAction(driver).logoutLogin();
		hiringAction.GoToHiringPage();
		hiringAction.GoToResignationPage();	
	}
	/*
	 * Check click testing of Policy Page
	 */
	@Test(priority=9)
	public void ValidateClickTestingOfSertvicePage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Service for Hiring");
		HiringAction hiringAction = new HiringAction(driver);
		new LoginAction(driver).logoutLogin();
		hiringAction.GoToHiringPage();
		hiringAction.GoToServicePage();
		
	}
	/*
	 * Check click testing of Talent Pool List Page
	 */
	@Test(priority=10)
	public void ValidateClickTestingOfTalentPoolListPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Talent Pool List for Hiring");
		HiringAction hiringAction = new HiringAction(driver);
		new LoginAction(driver).logoutLogin();
		hiringAction.GoToHiringPage();
		hiringAction.GoToTalentPoolListPage();
		
	}
	/*
	 * Check click testing of Vendor Listing Page
	 */
	@Test(priority=11)
	public void ValidateClickTestingOfVendorListingPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Vendor Listing for Hiring");
		HiringAction hiringAction = new HiringAction(driver);
		new LoginAction(driver).logoutLogin();
		hiringAction.GoToHiringPage();
		hiringAction.GoToVendorListingPage();
		
	}
	
	
}
