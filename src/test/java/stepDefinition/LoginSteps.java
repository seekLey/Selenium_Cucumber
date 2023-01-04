package stepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.PageObj;

public class LoginSteps {

    String baseURL = "https://testpages.herokuapp.com/styled/index.html";
    public WebDriver driver;
    public PageObj po;

    @Before
    public void open_browser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to(baseURL);
        po = new PageObj(driver);
    }

    @Given("launch the browser")
    public void launch_the_browser() {
        System.out.println("########################   TEST STARTED   ##################################");
    }

    @Then("verify the page Title")
    public void verify_title() {
        String actualTitle = driver.getTitle();
//        System.out.println(actualTitle);
        Assert.assertEquals("Selenium Test Pages", actualTitle);
    }

    @Given("search for the HTML Form")
    public void search_HTML_Form() {
        String formText = "HTML Form Example";
        driver.findElement(By.xpath(".//*[contains(text(),'HTML Form Example')]")).isEnabled();
        String actualText = driver.findElement(By.partialLinkText("HTML Form Example")).getText();
//        System.out.println(actualText);

        Assert.assertEquals(formText, actualText);
    }

    @Then("click on the Form link and verify title")
    public void click_Form_Link() {
        driver.findElement(By.xpath(".//*[contains(text(),'HTML Form Example')]")).click();
        String actualPagetitle = driver.getTitle();
        System.out.println(actualPagetitle);

        Assert.assertEquals("HTML Form Elements", actualPagetitle);
    }

    @Then("enter username {string}")
    public void enter_txtUserName(String username) {
        po.enterUsername(username);
    }

    @And("enter password {string}")
    public void enter_txtPassword(String password) {
        po.enterPassword(password);
    }

    @And("enter text area {string}")
    public void enter_txtComment(String comment) {
        po.enterTextArea(comment);
    }

    @And("upload file")
    public void select_file() {
        WebElement e = driver.findElement(By.xpath("//*[@id=\"HTMLFormElements\"]/table/tbody/tr[4]/td/input[1]"));

        e.sendKeys("/Users/sujit.ambore/Desktop/sample1.png");
        driver.findElement(By.xpath(".//*[@type='checkbox' and @value='cb1']")).click();
    }

    @After()
    public void close_Browser() {
        driver.close();
        driver.quit();
        System.out.println("########################   TEST ENDED   ##################################");
    }
}