package com.pru.page;

public class SeleniumAssertion extends AbstractUiAssertion{

    private static AbstractUiAssertion instance=null;

    public SeleniumAssertion(){
        this.assertionType=AssertionType.HARD;
    }
    public  static AbstractUiAssertion getInstance(){
        if (instance==null){
            instance=new SeleniumAssertion();
        }
        return instance;
    }
}
