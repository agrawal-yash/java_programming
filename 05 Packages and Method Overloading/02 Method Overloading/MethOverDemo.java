class MethOver {
    int add(int x, int y)
    {
            return(x+y); 
    } 

    double add(int x, double y)
    {
         double z = (double)x;
            return(y+z); 
    } 

    double add(double x, int y)
    { 
        double z = (double)y; 
            return(x+z); 
    } 

    double add(double x, double y)
    {
            return(x+y); 
    } 
    
} 

class MethOverDemo { 

        public static void main(String[] args) {
        MethOver obj = new MethOver(); 
        System.out.println("Addition is: "+(obj.add(4,5)));
        System.out.println("Addition is: "+(obj.add(4,5.5)));
        System.out.println("Addition is: "+(obj.add(4.5,5)));
        System.out.println("Addition is: "+(obj.add(4.5,5.5)));
        }
}

