package pageobjects;

import static reporting.ComplexReportFactory.getTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.relevantcodes.extentreports.LogStatus;

import utils.WebBasePage;

public class CrmPage extends WebBasePage{
	WebDriver driver ;
	public CrmPage(WebDriver driver) {
		super(driver, "CrmPage");
		this.driver=driver;
		// TODO Auto-generated constructor stub
	}
	public void clickFullMenuDropDown() {
		staticWait(3000);
        click(By.xpath("//span[text()='Full Menu']"), "Full Menu", 30);
        
    }
	/*
	 * Code for click testing of Accounts for Crm
	 */
     public void clickOnCRM()
     {		staticWait(2000);
    	 click(By.xpath("//ul/li[@data-name='CRM']/span"),"CRM", 30);
    	 
     }
     public void clickOnAccounts()
     {		staticWait(2000);
    	 click(By.xpath("//div/ul/li/a[@data-original-title='Accounts']"),"Accounts", 30);
    	
    	 try {
    		 WebElement accountsPage = driver.findElement(By.xpath("//div/span[text()='Accounts']"));
    		 if (accountsPage.isDisplayed()) {
				logger.info("Accounts Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Accounts Page not opened succesfully");
		}
     }
     public void clickOnPageTourGuide()
     {		staticWait(2000);
    	 clickByJavascript(By.xpath("//span/div/a[@data-original-title='Page Tour']"),"Page Tour Guide", 30);
    	 click(By.xpath("//*[name()='svg' and @class='guided-tour-icon']"),"Close page tour guide", 30);
     }
     public void clickOnImportContact()
     {		staticWait(2000);
    	 click(By.xpath("//span/div/a[@data-original-title='Import Contacts']"),"Import Contacts", 30);
    	
    	 try {
    		 WebElement importContacts = driver.findElement(By.xpath("//div/span[text()='Import Contacts']"));
    		 if (importContacts.isDisplayed()) {
				logger.info("Import Contacts Page opened succesfully");
				clickByJavascript(By.xpath("//div/span/a[@data-original-title='Back to list']"),"Back to list", 30);
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Import Contacts Page not opened succesfully");
		}
     }
     public void clickOnImportAccounts()
     {		staticWait(2000);
    	 click(By.xpath("//span/div/a[@data-original-title='Import Accounts']"),"Import Accounts", 30);
    	
    	 try {
    		 WebElement importAccounts = driver.findElement(By.xpath("//div/span[text()='Import Accounts']"));
    		 if (importAccounts.isDisplayed()) {
				logger.info("Import Account Page displayed succesfully");
				clickByJavascript(By.xpath("//div/span/a[@data-original-title='Back to list']"),"Back to list", 30);
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Import accounts Page not opened succesfully");
		}
     }
     public void clickOnAddAccounts()
     {		staticWait(2000);
    	 click(By.xpath("//span/div/a[@data-original-title='Add Account']"),"Add Accounts", 30);
    	
    	 try {
    		 WebElement addAccounts = driver.findElement(By.xpath("//div/h5[text()='Select Account Type']"));
    		 if (addAccounts.isDisplayed()) {
				logger.info("Select Account type Page displayed succesfully");
				staticWait(2000);
				click(By.xpath("//div/h5[text()='Select Account Type']/ancestor::div[@class='modal-content']/descendant::button[@data-original-title='Close']"),"Close Button", 30);
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Select accounts type Page not opened succesfully");
		}
    	 driver.navigate().refresh();
     }
     /*--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
     /*
  	 * Code for click testing of Brand for CRM
  	 */
     public void clickOnBrand()
     {		staticWait(2000);
    	 click(By.xpath("//div/ul/li/a[@data-original-title='Brand']"),"Brand", 30);
    	
    	 try {
    		 WebElement brandPage = driver.findElement(By.xpath("//div/span[text()='Brand']"));
    		 if (brandPage.isDisplayed()) {
				logger.info("Brand Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Brand Page not opened succesfully");
		}
     }
     public void clickOnPageTourGuideForBrand()
     {		staticWait(2000);
    	 clickByJavascript(By.xpath("//span/a[@data-original-title='Page Tour']"),"Page Tour Guide", 30);
    	 click(By.xpath("//*[name()='svg' and @class='guided-tour-icon']"),"Close page tour guide", 30);
     }
     public void clickOnAddBrand()
     {		staticWait(2000);
    	 click(By.xpath("//span/a[@data-original-title='Add Brand']"),"Add Brand", 30);
    	
    	 try {
    		 WebElement addbrandPage = driver.findElement(By.xpath("//div/h5[text()='Add Brand']"));
    		 if (addbrandPage.isDisplayed()) {
				logger.info("Add Brand Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Add Brand Page not opened succesfully");
		}
     }
     public void clickOnsaveButton()
     {		staticWait(2000);
    	 click(By.xpath("//div/a[@title='Save']"),"Save Button", 30);
     }
     public void clickOnCancelButton()
     {		staticWait(2000);
    	 click(By.xpath("//div/a[@title='Close']"),"Close Button", 30);
    	 driver.navigate().refresh();
     }
     public void VerifyMandatoryFieldValidation() {
			int i = 0;
			String actualText;
			String expectedText;

			List<WebElement> errorMessageLocator = findMultipleElement(
					By.xpath("//div/span[contains(@class,'invalid-feedback')]"), 45);
			String[] expectedValue = { "Brand Name"};
			for (Object expected : expectedValue) {
				WebElement AsteriskField = findElementVisibility(By.xpath("//label[contains(text(),'"+ expected +"')]/ancestor::div[@class='form-group']/descendant::span[@class='text-danger']"), 45);
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
     /*--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
     /*
  	 * Code for click testing of Campaign for CRM
  	 */
     public void clickOnCampaign()
     {		staticWait(2000);
    	 click(By.xpath("//div/ul/li/a[@data-original-title='Campaign ']"),"Campaign", 30);
    	
    	 try {
    		 WebElement campaignPage = driver.findElement(By.xpath("//div/span[text()='Campaign ']"));
    		 if (campaignPage.isDisplayed()) {
				logger.info("Campaign Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Campaign Page not opened succesfully");
		}
     }
     public void clickOnFilter()
     {		staticWait(2000);
    	 click(By.xpath("//div/span/a[@data-original-title='Filter']"),"Filter", 30);
    	
    	 try {
    		 WebElement filterPage = driver.findElement(By.xpath("//div/h5/span[text()='Filter']"));
    		 if (filterPage.isDisplayed()) {
				logger.info("Filter Page opened succesfully");
				click(By.xpath("//div/h4[contains(text(),'Search')]/ancestor::div[@class='modal-content']/descendant::button[@class='close']"),"Close button", 30);
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Filter Page not opened succesfully");
		}
     }
     public void clickOnManageView()
     {		staticWait(2000);
    	 click(By.xpath("//div/span/a[@data-original-title='Manage View']"),"Manage view", 30);
    	
    	 try {
    		 WebElement manageViewPage = driver.findElement(By.xpath("//div/h4[text()='Manage View']"));
    		 if (manageViewPage.isDisplayed()) {
				logger.info("Manage View Page opened succesfully");
				staticWait(2000);
				//click(By.xpath("//div/h4[contains(text(),'Manage View')]/ancestor::div[@class='modal-content']/descendant::button[@class='close']/i"),"Close button", 30);
				WebElement closeButton = driver.findElement(By.xpath("//div/h4[contains(text(),'Manage View')]/ancestor::div[@class='modal-content']/descendant::button[@class='close']/i"));
				Actions action=new Actions(driver);
				action.moveToElement(closeButton).click().perform();
				logger.info("Close Manage View Page");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Manage View Page not opened succesfully");
		}
    	 driver.navigate().refresh();
     }
     public void clickOnAddCampaign()
     {		staticWait(3000);
    	 click(By.xpath("//div/span/a[@data-original-title='Add Campaign']"),"Add Campign", 30);
    	
    	 try {
    		 WebElement addCampaign = driver.findElement(By.xpath("//div/span[text()='Manage Campaign']"));
    		 if (addCampaign.isDisplayed()) {
				logger.info("Manage Campaign Page opened succesfully");
		
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Manage Campaign Page not opened succesfully");
		}
     }
     public void clickOnCancelButtonOfAddCampign()
     {		staticWait(2000);
    	 click(By.xpath("//div/a[@data-original-title='Cancel']"),"Cancel Button", 30);
     }
     /*--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
     /*
  	 * Code for click testing of Communication for CRM
  	 */
     public void clickOnCommunication()
     {		staticWait(2000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='Communication'])[2]"),"Communication", 30);
    	
    	 try {
    		 WebElement communicationPage = driver.findElement(By.xpath("//div/span[text()='Communication Modes']"));
    		 if (communicationPage.isDisplayed()) {
				logger.info("Communication mode Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Communication mode Page not opened succesfully");
		}
     }
     public void clickOnAddCommunication()
     {		staticWait(2000);
    	 click(By.xpath("//div/span/a[@data-original-title='Add communication mode type']"),"Add Communication", 30);
    	
    	 try {
    		 WebElement addcommunicationPage = driver.findElement(By.xpath("//div/span[text()='Manage Communication Modes']"));
    		 if (addcommunicationPage.isDisplayed()) {
				logger.info("manage Communication mode Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("mqanage Communication mode Page not opened succesfully");
		}
     }
     public void clickOnCancelAddCommunication()
     {		staticWait(2000);
    	 click(By.xpath("//div/a[@data-original-title='Cancel']"),"Cancel Button", 30);
     }
     public void clickOnCheckBox()
     {		staticWait(2000);
    	 click(By.xpath("//div[@class='custom-control custom-checkbox']"),"checkbox", 30);
     }
     public void clickOnActive()
     {		staticWait(2000);
    	 click(By.xpath("//div/span/a[@data-original-title='Active']"),"Active", 30);
    	 click(By.xpath("//button[@title='OK']"),"OK", 30);
     }
     public void clickOnInActive()
     {		staticWait(2000);
    	 click(By.xpath("//div/span/a[@data-original-title='Inactive']"),"InActive", 30);
    	 click(By.xpath("//button[@title='OK']"),"OK", 30);
    	 driver.navigate().refresh();
     }
     /*--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
     /*
  	 * Code for click testing of Contact for CRM
  	 */
     public void clickOnContact()
     {		staticWait(2000);
    	 click(By.xpath("//div/ul/li/a[@data-original-title='Contact']"),"Contact", 30);
    	
    	 try {
    		 WebElement contactPage = driver.findElement(By.xpath("//div/span[text()='Contacts']"));
    		 if (contactPage.isDisplayed()) {
				logger.info("Contacts Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Contacts mode Page not opened succesfully");
		}
     }
     public void clickOnAddContacts()
     {		staticWait(2000);
    	 click(By.xpath("//span/a[@data-original-title='Add']"),"Add Accounts", 30);
    	
    	 try {
    		 WebElement addContacts = driver.findElement(By.xpath("//div/span[text()='Manage Contact']"));
    		 if (addContacts.isDisplayed()) {
				logger.info("Contacts Page displayed succesfully");
				staticWait(2000);
				click(By.xpath("//div/a[@data-original-title='Cancel']"),"cancel Button", 30);	
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Contacts Page not opened succesfully");
		}
     }
     public void clickOnImportContacts()
     {		staticWait(2000);
    	 click(By.xpath("//span/a[@data-original-title='Import Contacts']"),"Import Contacts", 30);
    	
    	 try {
    		 WebElement importContacts = driver.findElement(By.xpath("//div/span[text()='Import Contacts']"));
    		 if (importContacts.isDisplayed()) {
				logger.info("Import Contacts Page opened succesfully");
				clickByJavascript(By.xpath("//div/span/a[@data-original-title='Back to list']"),"Back to list", 30);
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Import Contacts Page not opened succesfully");
		}
     }
     /*--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
     /*
  	 * Code for click testing of Contract for CRM
  	 */
     public void clickOnContract()
     {		staticWait(2000);
    	 click(By.xpath("//div/ul/li/a[@data-original-title='Contract']"),"Contract", 30);
    	
    	 try {
    		 WebElement contractPage = driver.findElement(By.xpath("//span[text()=' Add Contract']"));
    		 if (contractPage.isDisplayed()) {
				logger.info("Contracts Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Contracts mode Page not opened succesfully");
		}
     }
     public void clickOnAddContract()
     {		staticWait(2000);
    	 click(By.xpath("//div/span/a[@data-original-title='Add Contract']"),"Add Contract", 30);
    	
    	 try {
    		 WebElement addcontractPage = driver.findElement(By.xpath("//div/span[text()='Manage Contracts']"));
    		 if (addcontractPage.isDisplayed()) {
				logger.info("Manage Contracts Page opened succesfully");
				click(By.xpath("//div/a[text()='Cancel']"),"Close Manage Contract", 30);
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Manage Contracts mode Page not opened succesfully");
		}
     }
     /*--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
     /*
  	 * Code for click testing of CRM Report for CRM
  	 */
     public void clickOnCRMReport()
     {		staticWait(2000);
    	 click(By.xpath("//div/ul/li/a[@data-original-title='CRM Report']"),"CRM Report", 30);
    	
    	 try {
    		 WebElement cRMReportPage = driver.findElement(By.xpath("//div/span[text()='CRM Report']"));
    		 if (cRMReportPage.isDisplayed()) {
				logger.info("CRM Report Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("CRM Report mode Page not opened succesfully");
		}
    	 driver.navigate().refresh();
     }
     /*--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
     /*
  	 * Code for click testing of Deal for CRM
  	 */
     public void clickOnDeal()
     {		staticWait(2000);
    	 click(By.xpath("//div/ul/li/a[@data-original-title='Deal']"),"Deal", 30);
    	
    	 try {
    		 WebElement dealPage = driver.findElement(By.xpath("//div/span[text()='Deals']"));
    		 if (dealPage.isDisplayed()) {
				logger.info("Deals Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Deals Page not opened succesfully");
		}
     }
     public void clickOnAddDeal()
     {		staticWait(2000);
    	 click(By.xpath("//div/span/a[@data-original-title='Add Deal']"),"Add Deal", 30);
    	
    	 try {
    		 WebElement adddealPage = driver.findElement(By.xpath("//div/span[text()='Manage Deals']"));
    		 if (adddealPage.isDisplayed()) {
				logger.info("Manage Deals Page opened succesfully");
				 click(By.xpath("//div/a[@data-original-title='Cancel']"),"Close Manage Deals", 30);
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Manage Deals Page not opened succesfully");
		}
     }
     /*--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
     /*
  	 * Code for click testing of Goods Inward for CRM
  	 */
     public void clickOnGoodsInward()
     {		staticWait(2000);
    	 click(By.xpath("//div/ul/li/a[@data-original-title='Goods Inward']"),"Goods Inward", 30);
    	
    	 try {
    		 WebElement goodsInwardPage = driver.findElement(By.xpath("//div/span[text()='Goods Inward']"));
    		 if (goodsInwardPage.isDisplayed()) {
				logger.info("Goods Inward Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Goods Inward Page not opened succesfully");
		}
     }
     public void clickOnAddGoodsInward()
     {		staticWait(2000);
    	 click(By.xpath("//div/span/a[@data-original-title='Add Inwards']"),"Add Inwards", 30);
    	
    	 try {
    		 WebElement addInwards = driver.findElement(By.xpath("//div/span[text()='Manage Goods Inward']"));
    		 if (addInwards.isDisplayed()) {
				logger.info("Add Goods Inward Page opened succesfully");
				click(By.xpath("//div/a[@data-original-title='Cancel']"),"Cancel Button", 30);
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Add Goods Inward Page not opened succesfully");
		}
     }
     /*--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
     /*
  	 * Code for click testing of Invoice for CRM
  	 */
     public void clickOnInvoice()
     {		staticWait(2000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='Invoice'])[2]"),"Invoice", 30);
    	
    	 try {
    		 WebElement invoicePage = driver.findElement(By.xpath("//div/span[text()='Invoice']"));
    		 if (invoicePage.isDisplayed()) {
				logger.info("Invoice Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Invoice Page not opened succesfully");
		}
     }
     public void clickOnAddInvoice()
     {		staticWait(2000);
    	 click(By.xpath("//div/span/a[@data-original-title='Add']"),"Add Invoice", 30);
    	
    	 try {
    		 WebElement addinvoicePage = driver.findElement(By.xpath("//div/span[text()='Manage Invoice']"));
    		 if (addinvoicePage.isDisplayed()) {
				logger.info("Manage Invoice Page opened succesfully");
				 click(By.xpath("//div/a[@data-original-title='Cancel']"),"Cancel Button", 30);
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Manage Invoice Page not opened succesfully");
		}
     }
     /*--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
     /*
  	 * Code for click testing of Product Type for CRM
  	 */
     public void clickOnProductType()
     {		staticWait(2000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='Product Type'])[2]"),"Product Type", 30);
    	
    	 try {
    		 WebElement productTypePage = driver.findElement(By.xpath("//div/span[text()='Product Type']"));
    		 if (productTypePage.isDisplayed()) {
				logger.info("Product Type Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Product Type Page not opened succesfully");
		}
     }
     public void clickOnAddProductType()
     {		staticWait(2000);
    	 click(By.xpath("//div/span/a[@data-original-title='Add Product Type']"),"Add Product Type", 30);
    	
    	 try {
    		 WebElement addproductTypePage = driver.findElement(By.xpath("//div/span[text()='Add Product Type']"));
    		 if (addproductTypePage.isDisplayed()) {
				logger.info("Add Product Type Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Add Product Type Page not opened succesfully");
		}
     }
     public void clickOnSaveProductType()
     {		staticWait(2000);
    	 click(By.xpath("//div/a[@data-original-title='Save']"),"Save Button", 30);
     }
     public void clickOnCancelProductType()
     {		staticWait(3000);
    	 click(By.xpath("//div/a[@data-original-title='Cancel']"),"Cancel Button", 30);
     }
     public void clickOnCloseNotifyMessage()
     {		staticWait(3000);
    	 click(By.xpath("//button[@id='closenotifymessage']"),"Close Notify Message", 30);
     }
     public void VerifyMandatoryFieldOfAddProductType() {
			int i = 0;
			String actualText;
			String expectedText;

			List<WebElement> errorMessageLocator = findMultipleElement(
					By.xpath("//span[contains(@class,'invalid-feedback')]"), 45);
			String[] expectedValue = { "Product Type Name"};
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
     /*--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
     /*
  	 * Code for click testing of Lead for CRM
  	 */
     public void clickOnLead()
     {		staticWait(2000);
    	 click(By.xpath("//div/ul/li/a[@data-original-title='Lead']"),"Lead", 30);
    	
    	 try {
    		 WebElement leadPage = driver.findElement(By.xpath("//div/span[text()='Leads']"));
    		 if (leadPage.isDisplayed()) {
				logger.info("Lead Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Lead Page not opened succesfully");
		}
     }
     public void clickOnAddLead()
     {		staticWait(2000);
    	 click(By.xpath("//div/span/a[@data-original-title='Add a Lead']"),"Add Lead", 30);
    	
    	 try {
    		 WebElement addleadPage = driver.findElement(By.xpath("//div/span[text()='Manage Lead Detail']"));
    		 if (addleadPage.isDisplayed()) {
				logger.info("Manage Lead Detail Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Manage Lead Detail Page not opened succesfully");
		}
     }
     public void VerifyMandatoryFieldOfManageLeadDetail() {
			int i = 0;
			String actualText;
			String expectedText;

			List<WebElement> errorMessageLocator = findMultipleElement(
					By.xpath("//div[contains(@class,'invalid-feedback')]"), 45);
			String[] expectedValue = { "First Name","Last Name","Lead Email","Lead Owner"};
			for (Object expected : expectedValue) {
				WebElement AsteriskField = findElementVisibility(By.xpath("//label[contains(text(),'"+ expected +"')]/ancestor::div[@class='form-group']/descendant::span[@class='text-danger']"), 45);
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
     public void clickOnImportLead()
     {		staticWait(2000);
    	 click(By.xpath("//div/span/a[@data-original-title='Import Leads']"),"Import Lead", 30);
    	
    	 try {
    		 WebElement importleadPage = driver.findElement(By.xpath("//div/span[text()='Import Leads']"));
    		 if (importleadPage.isDisplayed()) {
				logger.info("Import Leads Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Import Leads Page not opened succesfully");
		}
     }
     public void clickOnBackToList()
     {		staticWait(2000);
    	 click(By.xpath("//a[@data-original-title='Back to list']"),"Back to List", 30);
     }
     /*--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
     /*
  	 * Code for click testing of Manage Product for CRM
  	 */
     public void clickOnManageProduct()
     {		staticWait(2000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='Manage Product'])[2]"),"Manage Product", 30);
    	
    	 try {
    		 WebElement manageProductPage = driver.findElement(By.xpath("//div/span[text()='Product List']"));
    		 if (manageProductPage.isDisplayed()) {
				logger.info("Product List Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Product List Page not opened succesfully");
		}
     }
     public void clickOnAddProduct()
     {		staticWait(2000);
    	 click(By.xpath("//div/span/a[@data-original-title='Add Product']"),"Add Product", 30);
    	
    	 try {
    		 WebElement addProductPage = driver.findElement(By.xpath("//div/h5/span[text()='Create Product']"));
    		 if (addProductPage.isDisplayed()) {
				logger.info("Create Product Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Create Product Page not opened succesfully");
		}
     }
     public void VerifyMandatoryFieldOfAddProduct() {
			int i = 0;
			String actualText;
			String expectedText;

			List<WebElement> errorMessageLocator = findMultipleElement(
					By.xpath("//span[contains(@class,'invalid-feedback')]"), 45);
			String[] expectedValue = { "Product Type","Product Name","Barcode Type"};
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
    	 click(By.xpath("//div/span/a[@data-original-title='Product Transfer']"),"Product Transfer", 30);
    	
    	 try {
    		 WebElement productTransferPage = driver.findElement(By.xpath("//div/span[text()='Product Transfer']"));
    		 if (productTransferPage.isDisplayed()) {
				logger.info("Product Transfer Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Product Transfer Page not opened succesfully");
		}
     }
     public void clickOnInTransitProduct()
     {		staticWait(2000);
    	 click(By.xpath("//div/span/a[@data-original-title='In-Transit Products']"),"In-Transit Products", 30);
    	
    	 try {
    		 WebElement inTransitProductPage = driver.findElement(By.xpath("//div/span[text()='In-Transit List']"));
    		 if (inTransitProductPage.isDisplayed()) {
				logger.info("In-Transit List Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("In-Transit List Page not opened succesfully");
		}
     }
     public void clickOnDepreciation()
     {		staticWait(2000);
    	 click(By.xpath("//div/span/a[@data-original-title='Depreciation']"),"Depreciation", 30);
    	
    	 try {
    		 WebElement depreciationPage = driver.findElement(By.xpath("//div/span[text()='Depreciation List']"));
    		 if (depreciationPage.isDisplayed()) {
				logger.info("Depreciation List Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Depreciation List Page not opened succesfully");
		}
     }
     public void clickOnImportProduct()
     {		staticWait(2000);
    	 click(By.xpath("//div/span/a[@data-original-title='Import Product']"),"Import Product", 30);
    	
    	 try {
    		 WebElement importProductPage = driver.findElement(By.xpath("//div/span[text()=Import Product']"));
    		 if (importProductPage.isDisplayed()) {
				logger.info("Import Product Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Import Product Page not opened succesfully");
		}
     }
     public void clickOnCancelImportProduct()
     {		staticWait(2000);
    	 click(By.xpath("//div/a[@data-original-title='Cancel']"),"Cancel Import Product", 30);
    	 driver.navigate().refresh();
     }
     /*--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
     /*
  	 * Code for click testing of Price Book for CRM
  	 */
     public void clickOnPriceBook()
     {		staticWait(2000);
    	 click(By.xpath("//div/ul/li/a[@data-original-title='Price Book']"),"Price book", 30);
    	
    	 try {
    		 WebElement priceBookPage = driver.findElement(By.xpath("//span[text()=' Add Price Book']"));
    		 if (priceBookPage.isDisplayed()) {
				logger.info("Price Book Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Price Book Page not opened succesfully");
		}
     }
     public void clickOnAddPriceBook()
     {		staticWait(2000);
    	 click(By.xpath("//div/span/a[@data-original-title='Add Price Book']"),"Add Price book", 30);
    	
    	 try {
    		 WebElement addpriceBookPage = driver.findElement(By.xpath("//span[text()='Manage Price Book']"));
    		 if (addpriceBookPage.isDisplayed()) {
				logger.info("Manage Price Book Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Manage Price Book Page not opened succesfully");
		}
     }
     public void VerifyMandatoryFieldOfPriceBook() {
			int i = 0;
			String actualText;
			String expectedText;

			List<WebElement> errorMessageLocator = findMultipleElement(
					By.xpath("//div[contains(@class,'invalid-feedback')]"), 45);
			String[] expectedValue = { "Price Book Name","Description","Status","Effective From","Effective To"};
			for (Object expected : expectedValue) {
				WebElement AsteriskField = findElementVisibility(By.xpath("//label[contains(text(),'"+ expected +"')]/ancestor::div[@class='form-group']/descendant::span[@class='text-danger']"), 45);
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
     /*--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
     /*
  	 * Code for click testing of Product for CRM
  	 */
     public void clickOnProduct()
     {		staticWait(2000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='Product'])[2]"),"Product", 30);
    	
    	 try {
    		 WebElement productPage = driver.findElement(By.xpath("//span[text()='Product']"));
    		 if (productPage.isDisplayed()) {
				logger.info("Product Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Product Page not opened succesfully");
		}
     }
     public void clickOnAddProducts()
     {		staticWait(2000);
    	 click(By.xpath("//div/span/a[@data-original-title='Add Product']"),"Product", 30);
    	
    	 try {
    		 WebElement addproductPage = driver.findElement(By.xpath("//div/h5[text()='Add Product']"));
    		 if (addproductPage.isDisplayed()) {
				logger.info("Add Product Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Add Product Page not opened succesfully");
		}
     }
     public void clickOncloseAddProducts()
     {		staticWait(2000);
    	 click(By.xpath("//div/h5[text()='Add Product']/ancestor::div[@class='modal-content']/descendant::button[@data-original-title='Close']"),"Close Add Product", 30);
     }
    	
     public void VerifyMandatoryFieldOfAddProducts() {
			int i = 0;
			String actualText;
			String expectedText;

			List<WebElement> errorMessageLocator = findMultipleElement(
					By.xpath("//span[contains(@class,'invalid-feedback')]"), 45);
			String[] expectedValue = { "Product Type","Product Name","Barcode Type"};
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
     /*--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
     /*
  	 * Code for click testing of Purchase Order for CRM
  	 */
     public void clickOnPurchaseOrder()
     {		staticWait(3000);
    	 click(By.xpath("//div/ul/li/a[@data-original-title='Purchase Order']"),"Purchase Order", 30);
    	
    	 try {
    		 WebElement purchaseOrderPage = driver.findElement(By.xpath("//span[text()='Purchase Order']"));
    		 if (purchaseOrderPage.isDisplayed()) {
				logger.info("Purchase Order Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Purchase Order Page not opened succesfully");
		}
     }
     public void clickOnAddPurchaseOrder()
     {		staticWait(2000);
    	 click(By.xpath("//div/span/a[@data-original-title='Add Purchase Orders']"),"Add Purchase Order", 30);
    	
    	 try {
    		 WebElement addpurchaseOrderPage = driver.findElement(By.xpath("//span[text()='Manage Purchase Order']"));
    		 if (addpurchaseOrderPage.isDisplayed()) {
				logger.info("Manage Purchase Order Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Manage Purchase Order Page not opened succesfully");
		}
     }
     public void VerifyMandatoryFieldOfPurchaseOrder() {
			int i = 0;
			String actualText;
			String expectedText;

			List<WebElement> errorMessageLocator = findMultipleElement(
					By.xpath("//div[contains(@class,'invalid-feedback')]"), 45);
			String[] expectedValue = { "Contact Person","State"};
			for (Object expected : expectedValue) {
				WebElement AsteriskField = findElementVisibility(By.xpath("//label[contains(text(),'"+ expected +"')]/ancestor::div[@class='form-group']/descendant::span[@class='text-danger']"), 45);
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
     /*--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
     /*
  	 * Code for click testing of Quote for CRM
  	 */
     public void clickOnQuote()
     {		staticWait(2000);
    	 click(By.xpath("//div/ul/li/a[@data-original-title='Quote']"),"Quote", 30);
    	
    	 try {
    		 WebElement quotePage = driver.findElement(By.xpath("//span[text()='Quotes']"));
    		 if (quotePage.isDisplayed()) {
				logger.info("Quote Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Quote Page not opened succesfully");
		}
     }
     public void clickOnAddQuote()
     {		staticWait(2000);
    	 click(By.xpath("//div/span/a[@data-original-title='Add a Quote']"),"Add Quote", 30);
    	
    	 try {
    		 WebElement addquotePage = driver.findElement(By.xpath("//span[text()='Manage Quote']"));
    		 if (addquotePage.isDisplayed()) {
				logger.info("Manage Quote Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Manage Quote Page not opened succesfully");
		}
     }
     /*--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
     /*
  	 * Code for click testing of Sales Order for CRM
  	 */
     public void clickOnSalesOrder()
     {		staticWait(2000);
    	 click(By.xpath("//div/ul/li/a[@data-original-title='Sales Order']"),"Sales Order", 30);
    	
    	 try {
    		 WebElement salesOrderPage = driver.findElement(By.xpath("//div/span[text()='Sales Order']"));
    		 if (salesOrderPage.isDisplayed()) {
				logger.info("Sales Order Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Sales Order Page not opened succesfully");
		}
     }
     public void clickOnAddSalesOrder()
     {		staticWait(2000);
    	 click(By.xpath("//div/span/a[@data-original-title='Add']"),"Add Sales Order", 30);
    	
    	 try {
    		 WebElement addsalesOrderPage = driver.findElement(By.xpath("//div/span[text()='Manage Sales Order']"));
    		 if (addsalesOrderPage.isDisplayed()) {
				logger.info("Manage Sales Order Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Manage Sales Order Page not opened succesfully");
		}
     }
     public void VerifyMandatoryFieldOfSalesOrder() {
			int i = 0;
			String actualText;
			String expectedText;

			List<WebElement> errorMessageLocator = findMultipleElement(
					By.xpath("//div[contains(@class,'invalid-feedback')]"), 45);
			String[] expectedValue = { "Contact Person","State"};
			for (Object expected : expectedValue) {
				WebElement AsteriskField = findElementVisibility(By.xpath("//label[contains(text(),'"+ expected +"')]/ancestor::div[@class='form-group']/descendant::span[@class='text-danger']"), 45);
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
     /*--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
     /*
  	 * Code for click testing of Stage for CRM
  	 */
     public void clickOnStage()
     {		staticWait(2000);
    	 click(By.xpath("//div/ul/li/a[@data-original-title='Stage']"),"Stage", 30);
    	
    	 try {
    		 WebElement stagePage = driver.findElement(By.xpath("//div/span[text()='Stage']"));
    		 if (stagePage.isDisplayed()) {
				logger.info("Stage Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Stage Page not opened succesfully");
		}
     }
     public void clickOnAddStage()
     {		staticWait(2000);
    	 click(By.xpath("//div/span/a[@data-original-title='Add Stage']"),"Add Stage", 30);
    	
    	 try {
    		 WebElement addstagePage = driver.findElement(By.xpath("//div/span[text()='Manage Stages']"));
    		 if (addstagePage.isDisplayed()) {
				logger.info("Add Stage Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Add Stage Page not opened succesfully");
		}
     }
     public void VerifyMandatoryFieldOfStage() {
			int i = 0;
			String actualText;
			String expectedText;

			List<WebElement> errorMessageLocator = findMultipleElement(
					By.xpath("//div[contains(@class,'invalid-feedback')]"), 45);
			String[] expectedValue = { "Stage Name","Probability","Category","Status","Display Icon"};
			for (Object expected : expectedValue) {
				WebElement AsteriskField = findElementVisibility(By.xpath("//label[contains(text(),'"+ expected +"')]/ancestor::div[@class='form-group']/descendant::span[@class='text-danger']"), 45);
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
     /*--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
     /*
  	 * Code for click testing of Vendor for CRM
  	 */
     public void clickOnVendor()
     {		staticWait(2000);
    	 click(By.xpath("//div/ul/li/a[@data-original-title='Vendor']"),"Vendor", 30);
    	
    	 try {
    		 WebElement vendorPage = driver.findElement(By.xpath("//div/span[text()='Vendor']"));
    		 if (vendorPage.isDisplayed()) {
				logger.info("Vendor Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Vendor Page not opened succesfully");
		}
     }
     public void clickOnAddVendor()
     {		staticWait(2000);
    	 click(By.xpath("//div/span/a[@data-original-title='Add Vendor']"),"Add Vendor", 30);
    	
    	 try {
    		 WebElement addvendorPage = driver.findElement(By.xpath("//div/span[text()='Manage Vendor']"));
    		 if (addvendorPage.isDisplayed()) {
				logger.info("Manange Vendor Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Manage Vendor Page not opened succesfully");
		}
     }
     public void VerifyMandatoryFieldOfVendor() {
			int i = 0;
			String actualText;
			String expectedText;

			List<WebElement> errorMessageLocator = findMultipleElement(
					By.xpath("//div[contains(@class,'invalid-feedback')]"), 45);
			String[] expectedValue = { "Vendor Name","Vendor Owner Name","Description","Status"};
			for (Object expected : expectedValue) {
				WebElement AsteriskField = findElementVisibility(By.xpath("//label[contains(text(),'"+ expected +"')]/ancestor::div[@class='form-group']/descendant::span[@class='text-danger']"), 45);
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
			driver.navigate().refresh();
		}
     
}
