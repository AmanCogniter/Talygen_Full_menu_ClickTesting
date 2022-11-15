package testcases;

import static reporting.ComplexReportFactory.getTest;

import org.testng.annotations.Test;

import action.AppoitmentCalenderAction;
import action.LoginAction;
import action.TrainingAction;
import utils.WebTestBase;

public class TrainingTest extends WebTestBase{
	static String Screenname = "<b>Training</b>"; 
	/*
	 * Check click testing of Training Page
	 */
	@Test(priority=0)
	public void ValidateClickTestingOfTrainingPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Training ");
		TrainingAction trainingAction = new TrainingAction(driver);
		new LoginAction(driver).logoutLogin();
		trainingAction.GoToTrainingPage();
		trainingAction.GoToTrainingSubModulePage();
		
	}
	/* Test script for checking Click Testing of Training Report Page */
	@Test(priority=1)
	public void ValidateClickTestingOfTrainingReportPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Training Report Page");
		TrainingAction trainingAction = new TrainingAction(driver);
		new LoginAction(driver).logoutLogin();
		trainingAction.GoToTrainingPage();
		trainingAction.GoToTrainingReportPage();
		
	}
}
