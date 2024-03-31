import java.util.*;  

class bubble {
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in); 
        int i, j, temp=0; 
        System.out.println("Enter the size of the array:"); 

        int size = input.nextInt(); 

        int a[] = new int[size]; 

        System.out.println("Enter the array elements:");  

        for(i=0; i<size; i++)
        {
            a[i] = input.nextInt(); 

        } 

        System.out.println("Your array is: ");  

        for(i=0; i<size; i++)
        {
            System.out.println(a[i]);

        } 

        for(i=0; i<size; i++)
        {
            for(j = i+1; j<size; j++)
            {
                if(a[i]>a[j])
                {
                    temp = a[i];
                    a[i] = a[j]; 
                    a[j] = temp; 
                }
            }
        } 

        System.out.println("The sorted array is: "); 
        for(i=0; i<size;i++)
        {
            System.out.println(a[i]);
        }

    }
    
}
