package Expt_5;

public class MCA5 {
    public static void main(String[] args) {

        System.out.println("=== Runnable Interface Demo ===");
        Thread t1 = new Thread(new MyRunnable("RunnableThread-1"));
        Thread t2 = new Thread(new MyRunnable("RunnableThread-2"));
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        System.out.println("\n=== Thread Priority Demo ===");
        PriorityThread pt1 = new PriorityThread("LowPriority");
        PriorityThread pt2 = new PriorityThread("HighPriority");
        PriorityThread pt3 = new PriorityThread("NormalPriority");
        pt1.setPriority(Thread.MIN_PRIORITY);
        pt2.setPriority(Thread.MAX_PRIORITY);
        pt3.setPriority(Thread.NORM_PRIORITY);
        pt1.start();
        pt2.start();
        pt3.start();
    }
}
