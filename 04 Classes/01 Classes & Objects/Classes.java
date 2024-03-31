import java.util.*; 

class Calculator {
    int add(int a,int b)
    {
        return (a+b); 
    } 

    int sub(int a,int b)
    {
        return (a-b); 
    }

    int mul(int a,int b)
    {
        return (a*b); 
    }

    float div(int a,int b)
    {
        return (a/b); 
    }
    
}

class ClassDemo {
    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in); 
        System.out.println("Enter any two numbers:");
        int a = scn.nextInt(); 
        int b = scn.nextInt(); 

        Calculator calc = new Calculator(); 
        System.out.println("Addition is: "+calc.add(a,b));
        System.out.println("Subtraction is: "+calc.sub(a,b));
        System.out.println("Multiplication is: "+calc.mul(a,b));
        System.out.println("Division is: "+calc.div(a,b));
    } 
}