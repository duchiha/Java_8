
//
//Java lets you create a thread one of two ways:
//By implementing the Runnableinterface.
//By extending the Thread.

//The second way to create a thread is to create a new class that extends Thread, 
//then override the run() method and then to create an instance of that class.
//The run() method is what is executed by the thread after you call start(). 


class MyThread extends Thread {
	public void run() {
		try {
			sleep(1000);
		} catch (InterruptedException ex) {
			ex.printStackTrace();
			// ignore the InterruptedException - this is perhaps the one of the
			// very few of the exceptions in Java which is acceptable to ignore
		}
		System.out.println("In run(); thread name is: " + Thread.currentThread().getName());
	}

	public static void main(String args[]) {
		Thread myThread = new MyThread();
		myThread.start();
		System.out.println("In main(); thread name: " + Thread.currentThread().getName());
	}
}
