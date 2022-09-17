package StepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginSteps {

    String baseURL = "https://testpages.herokuapp.com/styled/index.html";
    public WebDriver driver;

    @Given("launch the browser")
    public void launch_the_browser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.navigate().to(baseURL);
    }

    @Then("verify the page Title")
    public void verify_title() {
        String actualTitle = driver.getTitle();
        System.out.println(actualTitle);

        Assert.assertEquals("Selenium Test Pages", actualTitle);
    }


    @After()
    public void close_Browser(){
        driver.close();
        driver.quit();
    }
}
