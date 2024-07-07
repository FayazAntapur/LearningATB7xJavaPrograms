package ex_singletonclass;

public class Browser {

    // create private variable of class name
    private static Browser browser;

    // create private constructor
    private Browser(){}

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
}
