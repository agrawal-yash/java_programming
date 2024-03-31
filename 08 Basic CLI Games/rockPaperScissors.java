import java.util.*;

public class rockPaperScissors {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int comp = rand.nextInt(3);
        

        
        System.out.print("Enter 0 for rock, 1 for paper, 2 for scissors: ");
        int user = input.nextInt();
        

        if(user <3){
            switch(comp) {
                case 0 -> System.out.println("Computer entered Rock");
                case 1 -> System.out.println("Computer entered Paper");
                case 2 -> System.out.println("Computer entered Scissors");
            }

            switch(user) {
                case 0 -> System.out.println("You entered Rock");
                case 1 -> System.out.println("You entered Paper");
                case 2 -> System.out.println("You entered Scissors");
            }


            
            if (rps(comp,user)==comp) {
                System.out.println("You Lose!");
            }
            else if(rps(comp,user)==user)
            {
                System.out.println("You Win!");
            }
            else if(rps(comp,user)==0)
            {
                System.out.println("Game Draw!");
            }
        }
        else{
            System.out.println("Please enter valid option between 0, 1 & 2!!");
        }

        input.close();


    }

    public static int rps(int p1, int p2){

        if(p1 == 0 && p2 == 1)
        {
            return p2;
        } 
        else if(p1 == 0 && p2 == 2)
        {
            return p1;
        }
        else if(p1 == 0 && p2 == 0)
        {
            return 0;
        }
        else if(p1 == 1 && p2 == 0)
        {
            return p1;
        } 
        else if(p1 == 1 && p2 == 1)
        {
            return 0;
        }
        else if(p1 == 1 && p2 == 2)
        {
            return p2;
        }
        else if(p1 == 2 && p2 == 0)
        {
            return p2;
        } 
        else if(p1 == 2 && p2 == 1)
        {
            return p1;
        }
        else if(p1 == 2 && p2 == 2)
        {
            return 0;
        }
        else return 0;
    }

}


