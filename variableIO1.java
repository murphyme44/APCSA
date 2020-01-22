//Michael Murphy
import java.util.Scanner;
public class variableIO1 {
    public static void main(String[] args){
        Scanner kboard= new Scanner(System.in);
        System.out.println("Please enter your first name");
        String firstname = kboard.nextLine();
        System.out.println("Please enter your last name");
        String lastname = kboard.nextLine();
        System.out.println("Please enter your age");
        int age = kboard.nextInt();
        System.out.println("Please enter your gpa");
        double gpa = kboard.nextDouble();
        System.out.println("My first name is " + firstname);
        System.out.println("My last name is " + lastname);
        System.out.println("I am currently " + age + " years old");
        System.out.println("my GPA is " + gpa);
        if (gpa >= 4) {
            System.out.println("Nice work!");
        }
        else{
            System.out.println("Hit the books!");
        }
        System.out.println("GO BUCS!");
        kboard.close();



        /* Create a scanner object kboard */


        /* Write (two) statements that will prompt a user
        to enter their first name & last name and store as variables */


        /* Write (two) statements that will prompt a user to enter their age, and GPA and store as variables */

        /* Write (four) messages using all of the variables created */

        /* Write an if statement, with a messages providing positive feedback for a good GPA, encouragement for a low GPA, and a nice message regardless of GPA */

        /* Close the scanner object */



    }
}
