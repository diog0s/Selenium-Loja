package br.com.core;

import org.openqa.selenium.By;

import static br.com.core.DriverFactory.getDriver;

public class BasePage {


    public void clickOn(String xpath){
        getDriver().findElement(By.xpath(xpath)).click();
    }
    public void writeOn(String xpath, String txt){
        getDriver().findElement(By.xpath(xpath)).click();
        getDriver().findElement(By.xpath(xpath)).sendKeys(txt);
    }
}
