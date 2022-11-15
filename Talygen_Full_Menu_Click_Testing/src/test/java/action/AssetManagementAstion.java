package action;

import org.openqa.selenium.WebDriver;

import pageobjects.ApprovalPage;
import pageobjects.AssetManagementPage;

public class AssetManagementAstion {
	WebDriver driver ; 
	AssetManagementPage assetManagementPage;
	
	public AssetManagementAstion(WebDriver driver)
	{
		this.driver= driver;
		assetManagementPage= new AssetManagementPage(driver);
	}
	
	public void GoToAssetManagementPage()
	{
		assetManagementPage.clickFullMenuDropDown();	
		assetManagementPage.clickAssetManagementLink();	
		
		
	}
	/*Meatod  for Group List for AssetManagement*/
	public void GoToGroupListPage()
	{
		
		assetManagementPage.clickOnGroupList();	
		assetManagementPage.clickOnAddNewGroupList();
		assetManagementPage.clickOnSaveButton();
		assetManagementPage.VerifyMandatoryFieldValidation();
		assetManagementPage.clickOnCancelButton();	
		
		
	}
	/*Meatod  for Product return for AssetManagement*/
	public void GoToRerturnListPage()
	{
		
		
		assetManagementPage.clickOnReturnProduct();
		
		
	}
	/*Meatod  for RFID Missing Product for AssetManagement*/
	public void GoToMissingProductPage()
	{
		
		
		assetManagementPage.clickOnRFIDMissingAssets();
		
		
	}
	/*Meatod  for Products Scan Summary for AssetManagement*/
	public void GoToProductsScanSummaryPage()
	{
		
		
		assetManagementPage.clickOnItemscansummery();
		
		
	}
	/*Meatod  for RFID Asset Listing for AssetManagement*/
	public void GoToRFIDAssetListingPage()
	{
		
		
		assetManagementPage.clickOnRFIDAssetListing();
		
		
	}
	/*Meatod  for Scanned Items for AssetManagement*/
	public void GoToScennedItemsPage()
	{
		
		
		assetManagementPage.clickOnScannedItems();
		assetManagementPage.clickOnSearchButton();
		assetManagementPage.clickOnAssignGroup();
		assetManagementPage.clickOnUnAssignGroup();
		
		
	}
	/*Meatod  for Scanned Items Status for AssetManagement*/
	public void GoToScennedItemsStatusPage()
	{
		
		
		assetManagementPage.clickOnScannedItemsStatus();
		
		
		
	}
	/*Meatod  for Scanned Items for AssetManagement*/
	public void GoToManageProductPage()
	{
		
		
		assetManagementPage.clickOnManagedProduct();
		assetManagementPage.clickOnAddNewProduct();
		assetManagementPage.clickOnSaveButtonOfCreateProduct();
		assetManagementPage.VerifyMandatoryFieldOfCreateProduct();
		assetManagementPage.clickOnCancelButtonOfCreateProduct();

		assetManagementPage.clickOnProductTransfer();
		assetManagementPage.clickOnProductTransferSaveButton();
		assetManagementPage.clickOnProductTransferCancelButton();
		
		assetManagementPage.clickOnInTransitProducts();
		assetManagementPage.clickOnExpandAll();
		assetManagementPage.clickOnBacktoList();
		
		assetManagementPage.clickOnDepreciation();
		assetManagementPage.clickOnBacktoList();
		
		assetManagementPage.clickOnImportProduct();
	}
	/*Meatod  for  Product Write-Off for AssetManagement*/
	public void GoToProductWriteOffPage()
	{
		
		
		assetManagementPage.clickOnProductWriteOff();
		assetManagementPage.clickOnAddNewProductWriteOff();
		assetManagementPage.clickOnSaveButtonOfAddNewProductWriteOff();
		assetManagementPage.clickOnCancelButtonOfAddNewProductWriteOff();
	}
	
	/*Meatod  for  MyProduct for AssetManagement*/
	public void GoToMyProductPage()
	{
		
		
		assetManagementPage.clickOnMyProducts();
		assetManagementPage.clickOnSelfAssignment();
		assetManagementPage.clickOnSaveButtonOfProductAssignment();
		assetManagementPage.clickOnCancelButtonOfProductAssignment();
		//assetManagementPage.clickOnCancelButtonOfCreateProduct();
		GoToAssetManagementPage();
		assetManagementPage.clickOnMyProducts();
		assetManagementPage.clickOnCheckOutRequestList();
		assetManagementPage.clickOnAddCheckOutRequest();
		assetManagementPage.clickOnSaveButtonOfAddCheckOutRequest();
		assetManagementPage.clickOnCancelButtonOfAddCheckOutRequest();
		GoToAssetManagementPage();
		assetManagementPage.clickOnMyProducts();

		assetManagementPage.clickOnAddCheckOutRequest();
		assetManagementPage.clickOnSaveButtonOfAddCheckOutRequest();
		assetManagementPage.clickOnCancelButtonOfAddCheckOutRequest();
	}
	
	/*Meatod  for  Product Product Report for AssetManagement*/
	public void GoToProductReportPage()
	{
		assetManagementPage.clickOnProductsReport();
		assetManagementPage.clickOnSearchButtonOfProductTypeReports();
	}

	
	/*Meatod  for  Product Assignment for AssetManagement*/
	public void GoToProductAssignmentPage()
	{
		assetManagementPage.clickOnProductAssignment();
		assetManagementPage.clickOnAddAssignmenProduct();
		assetManagementPage.clickOnSaveButtonOfAddCheckOutRequest();
		assetManagementPage.clickOnCancelButtonOfAddCheckOutRequest();
		assetManagementPage.clickOnReturnProductOfProductAssignment();
		assetManagementPage.clickOnRequestForReturnOfProductAssignment();
	}
	/*Meatod  for  Product Container for AssetManagement*/
	public void GoToProductContainerPage()
	{
		assetManagementPage.clickOnProductsContainerList();
		assetManagementPage.clickOnAddProductContainer();
		assetManagementPage.clickOnSaveButtonOfAddProductContainer();
		assetManagementPage.VerifyMandatoryFieldOfAddProductContaine();
		assetManagementPage.clickOnCancelButtonOfAddProductContaine();
	
	}
	/*Meatod  for  Product Type for AssetManagement*/
	public void GoToProductTypePage()
	{
		assetManagementPage.clickOnProductType();
		
		assetManagementPage.clickOnAddProductType();
		assetManagementPage.clickOnSaveButtonOfAddCheckOutRequest();
		assetManagementPage.clickOnCancelButtonOfAddCheckOutRequest();
		assetManagementPage.clickOnImportProductType();
		assetManagementPage.clickOnCancelButtonOfAddCheckOutRequest();
	
	}
	/*Meatod  for  AssetManagement Dashboard */
	public void GoToAssetManagementDashboard()
	{
		assetManagementPage.clickOnAssetManagementDashboard();
		
		
	
	}
}
