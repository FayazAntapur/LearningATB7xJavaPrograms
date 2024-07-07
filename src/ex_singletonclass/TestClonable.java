package ex_singletonclass;

public class TestClonable {

    public static void main(String[] args) {

        Browser browser1 = Browser.getInstance();
        Browser browser2 = (Browser) browser1.clone();

        System.out.println(browser1.hashCode());
        System.out.println(browser2.hashCode());
    }
}
