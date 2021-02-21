package TestCases;

import Driver.Driver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import Pages.Login;

public class LoginTest extends Driver
{

    @Test
    public void Test() throws Exception
    {

        driver.get("https://www.saucedemo.com");
        Login homepage = PageFactory.initElements(driver, Login.class);

        homepage.Username("standard_user");
        homepage.Password("secret_sauce");
        homepage.LoginButton();

    }

}

