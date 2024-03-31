import java.util.*; 

public class AddMatrix {
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in); 
        int a[][] = new int[3][3]; 
        int b[][] = new int[3][3]; 
        int i, j; 

        System.out.println("Enter Matrix A:");

        for(i = 0; i<3; i++)
        {
            for(j=0; j<3; j++)
            {
                a[i][j]=input.nextInt();
            }
        } 

        System.out.println("Enter Matrix B:");

        for(i = 0; i<3; i++)
        {
            for(j=0; j<3; j++)
            {
                b[i][j]=input.nextInt();
            }
        } 

        System.out.println("Entered matrix A is: "); 

        for(i = 0; i<3; i++)
        {
            for(j=0; j<3; j++)
            {
                System.out.print(a[i][j]+" ");
            } 
            System.out.println();
        } 

        System.out.println("Entered matrix B is: "); 

        for(i = 0; i<3; i++)
        {
            for(j=0; j<3; j++)
            {
                System.out.print(b[i][j]+" ");
            } 
            System.out.println();
        } 

        int c[][] = new int[3][3]; 
        
        for(i=0; i<3; i++)
        {
            for(j=0; j<3; j++)
            {
                c[i][j] = a[i][j] + b[i][j]; 
            }
        } 

        System.out.println("Addition of both matrices is:"); 

        for(i = 0; i<3; i++)
        {
            for(j=0; j<3; j++)
            {
                System.out.print(c[i][j]+" ");
            } 
            System.out.println();
        } 


    }
}
