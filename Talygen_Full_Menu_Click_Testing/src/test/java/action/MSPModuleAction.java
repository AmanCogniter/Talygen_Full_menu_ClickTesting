package action;

import org.openqa.selenium.WebDriver;

import pageobjects.MSPModulePage;

public class MSPModuleAction {
	WebDriver driver ; 
	MSPModulePage mSPModulePage;
	
	public MSPModuleAction(WebDriver driver)
	{
		this.driver= driver;
		mSPModulePage= new MSPModulePage(driver);
	}
	
	public void GoToMSPModulePage()
	{
		mSPModulePage.clickFullMenuDropDown();	
		mSPModulePage.clickOnMSPModule();	
		
		
	}
	/*Method  for AddPackages of MSPModule*/
	public void GoToAddPackagesPage()
	{
		
		mSPModulePage.clickOnAddPackagesforMSPModule();
		mSPModulePage.clickOnBackToList();
		
		
	}
	/*Method  for Add Subscription of MSPModule*/
	public void GoToAddSubscriptionPage()
	{
		
		mSPModulePage.clickOnAddSubscriptionforMSPModule();
		mSPModulePage.clickOnNext();
		mSPModulePage.VerifyMandatoryFieldValidation();
		mSPModulePage.clickOnBackToList();
		
		
	}
	/*Method  for Manage Packages of MSPModule*/
	public void GoToManagePackagesPage()
	{
		
		mSPModulePage.clickOnManagePackagesforMSPModule();
		mSPModulePage.clickOnAddPackages();
		mSPModulePage.clickOnBackToList();	
	}
	
	/*Method  for Manage Subscription of MSPModule*/
	public void GoToManageSubscriptionPage()
	{
		
		mSPModulePage.clickOnManageSubscriptionforMSPModule();
		mSPModulePage.clickOnAddSubscription();
		mSPModulePage.clickOnNext();
		mSPModulePage.VerifyMandatoryFieldValidation();
		mSPModulePage.clickOnBackToList();
	}

}
