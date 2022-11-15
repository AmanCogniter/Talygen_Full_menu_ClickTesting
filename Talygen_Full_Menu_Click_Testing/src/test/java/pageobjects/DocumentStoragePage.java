package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utils.WebBasePage;

public class DocumentStoragePage extends WebBasePage{
	WebDriver driver ;
	public DocumentStoragePage(WebDriver driver) {
		super(driver, "DocumentStoragePage");
		this.driver=driver;
		// TODO Auto-generated constructor stub
	}
	public void clickFullMenuDropDown() {
		staticWait(3000);
        click(By.xpath("//span[text()='Full Menu']"), "Full Menu", 30);
        
    }
	/*
	 * Code for click testing of Manage Client Storage for Document Storage
	 */
     public void clickOnDocumentStoragePage()
     {		staticWait(2000);
     JavascriptExecutor js = (JavascriptExecutor) driver;
     WebElement Element = driver.findElement(By.xpath("//ul/li[@data-name='CRM']/span"));
     js.executeScript("arguments[0].scrollIntoView();", Element);
    	 click(By.xpath("//ul/li[@data-name='Document Storage']/span"),"Document Storage", 30);
    	 
     }
     public void clickOnManageClientStorage()
     {		staticWait(2000);
    	 click(By.xpath("//div/ul/li/a[@data-original-title='Manage Client Storage']"),"Manage Client Storage", 30);
    	
    	 try {
    		 WebElement manageClientStoragePage = driver.findElement(By.xpath("//div/span[text()='Manage Client Storage']"));
    		 if (manageClientStoragePage.isDisplayed()) {
				logger.info("Manage Client Storage Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Manage Client Storage Page not opened succesfully");
		}
     }
     public void clickOnCheckBox()
     {		staticWait(2000);
    	 click(By.xpath("//div[@class='custom-control custom-checkbox']"),"Check Box", 30);
     }
     public void clickOnAllocateSpace()
     {		staticWait(2000);
    	 click(By.xpath("//div/span/a[@data-original-title='Allocate Space']"),"Allocate Space", 30);
    	
    	 try {
    		 staticWait(2000);
    		 WebElement allocateSpacePage = driver.findElement(By.xpath("//div/h4[text()='Allocate Space']"));
    		 if (allocateSpacePage.isDisplayed()) {
				logger.info("Allocate Space Page opened succesfully");
				 click(By.xpath("//div[@class='modal-header']/h4[text()='Allocate Space']/ancestor::div[@class='modal-content']/descendant::button[@class='close']"),"Close Allocate Space PopUp", 30);
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Allocate Space Page not opened succesfully");
		}
    	 driver.navigate().refresh();
     }
     /*--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
     /*
  	 * Code for click testing of Manage User Storage for Document Storage
  	 */
     public void clickOnManageUserStorage()
     {		staticWait(2000);
    	 click(By.xpath("//div/ul/li/a[@data-original-title='Manage User Storage']"),"Manage User Storage", 30);
    	
    	 try {
    		 WebElement manageUserStoragePage = driver.findElement(By.xpath("//div/span[text()='Manage User Storage']"));
    		 if (manageUserStoragePage.isDisplayed()) {
				logger.info("Manage User Storage Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Manage User Storage Page not opened succesfully");
		}
     }
     /*--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
     /*
  	 * Code for click testing of User Storage Report for Document Storage
  	 */
     public void clickOnUserStorageReport()
     {		staticWait(2000);
    	 click(By.xpath("//div/ul/li/a[@data-original-title='User Storage Report']"),"User Storage Report", 30);
    	
    	 try {
    		 WebElement userStorageReportPage = driver.findElement(By.xpath("//div/span[text()='Storage Capacity']"));
    		 if (userStorageReportPage.isDisplayed()) {
				logger.info("User Storage Report Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("User Storage Report Page not opened succesfully");
		}
     }
     public void clickOnListView()
     {		staticWait(5000);
    	 click(By.xpath("//div/span/a[@data-original-title='List View']"),"List View", 30);
    	
    	 try {
    		 WebElement listViewPage = driver.findElement(By.xpath("//div[@id='viewer_logo']"));
    		 if (listViewPage.isDisplayed()) {
				logger.info("List View Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("List View Page not opened succesfully");
		}
     }
     public void clickOnGraphicalView()
     {		staticWait(2000);
    	 click(By.xpath("//div/span/a[@data-original-title='Graphical View']"),"Graphical View", 30);
    	
    	 try {
    		 WebElement graphicalViewPage = driver.findElement(By.xpath("//*[@id='chartCtrl_viewer_Chart1_Default_svg_ChartTitleText']"));
    		 if (graphicalViewPage.isDisplayed()) {
				logger.info("Graphical View Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Graphical View Page not opened succesfully");
		}
    	 driver.navigate().refresh();
     }
}
