//WAP to display the minimum among three numbers 
import java.util.*; 

class Minimum 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the three numbers to find minimum among them: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt(); 

        if(n1 < n2)
        {
            if(n1<n3)
                System.out.println(n1+" is the minimum number."); 
            else 
                System.out.println(n3+" is the minimum number."); 

        } 

        else
        {       
            if(n2<n3)
                System.out.println(n2+ " is the minimum number.");
            else 
            { 
                System.out.println(n3+" is the minimum number. ");
            } 
        }
    }
}