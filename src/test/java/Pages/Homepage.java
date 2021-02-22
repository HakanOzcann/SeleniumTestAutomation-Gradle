package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class Homepage
{
    WebDriver driver;

    public Homepage(WebDriver driver)
    {
        this.driver = driver;
    }

    @FindBy(xpath = "/html/body/div[2]/div/header/div/div[1]/a")
    WebElement homepage;

    public void Homepage()
    {
        homepage.click();
    }


}

