package StepDefinition;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	static WebDriver driver;
	@Given("User is on Home Page")
	public void user_is_on_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	     driver = new ChromeDriver();
	    
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    driver.manage().window().maximize();
	    }

	@When("User navigate to Login Page")
	public void user_navigate_to_login_page() {
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys("admin123");
		
	}

	@Then("User enters {string} and {string}")
	public void user_enters_and(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	}

	@And("Keeping case as Valid")
	public void keeping_case_as_valid() {
		Assert.assertTrue(driver.findElements(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[1]/a/div[2]/img")).size()>0);
	}

	@Then("User should get logged in")
	public void user_should_get_logged_in() {
	    Assert.assertTrue(driver.findElements(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]")).size()>0);
	}

	@And("Message displayed Login Successfully")
	public void message_displayed_login_successfully() {
	    driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[3]/ul/li/span/p")).click();
	    driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[3]/ul/li/ul/li[4]/a")).click();
	}

	@And("Keeping case as InValid")
	public void keeping_case_as_in_valid() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys("admin12");
	}

	@Then("user will be asked to go back to login page")
	public void user_will_be_asked_to_go_back_to_login_page() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	}

	@And("Provide correct credentials")
	public void provide_correct_credentials() {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(driver.findElements(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/div/div[1]")).size()>0);
	    driver.close();
	}

}
