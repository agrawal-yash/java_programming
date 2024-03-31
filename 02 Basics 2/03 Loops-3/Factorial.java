import java.util.*;

class Factorial {
    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in); 
        System.out.println("Enter a number to calculate its factorial: "); 
        int num = scn.nextInt(); 
        int i, fact = 1; 
        for(i=1; i<=num; i++)
        {
            fact = fact*i;
        }
        System.out.println("Factorial of "+num+" is "+fact); 
    }
}
