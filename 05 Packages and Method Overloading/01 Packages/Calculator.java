package mypack; 

public class Calculator 
{ 
    public void add(int a, int b) 
    {
        System.out.println("Addition is: "+(a+b));
    }  

    public void sub(int a, int b) 
    {
        System.out.println("Subtraction is: "+(a-b));
    } 

    public void mul(int a, int b) 
    {
        System.out.println("Multiplication is: "+(a*b));
    } 

    public void div(int a, int b) 
    {
        System.out.println("Division is: "+(a/b));
    } 

    public void square(int a) 
    {
        System.out.println("Square is: "+(a*a));
    } 

    public void cube(int a) 
    {
        System.out.println("Cube is: "+(a*a*a));
    } 
} 