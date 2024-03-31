import java.util.*; 

public class Array2D {
    public static void main(String args[]) 
    {
        Scanner input = new Scanner(System.in); 
        System.out.println("Enter no. of rows:"); 
        int m = input.nextInt(); 
        System.out.println("Enter no. of columns:"); 
        int n = input.nextInt(); 


        int a[][] = new int[m][n]; 
        int i, j; 

        System.out.println("Enter a matrix: ");

        for(i = 0; i<m; i++)
        {
            for(j=0; j<n; j++)
            {
                a[i][j]=input.nextInt();
            }
        } 

        System.out.println("Entered matrix is: "); 

        for(i = 0; i<m; i++)
        {
            for(j=0; j<n; j++)
            {
                System.out.print(a[i][j]+" ");
            } 
            System.out.println();
        } 
    }
}
