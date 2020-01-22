//Michael Murphy
//ifElse1.java
import java.util.Scanner;
public class ifElse1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number. ");
        int num1 = scan.nextInt();
        System.out.println("Enter the second number. ");
        int num2 = scan.nextInt();
        System.out.println("Enter the third number. ");
        int num3 = scan.nextInt();
        if (num1 == 5){
            System.out.println("The first number is equal to 5.");
        }
        if (num2 == 5){
            System.out.println("The second number is equal to 5.");
        }
        if (num3 == 5){
            System.out.println("The third number is equal to 5.");
        }
        else{
            System.out.println("The third number does not equal 5.");
        }
        if (num1 > num2 && num1 > num3){
            System.out.println("The first number is the largest.");
        }
        if (num2 > num1 && num2 > num3){
            System.out.println("The second number is the largest.");
        }
        if (num3 > num1 && num3 > num2){
            System.out.println("The third number is the largest.");
        }
        if (num1 < num2 && num1 < num3){
            System.out.println("The first number is the smallest.");
        }
        if (num2 < num1 && num2 < num3){
            System.out.println("The first number is the smallest.");
        }
        if (num3 < num1 && num3 < num2){
            System.out.println("The first number is the smallest.");
        }
        if (num1 > num2 && num1 > num3){
            if(num2 > num3){
                System.out.println(num1);
                System.out.println(num2);
                System.out.println(num3);
            }
            else{
                System.out.println(num1);
                System.out.println(num3);
                System.out.println(num2);
            }
        }
        if (num2 > num1 && num2 > num3){
            if(num1 > num3){
                System.out.println(num2);
                System.out.println(num1);
                System.out.println(num3);
            }
            else{
                System.out.println(num2);
                System.out.println(num3);
                System.out.println(num1);
            }
        }
        if (num3 > num1 && num3 > num2){
            if(num2 > num1){
                System.out.println(num3);
                System.out.println(num2);
                System.out.println(num1);
            }
            else{
                System.out.println(num3);
                System.out.println(num1);
                System.out.println(num2);
            }
        }
    }
}
