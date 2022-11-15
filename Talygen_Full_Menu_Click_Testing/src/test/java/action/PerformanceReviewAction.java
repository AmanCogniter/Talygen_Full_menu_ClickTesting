package action;

import org.openqa.selenium.WebDriver;

import pageobjects.FsmPage;
import pageobjects.IntegrationPage;
import pageobjects.PerformanceReviewPage;

public class PerformanceReviewAction {
	WebDriver driver ; 
	PerformanceReviewPage performanceReviewPage;
	
	public PerformanceReviewAction(WebDriver driver)
	{
		this.driver= driver;
		performanceReviewPage= new PerformanceReviewPage(driver);
	}
	
	public void GoToPerformanceReviewPage()
	{
		performanceReviewPage.clickFullMenuDropDown();	
		performanceReviewPage.clickOnPerformanceReview();	
		
		
	}
	/*Method  for Performance Review Sub Module Page of Performance Review*/
	public void GoToPerformanceReviewSubModulePage()
	{
		
		performanceReviewPage.clickOnPerformanceReviewSubModule();	
		
		
	}
	/*Method  for Performance Review Report Page of Performance Review*/
	public void GoToPerformanceReviewReportPage()
	{
		
		performanceReviewPage.clickOnPerformanceReviewReport();	
		
		
	}
	/*Method  for Provide Feedback Page of Performance Review*/
	public void GoToProvideFeedbackPage()
	{
		
		performanceReviewPage.clickOnProvideFeedback();	
		
		
	}
	/*Method  for Provide Review Page of Performance Review*/
	public void GoToProvideReviewPage()
	{
		
		performanceReviewPage.clickOnProvideReview();	
			
	}
	/*Method  for Review Page of Performance Review*/
	public void GoToReviewPage()
	{
		
		performanceReviewPage.clickOnReview();
		performanceReviewPage.clickOnAddReview();
		performanceReviewPage.clickOnSave();
		performanceReviewPage.VerifyMandatoryFieldValidation();
		performanceReviewPage.clickOnCancel();
			
	}
}
