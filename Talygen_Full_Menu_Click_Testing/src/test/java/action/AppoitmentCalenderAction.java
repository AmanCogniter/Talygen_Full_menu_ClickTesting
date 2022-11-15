package action;

import org.openqa.selenium.WebDriver;

import pageobjects.AppoitmentCalendarPage;



public class AppoitmentCalenderAction {
	WebDriver driver ; 
	AppoitmentCalendarPage appoitmentCalendarPage;
	
	public AppoitmentCalenderAction(WebDriver driver)
	{
		this.driver= driver;
		appoitmentCalendarPage= new AppoitmentCalendarPage(driver);
	}
	
	public void GoToAppoitmentCalendarPage()
	{
		appoitmentCalendarPage.clickFullMenuDropDown();	
		appoitmentCalendarPage.clickAppoitmentCalendarLink();	
		
		
	}
	/*Meatod  for External Link for appoitment*/
	public void GoToManageexternalLinkPage()
	{
		
		appoitmentCalendarPage.clickOnExternalLinkforAppointment();	
		appoitmentCalendarPage.clickOnSaveButton();
		appoitmentCalendarPage.clickOnPreviewButton();
		
	}
	/*Method for Appoitment Report*/
	public void GoToAppoitmentServiceReportPage()
	{
		
		appoitmentCalendarPage.clickAppoitmentReportLink();	
		appoitmentCalendarPage.clickOnSearchButton();
		appoitmentCalendarPage.clickOnClearButton();
		
	}
	/*Method for Consumer List*/
	public void GoToConsumerListPage()
	{
		
		appoitmentCalendarPage.clickOnConsumerList();	
		//appoitmentCalendarPage.clickOnExpand();
		appoitmentCalendarPage.clickOnCheckBox();
		appoitmentCalendarPage.clickOnSendEmailt();
		appoitmentCalendarPage.clickOncancelButton();
		
	}
	/*Method for Counter*/
	public void GoToCounterPage()
	{
		
		appoitmentCalendarPage.clickOnCounter();	
		appoitmentCalendarPage.clickOnAddCounter();
		appoitmentCalendarPage.clickOnCounterSaveButton();
		appoitmentCalendarPage.VerifyMandatoryFieldValidation();
		appoitmentCalendarPage.clickOnCancelButton();
		
	}
	/*Method for Course*/
	public void GoToCoursePage()
	{
		
		appoitmentCalendarPage.clickOnCourse();	
		appoitmentCalendarPage.clickOnExpandButton();	
		
		
	}
	/*Method for Course*/
	public void GoToScheduleAppointmentPage()
	{
		
		
		appoitmentCalendarPage.clickOnScheduleAppointment();	
		
		
	}
	/*Method for Appoitment Service Page*/
	public void GoToAppoitmentServicePage()
	{
		
		appoitmentCalendarPage.clickOnAppointmentService();	
		appoitmentCalendarPage.clickOnAddAppointmentService();
		appoitmentCalendarPage.clickOnCounterSaveButton();
		appoitmentCalendarPage.VerifyMandatoryFieldValidationofAddAppointmentService();
		appoitmentCalendarPage.clickOnUserGuide();
		appoitmentCalendarPage.clickOnCancelButton();
		
	}
	/*Method for Token Page*/
	public void GoToTokenPage()
	{
		
		appoitmentCalendarPage.clickOnToken();	
		appoitmentCalendarPage.clickOnTokenCheckBox();
		appoitmentCalendarPage.clickOnConfiguration();
		appoitmentCalendarPage.clickOnAddTokenNumberSaveButton();
		appoitmentCalendarPage.VerifyMandatoryFieldValidationofconfiguration();
		appoitmentCalendarPage.clickOnCloseButton();
		appoitmentCalendarPage.clickOnAddToken();	
		appoitmentCalendarPage.clickOnCounterSaveButton();
		appoitmentCalendarPage.VerifyMandatoryFieldValidationofAddToken();
		appoitmentCalendarPage.clickOnCancelButton();
		
		
	}
}
