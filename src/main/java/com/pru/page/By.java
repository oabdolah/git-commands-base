package com.pru.page;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;

import java.util.List;

public class By extends  org.openqa.selenium.By{


   private final org.openqa.selenium.By by;
   private final String desc;

    public By(org.openqa.selenium.By by, String desc) {
        this.by = by;
        this.desc=desc;
    }

    public By(org.openqa.selenium.By id, String desc, org.openqa.selenium.By by, String desc1) {

        this.by = by;
        this.desc = desc1;
    }

    public static By id(String id, String desc) {
        return new By(org.openqa.selenium.By.id(id), desc);
    }
    public static By linkText(String linkText, String desc) {
        return new By(org.openqa.selenium.By.linkText(linkText), desc);
    }

    public static By partiallinkText(String partiallinkText, String desc) {
        return new By(org.openqa.selenium.By.partialLinkText(partiallinkText), desc);
    }
    public static By name(String name, String desc) {
        return new By(org.openqa.selenium.By.name(name), desc);
    }
    public static By tagName(String tagName, String desc) {
        return new By(org.openqa.selenium.By.tagName(tagName), desc);
    }
    public static By xpath(String xpathExpression, String desc){
            return new By(org.openqa.selenium.By.tagName(xpathExpression), desc);
    }

    public static By cssSelector(String cssSelector, String desc){
        return new By(org.openqa.selenium.By.cssSelector(cssSelector), desc);
    }
    @Override
    public List<WebElement> findElements(SearchContext context) {
        return null;
    }

    public int hashCode(){
        return  this.by.hashCode();
    }
    public String toString(){

return TextUtil.getElementFormattedText(this.by, this.desc);
    }
    public boolean equals(Object o){
        return this.equals(o);
    }
    public org.openqa.selenium.By getBy(){
        return this.by;
    }
    public String getDesc(){
        return this.desc;
    }
}


