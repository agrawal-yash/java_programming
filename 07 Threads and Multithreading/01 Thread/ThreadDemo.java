// creating Threads using the thread class

class A extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
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
		for(int j=11;j<=20;j++)
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
		for(int k=21;k<=30;k++)
		{
			System.out.println("\t From Thread C : Value of k is = "+k);
		}
		System.out.println("\t Exit From Thread C ");
	}
}

class ThreadDemo
{
	public static void main(String args[])
	{
		A a=new A();
		B b=new B();
		C c=new C();

		a.start();
		b.start();
		c.start();
	}
}