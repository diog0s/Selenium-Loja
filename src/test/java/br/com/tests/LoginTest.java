package br.com.tests;

import br.com.pages.LoginPage;
import org.junit.Test;
import org.openqa.selenium.By;

import static br.com.core.DriverFactory.getDriver;
import static br.com.core.DriverFactory.killDriver;
import static org.junit.Assert.assertEquals;

public class LojaTest extends LoginPage {

    @Test
    public void testLoginSuccessful(){
        getDriver().get("http://automationpractice.com/index.php");

        clickOnLogin();

        insertEmail();
        insertPassword();

        signIn();

        String user = getDriver().findElement(By.xpath("//a[@class='account']")).getText();

        assertEquals("Diogo Santos", user);

        killDriver();
    }
    @Test
    public void testLoginWithPasswdWrong(){
        getDriver().get("http://automationpractice.com/index.php");

        clickOnLogin();

        insertEmail();
        insertPassword("pw_wrong");

        signIn();

        String alert = getDriver().findElement(By.xpath("//div[@class='alert alert-danger']/p")).getText();
        assertEquals("There is 1 error", alert);

        killDriver();
    }

    @Test
    public void testLoginWithEmailWrong(){
        getDriver().get("http://automationpractice.com/index.php");

        clickOnLogin();

        insertEmail("email.wrong@selenium.com");
        insertPassword();

        signIn();

        String alert = getDriver().findElement(By.xpath("//div[@class='alert alert-danger']/p")).getText();
        assertEquals("There is 1 error", alert);

        killDriver();
    }

}
