package brokenLinks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokeLinks {
	static WebDriver driver;

	public static void main(String[] args)
	{
		String expecttitle = "Under Construction: Mercury Tours";
		driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/mercurywelcome.php");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total links are " + links.size());
		String[] arr = new String[links.size()];
		int i = 0;
		for (WebElement val1 : links)
		{
			arr[i] = val1.getText();
			i++;
		}
		for (int j = 0; j < arr.length; j++) {
		}
		try 
		{
			for (String val : arr) 
			{
				driver.findElement(By.linkText(val)).click();
				if (driver.getTitle().equals(expecttitle)) 
				{
					// if(driver.getTitle().equals(expecttitle)){
					System.out.println(val + " Page not working");
				} else {
					System.out.println(val + " Hypherlink working");
			}
				driver.navigate().back();
			}
		}
		catch (Exception e)
		{
			System.out.println("Error found");
		}
		driver.quit();
	}
}
