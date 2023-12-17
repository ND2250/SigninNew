package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Signin {

    WebDriver driver;

    @Given("^User should be able to open a webpage$")
    public void user_should_be_able_to_open_a_webpage() {

        // Set up a path for driver
        System.setProperty("webdriver.chrome.driver","C:\\Software\\Driver\\chromedriver-win32\\chromedriver.exe");
        // create an instance for webdriver
         driver = new ChromeDriver();
        //Maximise the screen
        driver.manage().window().maximize();
    }

    @Given("^Enter a valid website URL$")
    public void enter_a_valid_website_URL()  {
        driver.get("https://demo.nopcommerce.com/");

    }

    @When("^User clicked on login$")
    public void user_clicked_on_login()  {
        driver.findElement(By.className("ico-login")).click();

    }

    @Then("^User should be on login page$")
    public void user_should_be_on_login_page()  {
        driver.findElement(By.className("master-wrapper-page")).isDisplayed();

    }

    @Then("^enter a registered \"([^\"]*)\"$")
    public void enter_a_registered(String userid)  {
        driver.findElement(By.id("Email")).sendKeys(userid);
    }

    @Then("^enter a \"([^\"]*)\"$")
    public void enter_a(String correctpassword)  {
        driver.findElement(By.id("Password")).sendKeys(correctpassword);
    }

    @Then("^user should be logged in successfully$")
    public void user_should_be_logged_in_successfully() {
        driver.findElement(By.className("button-1 login-button")).click();
    }

    @Then("^user close the browser$")
    public void user_close_the_browser() {
        driver.close();
    }


}
