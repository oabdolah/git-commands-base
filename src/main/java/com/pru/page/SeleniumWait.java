package com.pru.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.regex.Pattern;

public class SeleniumWait implements Wait{

    private static Wait instance =null;

    public SeleniumWait(){

    }

    public static Wait getInstance(){
        if (instance==null){
            instance=new SeleniumWait();
        }
        return  instance;
    }
    @Override
    public boolean alertIsPresent(WebDriver var1, long var2) {
        return false;
    }

    @Override
    public boolean alertToBeNotIsPresent(WebDriver var1, long var2) {
        return false;
    }

    @Override
    public boolean attributeContains(WebDriver var1, By var2, String var3, String var4, long var5) {
        return false;
    }

    @Override
    public boolean attributeNotContains(WebDriver var1, By var2, String var3, String var4, long var5) {
        return false;
    }

    @Override
    public boolean attributeNotToBe(WebDriver var1, By var2, String var3, String var4, long var5) {
        return false;
    }

    @Override
    public boolean attributeNotToBeEmpty(WebDriver var1, By var2, String var3, long var5) {
        return false;
    }

    @Override
    public boolean attributeToBeEmpty(WebDriver var1, By var2, String var3, long var5) {
        return false;
    }

    @Override
    public boolean attributeToBe(WebDriver var1, By var2, String var3, long var5) {
        return false;
    }

    @Override
    public boolean elementToBeClickable(WebDriver var1, By var2, long var3) {
        return false;
    }

    @Override
    public boolean elementToBeNotClickable(WebDriver var1, By var2, long var3) {
        return false;
    }

    @Override
    public boolean elementselectionstateToBe(WebDriver var1, By var2, boolean var3, long var4) {
        return false;
    }

    @Override
    public boolean elementSelectionstateNotToBe(WebDriver var1, By var2, boolean var3, long var4) {
        return false;
    }

    @Override
    public boolean elementToBeselected(WebDriver var1, By var2, long var3) {
        return false;
    }

    @Override
    public boolean elementToBeNotSelected(WebDriver var1, By var2, long var3) {
        return false;
    }

    @Override
    public boolean frameToBeAvailableAndSwitchToIt(WebDriver var1, By var2, long var3) {
        return false;
    }

    @Override
    public boolean frameToBeAvailableAndSwitchToIt(WebDriver var1, int var2, long var3) {
        return false;
    }

    @Override
    public boolean frameTọBeAvailableAndSwitchToIt(WebDriver var1, String var2, long var3) {
        return false;
    }

    @Override
    public boolean invisibilityOfElementLocated(WebDriver var1, By var2, long var3) {
        return false;
    }

    @Override
    public boolean visibilityofElementLocated(WebDriver var1, By var2, long var3) {
        return false;
    }

    @Override
    public boolean nvisibilityofElementWithText(WebDriver var1, By var2, String var3, long var4) {
        return false;
    }

    @Override
    public boolean notOfinvisibilityOfElement₩ithText(WebDriver var1, By var2, String var3, long var4) {
        return false;
    }

    @Override
    public boolean invisibilityofNestedElementsLocatedBy(WebDriver var1, By var2, By var3, long var4) {
        return false;
    }

    @Override
    public boolean visibilityOfNestedElementsLocatedBy(WebDriver var1, By var2, By var3, long var4) {
        return false;
    }

    @Override
    public boolean javascriptThrowsNoExceptions(WebDriver var1, String var2, long var3) {
        return false;
    }

    @Override
    public boolean JavascriptThrowsExceptions(WebDriver var1, String var2, long var3) {
        return false;
    }

    @Override
    public boolean jsReturnsValue(WebDriver var1, String var2, long var3) {
        return false;
    }

    @Override
    public boolean numberOfElementsNotToBe(WebDriver var1, By var2, int var3, long var4) {
        return false;
    }

    @Override
    public boolean numberOfElementsToBeLessThan(WebDriver var1, By var2, int var3, long var4) {
        return false;
    }

    @Override
    public boolean numberOfElementsToBeMoreThan(WebDriver var1, By var2, int var3, long var4) {
        return false;
    }

    @Override
    public boolean numberOfwindowsToBe(WebDriver var1, int var2, long var3) {
        return false;
    }

    @Override
    public boolean numberOfvindowsNotToBe(WebDriver var1, int var2, long var3) {
        return false;
    }

    @Override
    public boolean presenceOfAllElementsLocatedBy(WebDriver var1, By var2, long var3) {
        return false;
    }

    @Override
    public boolean absenceOfAllElementsLocatedBy(WebDriver var1, By var2, long var3) {
        return false;
    }

    @Override
    public boolean presenceOfElement(WebDriver var1, By var2, long var3) {
        return false;
    }

    @Override
    public boolean absenceOfElement(WebDriver var1, By var2, long var3) {
        return false;
    }

    @Override
    public boolean presenceOfNestedElementLocatedBy(WebDriver var1, By var2, By var3, long var4) {
        return false;
    }

    @Override
    public boolean presenceOfNestedElementsLocatedBy(WebDriver var1, By var2, By var3, long var4) {
        return false;
    }

    @Override
    public boolean textMatches(WebDriver var1, By var2, Pattern var3, long var4) {
        return false;
    }

    @Override
    public boolean textToBe(WebDriver var1, By var2, String var3, long var4) {
        return false;
    }

    @Override
    public boolean textToBePresentInElementValue(WebDriver var1, By var2, String var3, long var4) {
        return false;
    }

    @Override
    public boolean textToBeNotPresentInElementValue(WebDriver var1, By var2, String var3, long var4) {
        return false;
    }

    @Override
    public boolean titleContains(WebDriver var1, String var2, long var3) {
        return false;
    }

    @Override
    public boolean textToBePresentInElementLocated(WebDriver var1, By var2, String var3, long var4) {
        return false;
    }

    @Override
    public boolean textToBeNotPresentInElementLocated(WebDriver var1, By var2, String var3, long var4) {
        return false;
    }

    @Override
    public boolean titleNotContains(WebDriver var1, String var2, long var3) {
        return false;
    }

    @Override
    public boolean titleIs(WebDriver var1, String var2, long var3) {
        return false;
    }

    @Override
    public boolean titleIsNot(WebDriver var1, String var2, long var3) {
        return false;
    }

    @Override
    public boolean urlContains(WebDriver var1, String var2, long var3) {
        return false;
    }

    @Override
    public boolean urlNotContains(WebDriver var1, String var2, long var3) {
        return false;
    }

    @Override
    public boolean urlMatches(WebDriver var1, String var2, long var3) {
        return false;
    }

    @Override
    public boolean urlToBe(WebDriver var1, String var2, long var3) {
        return false;
    }

    @Override
    public boolean visibilityOfAllElement(WebDriver var1, By var2, long var3) {
        return false;
    }

    @Override
    public boolean notOfvisibilityOfAllElement(WebDriver var1, By var2, long var3) {
        return false;
    }
}
