package br.com.dsl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DSL {
    WebDriver driver;

    public DSL(){
        driver = new ChromeDriver();
    }

}
