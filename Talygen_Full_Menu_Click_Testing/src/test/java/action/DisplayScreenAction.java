package action;

import org.openqa.selenium.WebDriver;

import pageobjects.CrmPage;
import pageobjects.DisplayScreenPage;

public class DisplayScreenAction {
	WebDriver driver ; 
	DisplayScreenPage displayScreenPage;
	
	public DisplayScreenAction(WebDriver driver)
	{
		this.driver= driver;
		displayScreenPage= new DisplayScreenPage(driver);
	}
	
	public void GoToDisplayScreenPage()
	{
		displayScreenPage.clickFullMenuDropDown();	
		displayScreenPage.clickOnDisplayScreen();	
		
		
	}
	/*Meatod  for Counter Page */
	public void GoToCounterPage()
	{
		
		displayScreenPage.clickOnCounter();	
		displayScreenPage.clickOnAddCounter();
		displayScreenPage.clickOnSaveCounter();
		displayScreenPage.VerifyMandatoryFieldOfCounter();
		displayScreenPage.clickOnCancelCounter();	
	}
	/*Meatod  for Token Page */
	public void GoToTokenPage()
	{
		
		displayScreenPage.clickOnToken();	
		displayScreenPage.clickOnAddToken();
		displayScreenPage.clickOnSaveCounter();
		displayScreenPage.VerifyMandatoryFieldOfToken();
		displayScreenPage.clickOnCancelCounter();
		displayScreenPage.clickOnConfiguration();
		displayScreenPage.clickOnSaveAddTokenNumber();
		displayScreenPage.VerifyMandatoryFieldOfConfiguration();
		displayScreenPage.clickOnCloseAddTokenNumber();
	}
}
