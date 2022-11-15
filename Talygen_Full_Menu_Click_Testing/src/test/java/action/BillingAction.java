package action;

import org.openqa.selenium.WebDriver;

import pageobjects.AssetManagementPage;
import pageobjects.BillingPage;

public class BillingAction {
	WebDriver driver ; 
	BillingPage billingPage;
	
	public BillingAction(WebDriver driver)
	{
		this.driver= driver;
		billingPage= new BillingPage(driver);
	}
	
	public void GoToBillingPage()
	{
		billingPage.clickFullMenuDropDown();	
		billingPage.clickOnBillingLink();	
		}
	/*Meatod  for Automate Flag Processing for Billing*/
	public void GoToAutomateFlagProcessingPage()
	{
		
		billingPage.clickOnAutomateFlagProcessing();	
		billingPage.clickOnAddNewAutomateFlagProcessing();
		billingPage.clickOnSaveButton();
		billingPage.VerifyMandatoryFieldValidation();
		billingPage.clickOnCancelButton();	
		
		
	}
	/*Meatod  for Billing Rule for Billing*/
	public void GoToBillingRulePage()
	{
		
		billingPage.clickOnBillingRule();	
		billingPage.clickOnAddNewBillingRule();
		billingPage.clickOnNextButton();
		billingPage.VerifyMandatoryFieldValidationOfAddBillingRulePage();
		billingPage.clickOnCancelButton();	
		billingPage.clickOnExportToExcel();
		
	}
	/*Meatod  for Billing Service for Billing*/
	public void GoToBillingServicePage()
	{
		
		billingPage.clickOnBillingService();	
		billingPage.clickOnAddNewBillingService();
		billingPage.clickOnSaveButtonOfBillingService();
		billingPage.VerifyMandatoryFieldValidationOfAddBillingServicePage();
		billingPage.clickOnCancelButton();	
	
		
	}
	/*Meatod  for Billing Setup for Billing*/
	public void GoToBillingSetupPage()
	{
		
		billingPage.clickOnBillingSetup();	
		billingPage.clickOnAddNewBillingSetup();
		billingPage.clickOnImport();
		billingPage.VerifyMandatoryFieldValidationOfAddBillingSetupPage();
		billingPage.clickOnCancelButton();	
	
		
	}
	/*Meatod  for Flag Records for Billing*/
	public void GoToFlagRecordsPage()
	{
		
		billingPage.clickOnFlagRecords();	
		billingPage.clickOnProcess();
		billingPage.clickOnDoNotBill();
		billingPage.clickOnUpdate();
		billingPage.clickOnFlagSummaryReport();	
		billingPage.clickOnInvoiceDetailReport();	
		
	
		
	}
	/*Meatod  for Client Report for Billing*/
	public void GoToClientReportPage()
	{
		
		billingPage.clickOnClientReport();	
		billingPage.clickOnSearch();
		billingPage.clickOnClearButton();
			
		
	
		
	}
	/*Meatod  for Add new invoice for Billing*/
	public void GoToAddNewInvoicePage()
	{
		
		billingPage.clickOnAddNewInvoice();	
		billingPage.clickOnAddInvoiceSaveButton();
		billingPage.VerifyMandatoryFieldValidationOfAddInvoicePage();	
	}
	/*Meatod  for Import invoice for Billing*/
	public void GoToImportInvoicePage()
	{
		
		billingPage.clickOnImportInvoice();	
		billingPage.clickOnImportManageInvoiceFiles();
		//billingPage.VerifyMandatoryFieldValidationOfAddInvoicePage();
		billingPage.clickOnCancelButton();	
	}
	/*Meatod  for invoice for Billing*/
	public void GoToInvoicePage()
	{
		
		billingPage.clickOnInvoice();	
		billingPage.clickOnPageTour();
		billingPage.clickOnManualInvoice();
		billingPage.clickOnAddManualInvoiceSaveButton();
		billingPage.clickOnCancelButton();	
	}
	/*Meatod  for invoice report for Billing*/
	public void GoToInvoiceReportPage()
	{
		
		billingPage.clickOnInvoiceREport();	
		billingPage.clickOnSearch();
		billingPage.clickOnClearButtonofInvoiceReport();
		
	}
	/*Meatod  for Queue List for Billing*/
	public void GoToProcessAndReprocessChargesPage()
	{
		
		billingPage.clickOnProcessAndReprocessCharges();	
		billingPage.clickOnViewQueueList();
		
	}
	/*Meatod  for View History*/
	public void GoToViewRateSchedulePage()
	{
		billingPage.clickOnRateSchedule();
		billingPage.clickOnAddRateSchedule();
		billingPage.clickOnUpdateRateSchedul();
		billingPage.clickOnCopyRate();
		billingPage.clickOnViewHistory();

		
	}
	/*Meatod  for Received Invoice*/
	public void GoToReceivedInvoicePage()
	{
		billingPage.clickOnReceivedInvoice();
		
		
	}
}
