//Michael Murphy
//array1.java
import java.util.Scanner;
public class array1 {
    public static void main(String[] args) {
        int[] numArray = new int[5];
        numArray[0] = 5;
        numArray[1] = 10;
        numArray[2] = 15;
        numArray[3] = 20;
        numArray[4] = 25;


        for (int i = 0; i < numArray.length; i++) {
            System.out.println(numArray[i]);
        }

        for (int i : numArray) {
            System.out.println(i);
        }
        for (int i = 0; i < numArray.length; i++) {
            if(i % 2 == 1){
                System.out.println(i);
            }
        }
        int[] numArray2 = new int[10];
        int max = 20;
        int min = 1;
        int rand;
        for (int i = 0; i < numArray2.length; i++) {
            rand = (int)((Math.random()*((max-min)+1))+min);
            numArray2[i] = rand;
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(numArray2[i]);
        }
        int average = 0;
        int avg;
        for (int i = 0; i < numArray2.length; i++) {
            average += numArray2[i];
            avg = average + numArray2[i];
        }
        System.out.println(average/numArray2.length);

        String [] hogwartsarray = {"Gryffindor", "Hufflepuff", "Ravenclaw", "Slytherin"};
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scan.nextLine();
        String house = hogwartsarray[(int) (Math.random()*hogwartsarray.length)];
        System.out.println(name + " has been selected to " + house);


        System.out.println("HistogramArray");
        int maximum = 100;
        int minimum = 0;
        int random;
        int[] histogramArray = new int[5];
        for(int i = 0; i < 100; i++){
            random = (int)((Math.random()*((maximum-minimum)+1))+minimum);
            if(random <= 9){
                histogramArray[0]++;
            }
            else if(random <= 19){
                histogramArray[1]++;
            }
            else if(random <= 29){
                histogramArray[2]++;
            }
            else if(random <= 39){
                histogramArray[3]++;
            }
            else{
                histogramArray[4]++;
            }

        }
        printArr(histogramArray);

    }


    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void printArr(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}