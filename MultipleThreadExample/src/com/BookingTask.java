package com;
class Booking implements Runnable
{
	int avl=1;
	@Override
	public synchronized void run() {
		// TODO Auto-generated method stub
		Thread t=Thread.currentThread();
		String name=t.getName();
		for(int i=0;i<10;i++)
		{
			try
			{
				System.out.println(name+" "+i);
				Thread.sleep(500);
				if(i==5 && name.equals("Raj"))
				{
					wait();
				}
				if(i==4  && name.equals("jerry"))
				{
					notify();
					wait();
				}
			}
			catch(Exception e)
			{
				
			}
		}
	}
	
}
public class BookingTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Booking b1=new Booking();
//		Booking b2=new Booking();
//		Booking b3=new Booking();
		Thread t1= new Thread(b1);
		Thread t2= new Thread(b1);
		Thread t3= new Thread(b1);
		t1.setName("Raj");
		t2.setName("jerry");
		t3.setName("prateek");
		t1.start();
		t2.start();
		t3.start();

	}

}
