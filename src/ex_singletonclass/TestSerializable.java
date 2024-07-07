package ex_singletonclass;

import java.io.*;

public class TestSerializable {

    public static void main(String[] args) {

         Browser browser1 = Browser.getInstance();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("fayaz.txt"));
            objectOutputStream.writeObject(browser1);
            objectOutputStream.close();

            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("fayaz.txt"));
            Browser browser2 = (Browser)objectInputStream.readObject();
            objectInputStream.close();

            System.out.println(browser1.hashCode());
            System.out.println(browser2.hashCode());

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
