import java.util.*;

class Addition {
    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in); 
        System.out.println("Enter a number to calculate sum of first n natural numbers:"); 
        int num = scn.nextInt(); 
        int i, sum = 0; 
        for(i=1; i<=num; i++)
        {
            sum = sum+i;
        }
        System.out.println("Sum of first "+num+" natural numbers is "+sum); 
    }
}
