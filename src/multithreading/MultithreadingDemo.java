package multithreading;

public class MultithreadingDemo {

    public static void main(String[] args) throws InterruptedException {

//        System.out.println(Thread.currentThread().getName());

        Thread t1 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("hii");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        t1.start();

        t1.join();

        Thread t2 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("hello");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        t2.start();

//        System.out.println("Exit");
    }
}

/**
 * A thread state. A thread can be in one of the following states:
 * NEW
 * A thread that has not yet started is in this state.
 * RUNNABLE
 * A thread executing in the Java virtual machine is in this state.
 * BLOCKED
 * A thread that is blocked waiting for a monitor lock is in this state.
 * WAITING
 * A thread that is waiting indefinitely for another thread to perform a particular action is in this state.
 * TIMED_WAITING
 * A thread that is waiting for another thread to perform an action for up to a specified waiting time is in this state.
 * TERMINATED
 * A thread that has exited is in this state.
 */