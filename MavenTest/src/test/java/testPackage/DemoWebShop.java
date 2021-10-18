package testPackage;

	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

	public class DemoWebShop {
		WebDriver driver;
		
		@Test
		public void test3()
		{
			System.out.println("...Hello World-3...");
		}
		@BeforeTest
		public void SignIn()
		{
			System.setProperty("webdriver.chrome.driver", "E:\\Eclipse\\Selenium\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get("http://demowebshop.tricentis.com/");
		}

		@Test
		public void Register()
		{
			driver.findElement(By.cssSelector("a[class=\"ico-register\"]")).click();
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			driver.findElement(By.cssSelector("input[id=\"gender-female\"]")).click();
		
		}
		//@Parameters({"fname","lname","email","pswd","cpswd"})
		
		@Test
		public void login()
		{
			driver.findElement(By.xpath("//input[@id='gender-female']")).click();
			driver.findElement(By.xpath("//input[@name='FirstName']")).sendKeys("Bhagyashri");
			driver.findElement(By.xpath("//input[@name='LastName']")).sendKeys("Nimkarde");
			driver.findElement(By.xpath("//input[@name='Email']")).sendKeys("bu@gmail.com");
			driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("pswd");
			driver.findElement(By.xpath("//input[@name='ConfirmPassword']")).sendKeys("pswd");
			driver.findElement(By.xpath("//input[@name='register-button']")).click();

		}
		@AfterTest
		public void tearDown()
		{
			System.out.println("completed");
			driver.quit();
		}
	}

