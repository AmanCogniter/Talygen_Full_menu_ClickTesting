package action;

import org.openqa.selenium.WebDriver;

import pageobjects.TimeTrackingPage;
import pageobjects.TrainingPage;

public class TrainingAction {
	WebDriver driver ; 
	TrainingPage trainingPage;
	
	public TrainingAction(WebDriver driver)
	{
		this.driver= driver;
		trainingPage= new TrainingPage(driver);
	}
	
	public void GoToTrainingPage()
	{
		trainingPage.clickFullMenuDropDown();	
		trainingPage.clickOnTraining();	
		
		
	}
	/*Method  for Training*/
	public void GoToTrainingSubModulePage()
	{
		
		trainingPage.clickOnTrainingSubModule();	
		trainingPage.clickOnPageTour();
		trainingPage.clickOnAddTraining();
		trainingPage.clickOnSave();
		//trainingPage.VerifyMandatoryFieldValidation();
		//trainingPage.clickOnCancel();
		trainingPage.clickOnBackToList();
		trainingPage.clickOnCheckBox();
		trainingPage.clickOnDelete();
	
	}

/*Method  for Training Report*/
public void GoToTrainingReportPage()
{
	
	trainingPage.clickOnTrainingReport();	
}

}
