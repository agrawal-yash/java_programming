import mypack.Calculator;
import mypack.MyName;
import mypack.NewCalc; 

public class PackDemo {
    public static void main(String[] args) {
        Calculator calci = new Calculator(); 
        calci.add(5,9); 
        calci.sub(5,7); 
        calci.mul(9,4); 
        calci.mul(10,2); 
        calci.square(67);  
        calci.cube(5); 

        MyName name = new MyName();
        name.FirstName(); 
        name.LastName(); 

        NewCalc newcalci = new NewCalc();
        newcalci.Fact(5);
        newcalci.Reverse(13267);
    }
}
