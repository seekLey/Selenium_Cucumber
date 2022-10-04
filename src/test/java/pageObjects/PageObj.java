package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObj {
    public WebDriver driver;

    public PageObj(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = ".//*[@name='username']")
    @CacheLookup
    WebElement txtUserName;

    @FindBy(xpath = ".//*[@name='password']")
    @CacheLookup
    WebElement txtPassword;

    @FindBy(xpath = ".//*[@name='comments']")
    @CacheLookup
    WebElement txtArea;

    public void enterUsername(String userName) {
        txtUserName.clear();
        txtUserName.sendKeys(userName);
    }

    public void enterPassword(String password) {
        txtPassword.clear();
        txtPassword.sendKeys(password);
    }

    public void enterTextArea(String area) {
        txtArea.clear();
        txtArea.sendKeys(area);
    }

}