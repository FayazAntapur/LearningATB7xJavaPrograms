package ex_singletonclass;

import java.io.Serializable;

public class Browser implements Cloneable, Serializable {

    // create private variable of class name
    private volatile static Browser browser;

    // create private constructor
    private Browser(){
        if(browser!=null){
            throw new IllegalArgumentException("Object already exists");
        }
    }

    // create getter of object creation
    public static Browser getInstance(){

        //normal execution
        /* if(browser==null){
            browser = new Browser();
        }*/
        if (browser==null){

            synchronized (Browser.class){
                if (browser==null){
                    browser = new Browser();
                }
            }
        }
        return browser;
    }

    public void display(){
        System.out.println("display info");
    }
    @Override
    public Object clone(){
        throw new IllegalArgumentException("Not able to clone");
    }

    Object readResolve(){
        return getInstance();
    }
}
