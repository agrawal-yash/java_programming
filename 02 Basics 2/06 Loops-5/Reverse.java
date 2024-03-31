import java.util.*;

class Reverse {
    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in); 
        int dig, rev = 0;  
        System.out.print("Enter a number to reverse: "); 
        int num = scn.nextInt(); 
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
