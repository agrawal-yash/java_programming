import java.util.Scanner;

public class arrayinput {
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in); 
        int i, j; 
        System.out.println("Enter the size of the array:"); 

        int size = input.nextInt(); 

        int a[] = new int[size]; 

        System.out.println("Enter the array elements:");  

        for(i=0; i<size; i++)
        {
            a[i] = input.nextInt(); 

        } 

        System.out.println("Your array is: ");  

        for(i=0; i<size; i++)
        {
            System.out.println(a[i]);

        }  
    }
}
