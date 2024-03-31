import java.util.*; 
// import java.lang.Math; 

class Armstrong { 

    static int power(int N, int P)
    {
        int pow = 1;
        for (int i = 1; i <= P; i++)
            pow *= N;
        return pow;
    }

    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in); 
        int dig, count = 0, sum = 0;  
        System.out.print("Enter a number to check if it is an Armstrong number: "); 
        int num = scn.nextInt(); 
        int temp = num;  
        
        do{
            num = num/10; 
            count++; 
        } while (num != 0); 

        // System.out.println("count "+count);

        num = temp; 
        // System.out.println("num "+num);
        // System.out.println("temp "+temp);

        do
        {
            dig = num%10; 
            sum = sum + power(dig,count);  
            num = num/10; 
            // System.out.println();
            // System.out.println("num "+num); 
            // System.out.println("dig "+dig); 
            // System.out.println("sum "+sum); 

        } while(num != 0); 

        if (sum == temp) 
        {
            System.out.println("The given number "+temp+" is an Armstrong number.");
        }
        else 
            System.out.println("The given number "+temp+" is not an Armstrong number.");

    }
}
