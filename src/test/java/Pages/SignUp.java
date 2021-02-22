package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class SignUp
{
    WebDriver driver;

    public SignUp(WebDriver driver)
    {
        this.driver = driver;
    }

    @FindBy(xpath = "/html/body/div[2]/div/header/div/nav/ul/li[5]/a")
    WebElement signUp;

    public void SignUp()
    {
        signUp.click();
    }


}

