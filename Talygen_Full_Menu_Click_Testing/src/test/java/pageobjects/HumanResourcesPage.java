package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utils.WebBasePage;

public class HumanResourcesPage extends WebBasePage{
	WebDriver driver ;
	public HumanResourcesPage(WebDriver driver) {
		super(driver, "HumanResourcesPage");
		this.driver=driver;
		// TODO Auto-generated constructor stub
	}
	public void clickFullMenuDropDown() {
		staticWait(3000);
        click(By.xpath("//span[text()='Full Menu']"), "Full Menu", 30);
        
    }
	/*
	 * Code for click testing of Attendance for Human Resources
	 */
     public void clickOnHumanResources()
     {		staticWait(2000);
    	 click(By.xpath("//ul/li[@data-name='Human Resources']/span"),"Human Resources", 30);
    	 
     }
     public void clickOnAttendanceforHumanResources()
     {		staticWait(2000);
    	 click(By.xpath("//div/ul/li/a[@data-original-title='Attendance']"),"Attendance", 30);
    	
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
    	 * Code for click testing of Attendance Approval for  Human Resources
    	 */
        
         public void clickOnAttendanceApproval()
         {		staticWait(2000);
        	 click(By.xpath("//div/ul/li/a[@data-original-title='Attendance Approval']"),"Attendance Approval", 30);
        	
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
     	 * Code for click testing of Candidate List for  Human Resources
     	 */
         
          public void clickOnCandidateList()
          {		staticWait(2000);
         	 click(By.xpath("(//div/ul/li/a[@data-original-title='Candidate List'])[2]"),"Candidate List", 30);
         	
         	 try {
         		 WebElement candidateList = driver.findElement(By.xpath("//div/span[contains(text(),'Candidate List')]"));
         		 if (candidateList.isDisplayed()) {
     				logger.info("Candidate List Page opened succesfully");
     			}
     		} catch (Exception e) {
     			// TODO: handle exception
     			logger.info("Candidate List Page not opened succesfully");
     		}
          }
          /*
         	 * Code for click testing of Check-In Flag List for Human Resources
         	 */
             
              public void clickOnCheckInFlagList()
              {		staticWait(2000);
             	 click(By.xpath("//div/ul/li/a[@data-original-title='Check-In Flag List']"),"Check-In Flag List", 30);
             	
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
              /*---------------------------------------------------------------------------------------------------------------------------------*/
              /*Code for click testing of Consultant List */
              public void clickOnConsultantListforHumanResources()
              {		staticWait(2000);
             	 click(By.xpath("(//div/ul/li/a[@data-original-title='Consultant List'])[2]"),"Consultant List", 30);
             	
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
              /*---------------------------------------------------------------------------------------------------------------------------------*/
              /*
             	 * Code for click testing of Group List for Human Resources
             	 */
                 
                  public void clickOnGroupList()
                  {		staticWait(2000);
                 	 click(By.xpath("(//div/ul/li/a[@data-original-title='Group List'])[2]"),"Group List", 30);
                 	
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
               /*---------------------------------------------------------------------------------------------------------------------------------*/
               /*
                * Code for click testing of HR Report for Human Resources
                */
                     
                public void clickOnHRReport()
                {		
                 staticWait(2000);
                 click(By.xpath("//div/ul/li/a[@data-original-title='HR Report']"),"Hr Report", 30);
                     	
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
                /*---------------------------------------------------------------------------------------------------------------------------------*/
                /*
                 * Code for click testing of Induction Document List for Human Resources
                 */
                public void clickOnInductionDocumentList()
                {		
                 staticWait(2000);
                click(By.xpath("//div/ul/li/a[@data-original-title='Induction Document List']"),"Induction Document List", 30);
                                             	
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
                /*---------------------------------------------------------------------------------------------------------------------------------*/
                /* Code for click testing of Leave for Human Resources */
                
                public void clickOnLeave()
                {		
                 staticWait(2000);
                click(By.xpath("//div/ul/li/a[@data-original-title='Leave']"),"Leave", 30);
                                             	
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
                /*---------------------------------------------------------------------------------------------------------------------------------*/
                /* Code for click testing of Leave Approval for Human Resources */
                
                public void clickOnLeaveApproval()
                {		
                 staticWait(2000);
                click(By.xpath("//div/ul/li/a[@data-original-title='Leave Approval']"),"Leave Approval", 30);
                                             	
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
                /*---------------------------------------------------------------------------------------------------------------------------------*/
                /* Code for click testing of Leave Type- Listing for Human Resources */
                public void clickOnLeaveTypeListing()
                {		
                 staticWait(2000);
                click(By.xpath("//div/ul/li/a[@data-original-title='Leave Type- Listing']"),"Leave Type- Listing", 30);
                                             	
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
                /*---------------------------------------------------------------------------------------------------------------------------------*/
                /* Code for click testing of Manage Check-In for Human Resources */
                
                public void clickOnManageCheckIn()
                {		
                 staticWait(2000);
                click(By.xpath("//div/ul/li/a[@data-original-title='Manage Check-In']"),"Manage Check-In", 30);
                                             	
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
                /*---------------------------------------------------------------------------------------------------------------------------------*/
                /*Code for click testing of Talent Pool List*/
                public void clickOnTalentPoolListforHiring()
                {		staticWait(2000);
               	 click(By.xpath("(//div/ul/li/a[@data-original-title='Talent Pool List'])[2]"),"Talent Pool List", 30);
               	
               	 try {
               		 WebElement talentPoolList = driver.findElement(By.xpath("//div/span[text()='Talent Pool']"));
               		 if (talentPoolList.isDisplayed()) {
           				logger.info("Talent Pool List Page opened succesfully");
           			}
           		} catch (Exception e) {
           			// TODO: handle exception
           			logger.info("Talent Pool List Page not opened succesfully");
           		}
               	driver.navigate().refresh();
                }
}
