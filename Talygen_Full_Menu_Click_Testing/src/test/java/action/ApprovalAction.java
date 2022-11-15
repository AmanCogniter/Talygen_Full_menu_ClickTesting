package action;

import org.openqa.selenium.WebDriver;


import pageobjects.ApprovalPage;

public class ApprovalAction {
	WebDriver driver ; 
	ApprovalPage approvalPage;
	
	public ApprovalAction(WebDriver driver)
	{
		this.driver= driver;
		approvalPage= new ApprovalPage(driver);
	}
	
	public void GoToApprovalPage()
	{
		approvalPage.clickFullMenuDropDown();	
		approvalPage.clickOnApprovalLink();	
		
		
	}
	/*Meatod  for Approval Chain for Approval*/
	public void GoToApprovalChain()
	{
		
		approvalPage.clickOnApprovalChain();	
		approvalPage.clickOnExpandButton();
		approvalPage.clickOnPageTour();
		approvalPage.clickOnAddApprovalChain();
		approvalPage.clickOnSaveButton();	
		approvalPage.VerifyMandatoryFieldValidation();
		approvalPage.clickOnCancelButton();
		
	}
	/*Meatod  for Approval Group for Approval*/
	public void GoToApprovalGroup()
	{
		
		approvalPage.clickOnApprovalGroup();	
		approvalPage.clickOnExpandButton();
		approvalPage.clickOnPageTour();
		approvalPage.clickOnAddApprovalGroup();	
		approvalPage.clickOnSaveButton();
		approvalPage.VerifyMandatoryFieldOfApprovalGroup();
		approvalPage.clickOnCancelButton();
		
	}
	/*Meatod  for Approval Report for Approval*/
	public void GoToApprovalReport()
	{
		
		approvalPage.clickOnApprovalReport();	
		approvalPage.clickOnSearchButton();
		approvalPage.clickOnClearButton();
		
		
	}
	/*Meatod  for Approval Chain for Approval*/
	public void GoToApprovalRule()
	{
		
		approvalPage.clickOnApprovalRule();	
		approvalPage.clickOnExpandButton();
		approvalPage.clickOnPageTour();
		approvalPage.clickOnAddApprovalRule();
		approvalPage.clickOnSaveButton();	
		approvalPage.VerifyMandatoryFieldOfApprovalRule();
		approvalPage.clickOnCancelButton();
		
	}
}
