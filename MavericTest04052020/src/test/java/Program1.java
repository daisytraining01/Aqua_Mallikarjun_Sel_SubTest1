import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/*Automate Registration of user 

Application URL: http://demo.guru99.com/test/newtours/register.php

a)	Select “AUSTRALIA” programmatically from the list box
b)	Before clicking submit fetch the values displayed in each field and print in command line
c)	Include assertion Post submission of registration 
d)	Fetch the confirmation text and report in command line
e)	Execute the test for multiple records (parameterize)
f)	Identify a Negative scenario and include assertion for the it
g)	Take screenshot of success and failure
*/
public class Program1 {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		//Click on Register Link//
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		//d1.findElement(By.linkText("REGISTER")).click();
		
		//Filling the required details
		
		WebElement E1 = driver.findElement(By.name("firstName"));
		E1.sendKeys("Maks3");
		String s1 = E1.getAttribute("value");
		System.out.println("Firstname: "+s1);
		
		WebElement E2 = driver.findElement(By.name("lastName"));
		E2.sendKeys("Kams3");
		String s2 = E2.getAttribute("value");
		System.out.println("Lastname: "+s2);
		
		WebElement E3 = driver.findElement(By.name("phone"));
		E3.sendKeys("1234567890");
		String s3 = E3.getAttribute("value");
		System.out.println("Phone Number: "+s3);
		
		WebElement E4 = driver.findElement(By.name("address1"));
		E4.sendKeys("MK Systems Ltd");
		String s4 = E4.getAttribute("value");
		System.out.println("Address: "+s4);
	
		WebElement E5 = driver.findElement(By.name("city"));
		E5.sendKeys("Bangalore");
		String s5 = E5.getAttribute("value");
		System.out.println("City is: "+s5);
		
		WebElement E6 = driver.findElement(By.name("state"));
		E6.sendKeys("Karnataka");
		String s6 = E6.getAttribute("value");
		System.out.println("State is: "+s6);
		
		WebElement E7 = driver.findElement(By.name("postalCode"));
		E7.sendKeys("589632");
		String s7 = E7.getAttribute("value");
		System.out.println("Postal Code is: "+s7);

		Select country = new Select(driver.findElement(By.name("country")));
		country.selectByValue("AUSTRALIA");

		WebElement E8 = driver.findElement(By.id("email"));
		E8.sendKeys("mnk@gmail.com");
		String s8 = E8.getAttribute("value");
		System.out.println("Email ID is: "+s8);
		
		WebElement E9 = driver.findElement(By.name("password"));
		E9.sendKeys("Kams456");
		String s9 = E9.getAttribute("value");
		System.out.println("Password is: "+s9);

		WebElement E10 = driver.findElement(By.name("confirmPassword"));
		E10.sendKeys("Kams456");
		String s10 = E10.getAttribute("value");
		System.out.println("Password is: "+s10);
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		Thread.sleep(2000);
		String success1 = driver.findElement(By.xpath("(//font/b)[2]")).getText();
		String str = "mnk@gmail.com";
		Assert.assertTrue(success1.contains(str));
		if(success1.contains(str))
		{
		System.out.println("Registration Successfull");
		
		}
		else
		{
			System.out.println("Registration Failed");
		}
		
		driver.close();
			}

}
