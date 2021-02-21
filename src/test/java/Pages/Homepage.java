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

    @FindBy(xpath = "//*[@id=\"Main\"]/section[1]/div/div/div[2]/div/div/div[2]/div/div/div[1]/div/a")
    WebElement frontEnd;

    public void frontEnd1(){
        frontEnd.click();
    }


}

