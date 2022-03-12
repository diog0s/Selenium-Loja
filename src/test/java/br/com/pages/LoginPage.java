package br.com.pages;

import br.com.core.BasePage;

public class LoginPage extends BasePage {

    public void clickOnLogin(){
        clickOn("//a[@class='login']");
    }
    public void insertEmail(){
        clickOn("//input[@id='email']");
        writeOn("//input[@id='email']", "diogotestselenium@gmail.com");
    }

    public void insertPassword(){
        clickOn("//input[@id='passwd']");
        writeOn("//input[@id='email']", "selenium12345");
    }

    public void logIn(){
        clickOn("//button[@id='SubmitLogin']");
    }

}
