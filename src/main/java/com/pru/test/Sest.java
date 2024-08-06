package com.pru.test;

import com.google.common.annotations.VisibleForTesting;
import com.pru.page.BasePage;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.xml.sax.Locator;

import java.sql.Driver;

public class Sest extends BaseT{


    public Sest(WebDriver driver) {
        super(driver);
    }

    @Test
    public void test1(){


        driver.get("https://www.google.com");
     //   pom.takeAction.sendKeys(driver, Locators.Element.element);

    }

    @Test
    public void test(){

    }

    public static void main(String[] args) {

    }

}


