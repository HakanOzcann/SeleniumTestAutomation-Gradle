package TestCases;

import Pages.Download;
import Pages.Support;
import Utilities.Driver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import Pages.Homepage;
import Pages.Premium;

public class TestCases extends Driver
{

    @Test
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




}

