//Michael Murphy
//arrayProjV2.java
import java.util.Scanner;
public class arrayProjV2 {


    static String[] space(String[] array) {
        String[] arr = new String[array.length];
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals("#")) {
                arr[i] = " ";
            } else {
                arr[i] = "x";
            }
        }
        return arr;
    }

    static void printArray(String[] arr) {
        for (String i : arr) {
            System.out.print(i);
        }
        System.out.println();
    }

    static boolean isSolved(String[] arr1, String[] arr2) {//replaces the #'s in the arrays with spaces
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i].equals("#")) {
                arr1[i] = " ";
            }
            if (arr2[i].equals("#")) {
                arr2[i] = " ";
            }
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }
        return true;
    }

    static boolean doesContain(String s, String[] arr){//method detecting if the guess is in the phrase
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(s)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] points = {100, 200, 300, 400, 500, 600, 700, 800, 900, 1000};//possible points a letter can be worth
        int userpoints = 0;//player points

        String p1 = "a holly jolly christmas";//first phrase
        String[] guessArray = {"a", "#", "h", "o", "l", "l", "y", "#", "j", "o", "l", "l", "y", "#", "c", "h", "r", "i", "s", "t", "m", "a", "s"};
        String[] userGuesses1 = space(guessArray);//replaces the x's with spaces
        String[] arr = new String[p1.length()];
        boolean p1Guessed = false;

        String p2 = "most valuable player";//second phrase
        String[] guessArray2 = {"m", "o", "s", "t", "#", "v", "a", "l", "u", "a", "b", "l", "e", "#", "p", "l", "a", "y", "e", "r"};
        String[] userGuesses2 = space(guessArray2);//replaces the x's with spaces
        String[] arr2 = new String[p2.length()];
        boolean p2Guessed = false;

        String p3 = "chicken nuggets";//third phrase
        String[] guessArray3 = {"c", "h", "i", "c", "k", "e", "n", "#", "n", "u", "g", "g", "e", "t", "s"};
        String[] userGuesses3 = space(guessArray3);//replaces the x's with spaces
        String[] arr3 = new String[p3.length()];
        boolean p3Guessed = false;


        Scanner scan = new Scanner(System.in);
        while(!p1Guessed &&!p2Guessed && !p3Guessed){
            while (!p1Guessed){//while loop for the first phrase
                printArray(userGuesses1);
                System.out.println("Would you like to Spin(1), Solve(2), or Quit(3) ");//asks user if they want to guess a letter solve or quit
                String x = scan.nextLine();//user input
                if (x.equals("1")) {//when they choose to spin
                    int random = (int) (Math.random() * (points.length));//randomly selects an amount of points from points array
                    System.out.println("Points Per Letter: " + points[random]);
                    printArray(userGuesses1);
                    System.out.println("User Points: " + userpoints);
                    System.out.println("\nGuess a letter!");
                    String y = scan.nextLine();
                    if(doesContain(y, guessArray)){//when a user guesses a letter that is in the phrase
//                        System.out.println(doesContain(y, guessArray));
                            for (int i = 0; i < guessArray.length; i++) {
                                if (guessArray[i].equals(y)) {
                                    userGuesses1[i] = y;
                                    p1Guessed = isSolved(guessArray, userGuesses1);
                                    userpoints += points[random];//adds points to player's points
                                    if(p1Guessed){
                                        System.out.println(p1);
                                        System.out.println("GAME TWO START:");
                                    }
                                }
                            }

                    }
                }

                else if(x.equals("2")){//when player chooses to solve
                    System.out.println("SOLVE");
                    System.out.println("Enter the phrase ");//asks to put in phrase
                    String z = scan.nextLine();//user input
                    if(z.equals(p1)){//when they get it correct
                        System.out.println("Good Job You Got it");
                        p1Guessed = true;
                        System.out.println(p1);
                        System.out.println("GAME TWO START:");
                    }
                    else{//when they get it wrong
                        System.out.println("Sorry That's not it ");
                        p1Guessed = true;
                        System.out.println(p1);
                        System.out.println("GAME TWO START:");
                    }
                }
                else if(x.equals("3")){//when the user chooses to quit
                    System.out.println("Thanks for playing!");
                    p1Guessed = true;//ends first game
                    p2Guessed = true;//ends second game
                    p3Guessed = true;//ends third game
                }
            }


            while(!p2Guessed){
                printArray(userGuesses2);
                System.out.println("Would you like to Spin(1), Solve(2), or Quit(3) ");
                String x = scan.nextLine();
                if (x.equals("1")) {
                    int random = (int) (Math.random() * (points.length));
                    System.out.println("Points Per Letter: " + points[random]);
                    printArray(userGuesses2);
                    System.out.println("User Points: " + userpoints);
                    System.out.println("\nGuess a letter!");
                    String y = scan.nextLine();
                    if(doesContain(y, guessArray2)){
//                        System.out.println(doesContain(y, guessArray2));
                        for (int i = 0; i < guessArray2.length; i++) {
                            if (guessArray2[i].equals(y)) {
                                userGuesses2[i] = y;
                                p2Guessed = isSolved(guessArray2, userGuesses2);
                                userpoints += points[random];
                            }
                        }
                    }
                }
                else if(x.equals("2")){
                    System.out.println("SOLVE");
                    System.out.println("Enter the phrase ");
                    String z = scan.nextLine();
                    if(z.equals(p2)){
                        System.out.println("Good Job You Got it");
                        p2Guessed = true;
                        System.out.println(p2);
                        System.out.println("GAME THREE START");
                    }
                    else{
                        System.out.println("Sorry That's not it ");
                        p2Guessed = true;
                        System.out.println(p2);
                        System.out.println("GAME THREE START");
                    }
                }
                else if(x.equals("3")){
                    System.out.println("Thanks for playing!");
                    p2Guessed = true;
                    p3Guessed = true;
                }
            }


            while(!p3Guessed){
                printArray(userGuesses3);
                System.out.println("Would you like to Spin(1), Solve(2), or Quit(3) ");
                String x = scan.nextLine();
                if (x.equals("1")) {
                    int random = (int) (Math.random() * (points.length));
                    System.out.println("Points Per Letter: " + points[random]);
                    printArray(userGuesses1);
                    System.out.println("User Points: " + userpoints);
                    System.out.println("\nGuess a letter!");
                    String y = scan.nextLine();
                    if(doesContain(y, guessArray3)){
//                        System.out.println(doesContain(y, guessArray3));
                        for (int i = 0; i < guessArray3.length; i++) {
                            if (guessArray3[i].equals(y)) {
                                userGuesses3[i] = y;
                                p3Guessed = isSolved(guessArray, userGuesses3);
                                userpoints += points[random];
                            }
                        }
                    }
                    else{
                        System.out.println(doesContain(y, guessArray3));
                    }
                }
                else if(x.equals("2")){
                    System.out.println("SOLVE");
                    System.out.println("Enter the phrase ");
                    String z = scan.nextLine();
                    if(z.equals(p3)){
                        System.out.println("Good Job You Got it");
                        p3Guessed = true;
                        System.out.println(p3);

                    }
                    else{
                        System.out.println("Sorry That's not it ");
                        p3Guessed = true;
                        System.out.println(p3);

                    }
                }
                else if(x.equals("3")){
                    System.out.println("Thanks for playing!");
                    p3Guessed = true;
                }
            }
        }
            }
        }

