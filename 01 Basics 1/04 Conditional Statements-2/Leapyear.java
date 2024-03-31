//WAP to check whether the given year is a Leap year or not  
import java.util.*;
class Leapyear 
{
    public static void main(String args[])
    {
        Scanner input =new Scanner(System.in); 
        System.out.println("Enter an year to check for leap year: ");
        int year = input.nextInt(); 
        if(year%400 == 0 || year%100 != 0 && year%4 ==0)
            System.out.println("The entered year "+year+" is a leap year"); 
        else
            System.out.println("The entered year "+year+" is not a leap year"); 
            
    }
}