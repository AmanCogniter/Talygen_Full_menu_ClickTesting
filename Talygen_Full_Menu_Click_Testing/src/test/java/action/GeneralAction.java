package action;

import org.openqa.selenium.WebDriver;

import pageobjects.AppoitmentCalendarPage;
import pageobjects.GeneralPage;

public class GeneralAction {
	WebDriver driver ; 
	GeneralPage generalPage;
	
	public GeneralAction(WebDriver driver)
	{
		this.driver= driver;
		generalPage= new GeneralPage(driver);
	}
	
	public void GoToGeneralPage()
	{
		generalPage.clickFullMenuDropDown();	
		generalPage.clickOnGeneral();	
		
		
	}
	/*Meatod  for Add Report for General*/
	public void GoToAddReportPage()
	{
		
		generalPage.clickOnAddReport();	
		generalPage.clickOnSaveButton();
		generalPage.VerifyMandatoryFieldValidation();
		generalPage.clickOnCancelButton();
		
	}
	/*Meatod  for Auto Responder for General*/
	public void GoToAutoResponderPage()
	{
		
		generalPage.clickOnAutoResponder();	
		generalPage.clickOnAddAutoResponder();
		generalPage.clickOnSaveAutoResponder();
		generalPage.VerifyMandatoryFieldOfAddAutoResponder();
		generalPage.clickOnCancelButton();
		
	}
	/*Meatod  for Custom Fields for General*/
	public void GoToCustomFieldsPage()
	{
		
		generalPage.clickOnCustomFields();	
		generalPage.clickOnAddCustomFields();
		generalPage.clickOnSaveButton();
		generalPage.VerifyMandatoryFieldOfAddCustomFields();
		generalPage.clickOnCancelButton();
		
	}
	/*Meatod  for Custom Reports for General*/
	public void GoToCustomReportsPage()
	{
		
		generalPage.clickOnCustomReports();	
		generalPage.clickOnAddCustomReports();
		generalPage.clickOnSaveButton();
		generalPage.VerifyMandatoryFieldOfCustomReports();
		generalPage.clickOnCancelButton();
		
	}
	/*Meatod  for External Link for General*/
	public void GoToExternalLinkPage()
	{
		
		generalPage.clickOnExternalLink();	
		
		
	}
	/*Meatod  for Passport Information for General*/
	public void GoToPassportInformationPage()
	{
		
		generalPage.clickOnPassportInformation();	
		generalPage.clickOnAddPassportInformation();
		generalPage.clickOnSaveButton();
		generalPage.VerifyMandatoryFieldOfAddPassportInformation();
		generalPage.clickOnCancelButton();
		
	}
	/*Meatod  for Manage Layout  for General*/
	public void GoToManageLayoutPage()
	{
		
		generalPage.clickOnManageLayout();	
		
		
	}
	/*Meatod  for Organization Chart for General*/
	public void GoToOrganizationChartPage()
	{
		
		generalPage.clickOnOrganizationChart();	
		generalPage.clickOnChangeRootMember();
		
		
	}
	/*Meatod  for Provisional Rights for General*/
	public void GoToProvisionalRightsPage()
	{
		
		generalPage.clickOnProvisionalRights();	
		generalPage.clickOnAddProvisionalRights();
		generalPage.clickOnSaveAutoResponder();
		generalPage.VerifyMandatoryFieldOfAddProvisionalRights();
		generalPage.clickOnCancelButton();
		generalPage.clickOnCheckBox();
		generalPage.clickOnActive();
		//generalPage.clickOnCheckBox();
		generalPage.clickOnInActive();
		
	}
	public void GoToRuleEnginePage()
	{
		
		generalPage.clickOnRuleEngine();	
		generalPage.clickOnAddRuleEngine();
		generalPage.clickOnSaveRuleEngine();
		generalPage.VerifyMandatoryFielOfRuleEngine();
		generalPage.clickOnCancelRuleEngine();
	}
	public void GoToStoragePage()
	{
		
		generalPage.clickOnStorage();	
	}
	public void GoToTagsPage()
	{
		
		generalPage.clickOnTags();	
	}
	public void GoToWorkingDayPage()
	{
		
		generalPage.clickOnWorkingDay();	
		generalPage.clickOnAddWorkingDay();
		generalPage.clickOnSaveOfAddWorkingday();
		generalPage.VerifyMandatoryFielOfAddWorkingDay();
		generalPage.clickOnCancelRuleEngine();
	}
	public void GoToWorkingweekPage()
	{
		
		generalPage.clickOnWorkingWeek();	
		
	}
	
	
}
