package action;

import org.openqa.selenium.WebDriver;

import pageobjects.AppoitmentCalendarPage;
import pageobjects.ExpensePage;

public class ExpenseAction {
	WebDriver driver ; 
	ExpensePage expensePage;
	
	public ExpenseAction(WebDriver driver)
	{
		this.driver= driver;
		expensePage= new ExpensePage(driver);
	}
	
	public void GoToExpensePage()
	{
		expensePage.clickFullMenuDropDown();	
		expensePage.clickOnExpense();	
		
		
	}
	/*Meatod  for Add Expense for Expense*/
	public void GoToAddExpensePage()
	{
		
		expensePage.clickOnAddExpense();	
		expensePage.clickOnSaveAsDraft();
		expensePage.VerifyMandatoryFieldValidation();
		expensePage.clickOnCancel();
		
	}
	/*Method for Bulk upload expense*/
	public void GoToBulkUploadExpensePage()
	{
		
		expensePage.clickOnBulkUploadExpense();	
		expensePage.clickOnPageTourGuide();

		
	}
	/*Meatod  for Expense Approval for Expense*/
	public void GoToExpenseApprovalPage()
	{
		
		expensePage.clickOnExpenseApproval();	
		expensePage.clickOnPageTourGuideOfExpenseApproval();
		expensePage.clickOnViewHistory();
		
	}
	/*Meatod  for Expense Reports for Expense*/
	public void GoToExpenseReportsPage()
	{
		
		expensePage.clickOnExpenseReport();	
		
		
	}
	/*Meatod  for Add Expense for Expense*/
	public void GoToExpensesPage()
	{
		
		expensePage.clickOnExpenses();
		expensePage.clickOnPageTourGuideOfExpenseApproval();
		expensePage.clickOnCardView();
		expensePage.clickOnListView();
		expensePage.clickOnKanbanView();
		expensePage.clickOnAddExpenses();
		expensePage.clickOnSaveAsDraft();
		expensePage.VerifyMandatoryFieldValidation();
		expensePage.clickOnCancel();
		
	}
	/*Meatod  for Project for Expense*/
	public void GoToProjectPage()
	{
		
		expensePage.clickOnProject();
		expensePage.clickOnPageTourGuideOfProject();
		expensePage.clickOnCardView();
		expensePage.clickOnListView();
		expensePage.clickOnKanbanView();
		expensePage.clickOnImport();
		expensePage.clickOnAddProject();
		expensePage.clickOnManageTemplate();
	
		
	}
	/*Meatod  for Expense DashBoard*/
	public void GoToExpenseDashBoardPage()
	{
		
		expensePage.clickOnDashboard();
		expensePage.clickOnMyView();
		expensePage.clickOnTeamView();
		expensePage.clickOnChangeView();
		
	
		
	}
}
