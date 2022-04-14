package project;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class Insurance_MiniProject 
{
	WebDriver driver;
	  Select s;
	 @BeforeTest
	
	  public void beforeTest() throws InterruptedException 
	  {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\renuk\\Documents\\Automation Testing\\Browser Extension\\chromedriver.exe");
	        driver=new ChromeDriver();
	        Thread.sleep(2000);
	        driver.manage().window().maximize();
	        
	  }
	
	 @Test (priority =1)
	 public void launchBrowser () 
	 {
	  driver.get( "https://demo.guru99.com/insurance/v1/index.php");
	  
	  driver.findElement( By.xpath( "/html/body/div[3]/a")).click();
	 }
	 @Test (priority =2)
	 public void login() throws InterruptedException 
	 {
		 driver.findElement( By.xpath( "/html/body/div[3]/a")).click();
		 Thread.sleep(2000);
		 driver.findElement( By.xpath( "//*[@id=\"email\"]")).sendKeys( "renuka@gmail.com");
		 Thread.sleep(2000);
		 driver.findElement( By.xpath( "//*[@id=\"password\"]")).sendKeys( "123@123");
		 Thread.sleep(2000);
		 driver.findElement( By.xpath( "//*[@id=\"login-form\"]/div[3]/input")).click();
	 }
@Test (priority =3)
public void smokeTesting() throws InterruptedException
	{
	Actions a=new Actions(driver);
	
	List<WebElement> ls=driver.findElements(By.xpath("/html/body/div[3]/div/ul/li"));
	
	int size=ls.size();
	
	System.out.println("No of Modules: "+size);
	
	for(int i=1; i<=size; i++)
	
	{
		
	Thread.sleep(1000);
		
		
		// Display Module Name
		
		System.out.println(driver.findElement(By.xpath("/html/body/div[3]/div/ul/li["+ i +"]")).getText());
		
		
	a.moveToElement(driver.findElement( By.xpath("/html/body/div[3]/div/ul/li["+ i +"]"))).click().perform();
	
	
	
	}
	}
	// Request Quatation()
	@Test(priority =4)
	public void requestQuatation() throws Exception
	{
		driver.get( "https://demo.guru99.com/insurance/v1/index.php");
	driver.findElement( By.xpath( "//*[@id=\"email\"]")).sendKeys( "renuka@gmail.com");
		 driver.findElement( By.xpath( "//*[@id=\"password\"]")).sendKeys( "123@123");
		 driver.findElement( By.xpath( "//*[@id=\"login-form\"]/div[3]/input")).click();
		driver.findElement( By.xpath( "//*[@id=\"ui-id-2\"]")).click();
		
		Thread.sleep(2000);
		s=new Select (driver.findElement( By.xpath("//*[@id=\"quotation_breakdowncover\"]")));
		s.selectByIndex( 2);
		Thread.sleep(2000);
		driver.findElement( By.xpath("//*[@id=\"quotation_windscreenrepair_f\"]")).click();
		Thread.sleep(1000);
		driver.findElement( By.xpath("//*[@id=\"quotation_incidents\"]")).sendKeys( "abcdxyz");
		Thread.sleep(2000);
		driver.findElement( By.xpath("/html/body/div[3]/div/div[2]/form/div[7]/h5[2]/input")).sendKeys( "vehicle123");
		driver.findElement( By.xpath("//*[@id=\"quotation_vehicle_attributes_mileage\"]")).sendKeys( "25");
		driver.findElement( By.xpath("//*[@id=\"quotation_vehicle_attributes_value\"]")).sendKeys( "123");
		s=new Select (driver.findElement( By.xpath("//*[@id=\"quotation_vehicle_attributes_parkinglocation\"]")));
		s.selectByIndex( 3);
		s=new Select (driver.findElement( By.xpath("//*[@id=\"quotation_vehicle_attributes_policystart_1i\"]")));
		s.selectByIndex( 3);
		s=new Select (driver.findElement( By.xpath("//*[@id=\"quotation_vehicle_attributes_policystart_2i\"]")));
		s.selectByIndex( 4);
		s=new Select (driver.findElement( By.xpath("//*[@id=\"quotation_vehicle_attributes_policystart_3i\"]")));
		s.selectByIndex(6);
		driver.findElement( By.xpath( "//*[@id=\"new_quotation\"]/div[8]/input[3]")).click();
		Thread.sleep(2000);
		
	}
	
	// Retrieve Quatation
	@Test(priority =5)
	public void retriveQuatation() throws InterruptedException
	{
		driver.get( "https://demo.guru99.com/insurance/v1/index.php");
		driver.findElement( By.xpath( "//*[@id=\"email\"]")).sendKeys( "renuka@gmail.com");
		 driver.findElement( By.xpath( "//*[@id=\"password\"]")).sendKeys( "123@123");
		 
		 driver.findElement( By.xpath( "//*[@id=\"login-form\"]/div[3]/input")).click();
		 Thread.sleep(2000);
		 driver.findElement( By.xpath( "//*[@id=\"ui-id-3\"]")).click();
		 Thread.sleep(2000);
		 driver.findElement( By.xpath( "//*[@id=\"tabs-3\"]/form/input[1]")).sendKeys( "123123");
		 Thread.sleep(2000);
		 driver.findElement( By.xpath("//*[@id=\"getquote\"]")).click();
	}
	// Edit Profile
		@Test(priority =6)
		public void EditProfile() throws InterruptedException
		{
			driver.get( "https://demo.guru99.com/insurance/v1/index.php");
			driver.findElement( By.xpath( "//*[@id=\"email\"]")).sendKeys( "renuka@gmail.com");
			 driver.findElement( By.xpath( "//*[@id=\"password\"]")).sendKeys( "123@123");
			 driver.findElement( By.xpath( "//*[@id=\"login-form\"]/div[3]/input")).click();
			driver.findElement( By.xpath( "//*[@id=\"editprofile\"]")).click();
			s=new Select(driver.findElement( By.xpath( "//*[@id=\"user_title\"]")));
			s.selectByIndex( 3);
			
			driver.findElement( By.xpath( "//*[@id=\"user_surname\"]")).sendKeys( "Mete");
		
			driver.findElement( By.xpath( "//*[@id=\"user_firstname\"]")).sendKeys( "Renuka");
			Thread.sleep(2000);
			
			driver.findElement( By.xpath( "//*[@id=\"user_phone\"]")).sendKeys( "9403989692");
			Thread.sleep(2000);
			s=new Select(driver.findElement( By.xpath( "//*[@id=\"user_dateofbirth_1i\"]")));
			s.selectByValue( "1995");
			Thread.sleep(2000);
			s=new Select(driver.findElement( By.xpath( "//*[@id=\"user_dateofbirth_2i\"]")));
			s.selectByVisibleText( "October");
			s=new Select(driver.findElement( By.xpath( "//*[@id=\"user_dateofbirth_3i\"]")));
			s.selectByVisibleText("27");
			Thread.sleep(2000);
			driver.findElement( By.xpath( "//*[@id=\"user_licencetype_t\"]")).click();
			s=new Select(driver.findElement( By.xpath( "//*[@id=\"user_licenceperiod\"]")));
			s.selectByVisibleText( "5");
			Thread.sleep(2000);
			s=new Select(driver.findElement( By.xpath( "//*[@id=\"user_occupation_id\"]")));
			s.selectByVisibleText( "Student");
			
			
			driver.findElement( By.xpath( "//*[@id=\"user_address_attributes_street\"]")).sendKeys( "Aurangabad");
			Thread.sleep(2000);
			driver.findElement( By.xpath( "//*[@id=\"user_address_attributes_city\"]")).sendKeys( "Aurangabad");
			driver.findElement( By.xpath( "//*[@id=\"user_address_attributes_county\"]")).sendKeys( "India");
			Thread.sleep(2000);
			driver.findElement( By.xpath( "//*[@id=\"user_address_attributes_postcode\"]")).sendKeys("411001");
			driver.findElement( By.xpath( "//*[@id=\"edit_user_\"]/div[14]/input")).click();
		

		

	}
		public void f() throws Exception 
		 
		 {
				
				Select s;  // GLOBAL DECLARATION
				driver.manage().window().maximize();
				
				//URL
				driver.get("https://blazedemo.com");
				Thread.sleep(2000);
				
				//DROP DOWN ----> (DEPARTURE CITY) ; TAGNAME MUST BE <SELECT>
				//STEP 1 : CREATE AN OBJECT OF THE SELECT CLASS
				s=new Select(driver.findElement(By.xpath("/html/body/div[3]/form/select[1]")));
				//STEP 2 : SELECT THE OPTION
				s.selectByIndex(5);
				Thread.sleep(2000);
				

				//DROP DOWN ----> (DESTINATION CITY) ; TAGNAME MUST BE <SELECT>
				//STEP 1 : CREATE AN OBJECT OF THE SELECT CLASS
				s=new Select(driver.findElement(By.xpath("/html/body/div[3]/form/select[2]")));
				//STEP 2 : SELECT THE OPTION
				s.selectByVisibleText("New York");
				Thread.sleep(2000);
				
				// FIND FLIGHTS BUTTON
				driver.findElement(By.xpath("/html/body/div[3]/form/div/input")).click();
				Thread.sleep(2000); 
				
				// choose this flight 
				driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr[1]/td[1]/input")).click();
				Thread.sleep(2000);
		//Enter name for ticket 
				driver.findElement(By.xpath("//*[@id=\"inputName\"]")).sendKeys("Peter Dinklage");
				Thread.sleep(2000);
		//Enter Address for ticket 
				driver.findElement(By.xpath("//*[@id=\"address\"]")).sendKeys("786 Belgum Road");
				Thread.sleep(2000);
		//Enter City for ticket
				driver.findElement(By.xpath("//*[@id=\"city\"]")).sendKeys("Newyork");
				Thread.sleep(2000);
		//Enter State 
				driver.findElement(By.xpath("//*[@id=\"state\"]")).sendKeys("New Jersey");
				Thread.sleep(2000);
		//Enter Zip code
				driver.findElement(By.xpath("//*[@id=\"zipCode\"]")).sendKeys("08701");
				Thread.sleep(2000);
		//select card type
				s=new Select(driver.findElement(By.xpath("//*[@id=\"cardType\"]")));
				s.selectByIndex(0);
				Thread.sleep(2000);
//			Enter Credit Card Number
				driver.findElement(By.xpath("//*[@id=\"creditCardNumber\"]")).sendKeys("4012888888881881");
				Thread.sleep(2000);
		//Enter Month
				driver.findElement(By.xpath("//*[@id=\"creditCardMonth\"]")).sendKeys("02");
				Thread.sleep(2000);
		//Enter Year
				driver.findElement(By.xpath("//*[@id=\"creditCardYear\"]")).sendKeys("2020");
				Thread.sleep(2000);
		//Enter Name on card
				driver.findElement(By.xpath("//*[@id=\"nameOnCard\"]")).sendKeys("Peter Dinklage");
				Thread.sleep(2000);
		//Click for Check Box
				driver.findElement(By.xpath("//*[@id=\"rememberMe\"]")).click();
				Thread.sleep(2000);
		//Click for Submit Button
				driver.findElement(By.xpath("/html/body/div[2]/form/div[11]/div/input")).click();
				Thread.sleep(2000);
		 }
		
			
		@AfterTest
		public void afterTest() 
		{
			driver.close();
		}

}
	


