//Use of throws 

class ThrowsDemo
{
	static void divide() throws ArithmeticException
	{
		int x=11,y=0,z;
		z=x/y;
	}
	
	public static void main(String args[])
	{
		try{
			divide();
		}
		catch(ArithmeticException e)
		{
			System.out.println("Caught the Exception using throws"+e);
		}
	}
}
	