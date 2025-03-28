package Automation;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;



public class wingify {

	 WebDriver driver;
	 @BeforeClass  
	public void setup(){
        

        driver= new ChromeDriver();
        driver.get("https://sakshingp.github.io/assignment/login.html");
        
		
	 }
	
		@Test(priority=1)
           public void testPageTitle() {              
                
                // Checking the title of the page before log in
                String realTitle=driver.getTitle();
                Assert.assertEquals(realTitle,"Demo App");
                      
           }

		
		
		
       @Test(priority=2)
         public void logIn() {

        	   
       	     // Find username 
             WebElement txtbx_username=  
             driver.findElement(By.id("username"));
             txtbx_username.sendKeys("username");
                 
             
                //   Setting the  password
             WebElement txtbx_password=  
             driver.findElement(By.id("password"));
             txtbx_password.sendKeys("password");
                 
                
             // login 
             driver.findElement(By.id("log-in")).click();
           
             
           //Checking the title after login
          String loginTitle=driver.getTitle();
           
             if(loginTitle.equals("Demo App")){
 	           Assert.assertTrue(true);
 	        System.out.println("login succesfully");
 	 
               }
  
           else {
       	    Assert.assertTrue(false);
 	          System.out.println(" login failed");
 
	            }
	
               }
       
       
       
       
       @Test(priority=3)
       public  void ClickOnAmount() {
         	// Clicking on amount 
         	 WebElement amount=  driver.findElement(By.id("amount"));
              amount.click();
         	 
          }


           
            @Test(priority=4)
           public void searchFunctionality() {

          //Testing the search functionality
             WebElement searchbox=  driver.findElement(By.xpath("//input[@type='text']"));
             searchbox.sendKeys("wingify");
         
           }
         


        @AfterClass
         public void tearDown() {
             
                 driver.quit();
         
       }
       
        
     
       
}
       
           
    