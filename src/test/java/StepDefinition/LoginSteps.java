package StepDefinition;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginSteps {

    WebDriver driver = null;
    String baseURL = "https://testpages.herokuapp.com/styled/index.html";

    @Given("when user is on login page")
    public void when_user_is_on_login_page() {

        System.setProperty("webdriver.chrome.driver","/Users/sujit.ambore/Desktop/Sujit/Learnings/Selenium/src/test/java/Resources/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(baseURL);

        System.out.println("Given");
    }
    @When("verify the title of the page")
    public void verify_the_title_of_the_page() {
        System.out.println("When");
    }
    @And("enter username and password")
    public void enter_username_and_password() {
        System.out.println("And");
    }
    @Then("click on login button")
    public void click_on_login_button() {
        System.out.println("Then");
    }
}
