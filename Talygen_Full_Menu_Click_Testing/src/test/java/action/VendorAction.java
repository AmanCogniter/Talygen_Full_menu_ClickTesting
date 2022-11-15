package action;

import org.openqa.selenium.WebDriver;

import pageobjects.TrainingPage;
import pageobjects.VendorPage;

public class VendorAction {
	WebDriver driver ; 
	VendorPage vendorPage;
	
	public VendorAction(WebDriver driver)
	{
		this.driver= driver;
		vendorPage= new VendorPage(driver);
	}
	
	public void GoToVendorPage()
	{
		vendorPage.clickFullMenuDropDown();	
		vendorPage.clickOnVendor();	
		
		
	}
	/*Method  for Service*/
	public void GoToServicePage()
	{
		
		vendorPage.clickOnService();	
		
	
	}
	/*Method  for Vendor Listing*/
	public void GoToVendorListingePage()
	{
		
		vendorPage.clickOnVendorListing();
		vendorPage.clickOnAddVendorListing();
		vendorPage.clickOnSave();
		vendorPage.VerifyMandatoryFieldOfVendor();
		vendorPage.clickOnBackToList();
	
	}
}
