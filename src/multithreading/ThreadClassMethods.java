package multithreading;

public class ThreadClassMethods {


    public static void main(String[] args) {

//        Thread t1 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("in run");
//            }
//        });
//        t1.setName("test");
//        System.out.println(t1.getName());

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("in t2");
                System.out.println(Thread.currentThread().isAlive());
            }
        });

        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("in t3");
            }
        });

        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);
        t2.start();
        t3.start();

//        t2.setDaemon(true);
//        System.out.println(t2.isDaemon());
//        System.out.println(Thread.currentThread().isDaemon());
    }

}
