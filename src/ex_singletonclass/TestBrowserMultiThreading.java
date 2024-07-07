package ex_singletonclass;

public class TestBrowserMultiThreading {

    public static void main(String[] args) {

        Runnable task = () -> {
            Browser.getInstance().display();
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);
        Thread t3 = new Thread(task);
        Thread t4 = new Thread(task);
        Thread t5 = new Thread(task);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
            t5.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
