package exceptions;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExceptionHandle {
	static WebDriver d1;

	public static void main(String[] args)
	{

		d1 = new ChromeDriver();
		d1.manage().window().maximize();
		d1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d1.get("https://opensource-demo.orangehrmlive.com/");
		d1.findElement(By.id("txtUsername")).sendKeys("Admin");
		d1.findElement(By.id("txtPassword")).sendKeys("admin123");
		// No Such Element Exception
		try
		{
			d1.findElement(By.id("12345678")).click();
		} catch (Exception e) {
			System.out.println("No Such Element Exception");

		}
		// No Alert Present Exception
		try
		{
			Alert alert = d1.switchTo().alert();
			alert.accept();
		}
		catch (Exception e)
		{
			System.out.println("No Alert Present Exception");
		}
		// No Such Frame Exception
		try 
		{
			d1.switchTo().frame("a077aa5e");
		} 
		catch (Exception e)
		{
			System.out.println("No Such Frame Exception");
		}
		d1.findElement(By.id("btnLogin")).click();
		d1.findElement(By.id("welcome")).click();
		d1.findElement(By.xpath("//a[text()='Logout']")).click();
		//d1.close();
	}
}
