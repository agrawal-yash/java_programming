//WAP to display the maximum number among three numbers  
import java.util.*;
class Maxnum 
{
    public static void main(String args[])
    {
        Scanner input =new Scanner(System.in); 
        System.out.println("Enter the three numbers to find the maximum among them: ");
        int n1 = input.nextInt(); 
        int n2 = input.nextInt(); 
        int n3 = input.nextInt(); 
        
        if(n1 > n2)
        {
            if(n1>n3)
                System.out.println(n1+" is the maximum number."); 
            else 
                System.out.println(n3+" is the maximum number."); 

        }
        else
        {       
            if(n2>n3)
                System.out.println(n2+ " is the maximum number.");
            else 
            { 
                System.out.println(n3+" is the maximum number. ");
            } 
        }
    }
}