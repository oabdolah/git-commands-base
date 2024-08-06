package com.pru.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.regex.Pattern;

public interface Wait {

    boolean alertIsPresent(WebDriver var1,long var2 );
    boolean alertToBeNotIsPresent(WebDriver var1,long var2 );
    boolean attributeContains(WebDriver var1, By var2, String var3, String var4, long var5 );
    boolean attributeNotContains(WebDriver var1, By var2, String var3, String var4, long var5 );
    boolean attributeNotToBe(WebDriver var1, By var2, String var3, String var4, long var5 );
    boolean attributeNotToBeEmpty(WebDriver var1, By var2, String var3, long var5 );
    boolean attributeToBeEmpty(WebDriver var1, By var2, String var3, long var5 );
    boolean attributeToBe(WebDriver var1, By var2, String var3, long var5 );
    boolean elementToBeClickable(WebDriver var1, By var2, long var3);
    boolean elementToBeNotClickable(WebDriver var1, By var2, long var3);
    boolean elementselectionstateToBe(WebDriver var1, By var2, boolean var3, long var4);
    boolean elementSelectionstateNotToBe(WebDriver var1, By var2, boolean var3, long var4);
    boolean elementToBeselected(WebDriver var1, By var2, long var3);
    boolean elementToBeNotSelected(WebDriver var1, By var2, long var3);
    boolean frameToBeAvailableAndSwitchToIt(WebDriver var1, By var2, long var3);
    boolean frameToBeAvailableAndSwitchToIt(WebDriver var1, int var2, long var3);
    boolean frameTọBeAvailableAndSwitchToIt(WebDriver var1, String var2, long var3);
    boolean invisibilityOfElementLocated(WebDriver var1, By var2, long var3);
    boolean visibilityofElementLocated(WebDriver var1, By var2, long var3);
    boolean nvisibilityofElementWithText(WebDriver var1, By var2, String var3, long var4);
    boolean notOfinvisibilityOfElement₩ithText(WebDriver var1, By var2, String var3, long var4);
    boolean invisibilityofNestedElementsLocatedBy(WebDriver var1, By var2, By var3, long var4);
    boolean visibilityOfNestedElementsLocatedBy(WebDriver var1, By var2, By var3, long var4);
    boolean javascriptThrowsNoExceptions(WebDriver var1, String var2, long var3);
    boolean JavascriptThrowsExceptions(WebDriver var1, String var2, long var3);
    boolean jsReturnsValue(WebDriver var1, String var2, long var3);
    boolean numberOfElementsNotToBe(WebDriver var1, By var2, int var3, long var4);
    boolean numberOfElementsToBeLessThan(WebDriver var1, By var2, int var3, long var4);
    boolean numberOfElementsToBeMoreThan(WebDriver var1, By var2, int var3, long var4);
    boolean numberOfwindowsToBe(WebDriver var1, int var2, long var3);
    boolean numberOfvindowsNotToBe(WebDriver var1, int var2, long var3);
    boolean presenceOfAllElementsLocatedBy (WebDriver var1, By var2, long var3);
    boolean absenceOfAllElementsLocatedBy(WebDriver var1, By var2, long var3);
    boolean presenceOfElement (WebDriver var1, By var2, long var3);
    boolean absenceOfElement (WebDriver var1, By var2, long var3);
     boolean presenceOfNestedElementLocatedBy(WebDriver var1, By var2, By var3, long var4);
    boolean presenceOfNestedElementsLocatedBy(WebDriver var1, By var2, By var3, long var4);
    boolean textMatches(WebDriver var1, By var2, Pattern var3, long var4);
    boolean textToBe(WebDriver var1, By var2, String var3, long var4);

    boolean textToBePresentInElementValue(WebDriver var1, By var2, String var3, long var4);
    boolean textToBeNotPresentInElementValue(WebDriver var1, By var2, String var3, long var4);
    boolean titleContains(WebDriver var1, String var2, long var3);

    boolean textToBePresentInElementLocated(WebDriver var1, By var2, String var3, long var4);
    boolean textToBeNotPresentInElementLocated(WebDriver var1, By var2, String var3, long var4);

    boolean titleNotContains(WebDriver var1, String var2, long var3);
    boolean titleIs(WebDriver var1, String var2, long var3);
    boolean titleIsNot (WebDriver var1, String var2, long var3);
    boolean urlContains(WebDriver var1, String var2, long var3);
    boolean urlNotContains(WebDriver var1, String var2, long var3);
    boolean urlMatches(WebDriver var1, String var2, long var3);
    boolean urlToBe(WebDriver var1, String var2, long var3);
    boolean visibilityOfAllElement (WebDriver var1, By var2, long var3);
    boolean notOfvisibilityOfAllElement(WebDriver var1, By var2, long var3);
}
