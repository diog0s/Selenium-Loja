package br.com.tests;

import br.com.pages.LoginPage;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static br.com.core.DriverFactory.getDriver;
import static br.com.core.DriverFactory.killDriver;
import static org.junit.Assert.assertEquals;

public class LojaTest extends LoginPage {
    WebDriver driver;

//    @Before
//    public void init(){
//
//        //driver = new ChromeDriver();
//        getDriver();
//        //driver.get("http://automationpractice.com/index.php");
//        //driver.manage().window().maximize();
//    }

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





}
