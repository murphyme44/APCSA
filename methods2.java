public class methods2 {
    public static boolean jollyLikes(String s){
        boolean jolly = false;
        for(int i =0; i < s.length()-1; i++){
            if(s.substring(i,i+1).equalsIgnoreCase(s.substring(i+1,i+2))){
                jolly = true;
            }
        }
        return jolly;
    }
    public static String reverseString(String s){
        String reverse = "";
        for(int i = s.length()-1; i>=0; i--){
            reverse += s.substring(i,i+1);
        }
        return reverse;
    }
    public static boolean findTarget(String [] arr, String target){
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if(target == arr[i]){
                found = true;
            }
        }
        if(found) {
            return found;
        }
        return found;
    }
    public static double tipcalc(double bill, int diners, int tipPercent){
        //total tip will be
        //bill *tip/100 +1
        double tip = (double) tipPercent/100;
        tip = bill*tip;
        return((bill+tip)/diners);
    }
    public static int countWords(String s){
        int count = 0;
        String [] arr = s.split(" ");
        for(String a: arr){
            count++;
        }
        return count;
    }
    public static String nameGame(String name){
        String x = name.substring(1);
        return name + " " + name + ", bo-B"+x+"\n"+"Banana-fana fo-F"+x+"\n"+"Fee-fi-mo-Mohn"+x+"\n"+name.toUpperCase()+"!";
    }



    public static void main(String[] args) {
        String [] array1 = {"word", "phrase", "sentence", "paragraph", "essay"};
        int [] array2 = {1,0,2,3,4,5,6,7,8,9};
        System.out.println(jollyLikes("woods"));
        System.out.println(reverseString("hello"));
        System.out.println(findTarget(array1, "phrase"));
        System.out.println("$"+tipcalc(100, 2, 20));
        System.out.println(countWords("How are you doing?"));
        System.out.println(nameGame("John"));
    }
}
