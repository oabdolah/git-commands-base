package com.pru.page;

import org.openqa.selenium.WebDriver;


    public interface Action {
        boolean clear(WebDriver var1, By var2);
    boolean click(WebDriver var1, By var2);
    boolean clickByJavascript(WebDriver var1, By var2);
    boolean sendKeys(WebDriver var1, By var2, CharSequence...var3);
    boolean submit(WebDriver var1, By var2);
    boolean selectByIndex(WebDriver var1, By var2, int var3);
    boolean selectByValue(WebDriver var1, By var2, String var3);
    boolean selectByVisibleText(WebDriver var1, By var2, String var3);
    boolean deselectByIndex(WebDriver var1, By var2, int var3);
    boolean deselectByValue(WebDriver var1, By var2, String var3);
    boolean deselectByVisibleText(WebDriver var1, By var2, String var3);
    boolean deselectAll(WebDriver var1, By var2);
    boolean moveToElement (WebDriver var1, By var2);
    Object executescript(WebDriver var1, By var2, String var3, Object...var4);
    Object executeAsyncscript(WebDriver var1, By var2, String var3, Object...var4);
    boolean doubleClick(WebDriver var1, By var2);
    boolean hideElement(WebDriver var1, By var2);
    boolean scrollToElement(WebDriver var1, By var2);


}
