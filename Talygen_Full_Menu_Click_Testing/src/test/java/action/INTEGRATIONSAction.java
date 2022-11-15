package action;

import org.openqa.selenium.WebDriver;

import pageobjects.FsmPage;
import pageobjects.INTEGRATIONSPage;
import pageobjects.VDeskPage;

public class INTEGRATIONSAction {
	WebDriver driver ; 
	INTEGRATIONSPage iNTEGRATIONSPage;
	FsmPage fsmPage;
	public INTEGRATIONSAction(WebDriver driver)
	{
		this.driver= driver;
		iNTEGRATIONSPage= new INTEGRATIONSPage(driver);
		fsmPage= new FsmPage(driver);
	}
	
	public void GoToINTEGRATIONSPage()
	{
		iNTEGRATIONSPage.clickFullMenuDropDown();	
		iNTEGRATIONSPage.clickOnIntegration();	
		
		
	}
	/*Method  for Connector*/
	public void CheckGoToConnectorPage()
	{
		
		iNTEGRATIONSPage.clickOnConnector();	
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
	/*Method  for GPS Tracking*/
	public void CheckGoToGPSTrackingPage()
	{
		
		iNTEGRATIONSPage.clickOnGPSTrackingforIntegration();	
		iNTEGRATIONSPage.clickOnAddDeviceIntegrationforIntegration();
		iNTEGRATIONSPage.clickOnBackToList();
		
	}
	/*Method  for Twilio */
	public void CheckGoToTwilioPage()
	{
		
		iNTEGRATIONSPage.clickOnTwilioforIntegration();	
		iNTEGRATIONSPage.clickOnAddNewTwilioforIntegration();
		iNTEGRATIONSPage.clickOnAuthenticateforIntegration();
		iNTEGRATIONSPage.VerifyMandatoryFieldOfTwilio();
		iNTEGRATIONSPage.clickOnCancelforIntegration();
	}
}
