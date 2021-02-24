package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.xml.xpath.XPath;
import java.util.logging.XMLFormatter;


public class Premium
{
    WebDriver driver;

    public Premium(WebDriver driver)
    {
        this.driver = driver;
    }

    @FindBy(xpath = "/html/body/div[2]/div/header/div/nav/ul/li[1]/a")
    WebElement premium;

    public void Premium()
    {
        premium.click();
    }

    @FindBy(xpath = "//*[@id=\"HERO-0\"]/article/header/div/div[3]/div/a")
    WebElement showPlans;

    public void ShowPlans()
    {
        showPlans.click();
    }

    @FindBy(linkText = "Şartlar ve koşullar geçerlidir.")
    WebElement conditions;

    public void Conditions()
    {
        conditions.click();
    }

}

