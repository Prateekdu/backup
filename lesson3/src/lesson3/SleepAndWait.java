package lesson3;

public class SleepAndWait {
	private static Object LOCK=new Object();
	public static void main(String[] args)throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("Thraed"+Thread.currentThread().getName()+"is woken after sleeping for 1 second");
synchronized(LOCK)
{
    LOCK.wait(2000);
    System.out.println("Object '" + LOCK + "' is woken after" + " waiting for 1 second");

	}
	}

}
