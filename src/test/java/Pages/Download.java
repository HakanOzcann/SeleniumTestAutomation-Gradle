package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class Download
{
    WebDriver driver;

    public Download(WebDriver driver)
    {
        this.driver = driver;
    }

    @FindBy(xpath = "//*[@id=\"__next\"]/div[1]/header/div/nav/ul/li[3]/a")
    WebElement download;

    public void Download()
    {
        download.click();
    }

    @FindBy(linkText = "İndir")
    WebElement clickDownload;

    public void ClickDownload()
    {
        clickDownload.click();
    }




}

