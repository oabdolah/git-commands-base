package com.pru.page;

import org.openqa.selenium.WebDriver;

public class BasePage {
public  WebDriver driver;
public Wait wait = SeleniumWait.getInstance();
public AbstractUiAssertion assertThat = SeleniumAssertion.getInstance();
public Action takeAction = SeleniumAction.getInstance();
public MultiStepAction multiStepAction=SeleniumMultiActions.getInstance();


public BasePage(WebDriver driver){
    this.driver=driver;
}

}
