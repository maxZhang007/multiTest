import java.security.PrivateKey;

public class MyThread extends Thread{

    private int i =5;

    private int j = 7;
//    public MyThread(String name) {
//        this.setName(name);
//    }

    public void run() {
        super.run();
            i--;
            this.getPriority();
            
            System.out.println("calculate by " + Thread.currentThread().getName() + " count= " + i);
            System.out.println("calculate by " + Thread.currentThread().getId() + " count= " + i);
//            currentThread().isInterrupted();
    }


}
