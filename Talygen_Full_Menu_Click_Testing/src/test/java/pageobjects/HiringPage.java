package pageobjects;

import static reporting.ComplexReportFactory.getTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.relevantcodes.extentreports.LogStatus;

import utils.WebBasePage;

public class HiringPage extends WebBasePage{
	WebDriver driver ;
	public HiringPage(WebDriver driver) {
		super(driver, "HiringPage");
		this.driver=driver;
		// TODO Auto-generated constructor stub
	}
	public void clickFullMenuDropDown() {
		staticWait(3000);
        click(By.xpath("//span[text()='Full Menu']"), "Full Menu", 30);
        
    }
	/*
	 * Code for click testing of Candidate List for Hiring
	 */
     public void clickOnHiring()
     {		staticWait(2000);
    	 click(By.xpath("//ul/li[@data-name='Hiring']/span"),"Hiring", 30);
    	 
     }
     public void clickOnCandidateListforHiring()
     {		staticWait(2000);
    	 click(By.xpath("//div/ul/li/a[@data-original-title='Candidate List']"),"Candidate List", 30);
    	
    	 try {
    		 WebElement candidateList = driver.findElement(By.xpath("//div/span[text()='Candidate List']"));
    		 if (candidateList.isDisplayed()) {
				logger.info("Candidate List Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Candidate List Page not opened succesfully");
		}
     }
     public void clickOnAddCandidateListforHiring()
     {		staticWait(2000);
    	 click(By.xpath("//div/span/a[@data-original-title='Add Candidate']"),"Candidate List", 30);
    	
    	 try {
    		 WebElement addcandidateList = driver.findElement(By.xpath("//div/span[text()='Add Candidate']"));
    		 if (addcandidateList.isDisplayed()) {
				logger.info("Add Candidate List Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Add Candidate List Page not opened succesfully");
		}
     }
     public void clickOnSaveButton()
     {		staticWait(2000);
    	 click(By.xpath("//div/a[@data-original-title='Save']"),"Save Button", 30);
     }
     public void clickOnCloseNotifyMessageButton()
     {		staticWait(2000);
    	 click(By.xpath("//button[@id='closenotifymessage']"),"Close Notify Message", 30);
     }
     public void clickOnCancelButton()
     {		staticWait(2000);
    	 click(By.xpath("//div/a[@data-original-title='Cancel']"),"Cancel Button", 30);
    	 driver.navigate().refresh();
     }
     public void VerifyMandatoryFieldValidation() {
			int i = 0;
			String actualText;
			String expectedText;

			List<WebElement> errorMessageLocator = findMultipleElement(
					By.xpath("//div[contains(@class,'invalid-feedback')]"), 45);
			String[] expectedValue = { "Select Job","First Name","Last Name","Email","Mobile Number" };
			for (Object expected : expectedValue) {
				WebElement AsteriskField = findElementVisibility(By.xpath("//label[contains(text(),'"+ expected +"')]/ancestor::div[@class='form-group']/descendant::span[@class='text-danger']"), 45);
				if (AsteriskField != null) {
					getTest().log(LogStatus.PASS, "The Asterisk symbol is displayed for " + expected + " field");
					logger.info("The Asterisk symbol is displayed for " + expected + " field");
				} else {
					getTest().log(LogStatus.FAIL, "The Asterisk symbol is not displayed for " + expected + " field");
					logger.info("The Asterisk symbol is not displayed for " + expected + " field");
					takeScreenshot(expected.toString());
				}

				List<WebElement> expectedElements = errorMessageLocator;
				for (WebElement element : expectedElements) {
					i++;
					actualText = element.getText();
					expectedText = expected.toString();

					if (actualText.indexOf(expectedText) != -1) {
						getTest().log(LogStatus.PASS,
								"Error message for \"" + expected + "\" field is displayed as expected");
						logger.info("Error message for \"" + expected + "\" field is displayed as expected");
						i = 0;
						break;
					} else if (i == expectedValue.length && !element.getText().contains(expectedText)) {
						getTest().log(LogStatus.FAIL, "Error message for \"" + expected + "\" field is not displayed");
						logger.info("Error message for \"" + expected + "\" field is displayed as expected");
						takeScreenshot(expectedText);
					}
				}

			}
		}
     public void clickOnForwardcandidatesCV()
     {		staticWait(2000);
    	 click(By.xpath("//div/span/a/span[text()='Forward candidates CV']"),"Forward candidates CV", 30);
    	
    	 try {
    		 WebElement forwardcandidatesCV = driver.findElement(By.xpath("//div[text()='Please select atleast one candidate.']"));
    		 if (forwardcandidatesCV.isDisplayed()) {
				logger.info("Forward candidates CV Clicked succesfully");
				staticWait(2000);
				click(By.xpath("//div/button[@data-bb-handler='ok']"),"Ok Button", 30);
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Forward candidates CV not clicked succesfully");
		}
     }
     public void clickOnGridView()
     {		staticWait(2000);
    	 click(By.xpath("//div/span/a/span[text()='Grid View']"),"Grid View", 30);
    	 logger.info("Grid View page opened succesfully");
    	
     }
     public void clickOnListView()
     {		staticWait(2000);
    	 click(By.xpath("//div/span/a/span[text()='List View']"),"List View", 30);
    	 logger.info("List View page opened succesfully");
    	
     }
     public void clickOnCheckBox()
     {		staticWait(2000);
    	 click(By.xpath("//table/thead/tr/th/div[@class='custom-control custom-checkbox']"),"CheckBox", 30);
    	 
    	
     }
     public void clickOnDelete()
     {	staticWait(2000);
    	 click(By.xpath("//div/span/a[@data-original-title='Delete']"),"Delet Button", 30);
    	 staticWait(2000);
    	 click(By.xpath("//div/button[@title='Cancel']"),"Cancel Button", 30);
    	 driver.navigate().refresh();
     }
     public void clickOnManageView()
     {		staticWait(3000);
    	 click(By.xpath("//div/span/a[@data-original-title='Manage View']"),"Manage view", 30);
    	
    	 try {
    		 WebElement manageViewPage = driver.findElement(By.xpath("//div/h4[text()='Manage View']"));
    		 if (manageViewPage.isDisplayed()) {
				logger.info("Manage View Page opened succesfully");
				staticWait(2000);
				//click(By.xpath("//div/h4[contains(text(),'Manage View')]/ancestor::div[@class='modal-content']/descendant::button[@class='close']/i"),"Close button", 30);
				WebElement closeButton = driver.findElement(By.xpath("//div/h4[contains(text(),'Manage View')]/ancestor::div[@class='modal-content']/descendant::button[@class='close']/i"));
				Actions action=new Actions(driver);
				action.moveToElement(closeButton).click().perform();
				logger.info("Close Manage View Page");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Manage View Page not opened succesfully");
		}
    	 driver.navigate().refresh();
     }
     /*---------------------------------------------------------------------------------------------------------------------------------*/
     /*Code for click testing of Consultant List */
     public void clickOnConsultantListforHiring()
     {		staticWait(2000);
    	 click(By.xpath("//div/ul/li/a[@data-original-title='Consultant List']"),"Consultant List", 30);
    	
    	 try {
    		 WebElement consultantList = driver.findElement(By.xpath("//div/span[text()='Manage Consultant']"));
    		 if (consultantList.isDisplayed()) {
				logger.info("Manage Consultant Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Manage Consultant Page not opened succesfully");
		}
     }
     public void clickOnAddConsultantListforHiring()
     {		staticWait(2000);
    	 click(By.xpath("//div/span/a[@data-original-title='Add Consultant']"),"Add Consultant", 30);
    	
    	 try {
    		 WebElement addConsultantList = driver.findElement(By.xpath("//div/span[contains(text(),'Add Consultant')]"));
    		 if (addConsultantList.isDisplayed()) {
				logger.info("Add Consultant List Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Add Consultant List Page not opened succesfully");
		}
     }
     public void clickOnSaveAddConsultantList()
     {		staticWait(2000);
    	 click(By.xpath("//div/button[@id='SaveArticle']"),"Save Button", 30);
     }
     public void clickOnCancelAddConsultantList()
     {		staticWait(2000);
    	 click(By.xpath("//div/a[@id='cancel']"),"Cancel Button", 30);
    	 driver.navigate().refresh();
     }
     public void VerifyMandatoryFieldOfAddConsultantList() {
			int i = 0;
			String actualText;
			String expectedText;

			List<WebElement> errorMessageLocator = findMultipleElement(
					By.xpath("//span[contains(@class,'invalid-feedback')]"), 45);
			String[] expectedValue = { "Company Name","First Name","Last Name","Email","Password","Confirm Password","Country","State","City","Address 1","Phone Number"};
			for (Object expected : expectedValue) {
				WebElement AsteriskField = findElementVisibility(By.xpath("//label[contains(text(),'"+ expected +"')]/ancestor::div[@class='form-group']/descendant::span[@class='mandatory']"), 45);
				if (AsteriskField != null) {
					getTest().log(LogStatus.PASS, "The Asterisk symbol is displayed for " + expected + " field");
					logger.info("The Asterisk symbol is displayed for " + expected + " field");
				} else {
					getTest().log(LogStatus.FAIL, "The Asterisk symbol is not displayed for " + expected + " field");
					logger.info("The Asterisk symbol is not displayed for " + expected + " field");
					takeScreenshot(expected.toString());
				}

				List<WebElement> expectedElements = errorMessageLocator;
				for (WebElement element : expectedElements) {
					i++;
					actualText = element.getText();
					expectedText = expected.toString();

					if (actualText.indexOf(expectedText) != -1) {
						getTest().log(LogStatus.PASS,
								"Error message for \"" + expected + "\" field is displayed as expected");
						logger.info("Error message for \"" + expected + "\" field is displayed as expected");
						i = 0;
						break;
					} else if (i == expectedValue.length && !element.getText().contains(expectedText)) {
						getTest().log(LogStatus.FAIL, "Error message for \"" + expected + "\" field is not displayed");
						logger.info("Error message for \"" + expected + "\" field is displayed as expected");
						takeScreenshot(expectedText);
					}
				}

			}
		}
     /*---------------------------------------------------------------------------------------------------------------------------------*/
     /*Code for click testing of Group List */
     public void clickOnGroupListforHiring()
     {		staticWait(2000);
    	 click(By.xpath("//div/ul/li/a[@data-original-title='Group List']"),"Group List", 30);
    	
    	 try {
    		 WebElement groupList = driver.findElement(By.xpath("//div/span[text()='Group Listing']"));
    		 if (groupList.isDisplayed()) {
				logger.info("Group Listing Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Group Listing Page not opened succesfully");
		}
     }
     public void clickOnAddGroupListforHiring()
     {		staticWait(2000);
    	 click(By.xpath("//div/span/a[@data-original-title='Add Group']"),"Add Group", 30);
    	
    	 try {
    		 WebElement addGroupList = driver.findElement(By.xpath("//div/span[contains(text(),'Add Consultant')]"));
    		 if (addGroupList.isDisplayed()) {
				logger.info("Add Group List Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Add Group List Page not opened succesfully");
		}
     }
     public void clickOnSaveAddGroupList()
     {		staticWait(2000);
    	 click(By.xpath("//div/a[@title='Save']"),"Save Button", 30);
     }
     public void clickOnCancelAddGroupList()
     {		staticWait(2000);
    	 click(By.xpath("//div/a[@title='Close']"),"Close Button", 30);
     }
     public void VerifyMandatoryFieldOfAddGroupList() {
			int i = 0;
			String actualText;
			String expectedText;

			List<WebElement> errorMessageLocator = findMultipleElement(
					By.xpath("//span[contains(@class,'invalid-feedback')]"), 45);
			String[] expectedValue = { "Group Name"};
			for (Object expected : expectedValue) {
				WebElement AsteriskField = findElementVisibility(By.xpath("//label[contains(text(),'"+ expected +"')]/ancestor::div[@class='form-group']/descendant::span[@class='text-danger']"), 45);
				if (AsteriskField != null) {
					getTest().log(LogStatus.PASS, "The Asterisk symbol is displayed for " + expected + " field");
					logger.info("The Asterisk symbol is displayed for " + expected + " field");
				} else {
					getTest().log(LogStatus.FAIL, "The Asterisk symbol is not displayed for " + expected + " field");
					logger.info("The Asterisk symbol is not displayed for " + expected + " field");
					takeScreenshot(expected.toString());
				}

				List<WebElement> expectedElements = errorMessageLocator;
				for (WebElement element : expectedElements) {
					i++;
					actualText = element.getText();
					expectedText = expected.toString();

					if (actualText.indexOf(expectedText) != -1) {
						getTest().log(LogStatus.PASS,
								"Error message for \"" + expected + "\" field is displayed as expected");
						logger.info("Error message for \"" + expected + "\" field is displayed as expected");
						i = 0;
						break;
					} else if (i == expectedValue.length && !element.getText().contains(expectedText)) {
						getTest().log(LogStatus.FAIL, "Error message for \"" + expected + "\" field is not displayed");
						logger.info("Error message for \"" + expected + "\" field is displayed as expected");
						takeScreenshot(expectedText);
					}
				}

			}
		}
     public void clickOnCheckBoxOfGroupListing()
     {		staticWait(2000);
    	 click(By.xpath("//table/thead/tr/th/span/div[@class='custom-control custom-checkbox']"),"CheckBox", 30);
    	 
    	
     }
     public void clickOnDeleteGroupListing()
     {	staticWait(2000);
    	 click(By.xpath("//div/span/a[@id='DeleteMultiple']"),"Delet Button", 30);
    	 staticWait(2000);
    	 click(By.xpath("//div/button[@title='Cancel']"),"Cancel Button", 30);
    	 driver.navigate().refresh();
     }
     /*---------------------------------------------------------------------------------------------------------------------------------*/
     /*Code for click testing of Job List */
     public void clickOnJobListforHiring()
     {		staticWait(2000);
    	 click(By.xpath("//div/ul/li/a[@data-original-title='Job List']"),"Job list", 30);
    	
    	 try {
    		 WebElement jobList = driver.findElement(By.xpath("//div/span[text()='Job List']"));
    		 if (jobList.isDisplayed()) {
				logger.info("Job Listing Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Job Listing Page not opened succesfully");
		}
     }
     public void clickOnAddJobListforHiring()
     {		staticWait(2000);
    	 click(By.xpath("//div/span/a[@data-original-title='Add a Job']"),"Add Job List", 30);
    	
    	 try {
    		 WebElement addJobList = driver.findElement(By.xpath("//div/span[contains(text(),'Add a Job')]"));
    		 if (addJobList.isDisplayed()) {
				logger.info("Add Job List Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Add Job List Page not opened succesfully");
		}
     }
     public void clickOnSaveAddJobList()
     {		staticWait(2000);
    	 click(By.xpath("//div/a[@data-original-title='Save and continue']"),"Save Button", 30);
     }
     public void VerifyMandatoryFieldOfAddJobList() {
			int i = 0;
			String actualText;
			String expectedText;

			List<WebElement> errorMessageLocator = findMultipleElement(
					By.xpath("//div[contains(@class,'invalid-feedback')]"), 45);
			String[] expectedValue = { "Title","Job Title(Internal)","Designation","Enter number of positions","Department","Start Date","Close Date","Location","Currency","Salary Frequency","Job Type","Skill","Short Description","Description","Graduation","Post Graduation","Doctorate"};
			for (Object expected : expectedValue) {
				WebElement AsteriskField = findElementVisibility(By.xpath("//label[contains(text(),'"+ expected +"')]/ancestor::div[@class='form-group']/descendant::span[@class='text-danger']"), 45);
				if (AsteriskField != null) {
					getTest().log(LogStatus.PASS, "The Asterisk symbol is displayed for " + expected + " field");
					logger.info("The Asterisk symbol is displayed for " + expected + " field");
				} else {
					getTest().log(LogStatus.FAIL, "The Asterisk symbol is not displayed for " + expected + " field");
					logger.info("The Asterisk symbol is not displayed for " + expected + " field");
					takeScreenshot(expected.toString());
				}

				List<WebElement> expectedElements = errorMessageLocator;
				for (WebElement element : expectedElements) {
					i++;
					actualText = element.getText();
					expectedText = expected.toString();

					if (actualText.indexOf(expectedText) != -1) {
						getTest().log(LogStatus.PASS,
								"Error message for \"" + expected + "\" field is displayed as expected");
						logger.info("Error message for \"" + expected + "\" field is displayed as expected");
						i = 0;
						break;
					} else if (i == expectedValue.length && !element.getText().contains(expectedText)) {
						getTest().log(LogStatus.FAIL, "Error message for \"" + expected + "\" field is not displayed");
						logger.info("Error message for \"" + expected + "\" field is displayed as expected");
						takeScreenshot(expectedText);
					}
				}

			}
		}
     public void clickOnCardView()
     {		staticWait(2000);
    	 click(By.xpath("//div/span/a[@data-original-title='Card View']"),"Card View", 30);
    	 logger.info("Card View page opened succesfully");
    	
     }
     /*---------------------------------------------------------------------------------------------------------------------------------*/
     /*Code for click testing of Job Post Report */
     public void clickOnJobPostReportforHiring()
     {		staticWait(2000);
    	 click(By.xpath("//div/ul/li/a[@data-original-title='Job Post Report']"),"Job Post Report", 30);
    	
    	 try {
    		 WebElement jobPostReport = driver.findElement(By.xpath("//div/span[text()='Hiring Reports']"));
    		 if (jobPostReport.isDisplayed()) {
				logger.info("Hiring Reports Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Hiring Reports Page not opened succesfully");
		}
    	 driver.navigate().refresh();
     }
     /*---------------------------------------------------------------------------------------------------------------------------------*/
     /*Code for click testing of Job Requisition*/
     public void clickOnJobRequisitionforHiring()
     {		staticWait(2000);
    	 click(By.xpath("//div/ul/li/a[@data-original-title='Job Requisition']"),"Job Requisition", 30);
    	
    	 try {
    		 WebElement jobRequisition = driver.findElement(By.xpath("//div/span[text()='Requisition']"));
    		 if (jobRequisition.isDisplayed()) {
				logger.info("Job Requisition Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Job Requisition Page not opened succesfully");
		}
     }
     public void clickOnAddJobRequisitionforHiring()
     {		staticWait(2000);
    	 click(By.xpath("//div/span/a[@data-original-title='Add Requisition']"),"Add Job Requisition", 30);
    	
    	 try {
    		 WebElement addjobRequisition = driver.findElement(By.xpath("//div/span[text()='Add Requisition']"));
    		 if (addjobRequisition.isDisplayed()) {
				logger.info("Add Job Requisition Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Add Job Requisition Page not opened succesfully");
		}
     }
     public void clickOnSubmit()
     {		staticWait(2000);
    	 click(By.xpath("//button[@type='submit']"),"Submit Button", 30);

    	
     }
     /*---------------------------------------------------------------------------------------------------------------------------------*/
     /*Code for click testing of Offboard Employee List*/
     public void clickOnOffboardEmployeeListforHiring()
     {		staticWait(2000);
    	 click(By.xpath("//div/ul/li/a[@data-original-title='Offboard Employee List']"),"Offboard Employee List", 30);
    	
    	 try {
    		 WebElement offboardEmployeeList = driver.findElement(By.xpath("//div/span[text()='Offboard Employee List']"));
    		 if (offboardEmployeeList.isDisplayed()) {
				logger.info("Offboard Employee List Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Offboard Employee List Page not opened succesfully");
		}
     }
     public void clickOnAddOffboardEmployeeListforHiring()
     {		staticWait(2000);
    	 click(By.xpath("//div/span/a[contains(@data-original-title,'Add Offboard Employee')]"),"Add Offboard Employee", 30);
    	
    	 try {
    		 WebElement addOffboardEmployeeList = driver.findElement(By.xpath("//div/span[text()='Manage Offboard Employee']"));
    		 if (addOffboardEmployeeList.isDisplayed()) {
				logger.info("Add Offboard Employee List Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Add Offboard Employee List Page not opened succesfully");
		}
     }
     public void VerifyMandatoryFieldOfAddOffboardEmployeeList() {
			int i = 0;
			String actualText;
			String expectedText;

			List<WebElement> errorMessageLocator = findMultipleElement(
					By.xpath("//span[contains(@class,'invalid-feedback')]"), 45);
			String[] expectedValue = { "Employee Name"};
			for (Object expected : expectedValue) {
				WebElement AsteriskField = findElementVisibility(By.xpath("//label[contains(text(),'"+ expected +"')]/ancestor::div[@class='form-group']/descendant::span[@class='mandatory']"), 45);
				if (AsteriskField != null) {
					getTest().log(LogStatus.PASS, "The Asterisk symbol is displayed for " + expected + " field");
					logger.info("The Asterisk symbol is displayed for " + expected + " field");
				} else {
					getTest().log(LogStatus.FAIL, "The Asterisk symbol is not displayed for " + expected + " field");
					logger.info("The Asterisk symbol is not displayed for " + expected + " field");
					takeScreenshot(expected.toString());
				}

				List<WebElement> expectedElements = errorMessageLocator;
				for (WebElement element : expectedElements) {
					i++;
					actualText = element.getText();
					expectedText = expected.toString();

					if (actualText.indexOf(expectedText) != -1) {
						getTest().log(LogStatus.PASS,
								"Error message for \"" + expected + "\" field is displayed as expected");
						logger.info("Error message for \"" + expected + "\" field is displayed as expected");
						i = 0;
						break;
					} else if (i == expectedValue.length && !element.getText().contains(expectedText)) {
						getTest().log(LogStatus.FAIL, "Error message for \"" + expected + "\" field is not displayed");
						logger.info("Error message for \"" + expected + "\" field is displayed as expected");
						takeScreenshot(expectedText);
					}
				}

			}
		}
     /*---------------------------------------------------------------------------------------------------------------------------------*/
     /*Code for click testing of Policy*/
     public void clickOnPolicyforHiring()
     {		staticWait(2000);
    	 click(By.xpath("//div/ul/li/a[@data-original-title='Policy']"),"Policy", 30);
    	
    	 try {
    		 WebElement policy = driver.findElement(By.xpath("//div/span[text()='Policies']"));
    		 if (policy.isDisplayed()) {
				logger.info("Policy Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Policy Page not opened succesfully");
		}
     }
     public void clickOnAddPolicyforHiring()
     {		staticWait(2000);
    	 click(By.xpath("//div/span/a[@data-original-title='Add Policy']"),"Add Policy", 30);
    	
    	 try {
    		 WebElement policy = driver.findElement(By.xpath("//div/span[text()='Add Policy']"));
    		 if (policy.isDisplayed()) {
				logger.info("Add Policy Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Add Policy Page not opened succesfully");
		}
     }
     /*---------------------------------------------------------------------------------------------------------------------------------*/
     /*Code for click testing of Resignation*/
     public void clickOnResignationforHiring()
     {		staticWait(2000);
    	 click(By.xpath("//div/ul/li/a[@data-original-title='Resignation']"),"Resignation", 30);
    	
    	 try {
    		 WebElement resignation = driver.findElement(By.xpath("//div/span[text()='Employees  Resignation']"));
    		 if (resignation.isDisplayed()) {
				logger.info("Resignation Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Resignation Page not opened succesfully");
		}
     }
     public void clickOnApplyResignation()
     {		staticWait(2000);
    	 click(By.xpath("//div/span/a[@data-original-title='btn_applyResignation']"),"Apply Resignation", 30);
    	
    	 try {
    		 WebElement applyresignation = driver.findElement(By.xpath("//div/span[text()='Manage Resignation']"));
    		 if (applyresignation.isDisplayed()) {
				logger.info("Manage Resignation Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Manage Resignation Page not opened succesfully");
		}
     }
     public void clickOnSaveManageResignation()
     {		staticWait(2000);
    	 click(By.xpath("//div/a[@id='saveRequest']"),"Save Button", 30);

    	
     }
     public void clickOnCancelManageResignation()
     {		staticWait(2000);
    	 click(By.xpath("//div/a[@id='btnCancel']"),"Cancel Button", 30);

    	
     }
     /*---------------------------------------------------------------------------------------------------------------------------------*/
     /*Code for click testing of Service*/
     public void clickOnServiceforHiring()
     {		staticWait(2000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='Service'])[2]"),"Service", 30);
    	
    	 try {
    		 WebElement service = driver.findElement(By.xpath("//div/span[text()='Vendor Services']"));
    		 if (service.isDisplayed()) {
				logger.info("Vendor Services Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Vendor Services Page not opened succesfully");
		}
    	 driver.navigate().refresh();
     }
     /*---------------------------------------------------------------------------------------------------------------------------------*/
     /*Code for click testing of Talent Pool List*/
     public void clickOnTalentPoolListforHiring()
     {		staticWait(2000);
    	 click(By.xpath("//div/ul/li/a[@data-original-title='Talent Pool List']"),"Talent Pool List", 30);
    	
    	 try {
    		 WebElement talentPoolList = driver.findElement(By.xpath("//div/span[text()='Talent Pool']"));
    		 if (talentPoolList.isDisplayed()) {
				logger.info("Talent Pool List Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Talent Pool List Page not opened succesfully");
		}
     }
     public void clickOnAddToTalentPoolListforHiring()
     {		staticWait(2000);
    	 click(By.xpath("//div/span/a[@data-original-title='Add to Talent Pool']"),"Add To Talent Pool List", 30);
    	
    	 try {
    		 WebElement addTotalentPoolList = driver.findElement(By.xpath("//div/span[text()='Add Talent Pool']"));
    		 if (addTotalentPoolList.isDisplayed()) {
				logger.info("Add Talent Pool List Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Add Talent Pool List Page not opened succesfully");
		}
     }
     public void VerifyMandatoryFieldOfAddToTalentPoo() {
			int i = 0;
			String actualText;
			String expectedText;

			List<WebElement> errorMessageLocator = findMultipleElement(
					By.xpath("//div[contains(@class,'invalid-feedback')]"), 45);
			String[] expectedValue = { "First Name","Last Name","Email","Mobile Number"};
			for (Object expected : expectedValue) {
				WebElement AsteriskField = findElementVisibility(By.xpath("//label[contains(text(),'"+ expected +"')]/ancestor::div[@class='form-group']/descendant::span[@class='text-danger']"), 45);
				if (AsteriskField != null) {
					getTest().log(LogStatus.PASS, "The Asterisk symbol is displayed for " + expected + " field");
					logger.info("The Asterisk symbol is displayed for " + expected + " field");
				} else {
					getTest().log(LogStatus.FAIL, "The Asterisk symbol is not displayed for " + expected + " field");
					logger.info("The Asterisk symbol is not displayed for " + expected + " field");
					takeScreenshot(expected.toString());
				}

				List<WebElement> expectedElements = errorMessageLocator;
				for (WebElement element : expectedElements) {
					i++;
					actualText = element.getText();
					expectedText = expected.toString();

					if (actualText.indexOf(expectedText) != -1) {
						getTest().log(LogStatus.PASS,
								"Error message for \"" + expected + "\" field is displayed as expected");
						logger.info("Error message for \"" + expected + "\" field is displayed as expected");
						i = 0;
						break;
					} else if (i == expectedValue.length && !element.getText().contains(expectedText)) {
						getTest().log(LogStatus.FAIL, "Error message for \"" + expected + "\" field is not displayed");
						logger.info("Error message for \"" + expected + "\" field is displayed as expected");
						takeScreenshot(expectedText);
					}
				}

			}
		}
     /*---------------------------------------------------------------------------------------------------------------------------------*/
     /*Code for click testing of Vendor Listing*/
     public void clickOnVendorListingforHiring()
     {		staticWait(2000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='Vendor Listing'])[2]"),"Vendor Listing", 30);
    	
    	 try {
    		 WebElement vendorListing = driver.findElement(By.xpath("//div/span[text()='Vendor Listing']"));
    		 if (vendorListing.isDisplayed()) {
				logger.info("Vendor Listing Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Vendor Listing Page not opened succesfully");
		}
     }
     public void clickOnAddVendorListingforHiring()
     {		staticWait(2000);
    	 click(By.xpath("//div/span/a[@data-original-title='Add vendor']"),"Add Vendor", 30);
    	
    	 try {
    		 WebElement addvendorListing = driver.findElement(By.xpath("//div/span[contains(text(),'Add Vendor')]"));
    		 if (addvendorListing.isDisplayed()) {
				logger.info("Add Vendor Listing Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Add Vendor Listing Page not opened succesfully");
		}
     }
     public void VerifyMandatoryFieldOfAddVendorListing() {
			int i = 0;
			String actualText;
			String expectedText;

			List<WebElement> errorMessageLocator = findMultipleElement(
					By.xpath("//span[contains(@class,'invalid-feedback')]"), 45);
			String[] expectedValue = { "Company Name","First Name","Last Name","Email","Password","Confirm Password","Country","State","City","Address 1","Phone Number"};
			for (Object expected : expectedValue) {
				WebElement AsteriskField = findElementVisibility(By.xpath("//label[contains(text(),'"+ expected +"')]/ancestor::div[@class='form-group']/descendant::span[@class='mandatory']"), 45);
				if (AsteriskField != null) {
					getTest().log(LogStatus.PASS, "The Asterisk symbol is displayed for " + expected + " field");
					logger.info("The Asterisk symbol is displayed for " + expected + " field");
				} else {
					getTest().log(LogStatus.FAIL, "The Asterisk symbol is not displayed for " + expected + " field");
					logger.info("The Asterisk symbol is not displayed for " + expected + " field");
					takeScreenshot(expected.toString());
				}

				List<WebElement> expectedElements = errorMessageLocator;
				for (WebElement element : expectedElements) {
					i++;
					actualText = element.getText();
					expectedText = expected.toString();

					if (actualText.indexOf(expectedText) != -1) {
						getTest().log(LogStatus.PASS,
								"Error message for \"" + expected + "\" field is displayed as expected");
						logger.info("Error message for \"" + expected + "\" field is displayed as expected");
						i = 0;
						break;
					} else if (i == expectedValue.length && !element.getText().contains(expectedText)) {
						getTest().log(LogStatus.FAIL, "Error message for \"" + expected + "\" field is not displayed");
						logger.info("Error message for \"" + expected + "\" field is displayed as expected");
						takeScreenshot(expectedText);
					}
				}

			}
			driver.navigate().refresh();
		}
     
}
