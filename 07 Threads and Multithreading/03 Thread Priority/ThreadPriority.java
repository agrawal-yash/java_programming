// Thread Priority

class A extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("\t From Thread A : Value of i is = "+i);
		}
		System.out.println("\t Exit From Thread A ");	
	}
}

class B extends Thread
{
	public void run()
	{
		for(int j=11;j<=15;j++)
		{
			System.out.println("\t From Thread B : Value of j is = "+j);
			
		}
		System.out.println("\t Exit From Thread B ");
	}
}

class C extends Thread
{
	public void run()
	{
		for(int k=21;k<=25;k++)
		{
			System.out.println("\t From Thread C : Value of k is = "+k);
			
		}
		System.out.println("\t Exit From Thread C ");
	}
}

class ThreadPriority
{
	public static void main(String args[])
	{
		A a=new A();
		B b=new B();
		C c=new C();

		c.setPriority(Thread.MAX_PRIORITY);
		b.setPriority(Thread.MIN_PRIORITY);
		a.setPriority(Thread.NORM_PRIORITY);

		System.out.println("Start Thread A ");
		a.start();
		System.out.println("Start Thread B ");
		b.start();
		System.out.println("Start Thread C ");
		c.start();

		System.out.println("End of Main Thread ");
	}
}