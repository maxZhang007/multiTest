public class TestMain {
    public static void main(String[] args){
//        MyThread a = new MyThread("A");
//        MyThread b = new MyThread("B");
//        MyThread c = new MyThread("C");

        long beginTime = System.currentTimeMillis();

        System.out.println(beginTime);

        MyThread myThread = new MyThread();
        Thread a = new Thread(myThread, "A");
        Thread b = new Thread(myThread, "B");
        Thread c = new Thread(myThread, "C");
        Thread d = new Thread(myThread, "D");
        Thread e = new Thread(myThread, "E");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e1) {
            e1.printStackTrace();
        }
        a.start();
        b.start();
        c.start();
        d.start();
        e.start();

        try {
            a.join();
            b.join();
            c.join();
            d.join();
            e.join();
        } catch (InterruptedException e1) {
            e1.printStackTrace();
        }

        long endTime = System.currentTimeMillis();

        System.out.println(endTime);
    }
}
