//WAP to check whether the given number is even or odd 
import java.util.*;
class Evenodd 
{
    public static void main(String args[])
    {
        Scanner input =new Scanner(System.in); 
        System.out.println("Enter any number to check for even or odd: ");
        int num = input.nextInt(); 
        if(num%2 == 0)
            System.out.println("The entered number "+num+" is an even number"); 
        else
            System.out.println("The entered number "+num+" is an odd number"); 
            
    }
}