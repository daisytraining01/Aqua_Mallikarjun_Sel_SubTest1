package StepDef;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class StepDefinition 
{
	static WebDriver driver;
	@Given("^I have url$")
	public void i_have_url() throws Throwable
	{
	    // Write code here that turns the phrase above into concrete actions
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/newtours/login.php");

	}

	@When("^I enter the credentials$")
	public void i_enter_the_credentials() throws Throwable
	{
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("userName")).sendKeys("mnk@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Kams456");

	}

	@When("^I click login button$")
	public void i_click_login_button() throws Throwable
	{
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("submit")).click();

	}

	@Then("^I am able to navigate to Homepage$")
	public void i_am_able_to_navigate_to_Homepage() throws Throwable
	{
	    // Write code here that turns the phrase above into concrete actions
		String s1 = driver.findElement(By.xpath("//h3")).getText();
		String s2 = "Login Successfully";
		Assert.assertEquals(s2, s1);
		System.out.println("Homepage loaded Successfully");
		driver.close();
	}


}
