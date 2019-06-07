
//Java lets you create a thread one of two ways:
//By implementing the Runnableinterface.
//By extending the Thread.
//The easiest way to create a thread is to create a class that implements the Runnable interface.
//To implement Runnable interface, a class need only implement a single method called run( )

class RunnableImpl implements Runnable {
    public void run() {
        System.out.println("In run(); thread name is: " +
                Thread.currentThread().getName());
    }

    public static void main(String args[]) throws Exception {
        Thread myThread = new Thread(new RunnableImpl());
        myThread.start();
        System.out.println("In main(); thread name is: " +
                Thread.currentThread().getName());
    }
}
