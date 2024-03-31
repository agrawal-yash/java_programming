import java.util.*; 

class A {
    Scanner scn = new Scanner(System.in); 
    int a, b, c; 

    void getdata()
    {
        System.out.println("Enter the values of a, b and c"); 
        a= scn.nextInt();
        b= scn.nextInt();
        c= scn.nextInt(); 

        System.out.println("The user entered values are: "+a+", "+b+" and "+c+".");
    }
} 

class B extends A 
{
    void total()
    {
        int sum = a+b+c; 
        System.out.println("Total of the three numbers is: "+sum);
    } 
}

class C extends B  
{
    void average()
    { 
        double avg = (double)(a+b+c)/3; 
        System.out.println("Average of the three numbers is: "+avg);
    } 
    B objc = new B(); 
}

public class MultiIn {
    public static void main(String[] args) { 
        C objc = new C(); 
        objc.getdata();
        objc.total(); 
        objc.average();

    }
}
