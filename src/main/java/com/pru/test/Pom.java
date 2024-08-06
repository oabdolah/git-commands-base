package com.pru.test;

import com.pru.page.BasePage;
import com.pru.page.By;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class Pom extends BasePage  {


    public Pom(WebDriver driver) {
        super(driver);
    }
public void test(){
    driver.get("https://www.google.com");
    //textarea[@name='q']
    org.openqa.selenium.By xpath = By.xpath("//textarea[@name='q']");
//    takeAction.sendKeys(driver, xpath, "all" );
}





}
