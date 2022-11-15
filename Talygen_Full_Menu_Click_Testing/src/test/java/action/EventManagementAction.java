package action;

import org.openqa.selenium.WebDriver;

import pageobjects.AppoitmentCalendarPage;
import pageobjects.EventManagementPage;

public class EventManagementAction {
	WebDriver driver ; 
	EventManagementPage eventManagementPage;
	
	public EventManagementAction(WebDriver driver)
	{
		this.driver= driver;
		eventManagementPage= new EventManagementPage(driver);
	}
	
	public void GoToEventManagementPage()
	{
		eventManagementPage.clickFullMenuDropDown();	
		eventManagementPage.clickOnEventMangement();	
		
		
	}
	/*Meatod  for Calendar for Event Management*/
	public void GoToCalendarPage()
	{
		
		eventManagementPage.clickOnCalenderforEventMangement();	
		
		
	}
	/*Meatod  for Google Calendar for Event Management*/
	public void GoToGoogleCalendarPage()
	{
		
		eventManagementPage.clickOnGoogleCalenderforEventMangement();
		eventManagementPage.clickOnSave();
		eventManagementPage.VerifyMandatoryFieldValidation();
		eventManagementPage.clickOnCancel();
		
		
	}
	/*Meatod  for  Event Management*/
	public void GoToeventManagementPage()
	{
		
		eventManagementPage.clickOneventMangement();
		eventManagementPage.clickOnFilter();
		eventManagementPage.clickOnAddEvent();
		eventManagementPage.clickOnSaveEvent();
		eventManagementPage.VerifyMandatoryFieldsOfAddEvent();
		eventManagementPage.clickOnCancelEvent();
		eventManagementPage.clickOnCardView();
		eventManagementPage.clickOnManageView();
		
		
	}
	/*Meatod  for  Manage Venue*/
	public void GoToManageVenuePage()
	{
		
		eventManagementPage.clickOnManageVenue();
		eventManagementPage.clickOnSaveEvent();
		eventManagementPage.VerifyMandatoryFieldsOfManageVenue();
		eventManagementPage.clickOnCancelEvent();
	}
	/*Meatod  for  User Availability*/
	public void GoToUserAvailabilityPage()
	{
		
		eventManagementPage.clickOnUserAvailability();
		eventManagementPage.clickOnAddUserAvailability();
		eventManagementPage.clickOnSaveEvent();
		eventManagementPage.VerifyMandatoryFieldsOfUserAvailability();
		eventManagementPage.clickOnCancelEvent();
	}
	/*Meatod  for  Dashboard*/
	public void GoToDashBoardPage()
	{
		
		eventManagementPage.clickOnDashboard();
		eventManagementPage.clickOnMyView();
		eventManagementPage.clickOnTeamView();
		eventManagementPage.clickOnChangeView();

	}
}
