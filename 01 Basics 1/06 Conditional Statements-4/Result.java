//WAP to display the result of a student by getting the marks of five subjects from user  
import java.util.*;
class Result 
{
    public static void main(String args[])
    {
        Scanner input =new Scanner(System.in); 
        System.out.println("Enter marks of student in five subjects: ");
        int s1 = input.nextInt(); 
        int s2 = input.nextInt(); 
        int s3 = input.nextInt(); 
        int s4 = input.nextInt(); 
        int s5 = input.nextInt(); 
        int total = s1 + s2 + s3 + s4 + s5; 
        System.out.println("Total marks obtained by student: "+total);
        float avg = total/5;
        System.out.println("Average marks obtained by student: "+avg); 

        if(avg >= 70)
            System.out.println("Student has achieved Distinction!");
        else if(avg>=60 && avg<70)
            System.out.println("Student has achieved First Class!"); 
        else if(avg>=50 && avg<60)
            System.out.println("Student has achieved Second Class!");
        else if(avg>=40 && avg<50)
            System.out.println("Student has achieved Pass Class!"); 
        else
            System.out.println("Student has Failed!");
    }
}