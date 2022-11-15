package action;

import org.openqa.selenium.WebDriver;


import pageobjects.CrmPage;

public class CrmAction {
	WebDriver driver ; 
	CrmPage crmPage;
	
	public CrmAction(WebDriver driver)
	{
		this.driver= driver;
		crmPage= new CrmPage(driver);
	}
	
	public void GoToCRMPage()
	{
		crmPage.clickFullMenuDropDown();	
		crmPage.clickOnCRM();	
		
		
	}
	/*Meatod  for Accounts Page */
	public void GoToAccountsPage()
	{
		
		crmPage.clickOnAccounts();	
		crmPage.clickOnPageTourGuide();
		crmPage.clickOnImportContact();
		crmPage.clickOnImportAccounts();
		//crmPage.clickOnPageTourGuide();
		crmPage.clickOnAddAccounts();

	}
	/*Meatod  for Brand Page */
	public void GoToBrandPage()
	{
		
		crmPage.clickOnBrand();	
		crmPage.clickOnPageTourGuideForBrand();
		crmPage.clickOnAddBrand();
		crmPage.clickOnsaveButton();
		crmPage.VerifyMandatoryFieldValidation();
		crmPage.clickOnCancelButton();	
	}
	/*Meatod  for Brand Page */
	public void GoToCampaignPage()
	{
		
		crmPage.clickOnCampaign();	
		crmPage.clickOnPageTourGuideForBrand();
		crmPage.clickOnFilter();
		//crmPage.clickOnManageView();
		crmPage.clickOnAddCampaign();
		crmPage.clickOnCancelButtonOfAddCampign();
		crmPage.clickOnManageView();
	}
	/*Meatod  for Communication Page */
	public void GoToCommunicationPage()
	{
		
		crmPage.clickOnCommunication();	
		crmPage.clickOnAddCommunication();
		crmPage.clickOnCancelAddCommunication();
		crmPage.clickOnCheckBox();
		crmPage.clickOnActive();
		crmPage.clickOnCheckBox();
		crmPage.clickOnInActive();
	}
	/*Meatod  for Contact Page */
	public void GoToContactPage()
	{
		
		crmPage.clickOnContact();	
		crmPage.clickOnPageTourGuideForBrand();
		crmPage.clickOnFilter();
		crmPage.clickOnAddContacts();
		crmPage.clickOnImportContacts();
		crmPage.clickOnManageView();
	}
	/*Meatod  for Contract Page */
	public void GoToContractPage()
	{
		
		crmPage.clickOnContract();	
		crmPage.clickOnPageTourGuideForBrand();
		crmPage.clickOnFilter();
		crmPage.clickOnAddContract();
	
		crmPage.clickOnManageView();
	}
	/*Meatod  for CRM Report Page */
	public void GoToCRMReportPage()
	{
		
		crmPage.clickOnCRMReport();	
		
	}
	/*Meatod  for Deal Page */
	public void GoToDealsPage()
	{
		
		crmPage.clickOnDeal();	
		crmPage.clickOnPageTourGuideForBrand();
		crmPage.clickOnFilter();
		crmPage.clickOnAddDeal();
	
		crmPage.clickOnManageView();
	}
	/*Meatod  for Goods Inward Page */
	public void GoToGoodsInwardPage()
	{
		
		crmPage.clickOnGoodsInward();	
		//crmPage.clickOnPageTourGuideForBrand();
		crmPage.clickOnFilter();
		crmPage.clickOnAddGoodsInward();
	
		crmPage.clickOnManageView();
	}
	/*Meatod  for Invoice Page */
	public void GoToInvoicePage()
	{
		
		crmPage.clickOnInvoice();	
		crmPage.clickOnFilter();
		crmPage.clickOnAddInvoice();
	
		crmPage.clickOnManageView();
	}
	/*Meatod  for Product type Page */
	public void GoToProductTypePage()
	{
		
		crmPage.clickOnProductType();	
		//crmPage.clickOnPageTourGuideForBrand();
		crmPage.clickOnFilter();
		crmPage.clickOnAddProductType();
		crmPage.clickOnSaveProductType();
		crmPage.clickOnCloseNotifyMessage();
		crmPage.VerifyMandatoryFieldOfAddProductType();
		crmPage.clickOnCancelProductType();
		crmPage.clickOnManageView();
	}
	/*Meatod  for Lead Page */
	public void GoToLeadPage()
	{
		
		crmPage.clickOnLead();	
		crmPage.clickOnPageTourGuideForBrand();
		crmPage.clickOnFilter();
		crmPage.clickOnAddLead();
		crmPage.clickOnSaveProductType();
		
		crmPage.VerifyMandatoryFieldOfManageLeadDetail();
		crmPage.clickOnCancelProductType();
		crmPage.clickOnImportLead();
		crmPage.clickOnBackToList();
		crmPage.clickOnManageView();
	}
	/*Meatod  for Product Manage Product Page */
	public void GoToManageProductPage()
	{
		
		crmPage.clickOnManageProduct();	
		crmPage.clickOnAddProduct();
		crmPage.clickOnSaveProductType();
		crmPage.VerifyMandatoryFieldOfAddProduct();
		crmPage.clickOnCancelProductType();
		
		crmPage.clickOnProductTransfer();
		crmPage.clickOnSaveProductType();
		crmPage.clickOnCloseNotifyMessage();
		crmPage.clickOnCancelProductType();
		crmPage.clickOnInTransitProduct();
		crmPage.clickOnBackToList();
		crmPage.clickOnDepreciation();
		crmPage.clickOnBackToList();
		crmPage.clickOnImportProduct();
		crmPage.clickOnCancelImportProduct();

		
	}
	/*Meatod  for PriceBook Page */
	public void GoToPriceBookPage()
	{
		
		crmPage.clickOnPriceBook();	
		crmPage.clickOnPageTourGuideForBrand();
		crmPage.clickOnFilter();
		crmPage.clickOnAddPriceBook();
		crmPage.clickOnSaveProductType();
		crmPage.VerifyMandatoryFieldOfPriceBook();
		crmPage.clickOnCancelProductType();
		crmPage.clickOnManageView();
	}
	/*Meatod  for Product Page */
	public void GoToProductPage()
	{
		
		crmPage.clickOnProduct();	
		crmPage.clickOnPageTourGuideForBrand();
		crmPage.clickOnFilter();
		crmPage.clickOnAddProducts();
		crmPage.clickOnSaveProductType();
		crmPage.VerifyMandatoryFieldOfAddProducts();
		crmPage.clickOncloseAddProducts();
		crmPage.clickOnManageView();
	}
	/*Meatod  for Purchase Order Page */
	public void GoToPurchaseOrderPage()
	{
		
		crmPage.clickOnPurchaseOrder();	
		crmPage.clickOnPageTourGuideForBrand();
		crmPage.clickOnFilter();
		crmPage.clickOnAddPurchaseOrder();
		crmPage.clickOnSaveProductType();
		crmPage.clickOnCloseNotifyMessage();
		crmPage.VerifyMandatoryFieldOfPurchaseOrder();
		crmPage.clickOnCancelProductType();
		crmPage.clickOnManageView();
	}
	/*Meatod  for Quote Page */
	public void GoToQuotePage()
	{
		
		crmPage.clickOnQuote();	
		crmPage.clickOnPageTourGuideForBrand();
		crmPage.clickOnFilter();
		crmPage.clickOnAddQuote();
		crmPage.clickOnSaveProductType();
		crmPage.clickOnCloseNotifyMessage();
	
		crmPage.clickOnCancelProductType();
		crmPage.clickOnManageView();
	}
	/*Meatod  for Sales Order Page */
	public void GoToSalesOrderPage()
	{
		
		crmPage.clickOnSalesOrder();	
		crmPage.clickOnPageTourGuideForBrand();
		crmPage.clickOnFilter();
		crmPage.clickOnAddSalesOrder();
		crmPage.clickOnSaveProductType();
		crmPage.clickOnCloseNotifyMessage();
		crmPage.VerifyMandatoryFieldOfSalesOrder();
		crmPage.clickOnCancelProductType();
		crmPage.clickOnManageView();
	}
	/*Meatod  for Stage Page */
	public void GoToStagePage()
	{
		
		crmPage.clickOnStage();	
		crmPage.clickOnPageTourGuideForBrand();
		crmPage.clickOnFilter();
		crmPage.clickOnAddStage();
		crmPage.clickOnSaveProductType();
		
		crmPage.VerifyMandatoryFieldOfStage();
		crmPage.clickOnCancelProductType();
		crmPage.clickOnManageView();
	}
	/*Meatod  for Vendor Page */
	public void GoToVendorPage()
	{
		
		crmPage.clickOnVendor();	

		crmPage.clickOnFilter();
		crmPage.clickOnAddVendor();
		crmPage.clickOnSaveProductType();
		
		crmPage.VerifyMandatoryFieldOfVendor();
		crmPage.clickOnCancelProductType();
		crmPage.clickOnManageView();
	}
}
