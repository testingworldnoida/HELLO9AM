package multithreading;

public class MultiThread extends Thread {
	
	public void run()
	{
		System.out.println("Thread is Running..........");
		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		MultiThread t1 = new MultiThread(); 
		t1.start();
		MultiThread t2 = new MultiThread();
		t2.start();
		
	}
	
	

}
