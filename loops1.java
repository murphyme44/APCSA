//Michael Murphy
//loops1.java
import java.util.Scanner;
import java.util.Random;
public class loops1 {
    public static void main(String [] args){
        int x = 0;
        while(x <= 50){
            System.out.println(x);
            x = x + 1;
        }
        int y = 0;
        while(y <= 100){
            System.out.println(y);
            y = y + 5;
        }
        Scanner input = new Scanner(System.in);
        System.out.println("Guess a number 1-5 ");
        int answer = input.nextInt();
        int num = (int)(Math.random()*5)+1;
        while(answer != num){
            System.out.println("Guess a number 1-5 ");
            answer = input.nextInt();

        }

    }
}
