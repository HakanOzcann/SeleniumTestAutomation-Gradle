package TestCases;

import Pages.*;
import Utilities.Driver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestCases extends Driver
{

    @Test(priority = 0)
    public void Homepage() throws Exception
    {
        driver.get("https://www.spotify.com/tr/");

        Homepage homepage = PageFactory.initElements(driver, Homepage.class);
        homepage.Homepage();
    }

    @Test
    public void Premium() throws Exception
    {
        Premium premium = PageFactory.initElements(driver, Premium.class);
        premium.Premium();
    }

    @Test
    public void Support() throws Exception
    {
        Support support = PageFactory.initElements(driver, Support.class);
        support.Support();
    }

    @Test
    public void Download() throws Exception
    {
        Download download = PageFactory.initElements(driver, Download.class);
        download.Download();
    }


    @Test
    public void SignUp() throws Exception
    {
        SignUp signUp = PageFactory.initElements(driver, SignUp.class);
        signUp.SignUp();
    }


    @Test
    public void LogIn() throws Exception
    {
        Login login = PageFactory.initElements(driver, Login.class);
        login.loginPage();
    }

}

