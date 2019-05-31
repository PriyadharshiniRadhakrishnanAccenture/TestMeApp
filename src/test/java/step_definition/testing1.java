package step_definition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class testing1 {
	
	WebDriver driver;

@Given("user launch chrome browser And enter TestMe URL")
public void user_launch_chrome_browser_And_enter_TestMe_URL() {
   System.out.println("user opened chrome browser and navigated to TestMe App");
   System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver (2).exe");
   driver=new ChromeDriver();
   driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
   driver.findElement(By.xpath("//*[@id='header']/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
   //chrome driver
   //testmeapp
}

@When("user enter username in username field")
public void user_enter_username_in_username_field() {
   System.out.println("user entered username is displayed");
   driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("priya369");
}

@When("user enter password in password field")
public void user_enter_password_in_password_field() {
	System.out.println("user entered password is displayed");
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("zxcvbnm");
}

@When("user clicks on OK button")
public void user_clicks_on_OK_button() {
	System.out.println("clicked ok button");
	driver.findElement(By.xpath("//input[@name='Login']")).click();
}

@Then("verify result")
public void verify_result() {
System.out.println("verified result");
}


}
