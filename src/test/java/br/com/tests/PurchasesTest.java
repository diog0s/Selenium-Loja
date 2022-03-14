package br.com.tests;

import br.com.pages.PurchasesPage;
import org.junit.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

import static br.com.core.DriverFactory.getDriver;
import static br.com.core.DriverFactory.killDriver;

public class PurchasesTest extends PurchasesPage {

    @Test
    public void testPurchasesTshirt(){
        getDriver().get("http://automationpractice.com/index.php");
        loginComplete();

        clickOnTshirtTap();

        clickOnTshirtImg();

        clickOnTshirtText();

        addToCart();

        clickOnCheckOut();

        clickOnProceedToCheckout();



        killDriver();
    }
}
