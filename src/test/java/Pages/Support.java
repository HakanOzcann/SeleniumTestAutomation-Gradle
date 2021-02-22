package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class Support
{
    WebDriver driver;

    public Support(WebDriver driver)
    {
        this.driver = driver;
    }

    @FindBy(xpath = "/html/body/div[2]/div/header/div/nav/ul/li[2]/a")
    WebElement support;

    public void Support()
    {
        support.click();
    }


}

