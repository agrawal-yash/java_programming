public class ExceptionThere 
{
    public static void main(String[] args) {
        int num = 10;
        int deno = 0;
        try {
            int result = num / deno;
            System.out.println("Result: "+result);
            System.out.println("inside try");
            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception is: "+e);
            System.out.println("inside catch");
        }

        finally{
            System.out.println("finally");
        }


        System.out.println("rest of code "+(num+deno));
    }
}