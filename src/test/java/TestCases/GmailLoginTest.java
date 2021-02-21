package TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import Pages.Homepage;

public class GmailLoginTest extends TestBase
{

    @Test
    public void init() throws Exception
    {

        driver.get("https://phptravels.com/demo/");
        Homepage loginpage = PageFactory.initElements(driver, Homepage.class);

        loginpage.frontEnd1();
    }

}

