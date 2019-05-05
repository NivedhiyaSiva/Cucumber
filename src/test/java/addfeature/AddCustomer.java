package addfeature;
import java.util.List;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.CucumberOptions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import io.cucumber.datatable.DataTable;

public class AddCustomer {

	static WebDriver driver;
	@Given("The user  want to write a step with precondition")
	public void the_user_want_to_write_a_step_with_precondition() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\np00474612\\eclipse-workspace\\BDDFramework\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.gmail.com");
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
	}

	@When("The user to fill the customer details")
	public void the_user_to_fill_the_customer_details(DataTable datatable) throws Exception {
		List<String> dd = datatable.asList(String.class);

		WebElement txtEmail = driver.findElement(By.id("identifierId"));
		txtEmail.sendKeys(dd.get(0));
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		
	Thread.sleep(1000);
		WebElement txtPasswd = driver.findElement(By.xpath("//input[@type='password']"));
		
		
		txtPasswd.sendKeys(dd.get(1));
		driver.findElement(By.xpath("(//span[@class='RveJvd snByac'])[1]")).click();




	}

	@Then("The user validate the outcomes")
	public void the_user_validate_the_outcomes() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

}