public class arrayTwo {
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

    public static void main(String[] args) {
        String [] strArray = {"pizza", "chicken", "pasta", "burger", "hotdog", "apple", "banana", "pineapple", "avocado", "peach" };
        String [] strArray2 = {"blue","pizza", "green", "yellow", "pink", "orange", "black", "white", "purple", "gray" };
        String target = "pizza";

//        int found = 0;
//        int tar =0;
//        int tar2 =0;
//
//        for (int i = 0; i < strArray.length; i++) {
//            if(target == strArray[i]){
//                found++;
//                tar = i;
//            }
//        }
//        if(found > 0) {
//            System.out.println("FOUND");
//        }
//        else{
//            System.out.println("NOT FOUND");
//        }
//
//        found = 0;
//        for (int i = 0; i < strArray2.length; i++) {
//            if(target == strArray2[i]){
//                found++;
//                tar2 = i;
//            }
//        }
//        if(found > 0) {
//            System.out.println("FOUND");
//        }
//        else{
//            System.out.println("NOT FOUND");
//        }
//
//        found = 0;
//        for (int i = 0; i < strArray.length; i++) {
//            for (int j = 0; j < strArray2.length; j++) {
//                if (strArray[i] == strArray2[j]) {
//                    found++;
//                    System.out.println(i);
//                    System.out.println(j);
//                }
//            }
//        }
//
//        if(found > 0){
//            System.out.println("Common Elements");
//        }
//        else{
//            System.out.println("No Common Elements");
//        }
//
//        for(int i = 0; i < strArray.length; i++){
//            if(strArray[i].equals(target)){
//                strArray[i] = "";
//            }
//            System.out.println(strArray[i]);
//        }
//
//        String [] revArray = new String[10];
//        int x = 0;
//        for(int j = strArray.length - 1; j >= 0; j--){
//            revArray[x] = strArray[j];
//            x++;
//        }
//        for(int j = 0; j < strArray.length; j++){
//            System.out.println(revArray[j]+" ");
//        }
//        String [] dupStrArray2 = new String[10];
//        dupStrArray2 = strArray2;
//        printArr(dupStrArray2);

        Integer [] intArray = {0,1,2,3,4,5,6,7,8,9};
        Integer [] intArray2 = {0,5,10,15,20,25,30,35,40,45};
//        int find = 0;
//        int iTarget = 0;
//        for (int i = 0; i < intArray.length; i++){
//            find++;
//            if(iTarget == intArray[i]){
//                find++;
//            }
//        if(find > 0){
//            System.out.println("Found");
//            break;
//        }
//        else{
//            System.out.println("Not Found");
//            break;
//        }
//        }

//        int found = 0;
//        for (int i = 0; i < intArray.length; i++) {
//            for (int j = 0; j < intArray2.length; j++) {
//                if (intArray[i] == intArray2[j]) {
//                    found++;
//                    System.out.println(i);
//                    System.out.println(j);
//                }
//            }
//        }
//
//        if(found > 0){
//            System.out.println("Common Elements");
//        }
//        else{
//            System.out.println("No Common Elements");
//        }

//        Integer [] revArray2 = new Integer[10];
//        for(int j = intArray.length - 1; j > 0; j--){
//            revArray2[j] = intArray[j];
//            System.out.println(revArray2[j]);
//        }
//        Integer [] revArray3 = new Integer[10];
//        for(int j = intArray2.length - 1; j > 0;j--){
//            revArray3[j] = intArray[j];
//            System.out.println(revArray3[j]);

//        Integer [] revArray2 = new Integer[10];
//        int x = 0;
//        for(int j = intArray.length - 1; j >= 0; j--){
//            revArray2[x] = intArray[j];
//            x++;
//        }
//        for(int j = 0; j < intArray.length; j++){
//            System.out.println(revArray2[j]+" ");
//        }
//        Integer [] revArray3 = new Integer[10];
//        x = 0;
//        for(int j = intArray2.length - 1; j >= 0; j--){
//            revArray3[x] = intArray2[j];
//            x++;
//        }
//        for(int j = 0; j < intArray2.length; j++){
//            System.out.println(revArray3[j]+" ");
//        }
//        Integer [] dupIntArray2;
//        dupIntArray2 = intArray;
//        for(int i = 0; i < intArray2.length; i++){
//            System.out.println(dupIntArray2[i]);
//        }

//        int min = Integer.MAX_VALUE;
//        int index = -1;
//        for(int i = 0; i < intArray2.length; i++){
//            if(intArray2[i]<min){
//                min = intArray2[i];
//                index = i;
//            }
//        }
//        System.out.println("intArray2[" + index + "] = " + min);
//
//        int nextMin = Integer.MAX_VALUE, secondMin = Integer.MAX_VALUE;
//        for(int i = 0; i < intArray2.length; i++){
//            if(intArray2[i] < nextMin){
//                secondMin = nextMin;
//                nextMin = intArray2[i];
//            }
//            else if(intArray2[i] < secondMin && intArray2[i] > nextMin){
//                secondMin = intArray2[i];
//            }
//        }
//        System.out.println("Second Smallest = "+secondMin);


        }
        }



// Part 1
// Create two String arrays strArray & strArray2 of length 10, using a
// themes of your choice. Enter two elements with the same values in
// each array


// Create a String variable target
// Write code that will iterate through both arrays (individually or
// together) and print “Found” or “Not Found” based on results when
// searching for target


// Write code that will compare strArray and strArray2 and print
// “Common Elements!” or “No Common Elements” based on results. Print // the indices of common elements


// Write code that will remove a target from strArray without
// decreasing array size


// [Put the removed item back] and write code that will reverse
// strArray


// Write code that will copy(duplicate) strArray2 to dupStrArray2





// Part 2
// Create an int array intArray of length 10, with numbers ascending
// from the start number of your choice AND an int array intArray2
// with numbers of your choice. Enter at least two values that are in
// intArray


// Create an int variable iTarget
// Write code that will iterate through both arrays (individually or
// together) and print “Found” or “Not Found” based on results when
// searching for iTarget


// Write code that will compare strArray and strArray2 and print
// “Common Elements!” or “No Common Elements” based on results. Print // the indices of common elements


// Write code that will reverse intArray and intArray2 (separately)


// Write code that will duplicate intArray [dupIntArray2]


// Write code that will locate the index of the smallest element in
// intArray2. Print the smallest index, and its elements value


// Write code that will locate the second index of the smallest
// element in intArray2. Print the index, and its elements value