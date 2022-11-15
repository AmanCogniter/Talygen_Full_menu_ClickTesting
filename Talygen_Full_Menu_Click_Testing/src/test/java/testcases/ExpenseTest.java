package testcases;

import static reporting.ComplexReportFactory.getTest;

import org.testng.annotations.Test;

import action.ExpenseAction;
import action.LoginAction;
import utils.WebTestBase;

public class ExpenseTest extends WebTestBase{
	static String Screenname = "<b>Expense</b>"; 
	/*
	 * Check click testing of Add Expense Page
	 */
	@Test(priority=0)
	public void ValidateClickTestingOfAddExpensePage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Add Expense for Expense");
		ExpenseAction expenseAction = new ExpenseAction(driver);
		new LoginAction(driver).logoutLogin();
		expenseAction.GoToExpensePage();
		expenseAction.GoToAddExpensePage();
		
	}
	@Test(priority=1)
	public void ValidateClickTestingOfBulkUploadExpensePage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Bulk UPLoad Expense for Expense");
		ExpenseAction expenseAction = new ExpenseAction(driver);
		new LoginAction(driver).logoutLogin();
		expenseAction.GoToExpensePage();
		expenseAction.GoToBulkUploadExpensePage();
		
	}
	@Test(priority=2)
	public void ValidateClickTestingOfExpenseApprovalPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Expense Approval for Expense");
		ExpenseAction expenseAction = new ExpenseAction(driver);
		new LoginAction(driver).logoutLogin();
		expenseAction.GoToExpensePage();
		expenseAction.GoToExpenseApprovalPage();
		
	}
	@Test(priority=3)
	public void ValidateClickTestingOfExpenseReportsPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Expense Report for Expense");
		ExpenseAction expenseAction = new ExpenseAction(driver);
		new LoginAction(driver).logoutLogin();
		expenseAction.GoToExpensePage();
		expenseAction.GoToExpenseReportsPage();
		
	}
	@Test(priority=4)
	public void ValidateClickTestingOfExpensesPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Expenses for Expense");
		ExpenseAction expenseAction = new ExpenseAction(driver);
		new LoginAction(driver).logoutLogin();
		expenseAction.GoToExpensePage();
		expenseAction.GoToExpensesPage();
		
	}
	@Test(priority=5)
	public void ValidateClickTestingOfProjectPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Project for Expense");
		ExpenseAction expenseAction = new ExpenseAction(driver);
		new LoginAction(driver).logoutLogin();
		expenseAction.GoToExpensePage();
		expenseAction.GoToProjectPage();
		
	}
	@Test(priority=6)
	public void ValidateClickTestingOfExpenseDashBoardPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Expense DashBoard for Expense");
		ExpenseAction expenseAction = new ExpenseAction(driver);
		new LoginAction(driver).logoutLogin();
		expenseAction.GoToExpensePage();
		expenseAction.GoToExpenseDashBoardPage();
		
	}
}
