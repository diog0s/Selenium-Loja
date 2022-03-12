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

    public void insertEmail(String email){
        clickOn("//input[@id='email']");
        writeOn("//input[@id='email']", email);
    }

    public void insertPassword(){
        clickOn("//input[@id='passwd']");
        writeOn("//input[@id='passwd']", "selenium12345");
    }

    public void insertPassword(String pw){
        clickOn("//input[@id='passwd']");
        writeOn("//input[@id='passwd']", pw);
    }

    public void signIn(){
        clickOn("//button[@id='SubmitLogin']");
    }

}
