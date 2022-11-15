package pageobjects;

import static reporting.ComplexReportFactory.getTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.LogStatus;

import utils.WebBasePage;

public class AssetManagementPage extends WebBasePage{
	WebDriver driver ;
	public AssetManagementPage(WebDriver driver) {
		super(driver, "AssetManagementPage");
		this.driver=driver;
		// TODO Auto-generated constructor stub
	}
	public void clickFullMenuDropDown() {
		staticWait(3000);
        click(By.xpath("//span[text()='Full Menu']"), "Full Menu", 30);
        
    }
	/*
	 * Code for click testing of Group List for Asset Management
	 */
     public void clickAssetManagementLink()
     {		staticWait(2000);
    	 click(By.xpath("//ul/li[@data-name='Asset Management ']/span"),"Asset Management", 30);
    	 
     }
     public void clickOnGroupList()
     {		staticWait(2000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='Group List'])[3]"),"Group List", 30);
    	
    	 try {
    		 WebElement productsGroupList = driver.findElement(By.xpath("//div/span[text()='Products Group List']"));
    		 if (productsGroupList.isDisplayed()) {
				logger.info("Group List Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Group List Page not opened succesfully");
		}
     }
     public void clickOnAddNewGroupList()
     {		staticWait(2000);
    	 click(By.xpath("//span/a[@id='ancCreateItem']"),"Add new group list", 30);
    	 
     }
     public void clickOnSaveButton()
     {		staticWait(3000);
    	 click(By.xpath("//div/input[@id='btnSave']"),"Save Button", 30);
    	 
     }
     public void clickOnCancelButton()
     {		staticWait(2000);
    	 click(By.xpath("//div/a[@data-original-title='Cancel']"),"Cancel Button", 30);
    	 driver.navigate().refresh();
     }
     public void VerifyMandatoryFieldValidation() {
			int i = 0;
			String actualText;
			String expectedText;

			List<WebElement> errorMessageLocator = findMultipleElement(
					By.xpath("//span[contains(@class,'invalid-feedback')]"), 45);
			String[] expectedValue = { "C","Reader" };
			for (Object expected : expectedValue) {
				WebElement AsteriskField = findElementVisibility(By.xpath("//label[contains(text(),'"+ expected +"')]/ancestor::div[@class='form-group']/descendant::span[@class='mandatory']"), 45);
				if (AsteriskField != null) {
					getTest().log(LogStatus.PASS, "The Asterisk symbol is displayed for " + expected + " field");
					logger.info("The Asterisk symbol is displayed for " + expected + " field");
				} else {
					getTest().log(LogStatus.FAIL, "The Asterisk symbol is not displayed for " + expected + " field");
					logger.info("The Asterisk symbol is not displayed for " + expected + " field");
					takeScreenshot(expected.toString());
				}

				List<WebElement> expectedElements = errorMessageLocator;
				for (WebElement element : expectedElements) {
					i++;
					actualText = element.getText();
					expectedText = expected.toString();

					if (actualText.indexOf(expectedText) != -1) {
						getTest().log(LogStatus.PASS,
								"Error message for \"" + expected + "\" field is displayed as expected");
						logger.info("Error message for \"" + expected + "\" field is displayed as expected");
						i = 0;
						break;
					} else if (i == expectedValue.length && !element.getText().contains(expectedText)) {
						getTest().log(LogStatus.FAIL, "Error message for \"" + expected + "\" field is not displayed");
						logger.info("Error message for \"" + expected + "\" field is displayed as expected");
						takeScreenshot(expectedText);
					}
				}

			}
		}
     /*-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
     /*Code for click testing of Return Product Page */
     public void clickOnReturnProduct()
     {		staticWait(2000);
    	 click(By.xpath("//div/ul/li/a[@data-original-title='Return Products']"),"Return product", 30);
    	
    	 try {
    		 WebElement returnList = driver.findElement(By.xpath("//div/span[contains(text(),'Return List')]"));
    		 if (returnList.isDisplayed()) {
				logger.info("Return List Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Return List Page not opened succesfully");
		}
    	 driver.navigate().refresh();
     }
     /*-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
     /*Code for click testing of RFID Missing Assets */
     public void clickOnRFIDMissingAssets()
     {		staticWait(2000);
    	 click(By.xpath("//div/ul/li/a[@data-original-title='RFID Missing Assets']"),"RFID Misssing Assets", 30);
    	
    	 try {
    		 WebElement manageExternalLink = driver.findElement(By.xpath("//div/span[contains(text(),'Missing Product')]"));
    		 if (manageExternalLink.isDisplayed()) {
				logger.info("Missing Product Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Missing Product Page not opened succesfully");
		}
    	 driver.navigate().refresh();
     }
     /*-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
     /*Code for click testing of Item scan summery */
     public void clickOnItemscansummery()
     {		staticWait(2000);
    	 click(By.xpath("//div/ul/li/a[@data-original-title='Items Scan Summary']"),"Item scan summery", 30);
    	
    	 try {
    		 WebElement manageExternalLink = driver.findElement(By.xpath("//div/span[contains(text(),'Products Scan Summary')]"));
    		 if (manageExternalLink.isDisplayed()) {
				logger.info("Products Scan Summary Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Products Scan Summary Page not opened succesfully");
		}
    	 driver.navigate().refresh();
     }
     /*-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
     /*Code for click testing ofRFID Asset Listing */
     public void clickOnRFIDAssetListing()
     {		staticWait(2000);
    	 click(By.xpath("//div/ul/li/a[@data-original-title='RFID Asset Listing']"),"Item scan summery", 30);
    	
    	 try {
    		 WebElement rFIDAssetListing = driver.findElement(By.xpath("//div/span[contains(text(),'RFID Asset Listing')]"));
    		 if (rFIDAssetListing.isDisplayed()) {
				logger.info("RFID Asset Listing Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("RFID Asset Listing Page not opened succesfully");
		}
    	 driver.navigate().refresh();
     }
     /*-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
     /*Code for click testing of Scanned Item */
     public void clickOnScannedItems()
     {		staticWait(2000);
    	 click(By.xpath("//div/ul/li/a[@data-original-title='Scanned Items']"),"Scanned Items", 30);
    	
    	 try {
    		 WebElement rFIDAssetListing = driver.findElement(By.xpath("//div/span[contains(text(),'Scanned Items')]"));
    		 if (rFIDAssetListing.isDisplayed()) {
				logger.info("Scanned Items Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Scanned Items Page not opened succesfully");
		}
     }
     public void clickOnSearchButton()
     {		staticWait(2000);
    	 click(By.xpath("//div/a[@data-original-title='Search']"),"Search Button", 30);
     }
     public void clickOnAssignGroup()
     {		staticWait(2000);
    	 click(By.xpath("//span/a[@data-original-title='Assign Group']"),"Assign Group", 30);
    	 click(By.xpath("//button[@title='OK']"),"OK", 30);
    	
    	     }
     public void clickOnUnAssignGroup()
     {		staticWait(2000);
    	 click(By.xpath("//span/a[@data-original-title='Unassign Group']"),"UnAssign Group", 30);
    	 click(By.xpath("//button[@title='OK']"),"OK", 30);
    	 driver.navigate().refresh();
    	     }
     /*-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
     /*Code for click testing of Scanned Item Status */
     public void clickOnScannedItemsStatus()
     {		staticWait(2000);
    	 click(By.xpath("//div/ul/li/a[@data-original-title='Scanned Items Status']"),"Scanned Items Status", 30);
    	
    	 try {
    		 WebElement ScannedItemsStatus = driver.findElement(By.xpath("//div/span[contains(text(),'Scanned Items')]"));
    		 if (ScannedItemsStatus.isDisplayed()) {
				logger.info("Scanned Items status Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Scanned Items status Page not opened succesfully");
		}
    	 driver.navigate().refresh();
     }
     /*-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
     /*Code for click testing of Manage Product */
     public void clickOnManagedProduct()
     {		staticWait(2000);
    	 click(By.xpath("//div/ul/li/a[@data-original-title='Manage Product']"),"Managed Product", 30);
    	
    	 try {
    		 WebElement ScannedItemsStatus = driver.findElement(By.xpath("//div/span[contains(text(),'Product List')]"));
    		 if (ScannedItemsStatus.isDisplayed()) {
				logger.info("Product List Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Product List Page not opened succesfully");
		}
     }
     public void clickOnAddNewProduct()
     {		staticWait(2000);
    	 click(By.xpath("//span/a[@data-original-title='Add Product']"),"Add New Product", 30);
    	
    	 try {
    		 WebElement addNewProduct = driver.findElement(By.xpath("//h5/span[text()='Create Product']"));
    		 if (addNewProduct.isDisplayed()) {
				logger.info("Add New Product Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Add New Product Page not opened succesfully");
		}
     }
     public void clickOnSaveButtonOfCreateProduct()
     {		staticWait(3000);
    	 click(By.xpath("//a[@data-original-title='Save']"),"Save Button", 30);
    	 
     }
     public void clickOnCancelButtonOfCreateProduct()
     {		staticWait(3000);
    	 click(By.xpath("//a[@data-original-title='Cancel']"),"Cancel Button", 30);
    	 
     }
     public void VerifyMandatoryFieldOfCreateProduct() {
			int i = 0;
			String actualText;
			String expectedText;

			List<WebElement> errorMessageLocator = findMultipleElement(
					By.xpath("//span[contains(@class,'invalid-feedback')]"), 45);
			String[] expectedValue = { "Product Type","Product Name","Barcode Type" };
			for (Object expected : expectedValue) {
				WebElement AsteriskField = findElementVisibility(By.xpath("//label[contains(text(),'"+ expected +"')]/ancestor::div[@class='form-group']/descendant::span[@class='mandatory']"), 45);
				if (AsteriskField != null) {
					getTest().log(LogStatus.PASS, "The Asterisk symbol is displayed for " + expected + " field");
					logger.info("The Asterisk symbol is displayed for " + expected + " field");
				} else {
					getTest().log(LogStatus.FAIL, "The Asterisk symbol is not displayed for " + expected + " field");
					logger.info("The Asterisk symbol is not displayed for " + expected + " field");
					takeScreenshot(expected.toString());
				}

				List<WebElement> expectedElements = errorMessageLocator;
				for (WebElement element : expectedElements) {
					i++;
					actualText = element.getText();
					expectedText = expected.toString();

					if (actualText.indexOf(expectedText) != -1) {
						getTest().log(LogStatus.PASS,
								"Error message for \"" + expected + "\" field is displayed as expected");
						logger.info("Error message for \"" + expected + "\" field is displayed as expected");
						i = 0;
						break;
					} else if (i == expectedValue.length && !element.getText().contains(expectedText)) {
						getTest().log(LogStatus.FAIL, "Error message for \"" + expected + "\" field is not displayed");
						logger.info("Error message for \"" + expected + "\" field is displayed as expected");
						takeScreenshot(expectedText);
					}
				}

			}
		}
     public void clickOnProductTransfer()
     {		staticWait(2000);
    	 click(By.xpath("//span/a[@data-original-title='Product Transfer']"),"Product Transfer", 30);
    	
    	 try {
    		 WebElement addNewProduct = driver.findElement(By.xpath("//div/span[text()='Product Transfer']"));
    		 if (addNewProduct.isDisplayed()) {
				logger.info("Product Transfer Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Product Transfer Page not opened succesfully");
		}
     }
     public void clickOnProductTransferSaveButton()
     {		staticWait(2000);
    	 click(By.xpath("//div/a[@id='saveBtn']"),"Save Button", 30);
    	  String errorMessage = getText(By.xpath("//div/span[text()='Please correct the highlighted errors.']"),30);
    	  logger.info(errorMessage);
    	  click(By.xpath("//button[@id='closenotifymessage']/span/i"),"Close Button", 30);
     }
     public void clickOnProductTransferCancelButton()
     {		staticWait(2000);
    	 click(By.xpath("//div/a[@id='cancelBtn']"),"Cancel Button", 30);
     }
     public void clickOnInTransitProducts()
     {		staticWait(2000);
    	 click(By.xpath("//span/a[@data-original-title='In-Transit Products']"),"In-Transit Products", 30);
    	
    	 try {
    		 WebElement addNewProduct = driver.findElement(By.xpath("//div/span[text()='In-Transit List']"));
    		 if (addNewProduct.isDisplayed()) {
				logger.info("In-Transit Products Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("In-Transit Productsr Page not opened succesfully");
		}
     }
     public void clickOnExpandAll()
     {		staticWait(2000);
    	 clickByJavascript(By.xpath("//div/a[text()='Expand All or Collapse All']"),"Expand All or Collapse All", 30);
     }
     public void clickOnBacktoList()
     {		staticWait(2000);
    	 clickByJavascript(By.xpath("//span/a[@data-original-title='Back to list']"),"Back to list", 30);
     }
     
     public void clickOnDepreciation()
     {		staticWait(2000);
    	 click(By.xpath("//span/a[@data-original-title='Depreciation']"),"Depreciation", 30);
    	
    	 try {
    		 WebElement ScannedItemsStatus = driver.findElement(By.xpath("//div/span[contains(text(),'Depreciation List')]"));
    		 if (ScannedItemsStatus.isDisplayed()) {
				logger.info("Depreciation List Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Depreciation List Page not opened succesfully");
		}
     }
     
     public void clickOnImportProduct()
     {		staticWait(2000);
    	 click(By.xpath("//span/a[@data-original-title='Import Product']"),"Import Product", 30);
    	
    	 try {
    		 WebElement ScannedItemsStatus = driver.findElement(By.xpath("//div/span[contains(text(),'Import Product')]"));
    		 if (ScannedItemsStatus.isDisplayed()) {
				logger.info("Import Product Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Import Product Page not opened succesfully");
		}
    	 driver.navigate().refresh();
     }
     /*-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
     /*Code for click testing of Product Write-off */
     public void clickOnProductWriteOff()
     {		staticWait(2000);
    	 click(By.xpath("//div/ul/li/a[@data-original-title='Product Write-Off']"),"Product Write-Off", 30);
    	
    	 try {
    		 WebElement ScannedItemsStatus = driver.findElement(By.xpath("//div/span[contains(text(),'Product Write-Off')]"));
    		 if (ScannedItemsStatus.isDisplayed()) {
				logger.info("Product Write-Off Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Product Write-Off Page not opened succesfully");
		}
     }
     public void clickOnAddNewProductWriteOff()
     {		staticWait(2000);
    	 click(By.xpath("//span/a[@data-original-title='Add Product Write-Off']"),"Add New Product Write Off", 30);
    	
    	 try {
    		 WebElement AddNewProductWriteOff = driver.findElement(By.xpath("//div/span[text()='Add Product Write-Off']"));
    		 if (AddNewProductWriteOff.isDisplayed()) {
				logger.info("Add Product Write-Off Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Add Product Write-Off Page not opened succesfully");
		}
     }
     public void clickOnSaveButtonOfAddNewProductWriteOff()
     {		staticWait(2000);
    	 click(By.xpath("//div/a[@id='saveBtn']"),"Save Button", 30);
    	 click(By.xpath("//button[@id='closenotifymessage']"),"close notify message", 30);
     }
     public void clickOnCancelButtonOfAddNewProductWriteOff()
     {		staticWait(2000);
    	 click(By.xpath("//a[@id='cancelBtn']"),"Cancel Button", 30);
    	 driver.navigate().refresh();
     }
     /*-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
     /*Code for click testing of My Products */
     public void clickOnMyProducts()
     {		staticWait(2000);
    	 click(By.xpath("//div/ul/li/a[@data-original-title='My Products']"),"My Products", 30);
    	
    	 try {
    		 WebElement myProducts = driver.findElement(By.xpath("//div/span[contains(text(),'My Products')]"));
    		 if (myProducts.isDisplayed()) {
				logger.info("My Product Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("My Product Page not opened succesfully");
		}
     }
     public void clickOnSelfAssignment()
     {		staticWait(2000);
    	 click(By.xpath("//span/a[@data-original-title='Self Assignment']"),"Self Assignment", 30);
    	
    	 try {
    		 WebElement myProducts = driver.findElement(By.xpath("//div/span[contains(text(),'Product Assignment')]"));
    		 if (myProducts.isDisplayed()) {
				logger.info("Product Assignment Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Product Assignment Page not opened succesfully");
		}
     }
     public void clickOnSaveButtonOfProductAssignment()
     {		staticWait(2000);
    	 click(By.xpath("//div/a[@id='btnSave']"),"Save Button", 30);
    	 click(By.xpath("//button[@id='closenotifymessage']"),"close notify message", 30);
     }
     public void clickOnCancelButtonOfProductAssignment()
     {		staticWait(2000);
    	 click(By.xpath("//a[@data-original-title='Cancel']"),"Cancel Button", 30);
    	
     }
     public void clickOnCheckOutRequestList()
     {		staticWait(2000);
    	 click(By.xpath("//span/a[@data-original-title='Check Out Request List']"),"Check Out Request List", 30);
    	
    	 try {
    		 WebElement CheckOutList = driver.findElement(By.xpath("//div/span[contains(text(),'Check-Out List')]"));
    		 if (CheckOutList.isDisplayed()) {
				logger.info("Check-Out List Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Check-Out List Page not opened succesfully");
		}
     }
     public void clickOnAddCheckOutRequest()
     {		staticWait(2000);
    	 click(By.xpath("//span/a[@data-original-title='Add Check Out Request']"),"AddCheckOutRequest", 30);
    	 try {
    		 WebElement addCheckOutRequest = driver.findElement(By.xpath("//div/span[contains(text(),'Check-Out List')]"));
    		 if (addCheckOutRequest.isDisplayed()) {
				logger.info("Add Check-Out List Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Add Check-Out List Page not opened succesfully");
		}
     }
     public void clickOnSaveButtonOfAddCheckOutRequest()
     {		staticWait(2000);
    	 click(By.xpath("//div/a[@data-original-title='Save']"),"Save Button", 30);
    	 click(By.xpath("//button[@id='closenotifymessage']"),"close notify message", 30);
     }
     public void clickOnCancelButtonOfAddCheckOutRequest()
     {		staticWait(2000);
    	 click(By.xpath("//div/a[@data-original-title='Cancel']"),"Cancel Button", 30);
    	 driver.navigate().refresh();
     }
     /*-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
     /*Code for click testing of Products Report */
     public void clickOnProductsReport()
     {		staticWait(2000);
    	 click(By.xpath("//div/ul/li/a[@data-original-title='Product Report']"),"Product Report", 30);
    	
    	 try {
    		 WebElement myProducts = driver.findElement(By.xpath("//div/span[contains(text(),'Product Type Reports')]"));
    		 if (myProducts.isDisplayed()) {
				logger.info("Product Type Reports Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Product Type Reports Page not opened succesfully");
		}
     }
     public void clickOnSearchButtonOfProductTypeReports()
     {		staticWait(2000);
    	 click(By.xpath("//div/a[@id='aSearch']"),"Search Button", 30);
    	 try {
    		 WebElement ProductTypeReports = driver.findElement(By.xpath("//div[@id='viewer_logo']"));
    		 if (ProductTypeReports.isDisplayed()) {
				logger.info("ProductTypeReports Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("ProductTypeReports Page not opened succesfully");
		}
    	 clickByJavascript(By.xpath("//a[@id='Clear']"),"Clear Button", 30);
    	 driver.navigate().refresh();
     }
     /*-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
     /*Code for click testing of Products Report */
     public void clickOnProductAssignment()
     {		staticWait(2000);
    	 click(By.xpath("//div/ul/li/a[@data-original-title='Product Assignment']"),"Product Assignment", 30);
    	
    	 try {
    		 WebElement myProducts = driver.findElement(By.xpath("//div/span[contains(text(),'Product Assignment')]"));
    		 if (myProducts.isDisplayed()) {
				logger.info("Product Assignment Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Product Assignment Page not opened succesfully");
		}
     }
     public void clickOnAddAssignmenProduct()
     {		staticWait(2000);
    	 click(By.xpath("//span/a[@id='ancCreateJob']"),"Add Assignmen Product", 30);
    	
    	 try {
    		 WebElement AddAssignmentProduct = driver.findElement(By.xpath("//div/span[contains(text(),'Product Assignment')]"));
    		 if (AddAssignmentProduct.isDisplayed()) {
				logger.info("Product Assignment Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Product Assignment Page not opened succesfully");
		}
     }
     public void clickOnReturnProductOfProductAssignment()
     {		staticWait(2000);
    	 click(By.xpath("//span/a[@id='ancReturnItem']"),"Product Return", 30);
    	 click(By.xpath("//button[@id='closenotifymessage']"),"Close notify message", 30);
     }
     public void clickOnRequestForReturnOfProductAssignment()
     {		staticWait(2000);
    	 click(By.xpath("//span/a[@id='ancRequstForReturn']"),"Request For Return", 30);
    	 click(By.xpath("//button[@id='closenotifymessage']"),"Close notify message", 30);
    	 driver.navigate().refresh();
     }
     /*-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
     /*Code for click testing of Products Container List */     
     public void clickOnProductsContainerList()
     {		staticWait(2000);
    	 click(By.xpath("//div/ul/li/a[@data-original-title='Products Container List']"),"Products Container List", 30);
    	
    	 try {
    		 WebElement ProductsContainerList = driver.findElement(By.xpath("//div/span[contains(text(),'Product Container')]"));
    		 if (ProductsContainerList.isDisplayed()) {
				logger.info("Product Container Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Product Container Page not opened succesfully");
		}
     }
     public void clickOnAddProductContainer()
     {		staticWait(2000);
    	 click(By.xpath("//span/a[@data-original-title='Add Product Container']"),"Add Product Container", 30);
    	
    	 try {
    		 WebElement addProductContainer = driver.findElement(By.xpath("//div/span[text()='Add Product Container List']"));
    		 if (addProductContainer.isDisplayed()) {
				logger.info("Add Product Container Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Add Product Container Page not opened succesfully");
		}
     }
     public void clickOnSaveButtonOfAddProductContainer()
     {		staticWait(3000);
    	 click(By.xpath("//a[@data-original-title='Save']"),"Save Button", 30);
    	 
     }
     public void clickOnCancelButtonOfAddProductContaine()
     {		staticWait(3000);
    	 click(By.xpath("//a[@data-original-title='Cancel']"),"Cancel Button", 30);
    	 driver.navigate().refresh(); 
     }
     public void VerifyMandatoryFieldOfAddProductContaine() {
			int i = 0;
			String actualText;
			String expectedText;

			List<WebElement> errorMessageLocator = findMultipleElement(
					By.xpath("//span[contains(@class,'invalid-feedback')]"), 45);
			String[] expectedValue = { "Product Type","Select Container" };
			for (Object expected : expectedValue) {
				WebElement AsteriskField = findElementVisibility(By.xpath("//label[contains(text(),'"+ expected +"')]/ancestor::div[@class='form-group']/descendant::span[@class='mandatory']"), 45);
				if (AsteriskField != null) {
					getTest().log(LogStatus.PASS, "The Asterisk symbol is displayed for " + expected + " field");
					logger.info("The Asterisk symbol is displayed for " + expected + " field");
				} else {
					getTest().log(LogStatus.FAIL, "The Asterisk symbol is not displayed for " + expected + " field");
					logger.info("The Asterisk symbol is not displayed for " + expected + " field");
					takeScreenshot(expected.toString());
				}

				List<WebElement> expectedElements = errorMessageLocator;
				for (WebElement element : expectedElements) {
					i++;
					actualText = element.getText();
					expectedText = expected.toString();

					if (actualText.indexOf(expectedText) != -1) {
						getTest().log(LogStatus.PASS,
								"Error message for \"" + expected + "\" field is displayed as expected");
						logger.info("Error message for \"" + expected + "\" field is displayed as expected");
						i = 0;
						break;
					} else if (i == expectedValue.length && !element.getText().contains(expectedText)) {
						getTest().log(LogStatus.FAIL, "Error message for \"" + expected + "\" field is not displayed");
						logger.info("Error message for \"" + expected + "\" field is displayed as expected");
						takeScreenshot(expectedText);
					}
				}

			}
		}
     /*-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
     /*Code for click testing of Products Type */     
     public void clickOnProductType()
     {		staticWait(2000);
    	 click(By.xpath("//div/ul/li/a[@data-original-title='Product Type']"),"Products TYpe", 30);
    	
    	 try {
    		 WebElement ProductsTYpe = driver.findElement(By.xpath("//div/span[contains(text(),'Product Type')]"));
    		 if (ProductsTYpe.isDisplayed()) {
				logger.info("Product Type Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Product Type Page not opened succesfully");
		}
     }
     public void clickOnAddProductType()
     {		staticWait(2000);
    	 click(By.xpath("//div/span/a[@data-original-title='Add Product Type']"),"Add Products TYpe", 30);
    	
    	 try {
    		 WebElement ProductsTYpe = driver.findElement(By.xpath("//div/span[contains(text(),'Product Type')]"));
    		 if (ProductsTYpe.isDisplayed()) {
				logger.info("Add Product Type Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info(" Add Product Type Page not opened succesfully");
		}
     }
     public void clickOnImportProductType()
     {		staticWait(3000);
    	 clickByJavascript(By.xpath("//div/span/a[@data-original-title='Import Product Type']"),"Import Product Type", 30);
    	
    	 try {
    		 WebElement ProductsTYpe = driver.findElement(By.xpath("//div/span[text()='Import Product Type']"));
    		 if (ProductsTYpe.isDisplayed()) {
				logger.info("Import Product Type Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Import Product Type Page not opened succesfully");
		}
     }
     public void clickOnAssetManagementDashboard()
     {		staticWait(3000);
    	 clickByJavascript(By.xpath("//span[text()='Asset Management ']//a[text()='Dashboard']"),"Asset Management Dashboard", 30);
    	
    	 try {
    		 WebElement ProductsTYpe = driver.findElement(By.xpath("//div/span[text()='Import Product Type']"));
    		 if (ProductsTYpe.isDisplayed()) {
				logger.info("Asset Management Dashboard Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Asset Management Dashboard Page not opened succesfully");
		}
    	 driver.navigate().refresh();
     }
     }

