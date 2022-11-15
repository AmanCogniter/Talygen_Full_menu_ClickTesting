package action;

import org.openqa.selenium.WebDriver;

import pageobjects.AppoitmentCalendarPage;
import pageobjects.FsmPage;

public class FsmAction {
	WebDriver driver ; 
	FsmPage fsmPage;
	
	public FsmAction(WebDriver driver)
	{
		this.driver= driver;
		fsmPage= new FsmPage(driver);
	}
	
	public void GoToFSMPage()
	{
		fsmPage.clickFullMenuDropDown();	
		fsmPage.clickOnFSMLink();	
		
		
	}
	/*Meatod  for Add Ticket for FSM*/
	public void GoToAddTicketPage()
	{
		
		fsmPage.clickOnAddTicket();	
		fsmPage.clickOnSaveAsDraftButton();
		fsmPage.VerifyMandatoryFieldValidation();
		fsmPage.clickOnCancelButton();
		
	}
	/*Meatod  for Call Center Sync Status for FSM*/
	public void GoToCallCenterSyncStatusPage()
	{
		fsmPage.clickOnCallCenterSyncStatus();	
		
		
	}
	/*Meatod  for Go To of FSM*/
	public void CheckGoToConnectorPage()
	{
		
		fsmPage.clickOnConnector();	
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
	public void GoToFieldServiceTicketPage()
	{
		
		fsmPage.clickOnFieldServiceTicket();	
		fsmPage.clickOnCollapseMap();
		fsmPage.clickOnAssignTicket();
		fsmPage.clickOnFilter();
		fsmPage.clickOnUpdateStatus();
		fsmPage.clickOnAssignTag();
		//fsmPage.clickOnListView();
		fsmPage.clickOnAddTicketOfFieldServiceTicket();
		fsmPage.clickOnSaveAsDraftButton();
		fsmPage.VerifyMandatoryFieldValidation();
		fsmPage.clickOnCancelButton();
		
	}
	public void GoToFormBuilderPage()
	{
		
		fsmPage.clickOnFormBuilder();	
		fsmPage.clickOnAddFormBuilder();
		fsmPage.clickOnNext();
		fsmPage.VerifyMandatoryFielOfAddFormBuilder();
		fsmPage.clickOnClose();
	}
	public void GoToFSMReportPage()
	{
		
		fsmPage.clickOnFSMReport();	
		
	}
	public void GoToManageMapConfigurationPage()
	{
		
		fsmPage.clickOnManageMapConfiguration();	
		fsmPage.clickOnAddManageMapConfiguration();
		fsmPage.clickOnSaveManageMapConfiguration();
		fsmPage.VerifyMandatoryFielOfAddManageMapConfiguration();
		fsmPage.clickOnCloseManageMapConfiguration();
	}
	public void GoToMapExtentPage()
	{
		
		fsmPage.clickOnMapExtent();	
		fsmPage.clickOnAddMapExtent();
		
	}
	public void GoToRuleEnginePage()
	{
		
		fsmPage.clickOnRuleEngine();	
		fsmPage.clickOnAddRuleEngine();
		fsmPage.clickOnSaveRuleEngine();
		fsmPage.VerifyMandatoryFielOfRuleEngine();
		fsmPage.clickOnCloseManageMapConfiguration();
	}
	public void GoToServiceAppointmentPage()
	{
		
		fsmPage.clickOnServiceAppointment();	
		fsmPage.clickOnAddServiceAppointment();
		fsmPage.clickOnSaveManageMapConfiguration();
		fsmPage.VerifyMandatoryFielOfAddserviceAppointment();
		fsmPage.clickOnCloseManageMapConfiguration();
		fsmPage.clickOnFilter();
		fsmPage.clickOnGaintChart();
		fsmPage.clickOnSetting();
		fsmPage.clickOnManageView();
	}
	public void GoToServiceCrewPage()
	{
		
		fsmPage.clickOnServiceCrew();	
		fsmPage.clickOnAddServiceCrew();
		fsmPage.clickOnSaveServiceCrew();
		fsmPage.VerifyMandatoryFielOfAddServiceCrew();
		fsmPage.clickOnCancelServiceCrew();
		
	}
	public void GoToServiceResourcePage()
	{
		
		fsmPage.clickOnServiceResources();	
		fsmPage.clickOnAddServiceResource();
		fsmPage.clickOnSaveServiceCrew();
		fsmPage.VerifyMandatoryFielOfAddServiceResource();
		fsmPage.clickOnCancelServiceCrew();
		
	}
	public void GoToServiceTerritoryPage()
	{
		
		fsmPage.clickOnServiceTerritory();	
		fsmPage.clickOnAddServiceTerritory();
		fsmPage.clickOnSaveServiceCrew();
		fsmPage.VerifyMandatoryFielOfAddServiceTerritory();
		fsmPage.clickOnCancelServiceCrew();
		
	}
	public void GoToTechTrackingPage()
	{
		
		fsmPage.clickOnTechTracking();	
		
		
	}
	public void GoToTicketingPage()
	{
		
		fsmPage.clickOnTicketing();	
		fsmPage.clickOnAddTicketing();
		fsmPage.clickOnSaveAsDraftButton();
		fsmPage.VerifyMandatoryFieldValidation();
		fsmPage.clickOnCancelButton();
		fsmPage.clickOnCheckBox();
		fsmPage.clickOnUpdateStatusOfTicketing();
		fsmPage.clickOnCancel();
		
	}
	public void GoToTransformPendingPage()
	{
		
		fsmPage.clickOnTransformPending();	
		
	}
	public void GoToFieldUnassignedTicketsPage()
	{
		
		fsmPage.clickOnUnassignedTickets();	
		fsmPage.clickOnCollapseMap();
		fsmPage.clickOnAssignTicket();
		fsmPage.clickOnFilter();
		fsmPage.clickOnUpdateStatus();
		fsmPage.clickOnAssignTag();
		//fsmPage.clickOnListView();
		fsmPage.clickOnAddTicketOfFieldServiceTicket();
		fsmPage.clickOnSaveAsDraftButton();
		fsmPage.VerifyMandatoryFieldValidation();
		fsmPage.clickOnCancelButton();
		
	}
	public void GoToWorkTypeListingPage()
	{
		
		fsmPage.clickOnWorkTypeListing();	
		fsmPage.clickOnAddWorkTypeListing();
		fsmPage.clickOnSaveAddWorkTypeListing();
		fsmPage.VerifyMandatoryFielOfAddWorkTypeListing();
		fsmPage.clickOnCancelAddWorkTypeListing();
		
		
	}
	public void GoToZoneManagementPage()
	{
		
		fsmPage.clickOnZoneManagement();	
		fsmPage.clickOnImport();
		fsmPage.clickOnCancelImport();
		}
	public void GoToDashBoardPage()
	{
		
		fsmPage.clickOnDashBoard();	
		fsmPage.clickOnAddMore();
		fsmPage.clickOnCancelButtonOfAddMore();
		}
}
