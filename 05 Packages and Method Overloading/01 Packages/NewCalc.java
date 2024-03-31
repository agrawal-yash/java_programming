package mypack; 

public class NewCalc {
    public void Fact(int num)
        {
        int i, fact = 1; 
        for(i=1; i<=num; i++)
        {
           fact = fact*i;
        }
       System.out.println("Factorial of "+num+" is "+fact); 
    } 

    public void Reverse(int num)
    {
        int dig, rev = 0;  
        int temp = num; 
        do
        {
            dig = num%10; 
            rev = (rev*10)+dig; 
            num = num/10; 
        } while(num != 0); 
        System.out.println("Reverse of the given number "+temp+" is "+rev); 
    }
}
