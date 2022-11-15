package action;

import org.openqa.selenium.WebDriver;

import pageobjects.BillingPage;
import pageobjects.CommunicationPage;

public class CommunicationAction {
	WebDriver driver ; 
	CommunicationPage communicationPage;
	
	public CommunicationAction(WebDriver driver)
	{
		this.driver= driver;
		communicationPage= new CommunicationPage(driver);
	}
	
	public void GoToCommunicationPage()
	{
		communicationPage.clickFullMenuDropDown();	
		communicationPage.clickOnCummunicationLink();	
		}
	/*Meatod  for Automate Flag Processing for Billing*/
	public void GoToIVRPage()
	{
		
		communicationPage.clickOnIVR();	
		communicationPage.clickOnSaveButton();
		communicationPage.clickOnSaveButton();
		communicationPage.VerifyMandatoryFieldValidation();
		communicationPage.clickOnCancelButton();	
		
		
	}
	/*Meatod  for MeetingRecordingList*/
	public void GoToMeetingRecordingListPage()
	{
		
		communicationPage.clickOnMeetingRecordingList();	
		
	}
	/*Meatod  for verify Meetings page*/
	public void GoToMeetingsPage()
	{
		
		communicationPage.clickOnMeetings();	
		
	}
	/*Meatod  for UnifiedSetup */
	public void GoToUnifiedSetupPage()
	{
		
		communicationPage.clickOnUnifiedSetup();	
		communicationPage.clickOnSetup();
		
		
		
	}
	/*Meatod  for Video Recording List */
	public void GoToVideoRecordingListPage()
	{
		
		communicationPage.clickOnVideoRecordingList();	
		
		
	}
}
