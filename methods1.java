//Michael Murphy
//methods1.java
public class methods1 {
    public static void helloWorldVoid(){
        System.out.println("Hello World");
    }
    public static void myNameVoid(){
        System.out.println("Michael Murphy");
    }
    public static void randomNumberVoid(){
        System.out.println((int)(Math.random()*100));
    }
    public static void sayHelloVoid(String s){
        System.out.println("Hello "+s+"!");
    }
    public static void randomNumberVoid(int limit){
        System.out.println((int)(Math.random()*limit));
    }
    public static void maxNumVoid(int a, int b, int c){
        if(a>b && a>c){
            System.out.println(a);
        }
        if(b>a && b>c){
            System.out.println(b);
        }
        if(c>b && c>a){
            System.out.println(c);
        }
    }
    public static void printArray(String [] arr){
        for(int i = 0; arr.length>i; i++){
            System.out.println(arr[i]);
        }
    }
    public static void printArray(int [] arr){
        for(int i = 0; arr.length>i; i++){
            System.out.println(arr[i]);
        }
    }
    public static void  longestWord(String [] arr){
        String word = "";
        for(int i = 0;arr.length > i; i++){
            if(word.length() < arr[i].length()){
                word = arr[i];
            }
        }
        System.out.println(word);
    }
    public static void maxNumVoid(int [] arr){
        int number = 0;
        for(int i = 0;arr.length > i; i++){
            if(number<arr[i]){
                number = arr[i];
            }
        }
        System.out.println(number);
    }
    public static String myName(){
        return("Michael Murphy");
    }
    public static int randomNumber(){
        return((int)(Math.random()*100));
    }
    public static int maxNum(int a,int b,int c){
        if(a>b && a>c){
            return(a);
        }
        if(b>a && b>c){
            return(b);
        }
        else{
            return(c);
        }
    }
    public static int maxNum(int [] arr){
        int number = 0;
        for(int i = 0;arr.length > i; i++){
            if(number<arr[i]){
                number = arr[i];
            }
        }
        return number;
    }
    public static String [] sortArray(String [] arr){
        for(int index = 1; index < arr.length; index++){
            String key = arr[index];
            int position = index;
            while(position > 0 && arr[position-1].compareTo(key) > 0){
                arr[position] = arr[position-1];
                position--;
            }
            arr[position] = key;
        }
        return(arr);
    }
    public static int [] sortArray(int [] arr){
        for(int index = 1; index < arr.length; index++){
            int key = arr[index];
            int position = index;
            while(position > 0 && arr[position-1] > key){
                arr[position] = arr[position-1];
                position--;
            }
            arr[position] = key;
        }
        return(arr);
    }

    public static void main(String[] args) {
        String [] array1 = {"word", "phrase", "sentence", "paragraph", "essay"};
        int [] array2 = {1,0,2,3,4,5,6,7,8,9};
        helloWorldVoid();
        myNameVoid();
        randomNumberVoid();
        sayHelloVoid("James");
        randomNumberVoid(5);
        maxNumVoid(5,4,3);
        printArray(array1);
        printArray(array2);
        longestWord(array1);
        maxNumVoid(array2);
        System.out.println(myName());
        System.out.println(randomNumber());
        System.out.println(maxNum(1,2,3));
        System.out.println(maxNum(array2));
        printArray(sortArray(array1));
        printArray(sortArray(array2));



    }
}
