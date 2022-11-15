package action;

import org.openqa.selenium.WebDriver;

import pageobjects.DocumentStoragePage;
import pageobjects.VDeskPage;

public class DocumentStorageAction {
	WebDriver driver ; 
	DocumentStoragePage documentStoragePage;
	
	public DocumentStorageAction(WebDriver driver)
	{
		this.driver= driver;
		documentStoragePage= new DocumentStoragePage(driver);
	}
	
	public void GoToDocumentStoragePage()
	{
		documentStoragePage.clickFullMenuDropDown();	
		documentStoragePage.clickOnDocumentStoragePage();	
		
		
	}
	/*Method  for Manage Client Storage Page */
	public void GoToManageClientStoragePage()
	{
		
		documentStoragePage.clickOnManageClientStorage();	
		documentStoragePage.clickOnCheckBox();
		documentStoragePage.clickOnAllocateSpace();
		
	}
	/*Method  for Manage User Storage Page */
	public void GoToManageClientUserPage()
	{
		
		documentStoragePage.clickOnManageUserStorage();	
		documentStoragePage.clickOnCheckBox();
		documentStoragePage.clickOnAllocateSpace();
		
	}
	/*Method  for User Storage Report Page */
	public void GoToUserStorageReportPage()
	{
		
		documentStoragePage.clickOnUserStorageReport();	
		documentStoragePage.clickOnListView();
		documentStoragePage.clickOnGraphicalView();
		
	}
}
