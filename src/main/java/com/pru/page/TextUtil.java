package com.pru.page;

import org.openqa.selenium.By;

public class TextUtil {
    public static String getElementFormattedText(By locator, String locatorDescription){
        return locatorDescription != null&&!"".equals(locatorDescription)?"'"+locatorDescription+"'["+locator.toString()+"]":"["+locator.toString()+"]";

    }

}
