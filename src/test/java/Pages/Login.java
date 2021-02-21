package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class Login
{
    WebDriver driver;

    public Login(WebDriver driver)
    {
        this.driver = driver;
    }

    @FindBy(id = "user-name")
    WebElement userName;

    public void Username(String Username)
    {
        userName.sendKeys(Username);
    }

    @FindBy(id = "password")
    WebElement password;

    public void Password(String Password)
    {
        password.sendKeys(Password);
    }

    @FindBy(id = "login-button")
    WebElement loginButton;

    public void LoginButton()
    {
        loginButton.click();
    }




}

