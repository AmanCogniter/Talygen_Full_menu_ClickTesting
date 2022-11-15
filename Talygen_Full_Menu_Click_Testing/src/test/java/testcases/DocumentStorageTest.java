package testcases;

import static reporting.ComplexReportFactory.getTest;

import org.testng.annotations.Test;

import action.DocumentStorageAction;
import action.LoginAction;
import utils.WebTestBase;

public class DocumentStorageTest extends WebTestBase{
	static String Screenname = "<b>Document Storage</b>"; 
	/*
	 * Check click testing of Manage Client Storage Page
	 */
	@Test(priority=0)
	public void ValidateClickTestingOfManageClientStoragePage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Manage Client Storage page");
		DocumentStorageAction documentStorageAction = new DocumentStorageAction(driver);
		new LoginAction(driver).logoutLogin();
		documentStorageAction.GoToDocumentStoragePage();
		documentStorageAction.GoToManageClientStoragePage();
		
	}
	/*
	 * Check click testing of Manage User Storage Page
	 */
	@Test(priority=1)
	public void ValidateClickTestingOfManageUserStoragePage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Manage User Storage page");
		DocumentStorageAction documentStorageAction = new DocumentStorageAction(driver);
		new LoginAction(driver).logoutLogin();
		documentStorageAction.GoToDocumentStoragePage();
		documentStorageAction.GoToManageClientUserPage();
		
	}
	/*
	 * Check click testing of User Storage Report Page
	 */
	@Test(priority=2)
	public void ValidateClickTestingOfUserStorageReportPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of User Storage Report page");
		DocumentStorageAction documentStorageAction = new DocumentStorageAction(driver);
		new LoginAction(driver).logoutLogin();
		documentStorageAction.GoToDocumentStoragePage();
		documentStorageAction.GoToUserStorageReportPage();
		
	}
}
