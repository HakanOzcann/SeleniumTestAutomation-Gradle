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

    @FindBy(xpath = "/html/body/div[2]/div/header/div/div[1]/a")
    WebElement loginPage;

    public void loginPage()
    {
        loginPage.click();
    }


}

