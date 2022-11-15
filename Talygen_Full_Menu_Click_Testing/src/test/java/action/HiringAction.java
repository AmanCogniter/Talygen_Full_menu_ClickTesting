package action;

import org.openqa.selenium.WebDriver;

import pageobjects.AppoitmentCalendarPage;
import pageobjects.HiringPage;

public class HiringAction {
	WebDriver driver ; 
	HiringPage hiringPage;
	
	public HiringAction(WebDriver driver)
	{
		this.driver= driver;
		hiringPage= new HiringPage(driver);
	}
	
	public void GoToHiringPage()
	{
		hiringPage.clickFullMenuDropDown();	
		hiringPage.clickOnHiring();	
		
		
	}
	/*Meatod  for Candidate List for Hiring*/
	public void GoToCandidateListPage()
	{
		
		hiringPage.clickOnCandidateListforHiring();	
		hiringPage.clickOnAddCandidateListforHiring();
		hiringPage.clickOnSaveButton();
		hiringPage.clickOnCloseNotifyMessageButton();
		hiringPage.VerifyMandatoryFieldValidation();
		hiringPage.clickOnCancelButton();
		hiringPage.clickOnForwardcandidatesCV();
		hiringPage.clickOnGridView();
		hiringPage.clickOnListView();
		hiringPage.clickOnCheckBox();
		hiringPage.clickOnDelete();
		hiringPage.clickOnManageView();
		
	}
	/*Meatod  for Consultant List for Hiring*/
	public void GoToConsultantListPage()
	{
		
		hiringPage.clickOnConsultantListforHiring();	
		hiringPage.clickOnAddConsultantListforHiring();
		hiringPage.clickOnSaveAddConsultantList();
		hiringPage.VerifyMandatoryFieldOfAddConsultantList();
		hiringPage.clickOnCancelAddConsultantList();
		hiringPage.clickOnCheckBox();
		hiringPage.clickOnDelete();	
	}
	/*Meatod  for Group List for Hiring*/
	public void GoToGroupListPage()
	{
		
		hiringPage.clickOnGroupListforHiring();	
		hiringPage.clickOnAddGroupListforHiring();
		hiringPage.clickOnSaveAddGroupList();
		hiringPage.VerifyMandatoryFieldOfAddGroupList();
		hiringPage.clickOnCancelAddGroupList();
		hiringPage.clickOnCheckBoxOfGroupListing();
		hiringPage.clickOnDeleteGroupListing();	
	}
	/*Meatod  for Job List for Hiring*/
	public void GoToJobListPage()
	{
		
		hiringPage.clickOnJobListforHiring();	
		hiringPage.clickOnAddJobListforHiring();
		hiringPage.clickOnSaveAddJobList();
		hiringPage.clickOnCloseNotifyMessageButton();
		hiringPage.VerifyMandatoryFieldOfAddJobList();
		hiringPage.clickOnCancelButton();
		hiringPage.clickOnCardView();
		hiringPage.clickOnListView();
		hiringPage.clickOnCheckBox();
		hiringPage.clickOnDelete();
		hiringPage.clickOnManageView();
		
	}
	/*Method  for Job Post Report for Hiring*/
	public void GoToJobPostReportPage()
	{
		
		hiringPage.clickOnJobPostReportforHiring();	
	}
	/*Method  for Job Requisition for Hiring*/
	public void GoToJobRequisitionPage()
	{
		
		hiringPage.clickOnJobRequisitionforHiring();	
		hiringPage.clickOnAddJobRequisitionforHiring();
		hiringPage.clickOnSubmit();
		hiringPage.clickOnCancelButton();
		
	}
	/*Method  for Offboard Employee List for Hiring*/
	public void GoToOffboardEmployeeListPage()
	{
		
		hiringPage.clickOnOffboardEmployeeListforHiring();	
		hiringPage.clickOnAddOffboardEmployeeListforHiring();
		hiringPage.clickOnSaveAddConsultantList();
		hiringPage.VerifyMandatoryFieldOfAddOffboardEmployeeList();
		hiringPage.clickOnCancelAddConsultantList();
		
	}
	/*Method  for Policy for Hiring*/
	public void GoToPolicyPage()
	{
		
		hiringPage.clickOnPolicyforHiring();	
		hiringPage.clickOnAddPolicyforHiring();
		hiringPage.clickOnSaveButton();
		hiringPage.clickOnCancelButton();
		hiringPage.clickOnCheckBox();
		hiringPage.clickOnDelete();
		
	}
	/*Method  for Resignation for Hiring*/
	public void GoToResignationPage()
	{
		
		hiringPage.clickOnResignationforHiring();	
		hiringPage.clickOnApplyResignation();
		hiringPage.clickOnSaveManageResignation();
		hiringPage.clickOnCancelManageResignation();
		hiringPage.clickOnAddOffboardEmployeeListforHiring();
		hiringPage.clickOnSaveAddConsultantList();
		hiringPage.VerifyMandatoryFieldOfAddOffboardEmployeeList();
		hiringPage.clickOnCancelAddConsultantList();
	}
	/*Method  for Service for Hiring*/
	public void GoToServicePage()
	{
		
		hiringPage.clickOnServiceforHiring();	
	}
	/*Meatod  for Talent Pool List for Hiring*/
	public void GoToTalentPoolListPage()
	{
		
		hiringPage.clickOnTalentPoolListforHiring();	
		hiringPage.clickOnAddToTalentPoolListforHiring();
		hiringPage.clickOnSaveButton();
		hiringPage.clickOnCloseNotifyMessageButton();
		hiringPage.VerifyMandatoryFieldOfAddToTalentPoo();
		hiringPage.clickOnCancelButton();
		hiringPage.clickOnManageView();
	}
	/*Meatod  for Vendor Listing for Hiring*/
	public void GoToVendorListingPage()
	{
		
		hiringPage.clickOnVendorListingforHiring();	
		hiringPage.clickOnAddVendorListingforHiring();
		hiringPage.clickOnSaveAddConsultantList();
		hiringPage.VerifyMandatoryFieldOfAddVendorListing();
		hiringPage.clickOnCancelAddConsultantList();
	}
}
