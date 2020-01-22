//Michael Murphy
//loops2.java
import java.util.Random;
import java.util.Scanner;
public class loops2 {
    public static void main(String [] args){
        for(int i = 0; i < 11; i++){
            System.out.println(i);
        }
        for(int i = 10; i > -1; i--){
            System.out.println(i);
        }
        for(int i = 0; i < 101; i+=10){
            System.out.println(i);
        }
        for(int i = 0; i < 10; i++){
            System.out.println((int)(Math.random()*100));
        }
        String a = "*";
        for(int i = 0; i < 20; i++){
            System.out.println(a);
            a += "*";
        }
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer ");
        int x = input.nextInt();
        for(int i = x; i < 101; i++){
            System.out.println(i);
        }
        System.out.println("Enter your name ");
        String y = input.next();
        System.out.println("How many times do you want your name to be printed? ");
        int z = input.nextInt();
        for(int i = 0; i < z; i++){
            System.out.println(y);
        }
    }
}
