import java.util.*;

class Palindrome {
    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in); 
        int dig, rev = 0;  
        System.out.print("Enter a number to check if it is palindrome: "); 
        int num = scn.nextInt(); 
        int temp = num; 
        do
        {
            dig = num%10; 
            rev = (rev*10)+dig; 
            num = num/10; 
        } while(num != 0); 

        if (rev == temp) 
        {
            System.out.println("The given number "+temp+" is a Palindrome.");
        }
        else 
            System.out.println("The given number "+temp+" is not a Palindrome.");

    }
}
