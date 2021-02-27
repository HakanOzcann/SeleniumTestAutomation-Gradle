package Utilities;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import com.google.common.io.Files;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Driver
{
    public static WebDriver driver = null;

    @BeforeSuite
    public void initialize() throws IOException
    {
        System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/src/main/resources/geckodriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.spotify.com/tr/");

        File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            Files.copy(src, new File("./Screenshot/denem2e.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @AfterSuite
    public void TeardownTest()
    {
        Driver.driver.quit();
    }

}

