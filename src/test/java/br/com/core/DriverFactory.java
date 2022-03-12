package br.com.core;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {

    private static WebDriver driver;

    private DriverFactory() {}

    public static WebDriver getDriver(){
        if(driver == null) {
            System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
            driver = new ChromeDriver();
        }
            driver.manage().window().maximize();

        return driver;
    }

    public static void killDriver(){
        if(driver != null) {
            driver.quit();
            driver = null;
        }
    }
}

