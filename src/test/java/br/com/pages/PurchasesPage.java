package br.com.pages;

import br.com.core.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

import static br.com.core.DriverFactory.getDriver;

public class PurchasesPage extends BasePage {

    public void loginComplete(){
        clickOn("//a[@class='login']");

        clickOn("//input[@id='email']");
        writeOn("//input[@id='email']", "diogotestselenium@gmail.com");

        clickOn("//input[@id='passwd']");
        writeOn("//input[@id='passwd']", "selenium12345");

        clickOn("//button[@id='SubmitLogin']");
    }

    public void clickOnTshirtTap(){
        clickOn("(//a[@title='T-shirts'])[2]");
    }

    public void addToCart(){
        getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        getDriver().findElement(By.xpath("//button[@name='Submit']")).click();
    }

    public void addToCartOnPopup(){
        clickOn("//p[@id='add_to_cart']/button");
    }

    public void clickOnCheckOut(){
        getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        Actions action = new Actions(getDriver());
        WebElement element = getDriver().findElement(By.xpath("//a[@title='Proceed to checkout']"));
        action.moveToElement(element);
        element.click();
    }
    public void clickOnTshirtText(){
        clickOn("//h5[@itemprop='name']");
    }

    public void clickOnTshirtImg(){
        Actions act = new Actions(getDriver());
        act.moveToElement(getDriver().findElement(By.xpath("//div[@class='product-image-container']"))).perform();
    }

    public void clickOnProceedToCheckout(){
        getDriver().findElement(By.xpath("//a[@class='button btn btn-default standard-checkout button-medium']")).click();
    }

    public void clickSaveShipping() {
        getDriver().findElement(By.xpath("//button[@type='submit']/span/i")).click();
    }

    public void clickSaveAddress() {
        clickSaveShipping();
    }

    public void agreeTerms() {
        getDriver().findElement(By.xpath("//input[@type='checkbox']")).click();
    }

    public void payByBankWire(){
        getDriver().findElement(By.xpath("//a[@title='Pay by bank wire']")).click();
    }

    public void confirmMyOrder(){
        getDriver().findElement(By.xpath("//button[@class='button btn btn-default button-medium']")).click();
    }

    public void continueShooping() {
        getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        Actions action = new Actions(getDriver());
        WebElement element = getDriver().findElement(By.xpath("//span[@title='Continue shopping']"));
        action.moveToElement(element);
        element.click();
    }

    public void cartDropDown() {
        WebElement dropDown = getDriver().findElement(By.xpath("//div[@class='shopping_cart']/a"));
        dropDown.click();

//        WebElement elementCart = getDriver().findElement(By.xpath("//a[@class='cart-images']"));
//        Actions action = new Actions(getDriver());
//        action.moveToElement(elementCart).click();
    }

}
