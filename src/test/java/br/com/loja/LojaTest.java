package br.com.loja;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LojaTest {
    WebDriver driver;

    @Before
    public void init(){
        System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();
    }

    @Test
    public void test(){
        System.out.println(driver.getTitle());
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='login']")));
        driver.findElement(By.xpath("//a[@class='login']")).click();


        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='email']")));
        driver.findElement(By.xpath("//input[@id='email']")).click();


        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("diogotestselenium@gmail.com");
        driver.findElement(By.xpath("//input[@id='passwd']")).click();
        driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("diogotestselenium@gmail.com");
        driver.findElement(By.xpath("//button[@id='SubmitLogin']")).click();


    }

    @After
    public void finish(){
        //WebDriverWait wait = new WebDriverWait(driver, 20);
        //wait.until(ExpectedConditions.alertIsPresent());
        driver.close();
    }

}
