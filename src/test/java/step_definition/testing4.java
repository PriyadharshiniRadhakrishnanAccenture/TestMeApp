package step_definition;


	
	import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	import cucumber.api.java.en.Given;
	import cucumber.api.java.en.Then;
	import cucumber.api.java.en.When;

	public class testing4 {
		WebDriver driver;
		
		@Given("user navigates to TestMe applicaton")
		public void user_navigates_to_TestMe_applicaton() {
			System.out.println("user launched chorme and naviagtes to TestMeApp");
			System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver (2).exe");
			   driver=new ChromeDriver();
			   driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
			   driver.findElement(By.linkText("SignIn")).click();		}

		@When("user enter username and passowrd")
		public void user_enter_username_and_passowrd() {
			LoginPageObject lp=new LoginPageObject(driver);
			LoginPageObject.un.sendKeys("qwerty");
			LoginPageObject.psd.sendKeys("ytrewq");
		}

		@Then("perform login")
		public void perform_login() {
			LoginPageObject lp=new LoginPageObject(driver);
			LoginPageObject.ok.click();

		}

	}

