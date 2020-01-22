//Michael Murphy
//stringsProj
import java.util.Scanner;
public class stringsProj {
        public static void formatName(String name){//splits at comma and puts the last name fist and first name last
            int split = name.indexOf(",");
            String first = name.substring(split+2);
            String last = name.substring(0, split);
            System.out.println(first + " " + last);
        }//end method
        public static void reverseEach(String para){
            String[] word = para.split(" ");//splits at space
            String reverse1 = "";//empty string
            for (int i = 0; i < word.length; i++){
                String phrase = word[i];
                String reverse2 = "";
                for(int j = phrase.length()-1; j >= 0; j--){
                    reverse2 = reverse2 + phrase.charAt(j);// sets reverse2 to the empty string and the array at char index of j
                }
                reverse1 = reverse1 + reverse2 + " ";
                int paralen = para.length()+1;
                int strlen = reverse1.length();
                if(paralen == strlen){
                    System.out.println(reverse1);
                }
            }
        }//end method
    public static void multiples(String phrase){
        int counter = 0;
        String a;
        String [] array = new String[phrase.length()];
        for (int i = 0; i < array.length; i++){
            array[i] = "murph";
        }
        for (int i = 0; i < phrase.length(); i++){
            String x = phrase.substring(i, i + 1);
            int s = phrase.length() - phrase.replace(x, "").length();
            if(s >= 2){
                array[counter] = (phrase.substring(i, i + 1) + " repeats " + (s) + " times");//appends to list
                counter++;
            }
        }
        if(counter == 0){
            System.out.println("There are no multiples");//prints when there are no multiples
        }
        for (int i = 0; i < array.length; i++){
            a = array[i];
            for(int j = 0; j < array.length; j++){
                if (array[j].equals(a) && j != i){
                    array[j] = "murphy";
                }
            }
        }
        for (String k: array){
            if (!k.equals("murph") && !k.equals("murphy")){
                System.out.println(k);
            }
        }
    }//end method

    public static void main(String[] args) {
        formatName("Mike, Murphy");
        reverseEach("Pizza is the best");
        multiples("Hello World");
    }
}
