import java.util.*; 

class InputProg
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any two numbers: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = a+b;
        System.out.println("Addition is: "+c);
    }
}