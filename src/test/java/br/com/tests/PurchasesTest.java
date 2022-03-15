package br.com.tests;

import br.com.pages.PurchasesPage;
import org.junit.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

import static br.com.core.DriverFactory.getDriver;
import static br.com.core.DriverFactory.killDriver;
import static junit.framework.TestCase.assertEquals;

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

        clickSaveAddress();

        agreeTerms();

        clickSaveAddress();

        payByBankWire();

        confirmMyOrder();

        String msg = getDriver().findElement(By.xpath("//p[@class='cheque-indent']/strong")).getText();

        assertEquals("Your order on My Store is complete.", msg);

        killDriver();
    }




}
