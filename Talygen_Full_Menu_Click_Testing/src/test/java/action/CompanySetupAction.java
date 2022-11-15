package action;

import org.openqa.selenium.WebDriver;

import pageobjects.AppoitmentCalendarPage;
import pageobjects.CompanySetupPage;

public class CompanySetupAction {
	WebDriver driver ; 
	CompanySetupPage companySetupPage;
	
	public CompanySetupAction(WebDriver driver)
	{
		this.driver= driver;
		companySetupPage= new CompanySetupPage(driver);
	}
	
	public void GoToCompantSetupPage()
	{
		companySetupPage.clickFullMenuDropDown();	
		companySetupPage.clickOnCOMPANYSETUPLink();	
		
		
	}
	/*Meatod  for Client */
	public void GoToClientPage()
	{
		
		companySetupPage.clickOnClientforCompanySetup();	
		companySetupPage.clickOnAddAccount();
		companySetupPage.clickOnsaveButton();
		companySetupPage.VerifyMandatoryFieldValidation();
		companySetupPage.clickOnPageTourGuide();
		companySetupPage.clickOnCancelButton();
		companySetupPage.clickOnAddClient();
		companySetupPage.clickOnBacktoList();
	
		
	}
	/*Meatod  for Company Directory */
	public void GoToCompanyDirectoryPage()
	{
		companySetupPage.clickOnCompanyDirectoryforCompanySetup();	
		}
	/*Meatod  for Company Setup */
	public void GoToCompanysetupPage()
	{
		companySetupPage.clickOnCompanySetupforCompanySetup();	
		}
	/*Meatod  for Coniguration Page */
	public void GoToConfigurationPage()
	{
		companySetupPage.clickOnConfigurationforCompanySetup();
		companySetupPage.clickOnRadioButton();
		companySetupPage.clickOnConfigurationsaveButton();
		
		}
	/*Meatod  for Context menu Page */
	public void GoToContextMenuPage()
	{
		companySetupPage.clickOnContextMenuforCompanySetup();	
		}
	/*Meatod  for HoliDay Bank*/
	public void GoToHolidayBankPage()
	{
		
		companySetupPage.clickOnHolidayBankforCompanySetup();	
		companySetupPage.clickOnAddHoliDay();
		companySetupPage.clickOnSaveHoliDay();
		companySetupPage.VerifyMandatoryFieldValidationOfCompanyHoliDays();
		companySetupPage.clickOnCancelHoliDay();
		companySetupPage.clickOnHoliDayBank();
	}
	/*Meatod  for Manage Subscription*/
	public void GoToManageSubscriptionPage()
	{
		
		companySetupPage.clickOnManageSubscriptionforCompanySetup();	
		
	}
	/*Meatod  for Manage Tax*/
	public void GoToManageTaxPage()
	{
		
		companySetupPage.clickOnManageTaxforCompanySetup();	
		companySetupPage.clickOnActionButton();
		companySetupPage.clickOnManageTaxsaveButton();
		companySetupPage.VerifyMandatoryFieldValidationOfManageTax();
		companySetupPage.clickOnManageCancelButton();
		
	}
	/*Meatod  for Resource Approval*/
	public void GoToResourceApprovalPage()
	{
		
		companySetupPage.clickOnResourceApprovalforCompanySetup();	
		
	}
	/*Meatod  for Manage Tax*/
	public void GoToRolesPage()
	{
		
		companySetupPage.clickOnRolesforCompanySetup();	
		companySetupPage.clickOnCreateRoles();
		companySetupPage.clickOnsaveButton();
		companySetupPage.VerifyMandatoryFieldValidationOfCreateRoles();
		companySetupPage.clickOnCancelButton();
		
	}
	/*Meatod  for User*/
	public void GoToUserPage()
	{
		
		companySetupPage.clickOnUserforCompanySetup();	
		companySetupPage.clickOnAddUser();
		companySetupPage.clickOnSaveUser();
		companySetupPage.VerifyMandatoryFieldValidationOfUser();
		companySetupPage.clickOnCancelUser();
		
	}
	/*Meatod  for Search Vendors*/
	public void GoToSearchVendorsPage()
	{
		
		companySetupPage.clickOnSearchVendors();	
		companySetupPage.clickOnrequestEmployee();
		companySetupPage.clickOnAssociateVendors();
		companySetupPage.clickOnVendorsListing();
		companySetupPage.clickOnAddVendor();
		companySetupPage.clickOnAssociate();
		
		
	}
}
