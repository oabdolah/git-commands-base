package com.pru.page;

import org.openqa.selenium.WebDriver;

public class SeleniumMultiActions implements MultiStepAction{

    private  static SeleniumMultiActions instance=null;

    public static MultiStepAction getInstance(){
        if (instance==null){
            instance=new SeleniumMultiActions();
        }
        return instance;
    }
    @Override
    public void click(WebDriver var1, By var2, String var3, long var4) {
      //  SeleniumWait.getInstance().elementToBeClickable()
    }

    @Override
    public void clickByJavascript(WebDriver var1, By var2, String var3, long var4) {

    }

    @Override
    public void doubleclick(WebDriver var1, By var2, String var3, long var4) {

    }

    @Override
    public void senakeysí(WebDriver var1, By var2, String var3, String var4, long var5) {

    }
}
