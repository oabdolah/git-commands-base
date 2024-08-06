package com.pru.page;

import org.openqa.selenium.WebDriver;

public class SeleniumAction implements Action{

    private  static  Action instance=null;
    public SeleniumAction(){

    }
    public static Action getInstance(){
        if (instance==null){
            instance=new SeleniumAction();
        }
        return  instance;
    }

    @Override
    public boolean clear(WebDriver var1, By var2) {
        return false;
    }

    @Override
    public boolean click(WebDriver var1, By var2) {
        return false;
    }

    @Override
    public boolean clickByJavascript(WebDriver var1, By var2) {
        return false;
    }

    @Override
    public boolean sendKeys(WebDriver var1, By var2, CharSequence... var3) {
        return false;
    }

    @Override
    public boolean submit(WebDriver var1, By var2) {
        return false;
    }

    @Override
    public boolean selectByIndex(WebDriver var1, By var2, int var3) {
        return false;
    }

    @Override
    public boolean selectByValue(WebDriver var1, By var2, String var3) {
        return false;
    }

    @Override
    public boolean selectByVisibleText(WebDriver var1, By var2, String var3) {
        return false;
    }

    @Override
    public boolean deselectByIndex(WebDriver var1, By var2, int var3) {
        return false;
    }

    @Override
    public boolean deselectByValue(WebDriver var1, By var2, String var3) {
        return false;
    }

    @Override
    public boolean deselectByVisibleText(WebDriver var1, By var2, String var3) {
        return false;
    }

    @Override
    public boolean deselectAll(WebDriver var1, By var2) {
        return false;
    }

    @Override
    public boolean moveToElement(WebDriver var1, By var2) {
        return false;
    }

    @Override
    public Object executescript(WebDriver var1, By var2, String var3, Object... var4) {
        return null;
    }

    @Override
    public Object executeAsyncscript(WebDriver var1, By var2, String var3, Object... var4) {
        return null;
    }

    @Override
    public boolean doubleClick(WebDriver var1, By var2) {
        return false;
    }

    @Override
    public boolean hideElement(WebDriver var1, By var2) {
        return false;
    }

    @Override
    public boolean scrollToElement(WebDriver var1, By var2) {
        return false;
    }
}
