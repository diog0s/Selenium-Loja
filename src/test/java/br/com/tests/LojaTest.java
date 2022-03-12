package br.com.tests;

import br.com.pages.LoginPage;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static br.com.core.DriverFactory.getDriver;
import static br.com.core.DriverFactory.killDriver;

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
    public void test(){
        getDriver().get("http://automationpractice.com/index.php");

        clickOnLogin();

        clickOn("//input[@id='email']");

        logIn();

        killDriver();
    }





}
