package TestCases;

import Pages.*;
import Utilities.Driver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestCases extends Driver
{

    @Test(priority = 1)
    public void Homepage() throws Exception
    {
        driver.get("https://www.spotify.com/tr/");

        Homepage homepage = PageFactory.initElements(driver, Homepage.class);
        homepage.Homepage();
        homepage.Free();

    }

    @Test(priority = 2)
    public void Premium() throws Exception
    {
        Premium premium = PageFactory.initElements(driver, Premium.class);
        premium.Premium();
        premium.ShowPlans();
        premium.Conditions();
    }

    @Test(priority = 3)
    public void Support() throws Exception
    {
        Support support = PageFactory.initElements(driver, Support.class);
        support.Support();
    }

    @Test(priority = 4)
    public void Download() throws Exception
    {
        Download download = PageFactory.initElements(driver, Download.class);
        download.Download();
        download.ClickDownload();
    }


    @Test(priority = 5)
    public void SignUp() throws Exception
    {
        SignUp signUp = PageFactory.initElements(driver, SignUp.class);
        signUp.SignUp();
    }


    @Test(priority = 6)
    public void LogIn() throws Exception
    {
        Login login = PageFactory.initElements(driver, Login.class);
        login.loginPage();
    }

}

