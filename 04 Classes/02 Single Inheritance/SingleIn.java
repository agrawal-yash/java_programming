import java.util.*; 



class A {
    Scanner scn = new Scanner(System.in); 
    int a, b; 

    void getdata()
    {
        System.out.println("Enter the values of a and b"); 
        a= scn.nextInt();
        b= scn.nextInt();
    }
}

class B extends A 
{
    void add()
    {
        System.out.println("Addition of A and B is:"+(a+b));
    } 

    void sub()
    {
        System.out.println("Subtraction of A and B is:"+(a-b));
    }

} 

class SingleIn
{
    public static void main(String[] args) { 
        B calc = new B(); 
        calc.getdata(); 
        calc.add();
        calc.sub();
    } 
}