package project;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class Aarohi_Blooad_Bank
{
	public class Aarohi_Blood_Bank 
	{
		WebDriver driver;
		Select s;
		Actions a;
		
		@BeforeTest
		public void beforeTest() throws InterruptedException 
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\renuk\\Documents\\Automation Testing\\Browser Extension\\chromedriver.exe");			
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.get("https://www.aarohibloodbank.org/");
			//Thread.sleep(2000);
			
			//Mouse Hover
			Actions a=new Actions(driver); 
					 
			List<WebElement> ls=driver.findElements(By.xpath("/html/body/div[1]/header/div/div/div/div[2]/nav/div[2]/ul/li"));
					
			int size=ls.size();
			System.out.println("No. of Modules: "+size);
					
			for(int i=1; i<=size; i++)
			{
			//Display Module name
			System.out.println(driver.findElement(By.xpath("/html/body/div[1]/header/div/div/div/div[2]/nav/div[2]/ul/li["+i+"]")).getText());
			Thread.sleep(1000);		 
			//Perform Mouse Hover
			a.moveToElement(driver.findElement(By.xpath("/html/body/div[1]/header/div/div/div/div[2]/nav/div[2]/ul/li["+i+"]"))).click().perform();
			}
			
		
		}

		
		@Test(priority=1)
		  public void Home() throws Exception
		  {
			//****Home Page***
					
			  
			a=new Actions(driver);
			a.moveToElement(driver.findElement(By.xpath("/html/body/div[1]/header/div/div/div/div[2]/nav/div[2]/ul/li[5]"))).perform();
			Thread.sleep(1400);
			//Thread.sleep(1000);
			a.moveToElement(driver.findElement(By.xpath("/html/body/div[1]/header/div/div/div/div[2]/nav/div[2]/ul/li[5]/ul/li[1]/a"))).click().perform();
			
			
			//scroll down
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("window.scrollTo(0,8)");
			
			
			  
			  
			  driver.findElement(By.xpath("//*[@id=\"register-form\"]/div/div[1]/input")).sendKeys("Sree");
			  Thread.sleep(1400);
			  s=new Select(driver.findElement(By.xpath("/html/body/div[1]/section[3]/div/div/div[1]/div/div[2]/div/div/form/div/div[2]/select")));
			  s.selectByVisibleText("O +ve");
			  Thread.sleep(1400);
			  driver.findElement(By.xpath("//*[@id=\"register-form\"]/div/div[3]/input")).sendKeys("SreeRaag@22.gmail.com");
			  Thread.sleep(1400);
			  driver.findElement(By.xpath("//*[@id=\"register-form\"]/div/div[4]/input")).sendKeys("9848254361");
			  Thread.sleep(1400);
			  driver.findElement(By.xpath("//*[@id=\"register-form\"]/div/div[5]/input")).sendKeys("12/04/2018");
			  Thread.sleep(1400);
			  
			  //Donate of last donation
			  s=new Select(driver.findElement(By.xpath("//*[@id=\"dld\"]")));
		      s.selectByIndex(2);
		      Thread.sleep(1400);
			  
		      //Address
			  driver.findElement(By.xpath("//*[@id=\"register-form\"]/div/div[7]/textarea")).sendKeys("Hyderabad");
			  Thread.sleep(1400);
			  driver.findElement(By.xpath("//*[@id=\"register-form\"]/div/div[8]/button")).click();
		  }
		
		@Test(priority=2)
		  public void Donors_Corner() throws Exception
		  {	 	
			
			//***Become Volunteer***
			
			Actions a=new Actions(driver);
			a.moveToElement(driver.findElement(By.xpath("/html/body/div[1]/header/div/div/div/div[2]/nav/div[2]/ul/li[3]/a"))).perform();
			Thread.sleep(2000);
			a.moveToElement(driver.findElement(By.xpath("/html/body/div[1]/header/div/div/div/div[2]/nav/div[2]/ul/li[3]/ul/li[1]/a"))).click().perform();
			Thread.sleep(2000);	  
		    driver.findElement( By.xpath( "//*[@id=\"volunteer-form\"]/div/div[1]/input")).sendKeys( "Renu"); Thread.sleep(1400);
		    s=new Select(driver.findElement( By.xpath( "//*[@id=\"category\"]"))); Thread.sleep(1400);
		    s.selectByIndex( 2); Thread.sleep(1400);
		    driver.findElement( By.xpath( "//*[@id=\"volunteer-form\"]/div/div[3]/input")).sendKeys( "renuka9527mete@gmail.com"); Thread.sleep(1400);
		    driver.findElement( By.xpath( "//*[@id=\"volunteer-form\"]/div/div[4]/input")).sendKeys( "9403989692"); Thread.sleep(1400);
		    driver.findElement( By.xpath( "//*[@id=\"volunteer-form\"]/div/div[5]/textarea")).sendKeys( "I want to become a voluntear"); Thread.sleep(1400);
		    driver.findElement( By.xpath( "//*[@id=\"volunteer-form\"]/div/div[6]/button")).click(); Thread.sleep(1400);Thread.sleep(2000);       
		  }
		
		@Test(priority=3)
		public void Register_Now() throws Exception
		{
			//***Registration***
			driver.get("https://www.aarohibloodbank.org/");
			a=new Actions(driver);
			a.moveToElement(driver.findElement(By.xpath("/html/body/div[1]/header/div/div/div/div[2]/nav/div[2]/ul/li[5]"))).perform();
			Thread.sleep(1400);
			//Thread.sleep(1000);
			a.moveToElement(driver.findElement(By.xpath("/html/body/div[1]/header/div/div/div/div[2]/nav/div[2]/ul/li[5]/ul/li[1]/a"))).click().perform();
			
			
			//scroll down
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("window.scrollTo(0,8)");
			  	  
			
			driver.findElement(By.xpath("//*[@id=\"register-form\"]/div/div[1]/input")).sendKeys("Jihansingh P"); Thread.sleep(1400);
			s = new Select(driver.findElement(By.xpath("//*[@id='bgroup']"))); Thread.sleep(1400);
			s.selectByVisibleText("B +ve"); Thread.sleep(1400);
			
			driver.findElement(By.xpath("//*[@id=\"register-form\"]/div/div[3]/input")).sendKeys("testmail@gmail.com"); Thread.sleep(1400);
			driver.findElement(By.xpath("//*[@id=\"register-form\"]/div/div[4]/input")).sendKeys("9985362154"); Thread.sleep(1400);
			driver.findElement(By.xpath("//*[@id=\"register-form\"]/div/div[5]/input")).sendKeys("7th march 1997"); Thread.sleep(1400);
			s = new Select(driver.findElement(By.xpath("//*[@id=\"dld\"]"))); Thread.sleep(1400);
			
			s.selectByVisibleText("More than 3 Months"); Thread.sleep(1400);
			
			driver.findElement(By.xpath("//*[@id=\"register-form\"]/div/div[7]/textarea")).sendKeys("bldg. 400 room 7 address here, this city, near this area, city, 123456"); Thread.sleep(1400);
			driver.findElement(By.xpath("//*[@id=\"register-form\"]/div/div[8]/button")).click();
			
			//**Support Funds***
			
			a=new Actions(driver);
			a.moveToElement(driver.findElement(By.xpath("/html/body/div[1]/header/div/div/div/div[2]/nav/div[2]/ul/li[5]"))).perform();
			Thread.sleep(2000);
			
			//Thread.sleep(1000);
			a.moveToElement(driver.findElement(By.xpath("/html/body/div[1]/header/div/div/div/div[2]/nav/div[2]/ul/li[5]/ul/li[3]/a"))).click().perform();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//*[@id=\"widget-preview\"]/ul/li/span/a/img")).click();
			Thread.sleep(2000);
		}
		
		@Test(priority=4)
		public void contact_us() throws InterruptedException 
		{
			//***Contact Us****
		
			Actions a=new Actions(driver);
			//a.moveToElement(driver.findElement(By.xpath("/html/body/div[1]/header/div/div/div/div[2]/nav/div[2]/ul/li[3]/a"))).perform();
			Thread.sleep(1000);
			a.moveToElement(driver.findElement(By.xpath("/html/body/div[1]/header/div/div/div/div[2]/nav/div[2]/ul/li[7]/a"))).click().perform();
			
			//driver.findElement(By.xpath("<a href=\"contact.php\">Contact</a>")).click();
			//Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"contact-form\"]/div/div[1]/input")).sendKeys("Manohar");
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//*[@id=\"contact-form\"]/div/div[2]/input")).sendKeys("tarun123@gmail.com");
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//*[@id=\"contact-form\"]/div/div[3]/input")).sendKeys("Donate Blood");
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//*[@id=\"contact-form\"]/div/div[4]/textarea")).sendKeys("I want to donate blood");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"contact-form\"]/div/div[5]/button")).click();
			Thread.sleep(2000);
		
		}
		
			
		@AfterTest
		public void afterTest() 
		{
			driver.close();
		}

		
	}
}
