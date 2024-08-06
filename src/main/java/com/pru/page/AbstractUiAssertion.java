package com.pru.page;

public abstract class AbstractUiAssertion implements UIAssertion {
    protected AssertionType assertionType = null;
    protected SoftAssert softAssert = null;
    public AbstractUiAssertion(){

    }
    public  SoftAssert getSoftAssert(){
        return this.softAssert;
    }


}
