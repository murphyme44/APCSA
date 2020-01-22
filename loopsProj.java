//Michael Murphy
//loopsProj
import java.util.Scanner;
public class loopsProj {
    public static void main(String [] args){
        String pin = "a123";//the correct pin
        int counter = 10;//10 attempts
        Scanner input = new Scanner(System.in);
        while(counter > 0){//makes sure they have not guessed the pin more than 10 times
            System.out.println("Attempts = " + counter);//prints the attempts the user has left
            System.out.println("Enter a 4 character pin ");
            String guess = input.nextLine();
            if(guess.equals(pin)){
                System.out.println("Access to te vault has been granted!");
                counter = -1;//stops the loop
            }
            else{
                counter -= 1;//takes one attempt away from the attempt counter
                System.out.println("WRONG");
            }
        }
    }
}
