//Michael Murphy
import java.util.Scanner;
import java.util.Random;
public class rps {
    public static void main(String[] args){
        int compmove;
        String playermove = "";
        String counter = "";
        Scanner input = new Scanner(System.in);
        //Thi welcomes the user
        System.out.println("Welcome to rock, paper, scissors.");
        String enter = input.nextLine();//press enter to continue to game
        if(enter.equals("")){
            System.out.println("Begin Game");
        }
        //"q" quits out of while loop
        while(!playermove.equals("q")) {
            int generator = (int) (Math.random() * 3) + 1;//randomly generates number 1-3 which represents rock paper and scissors
            //System.out.println(generator);
            compmove = generator;
            if (compmove == 1) {
                counter = "r";
            } else if (compmove == 2) {
                counter = "p";
            } else if (compmove == 3) {
                counter = "s";
            }
            System.out.println("Please choose r, p, or s. ");
            playermove = input.nextLine();
            System.out.println("The computer threw " + counter);//prints the computer's move
            //These lines of code determine if the user will win or lose
            if(playermove.equals("q")){
                return;
            }
            if (playermove.equals(counter)) {
                System.out.println("Tie!");
            } else if (playermove.equals("r")) {
                if (counter.equals("s"))
                    System.out.println("You win!");
                else {
                    System.out.println("You lose!");
                }

            } else if (playermove.equals("p")) {
                if (counter.equals("r"))
                    System.out.println("You win!");
                else {
                    System.out.println("You lose!");
                }
            } else if (playermove.equals("s")) {
                if (counter.equals("p"))
                    System.out.println("You win!");
                else {
                    System.out.println("You lose!");
                }
            }
            //playermove = input.next();

        }
    }
}
