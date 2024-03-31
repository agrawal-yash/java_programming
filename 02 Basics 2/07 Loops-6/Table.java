import java.util.*;

class Table {
    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in); 
        System.out.println("Enter a number to print its multiplication table"); 
        int num = scn.nextInt(); 
        int i = 1; 
        System.out.println("Multiplication Table of "+num+" is:"); 
        while (i<=10)
        {
            System.out.println(num+" * "+i+" = "+(num*i)); 
            i++; 
        }
    }
}
