package br.com.tests;

import br.com.pages.PurchasesPage;
import org.junit.Test;

import org.openqa.selenium.By;

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

        clickSaveShipping();

        payByBankWire();

        confirmMyOrder();

        String msg = getDriver().findElement(By.xpath("//p[@class='cheque-indent']/strong")).getText();

        assertEquals("Your order on My Store is complete.", msg);

        killDriver();
    }

    @Test
    public void testVerifyCart(){
        getDriver().get("http://automationpractice.com/index.php");
        loginComplete();

        clickOnTshirtTap();

        clickOnTshirtImg();

        clickOnTshirtText();

        addToCart();

        continueShooping();

        cartDropDown();

        String itemName = getDriver().findElement(By.xpath("(//p[@class='product-name'])[2]")).getText();

        assertEquals("Faded Short Sleeve T-shirts", itemName);

        //Kill Driver
        killDriver();
    }
    @Test
    public void verifyStock(){
        getDriver().get("http://automationpractice.com/index.php");
        loginComplete();

        clickOnTshirtTap();

        clickOnTshirtImg();

        clickOnTshirtText();

        addToCart();

        continueShooping();

        cartDropDown();

        String stock = getDriver().findElement(By.xpath("//span[@class='label label-success']")).getText();

        assertEquals("In stock", stock);
    }
}
