package com.pru.page;

public enum AssertionType {

    HARD("hard Asserting"),
    SOFT("soft Asserting");

     private final String text;
    AssertionType(String text) {
        this.text=text;
    }
    public String toString(){
        return this.text;
    }
}
