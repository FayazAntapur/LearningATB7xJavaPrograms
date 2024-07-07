package ex_singletonclass;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class TestRef {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        Browser browser1 = Browser.getInstance();
        Browser browser2 = null;

        Constructor<Browser> constructor = Browser.class.getDeclaredConstructor();

        constructor.setAccessible(true);
        browser2 = constructor.newInstance();

        System.out.println(browser1.hashCode());
        System.out.println(browser2.hashCode());

    }
}
