package Expt_5;

class MyRunnable implements Runnable
{
    private String tn;

    public MyRunnable(String tn)
    {
        this.tn = tn;
    }

    public void run()
    {
        for (int i = 1; i <= 3; i++)
        {
            System.out.println(tn + " is running: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(tn + " interrupted.");
            }
        }
    }
}

class PriorityThread extends Thread
{
    private String tn;

    public PriorityThread(String name)
    {
        this.tn = name;
        setName(name);
    }

    public void run()
    {
        for (int i = 1; i <= 3; i++)
        {
            System.out.println(getName() + " (Priority: " + getPriority() + ") is running: " + i);
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                System.out.println(getName() + " interrupted.");
            }
        }
    }
}
