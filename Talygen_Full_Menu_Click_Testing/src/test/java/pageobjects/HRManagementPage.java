package pageobjects;

import static reporting.ComplexReportFactory.getTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.LogStatus;

import utils.WebBasePage;

public class HRManagementPage extends WebBasePage{
	WebDriver driver ;
	public HRManagementPage(WebDriver driver) {
		super(driver, "HRManagementPage");
		this.driver=driver;
		// TODO Auto-generated constructor stub
	}
	public void clickFullMenuDropDown() {
		staticWait(3000);
        click(By.xpath("//span[text()='Full Menu']"), "Full Menu", 30);
        
    }
	/*
	 * Code for click testing of Attendance for HR Management
	 */
     public void clickOnHRManagement()
     {		staticWait(2000);
    	 click(By.xpath("//ul/li[@data-name='HR Management']/span"),"HR Management", 30);
    	 
     }
     public void clickOnAttendanceforHRManagement()
     {		staticWait(2000);
    	 click(By.xpath("(//div/ul/li/a[@data-original-title='Attendance'])[2]"),"Attendance", 30);
    	
    	 try {
    		 WebElement attendance = driver.findElement(By.xpath("//div/span[text()='Attendance']"));
    		 if (attendance.isDisplayed()) {
				logger.info("Attendance Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Attendance Page not opened succesfully");
		}
    	 driver.navigate().refresh();
     }
     /*
 	 * Code for click testing of Attendance Card Report for HR Management
 	 */
     
      public void clickOnAttendanceCardReport()
      {		staticWait(2000);
     	 click(By.xpath("//div/ul/li/a[@data-original-title='Attendance Card Report']"),"Attendance Card Report", 30);
     	
     	 try {
     		 WebElement attendanceCardReport = driver.findElement(By.xpath("//div/span[text()='Attendance']"));
     		 if (attendanceCardReport.isDisplayed()) {
 				logger.info("Attendance Card Report Page opened succesfully");
 			}
 		} catch (Exception e) {
 			// TODO: handle exception
 			logger.info("Attendance Card Report Page not opened succesfully");
 		}
      }
     /*
   	 * Code for click testing of Attendance In-Out Report for HR Management
   	 */
       
        public void clickOnAttendanceInOutReport()
        {		staticWait(2000);
       	 click(By.xpath("//div/ul/li/a[@data-original-title='Attendance In-Out Report']"),"Attendance In-Out Report", 30);
       	
       	 try {
       		 WebElement AttendanceInOutReport = driver.findElement(By.xpath("//div/span[text()='Attendance In-Out Report']"));
       		 if (AttendanceInOutReport.isDisplayed()) {
   				logger.info("Attendance In-Out Report Page opened succesfully");
   			}
   		} catch (Exception e) {
   			// TODO: handle exception
   			logger.info("Attendance In-Out Report Page not opened succesfully");
   		}
       	driver.navigate().refresh();
        }
        /*
       	 * Code for click testing of Attendance Approval for HR Management
       	 */
           
            public void clickOnAttendanceApproval()
            {		staticWait(2000);
           	 click(By.xpath("(//div/ul/li/a[@data-original-title='Attendance Approval'])[2]"),"Attendance Approval", 30);
           	
           	 try {
           		 WebElement attendanceApproval = driver.findElement(By.xpath("//div/span[contains(text(),'Attendance Approval')]"));
           		 if (attendanceApproval.isDisplayed()) {
       				logger.info("Attendance Approval Page opened succesfully");
       			}
       		} catch (Exception e) {
       			// TODO: handle exception
       			logger.info("Attendance Approval Page not opened succesfully");
       		}
           	driver.navigate().refresh();
            }
            /*
           	 * Code for click testing of Check-In Flag List for HR Management
           	 */
               
                public void clickOnCheckInFlagList()
                {		staticWait(2000);
               	 click(By.xpath("(//div/ul/li/a[@data-original-title='Check-In Flag List'])[2]"),"Check-In Flag List", 30);
               	
               	 try {
               		 WebElement checkInFlagList = driver.findElement(By.xpath("//div/span[contains(text(),'Flag List')]"));
               		 if (checkInFlagList.isDisplayed()) {
           				logger.info("Check-In Flag List Page opened succesfully");
           			}
           		} catch (Exception e) {
           			// TODO: handle exception
           			logger.info("Check-In Flag List Page not opened succesfully");
           		}
               	driver.navigate().refresh();
                }
                /*
               	 * Code for click testing of Dispute Approval for HR Management
               	 */
                   
                    public void clickOnDisputeApproval()
                    {		staticWait(2000);
                   	 click(By.xpath("//div/ul/li/a[@data-original-title='Dispute Approval']"),"Dispute Approval", 30);
                   	
                   	 try {
                   		 WebElement disputeApproval = driver.findElement(By.xpath("//div/span[contains(text(),'Dispute Approval')]"));
                   		 if (disputeApproval.isDisplayed()) {
               				logger.info("Dispute Approval Page opened succesfully");
               			}
               		} catch (Exception e) {
               			// TODO: handle exception
               			logger.info("Dispute Approval Page not opened succesfully");
               		}
                   	driver.navigate().refresh();
                    }
                    /*
                   	 * Code for click testing of Check-In/Out Dispute for HR Management
                   	 */
                       
                        public void clickOnCheckInOutDispute()
                        {		staticWait(2000);
                       	 click(By.xpath("//div/ul/li/a[@data-original-title='Check-In/Out Dispute']"),"Check-In/Out Dispute", 30);
                       	
                       	 try {
                       		 WebElement checkInOutDispute = driver.findElement(By.xpath("//div/span[contains(text(),'Dispute List')]"));
                       		 if (checkInOutDispute.isDisplayed()) {
                   				logger.info("Check-In/Out Dispute Page opened succesfully");
                   			}
                   		} catch (Exception e) {
                   			// TODO: handle exception
                   			logger.info("Check-In/Out Dispute Page not opened succesfully");
                   		}
                       	driver.navigate().refresh();
                        }
                        /*
                       	 * Code for click testing of Group List for HR Management
                       	 */
                           
                            public void clickOnGroupList()
                            {		staticWait(2000);
                           	 click(By.xpath("(//div/ul/li/a[@data-original-title='Group List'])[4]"),"Group List", 30);
                           	
                           	 try {
                           		 WebElement groupList = driver.findElement(By.xpath("//div/span[contains(text(),'Group Listing')]"));
                           		 if (groupList.isDisplayed()) {
                       				logger.info("Group Listing Page opened succesfully");
                       			}
                       		} catch (Exception e) {
                       			// TODO: handle exception
                       			logger.info("Group Listing Page not opened succesfully");
                       		}
                            }
                            public void clickOnAddGroupList()
                            {		staticWait(2000);
                           	 click(By.xpath("//div/span/a[@data-original-title='Add Group']"),"Add Group List", 30);
                           	
                           	 try {
                           		 WebElement addgroupList = driver.findElement(By.xpath("//div/h5[contains(text(),'Add Group')]"));
                           		 if (addgroupList.isDisplayed()) {
                       				logger.info("Add Group Listing Page opened succesfully");
                       			}
                       		} catch (Exception e) {
                       			// TODO: handle exception
                       			logger.info("Add Group Listing Page not opened succesfully");
                       		}
                            }
                            public void clickOnSaveButton()
                            {		staticWait(2000);
                           	 clickByJavascript(By.xpath("//div/a[@title='Save']"),"Save Button", 30);
                            }
                            public void clickOnCloselButton()
                            {		staticWait(2000);
                           	 clickByJavascript(By.xpath("//div/a[@title='Close']"),"Close Button", 30);
                           	driver.navigate().refresh();
                            }
                            public void VerifyMandatoryFieldValidation() {
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
                            /*
                           	 * Code for click testing of HR Report for HR Management
                           	 */
                               
                                public void clickOnHRReport()
                                {		staticWait(2000);
                               	 click(By.xpath("(//div/ul/li/a[@data-original-title='HR Report'])[2]"),"Hr Report", 30);
                               	
                               	 try {
                               		 WebElement hrReport = driver.findElement(By.xpath("//div/span[contains(text(),'HR Reports')]"));
                               		 if (hrReport.isDisplayed()) {
                           				logger.info("Hr Report Page opened succesfully");
                           			}
                           		} catch (Exception e) {
                           			// TODO: handle exception
                           			logger.info("Hr Report Page not opened succesfully");
                           		}
                               	driver.navigate().refresh();
                                }
                                
                                
     /*
   	 * Code for click testing of Induction Document List for HR Management
     */
                                   
      public void clickOnInductionDocumentList()
      {		
       staticWait(2000);
      click(By.xpath("(//div/ul/li/a[@data-original-title='Induction Document List'])[2]"),"Induction Document List", 30);
                                   	
        try {
      WebElement inductionDocumentList = driver.findElement(By.xpath("//div/span[contains(text(),'Induction')]"));
      if (inductionDocumentList.isDisplayed()) {
      logger.info("Induction Page opened succesfully");
      }
       } catch (Exception e) {
     // TODO: handle exception
        logger.info("Induction Page not opened succesfully");
      }
      }
      public void clickOnAddInductionDocumentList()
      {		
       staticWait(2000);
      click(By.xpath("//div/span/a[@data-original-title='Add Induction']"),"Add Induction", 30);
                                   	
        try {
      WebElement addinductionDocumentList = driver.findElement(By.xpath("//div/span[contains(text(),'Induction')]"));
      if (addinductionDocumentList.isDisplayed()) {
      logger.info("Add Induction Page opened succesfully");
      }
       } catch (Exception e) {
     // TODO: handle exception
        logger.info("Add Induction Page not opened succesfully");
      }
      }
      public void clickOnSaveAddInductionDocumentList()
      {		
       staticWait(2000);
      click(By.xpath("//div/button[@id='btnSave']"),"Save Button", 30);
      }
      public void clickOnCancelAddInductionDocumentList()
      {		
       staticWait(2000);
      click(By.xpath("//div/a[@id='btnCancel']"),"Cancel Button", 30);
      driver.navigate().refresh();
      }
      public void VerifyMandatoryFieldOfAddInduction() {
			int i = 0;
			String actualText;
			String expectedText;

			List<WebElement> errorMessageLocator = findMultipleElement(
					By.xpath("(//span[contains(@class,'invalid-feedback')])[2]"), 45);
			String[] expectedValue = { "Document Name"};
			for (Object expected : expectedValue) {
				WebElement AsteriskField = findElementVisibility(By.xpath("//label[contains(text(),'"+expected+"')]/ancestor::div[@class='form-group']/descendant::span[@class=' text-danger']"), 45);
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
      
      /* Code for click testing of Leave for HR Management */
                                     
        public void clickOnLeave()
        {		
         staticWait(2000);
        click(By.xpath("(//div/ul/li/a[@data-original-title='Leave'])[2]"),"Leave", 30);
                                     	
          try {
        WebElement leave = driver.findElement(By.xpath("//div/span[contains(text(),'Leave')]"));
        if (leave.isDisplayed()) {
        logger.info("Leave Page opened succesfully");
        }
         } catch (Exception e) {
       // TODO: handle exception
          logger.info("Leave Page not opened succesfully");
        }
        }
        public void clickOnPageTour()
        {		
         staticWait(2000);
        click(By.xpath("//a[@id='PageTour']"),"Page Tour", 30);
                                     	
          try {
        	  staticWait(2000);
        WebElement pageTour = driver.findElement(By.xpath("//div[text()='Search Filters ']"));
        if (pageTour.isDisplayed()) {
        logger.info("Page Tour Page opened succesfully");
        staticWait(2000);
        click(By.xpath("//*[name()='svg' and @class='guided-tour-icon']"),"Close Page Tour", 30);
        }
         } catch (Exception e) {
       // TODO: handle exception
          logger.info("Page Tour Page not opened succesfully");
        }
        }
        public void clickOnApplyLeave()
        {		
         staticWait(3000);
        click(By.xpath("//div/span/a[@data-original-title='Apply Leave']"),"Apply Leave", 30);
                                     	
          try {
        WebElement applyLeave = driver.findElement(By.xpath("//div/span[contains(text(),'Apply Leave')]"));
        if (applyLeave.isDisplayed()) {
        logger.info("Apply Leave Page opened succesfully");
        }
         } catch (Exception e) {
       // TODO: handle exception
          logger.info("Apply Leave Page not opened succesfully");
        }
        }
        public void clickOnSaveApplyLeave()
        {		
         staticWait(2000);
        click(By.xpath("//div/input[@id='btnSave']"),"Save Apply Leave", 30);
        }
        public void clickOnCancelApplyLeave()
        {		
         staticWait(2000);
        click(By.xpath("//div/input[@id='btnCancel']"),"Cancel Apply Leave", 30);
        }
        public void VerifyMandatoryFieldOfApplyLeave() {
			int i = 0;
			String actualText;
			String expectedText;

			List<WebElement> errorMessageLocator = findMultipleElement(
					By.xpath("//span[contains(@class,'invalid-feedback')]"), 45);
			String[] expectedValue = { "Leave Type","Reason"};
			for (Object expected : expectedValue) {
				WebElement AsteriskField = findElementVisibility(By.xpath("//label[contains(text(),'"+expected+"')]/ancestor::div[@class='form-group']/descendant::span[text()='*']"), 45);
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
        public void clickOnManageAccrual()
        {		
         staticWait(2000);
        click(By.xpath("//div/span/a[@data-original-title='Manage Accrual']"),"Manage Accrual", 30);
                                     	
          try {
        WebElement manageAccrual = driver.findElement(By.xpath("//div/span[contains(text(),'Manage Accrual')]"));
        if (manageAccrual.isDisplayed()) {
        logger.info("Manage Accrual Page opened succesfully");
        }
         } catch (Exception e) {
       // TODO: handle exception
          logger.info("Manage Accrual Page not opened succesfully");
        }
        }
        public void clickOnSaveManageAccrual()
        {		
         staticWait(2000);
        click(By.xpath("//div/input[@id='btnSubmit']"),"Save Manage Accrual", 30);
        }
        public void clickOnCancelManageAccrual()
        {		
         staticWait(2000);
        click(By.xpath("//div/a[@data-original-title='Cancel']"),"Cancel Manage Accrual", 30);
        driver.navigate().refresh();
        }
        public void VerifyMandatoryFieldOfManageAccrual() {
			int i = 0;
			String actualText;
			String expectedText;

			List<WebElement> errorMessageLocator = findMultipleElement(
					By.xpath("//span[contains(@class,'invalid-feedback')]"), 45);
			String[] expectedValue = { "Accrual Date ","Location"};
			for (Object expected : expectedValue) {
				WebElement AsteriskField = findElementVisibility(By.xpath("//label[contains(text(),'"+expected+"')]/ancestor::div[@class='form-group']/descendant::span[text()='*']"), 45);
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
        /* Code for click testing of Leave Approval for HR Management */
        
        public void clickOnLeaveApproval()
        {		
         staticWait(2000);
        click(By.xpath("(//div/ul/li/a[@data-original-title='Leave Approval'])[2]"),"Leave Approval", 30);
                                     	
          try {
        WebElement leaveApproval = driver.findElement(By.xpath("//div/span[contains(text(),'Leave')]"));
        if (leaveApproval.isDisplayed()) {
        logger.info("Leave Approval Page opened succesfully");
        }
         } catch (Exception e) {
       // TODO: handle exception
          logger.info("Leave Approval Page not opened succesfully");
        }
        }
        public void clickOnPageTourForLeaveApproval()
        {		
         staticWait(2000);
        click(By.xpath("//a[@id='PageTour']"),"Page Tour", 30);
                                     	
          try {
        	  staticWait(2000);
        WebElement pageTour = driver.findElement(By.xpath("//div[text()='Search Filters ']"));
        if (pageTour.isDisplayed()) {
        logger.info("Page Tour Page opened succesfully");
        staticWait(2000);
        click(By.xpath("//*[name()='svg' and @class='guided-tour-icon']"),"Close Page Tour", 30);
        }
         } catch (Exception e) {
       // TODO: handle exception
          logger.info("Page Tour Page not opened succesfully");
        }
        }
        public void clickOnViewHistory()
        {		
         staticWait(2000);
        click(By.xpath("//div/span/a[@data-original-title='View History']"),"View History", 30);
                                     	
          try {
        WebElement viewHistory = driver.findElement(By.xpath("//div/span[contains(text(),'History')]"));
        if (viewHistory.isDisplayed()) {
        logger.info("View History Page opened succesfully");
        }
         } catch (Exception e) {
       // TODO: handle exception
          logger.info("View History Page not opened succesfully");
        }
        }
        public void clickOnBackList()
        {		
         staticWait(2000);
        click(By.xpath("//div/span/a[@class='p-action-btn text-white']"),"Back To List", 30);
        }
        public void clickOnCheckBox()
        {		
         staticWait(2000);
        click(By.xpath("//table/thead/tr/th/div[@class='custom-control custom-checkbox']"),"Check box", 30);
        }
        public void clickOnReject()
        {		
         staticWait(2000);
        click(By.xpath("//a[@id='hlkReject']"),"Reject", 30);
        }
        public void clickOnCloseCommentPopUp()
        {		
         staticWait(2000);
        click(By.xpath("//div/h5[text()='Comment for Multiple Leave Approvals']/ancestor::div[@class='modal-content']/descendant::button[@data-original-title='Close']"),"Close Button", 30);
        }
        public void clickOnApprove()
        {		
         staticWait(2000);
        click(By.xpath("//a[@id='hlkApprove']"),"Approve", 30);
        
        }
        
        
        /* Code for click testing of Leave Type- Listing for HR Management */
        
        public void clickOnLeaveTypeListing()
        {		
         staticWait(2000);
        click(By.xpath("(//div/ul/li/a[@data-original-title='Leave Type- Listing'])[2]"),"Leave Type- Listing", 30);
                                     	
          try {
        WebElement leaveTypeListing = driver.findElement(By.xpath("//div/span[contains(text(),'Leave')]"));
        if (leaveTypeListing.isDisplayed()) {
        logger.info("Leave Type- Listing Page opened succesfully");
        }
         } catch (Exception e) {
       // TODO: handle exception
          logger.info("Leave Type- Listing Page not opened succesfully");
        }
        }
        public void clickOnAddLeaveTypeListing()
        {		
         staticWait(2000);
        click(By.xpath("//div/span/a[@data-original-title='Add Leave Type']"),"Add Leave Type- Listing", 30);
                                     	
          try {
        WebElement addleaveTypeListing = driver.findElement(By.xpath("//div/span[contains(text(),'Leave')]"));
        if (addleaveTypeListing.isDisplayed()) {
        logger.info("Add Leave Type- Listing Page opened succesfully");
        }
         } catch (Exception e) {
       // TODO: handle exception
          logger.info("Add Leave Type- Listing Page not opened succesfully");
        }
        }
        public void clickOnSaveAddLeaveType()
        {		
         staticWait(2000);
        click(By.xpath("//div/a[@data-original-title='Save']"),"Save Add Leave Type", 30);
        click(By.xpath("//button[@id='closenotifymessage']"),"Close notify message", 30);
        }
        public void VerifyMandatoryFieldOfAddLeaveType() {
			int i = 0;
			String actualText;
			String expectedText;

			List<WebElement> errorMessageLocator = findMultipleElement(
					By.xpath("//span[contains(@class,'text-danger msg')]"), 45);
			String[] expectedValue = { "Name"};
			for (Object expected : expectedValue) {
				WebElement AsteriskField = findElementVisibility(By.xpath("//label[contains(text(),'"+expected+"')]/ancestor::div[@class='form-group']/descendant::span[text()='*']"), 45);
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
  /* Code for click testing of Manage Check-In for HR Management */
        
        public void clickOnManageCheckIn()
        {		
         staticWait(2000);
        click(By.xpath("(//div/ul/li/a[@data-original-title='Manage Check-In'])[2]"),"Manage Check-In", 30);
                                     	
          try {
        WebElement manageCheckIn = driver.findElement(By.xpath("//div/span[contains(text(),'List Check-In/Out')]"));
        if (manageCheckIn.isDisplayed()) {
        logger.info("List Check-In/Out Page opened succesfully");
        }
         } catch (Exception e) {
       // TODO: handle exception
          logger.info("List Check-In/Out Page not opened succesfully");
        }
        }
        public void clickOnAddManageCheckIn()
        {		
         staticWait(2000);
        click(By.xpath("//div/span/a[@data-original-title='Add']"),"Add List Check-In/Out", 30);
                                     	
          try {
        WebElement addListCheckInOut = driver.findElement(By.xpath("(//div/h5[contains(text(),'Manage Attendance In/Out Time')])[2]"));
        if (addListCheckInOut.isDisplayed()) {
        logger.info("Manage Attendance In/Out Time Page opened succesfully");
        }
         } catch (Exception e) {
       // TODO: handle exception
          logger.info("Manage Attendance In/Out Time Page not opened succesfully");
        }
        }
        public void clickOnGo()
        {		
         staticWait(2000);
        click(By.xpath("//div/a[@id='aGo']"),"Go", 30);
        }
        public void clickOnClear()
        {		
         staticWait(2000);
        click(By.xpath("//div/a[@id='aClear']"),"Clear", 30);
        click(By.xpath("(//div/h5[contains(text(),'Manage Attendance In/Out Time')])[2]/ancestor::div[@class='modal-content']/descendant::button[@data-original-title='Close']"),"Close Button", 30);
        }
        public void clickOnSendForApproval()
        {		
         staticWait(2000);
        click(By.xpath("//div/span/a[@id='aCommanApproval']"),"Send For Approval", 30);
        click(By.xpath("//button[@title='OK']"),"Ok Button", 30);
        driver.navigate().refresh();
        }
        /*---------------------------------------------------------------------------------------------------------------------------------*/
        /*Code for click testing of Offboard Employee List*/
        public void clickOnOffboardEmployeeListforHiring()
        {		staticWait(2000);
       	 click(By.xpath("(//div/ul/li/a[@data-original-title='Offboard Employee List'])[2]"),"Offboard Employee List", 30);
       	
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
        /*---------------------------------------------------------------------------------------------------------------------------------*/
        /*Code for click testing of Policy*/
        public void clickOnPolicyforHiring()
        {		staticWait(2000);
       	 click(By.xpath("(//div/ul/li/a[@data-original-title='Policy'])[2]"),"Policy", 30);
       	
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
        /*---------------------------------------------------------------------------------------------------------------------------------*/
        /*Code for click testing of Resignation*/
        public void clickOnResignationforHiring()
        {		staticWait(2000);
       	 click(By.xpath("(//div/ul/li/a[@data-original-title='Resignation'])[2]"),"Resignation", 30);
       	
       	 try {
       		 WebElement resignation = driver.findElement(By.xpath("//div/span[text()='Employees  Resignation']"));
       		 if (resignation.isDisplayed()) {
   				logger.info("Resignation Page opened succesfully");
   			}
   		} catch (Exception e) {
   			// TODO: handle exception
   			logger.info("Resignation Page not opened succesfully");
   		}
       	driver.navigate().refresh();
        }
       
}
