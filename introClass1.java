//Michael Murphy
import java.util.Scanner;
public class introClass1 {
    public static void main (String[] args){
        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
//        System.out.println("Purchase items for 1 dollar!\nWhat would you like to buy?");
//        String item1 = scan1.next();
//        System.out.println("How many would you like to purchase?");
//        int price1 = scan2.nextInt();
//        System.out.println("What else would you like to buy?");
//        String item2 = scan1.next();
//        System.out.println("How many would you like to purchase?");
//        int price2 = scan2.nextInt();
//        System.out.println("What else would you like to buy?");
//        String item3 = scan1.next();
//        System.out.println("How many would you like to purchase?");
//        int price3 = scan2.nextInt();
//        System.out.println("What else would you like to buy?");
//        String item4 = scan1.next();
//        System.out.println("How many would you like to purchase?");
//        int price4 = scan2.nextInt();
//        System.out.println("What else would you like to buy?");
//        String item5 = scan1.next();
//        System.out.println("How many would you like to purchase?");
//        int price5 = scan2.nextInt();
        //int amount = price1+price2+price3+price4+price5;
        //System.out.print("Your total is $"+amount+". You purchased $"+price1+" of "+item1+", $"+price2+" of "+item2+", $"+price3+" of "+item3+", $"+price4+" of "+item4+", and $"+price5+" of "+item5+".");



        System.out.println("Purchase items for 1 dollar!\nWhat would you like to buy?");
        String item1 = scan1.next();
        int price1 = scan1.nextInt();
        String item2 = scan1.next();
        int price2 = scan1.nextInt();
        String item3 = scan1.next();
        int price3 = scan1.nextInt();
        String item4 = scan1.next();
        int price4 = scan1.nextInt();
        String item5 = scan1.next();
        int price5 = scan1.nextInt();
        int amount = price1+price2+price3+price4+price5;
        System.out.print("Your total is $"+amount+". You purchased $"+price1+" of "+item1+", $"+price2+" of "+item2+", $"+price3+" of "+item3+", $"+price4+" of "+item4+", and $"+price5+" of "+item5+".");

    }
}

//Part 1:
// Create a scanner object

// Write prompts to the user that will allow them to purchase
// items from “Dollar Plus”, where all items are $1. The user must
// purchase five items, with a quantity that is of their discretion

// Eg: paper towels x4, plate x10, soap x1, cups x15, forks x20

// Create variables to store the user data

// Print back each item in an itemized list, and a total cost


//Part 2:
// Perform this pseudo transaction with only two print statements. A
// message to the user, and the itemized list with total cost

