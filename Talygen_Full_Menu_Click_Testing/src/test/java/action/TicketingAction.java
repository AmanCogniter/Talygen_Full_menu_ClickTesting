package action;

import org.openqa.selenium.WebDriver;

import pageobjects.AppoitmentCalendarPage;
import pageobjects.TicketingPage;

public class TicketingAction {
	WebDriver driver ; 
	TicketingPage ticketingPage;
	
	public TicketingAction(WebDriver driver)
	{
		this.driver= driver;
		ticketingPage= new TicketingPage(driver);
	}
	
	public void GoToTicketingPage()
	{
		ticketingPage.clickFullMenuDropDown();	
		ticketingPage.clickOnTicketingLink();	
		
		
	}
	/*Method  for Ticketing */
	public void GoToTicketingSubModulePage()
	{
		
		ticketingPage.clickOnTicketing();	
		ticketingPage.clickOnAddTicketing();
		ticketingPage.clickOnSaveAsDraft();
		ticketingPage.clickOnCloseNotifyMessage();
		ticketingPage.VerifyMandatoryFieldValidation();
		ticketingPage.clickOnCancelForAddTicket();
		ticketingPage.clickOnCheckBox();
		ticketingPage.clickOnUpdateStatus();
		ticketingPage.clickOnCancelButtonOfUpdateStatus();
		
	}
	/*Method  for Add Ticket */
	public void GoToAddTicketPage()
	{
		
		ticketingPage.clickOnAddTicket();
		ticketingPage.clickOnSaveAsDraft();
		ticketingPage.clickOnCloseNotifyMessage();
		ticketingPage.VerifyMandatoryFieldOfAddTicket();
		ticketingPage.clickOnCancelForAddTicket();
		
		
		
	}
	/*Method  for Unassigned Ticket */
	public void GoToUnassignedTicketPage()
	{
		
		ticketingPage.clickOnUnassignedTickets();	
		ticketingPage.clickOnAddTicketing();
		ticketingPage.clickOnSaveAsDraft();
		ticketingPage.clickOnCloseNotifyMessage();
		ticketingPage.VerifyMandatoryFieldValidation();
		ticketingPage.clickOnCancelForAddTicket();
		ticketingPage.clickOnCheckBox();
		ticketingPage.clickOnUpdateStatus();
		ticketingPage.clickOnCancelButtonOfUpdateStatus();
		
	}
	/*Method  for Ticket Feedback */
	public void GoToTicketFeedbackPage()
	{
		
		ticketingPage.clickOnTicketFeedback();	
		ticketingPage.clickOnAddFeedback();
		ticketingPage.clickOnSaveAddFeedback();
		ticketingPage.VerifyMandatoryFieldOfAddFeedback();
		ticketingPage.clickOnCancelAddFeedback();
		ticketingPage.clickOnCheckBox();
		ticketingPage.clickOnActive();
		//ticketingPage.clickOnCheckBox();
		ticketingPage.clickOnInActive();
		ticketingPage.clickOnDelete();
		
		
	}
	/*Method  for Canned Reply */
	public void GoToCannedReplyPage()
	{
		
		ticketingPage.clickOnCannedReply();	
		ticketingPage.clickOnAddCannedReply();
		ticketingPage.clickOnSaveNewCannedReply();
		ticketingPage.VerifyMandatoryFieldOfManageCannedReplyTemplate();
		ticketingPage.clickOnCancelNewCannedReply();
		ticketingPage.clickOnCheckBox();
		ticketingPage.clickOnActive();
		//ticketingPage.clickOnCheckBox();
		ticketingPage.clickOnInActive();
		ticketingPage.clickOnDelete();
		
		
	}

/*Method  for Ticket Report */
public void GoToTicketReportPage()
{
	
	ticketingPage.clickOnTicketReport();	
}
/*Method  for Manage Service Board */
public void GoToManageServiceBoardPage()
{
	
	ticketingPage.clickOnManageServiceBoard();	
	ticketingPage.clickOnAddManageServiceBoard();
	ticketingPage.clickOnSave();
	ticketingPage.VerifyMandatoryFieldOfAddManageServiceBoard();
	ticketingPage.clickOnCancel();
	ticketingPage.clickOnCheckBox();
	ticketingPage.clickOnActive();
	//ticketingPage.clickOnCheckBox();
	ticketingPage.clickOnInActive();
	ticketingPage.clickOnDelete();
	
	
}
/*Method  for Add ticket Group */
public void GoToAddticketGroupPage()
{
	
	ticketingPage.clickOnAddticketGroup();	
	ticketingPage.clickOnSave();
	ticketingPage.clickOnCloseNotifyMessage();
	ticketingPage.VerifyMandatoryFieldOAddticketGroup();
	ticketingPage.clickOnCancel();
}
/*Method  for Ticket Group */
public void GoToTicketGroupPage()
{
	
	ticketingPage.clickOnTicketGroup();	
	ticketingPage.clickOnAddTicketGroup();	
	ticketingPage.clickOnSave();
	ticketingPage.clickOnCloseNotifyMessage();
	ticketingPage.VerifyMandatoryFieldOAddticketGroup();
	ticketingPage.clickOnCancel();
	ticketingPage.clickOnCheckBox();
	ticketingPage.clickOnActive();
	ticketingPage.clickOnInActive();
	ticketingPage.clickOnDelete();
	
}
/*Method  for SLA */
public void GoToSLAPage()
{
	
	ticketingPage.clickOnSLA();	
	ticketingPage.clickOnAddSLA();	
	ticketingPage.clickOnSave();
	ticketingPage.clickOnCloseNotifyMessage();
	ticketingPage.VerifyMandatoryFieldOfSLA();
	ticketingPage.clickOnCancel();
	ticketingPage.clickOnCheckBoxOfSLA();
	ticketingPage.clickOnActive();
	ticketingPage.clickOnInActive();
	ticketingPage.clickOnDelete();
	
}
/*Method  for Knowledge Base */
public void GoToKnowledgeBasePage()
{
	
	ticketingPage.clickOnKnowledgeBase();	
	ticketingPage.clickOnAddKnowledgeBase();	
	ticketingPage.clickOnSaveAsDraft();;
	ticketingPage.clickOnCloseNotifyMessage();
	ticketingPage.VerifyMandatoryFieldValidation();
	ticketingPage.clickOnCancelAddTicket();
	ticketingPage.clickOnExpandAllCollapseAll();
	
}
/*Method  for Manage Category */
public void GoToManageCategoryPage()
{
	
	ticketingPage.clickOnManageCategory();	
	ticketingPage.clickOnAddManageCategory();	
	ticketingPage.clickOnUserGuide();;
	ticketingPage.clickOnSaveAddNewcategory();
	ticketingPage.VerifyMandatoryFieldOfAddManageCategory();
	ticketingPage.clickOnCancelAddNewcategory();
	
}
/*Method  for My Articles */
public void GoToMyArticlesPage()
{
	
	ticketingPage.clickOnMyArticles();	
	ticketingPage.clickOnAddMyArticles();	
	ticketingPage.clickOnSaveAddArticle();;
	ticketingPage.VerifyMandatoryFieldOfAddArticle();
	ticketingPage.clickOnCancelAddNewcategory();
	ticketingPage.clickOnCheckBoxOfMyArticles();
	ticketingPage.clickOnDeleteMyArticles();
	ticketingPage.clickOnCloneButton();
	ticketingPage.clickOnUserGuideOfClone();
	ticketingPage.clickOnMoveButton();
	ticketingPage.clickOnUserGuideOfMove();
	
}
/*Method  for Product */
public void GoToProductPage()
{
	
	ticketingPage.clickOnProduct();	
	ticketingPage.clickOnAddProduct();	
	ticketingPage.clickOnSaveProduct();;
	ticketingPage.VerifyMandatoryFieldOfAddProduct();
	ticketingPage.clickOnCancelProduct();
	ticketingPage.clickOnCheckBoxOfMyArticles();
	ticketingPage.clickOnActive();
	ticketingPage.clickOnInActive();
	ticketingPage.clickOnDelete();
	
	
}
}
