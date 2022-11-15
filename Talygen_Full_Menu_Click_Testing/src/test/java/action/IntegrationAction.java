package action;

import org.openqa.selenium.WebDriver;

import pageobjects.FsmPage;
import pageobjects.IntegrationPage;

public class IntegrationAction {
		WebDriver driver ; 
		IntegrationPage integrationPage;
		FsmPage fsmPage;
		
		public IntegrationAction(WebDriver driver)
		{
			this.driver= driver;
			integrationPage= new IntegrationPage(driver);
			fsmPage= new FsmPage(driver);
		}
		
		public void GoToIntegrationPage()
		{
			integrationPage.clickFullMenuDropDown();	
			integrationPage.clickOnIntegration();	
			
			
		}
		/*Method  for Basecamp of Integration*/
		public void GoToBasecampPage()
		{
			
			integrationPage.clickOnBasecampforIntegration();	
			
			
		}
		/*Method  for Connector*/
		public void CheckGoToConnectorPage()
		{
			
			integrationPage.clickOnConnector();	
			fsmPage.clickOnStatusCodeMapping();
			fsmPage.clickOnTicketTypeMapping();
			fsmPage.clickOnSuppressCode();
			fsmPage.clickOnInvoiceGroupings();
			fsmPage.clickOnWorkCode();
			fsmPage.clickOnWorkCodeCategory();
			fsmPage.clickOnCounty();
			fsmPage.clickOnContractUtilityCDCMapping();
			fsmPage.clickOnStatusCode();
			fsmPage.clickOnStatusCodeCDCMapping();
			
		}
		/*Method  for Email*/
		public void CheckGoToEmailPage()
		{
			
			integrationPage.clickOnEmail();	
			
		}
		/*Method  for FreshBook of Integration*/
		public void GoToFreshBookPage()
		{
			
			integrationPage.clickOnFreshBooksforIntegration();	
			
			
		}
		/*Method  for GPS Tracking*/
		public void CheckGoToGPSTrackingPage()
		{
			
			integrationPage.clickOnGPSTrackingforIntegration();	
			integrationPage.clickOnAddDeviceIntegrationforIntegration();
			integrationPage.clickOnBackToList();
			
		}
		/*Method  for IVR*/
		public void CheckGoToIVRPage()
		{
			
			integrationPage.clickOnIVRforIntegration();	
			integrationPage.clickOnAddChildIVRforIntegration();
			integrationPage.clickOnDeleteButttonforIntegration();
			integrationPage.clickOnConfirmationPopUpforIntegration();
			integrationPage.clickOnAddMoreIVRforIntegration();
			integrationPage.clickOnDeleteButttonforIntegration();
			integrationPage.clickOnConfirmationPopUpforIntegration();
			integrationPage.clickOnSaveforIntegration();
			integrationPage.VerifyMandatoryFieldValidation();
			integrationPage.clickOnCancelforIntegration();
		}
		/*Method  for Microsoft Project Plan*/
		public void CheckGoToMicrosoftProjectPlanPage()
		{
			
			integrationPage.clickOnMicrosoftProjectPlanforIntegration();	
			integrationPage.clickOnImportforIntegration();
			integrationPage.clickOnCancelforIntegration();
		}
		/*Method  for QuickBooks*/
		public void CheckGoToQuickBooksPage()
		{
			
			integrationPage.clickOnQuickBooksforIntegration();	
		}
		/*Method  for Sales Force*/
		public void CheckGoToSalesForcePage()
		{
			
			integrationPage.clickOnSalesForceforIntegration();	
		}
		/*Method  for Trello */
		public void CheckGoToTrelloPage()
		{
			
			integrationPage.clickOnTrelloforIntegration();	
			integrationPage.clickOnAuthenticateforIntegration();
			integrationPage.VerifyMandatoryFieldOfTrello();
		}
		/*Method  for Twilio */
		public void CheckGoToTwilioPage()
		{
			
			integrationPage.clickOnTwilioforIntegration();	
			integrationPage.clickOnAddNewTwilioforIntegration();
			integrationPage.clickOnAuthenticateforIntegration();
			integrationPage.VerifyMandatoryFieldOfTwilio();
			integrationPage.clickOnCancelforIntegration();
		}
		/*Method  for Unified Setup*/
		public void CheckGoToUnifiedSetupPage()
		{
			
			integrationPage.clickOnUnifiedSetupforIntegration();	
			integrationPage.clickOnSetupforIntegration();
		}
	}

