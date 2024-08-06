package com.pru.test;

import com.pru.page.BasePage;
import com.pru.page.By;
import org.openqa.selenium.WebDriver;

public class Locators extends BasePage {


    public Locators(WebDriver driver) {
        super(driver);
    }

   interface Element{

        By element  =  By.xpath("//textarea[@name='q']", "");

    }


}
