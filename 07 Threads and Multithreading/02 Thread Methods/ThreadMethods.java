// Use of yield(), stop() and sleep() methods

/*The yield() method is used to hint the Java Virtual Machine (JVM) 
that the current thread is willing to yield its current processor time to allow 
other threads to run. 
It's a way to suggest that the current thread is not doing anything critical 
and can give up its CPU time.*/

class A extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			if(i==1)
			A.yield();
			System.out.println("\t From Thread A : Value of i is = "+i);
		}
		System.out.println("\t Exit From Thread A ");	
	}
}

class B extends Thread
{
	public void run()
	{
		for(int j=11;j<=20;j++)
		{
			System.out.println("\t From Thread B : Value of j is = "+j);
			if(j==13)
			stop();			
		}
		System.out.println("\t Exit From Thread B ");
	}
}

class C extends Thread
{
	public void run()
	{
		for(int k=21;k<=30;k++)
		{
			System.out.println("\t From Thread C : Value of k is = "+k);
			if(k==22)
			try{
				sleep(1000);
			}
			catch(Exception e)
			{
			}

		}
		System.out.println("\t Exit From Thread C ");
	}
}

class ThreadMethods
{
	public static void main(String args[])
	{
		A a=new A();
		B b=new B();
		C c=new C();

		System.out.println("Start Thread A ");
		a.start();
		System.out.println("Start Thread B ");
		b.start();
		System.out.println("Start Thread C ");
		c.start();
	}
}