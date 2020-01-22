public class strings1 {
//        public static String noDoubles(String st) {
//            for (int i = 0; i < st.length() - 1; i++) {
//                if (st.substring(i, i + 2).equalsIgnoreCase(st.substring(i, i + 1) + st.substring(i, i + 1))) {
//                    st=st.replace(st.substring(i,i+1), "-");
//                    return st;
//                }
//            }
//            return "No Common Things";
//        }

    public static void main(String[] args) {
        String s1 = "word*";
        String asterisk = "*";
        if(s1.endsWith(asterisk)){
            System.out.println("True");
        }
        else{
            System.out.println("false");
        }
        String bday = "06032003";
        if(bday.equals("MMDDYY")){
            System.out.println("error");
        }
        else if(bday.equals("MMDDYYYY")){
            System.out.println("error");
        }
        String bday1 = bday.substring(0,2);
        String bday2 = bday.substring(2,4);
        String bday3 = bday.substring(4);
        System.out.println(bday1+"/"+bday2+"/"+bday3);

        if(bday.equals("MM/DD/YYYY")){
            System.out.println("error");
        }
        String bday4 = bday.substring(0,2);
        String bday5 = bday.substring(2,4);
        String bday6 = bday.substring(4);
        System.out.println(bday1+"-"+bday2+"-"+bday3);

        String credit = "1111222233334444";
        String credit1 = credit.substring(0,4);
        String credit2 = credit.substring(4,8);
        String credit3 = credit.substring(8,12);
        System.out.println(credit1+" "+credit2+" "+credit3);

        String phrase = "My String";
        System.out.println(phrase.indexOf("S"));

        String phrase2 = "MyString";
        String string1 = phrase2.substring(0,1);
        String string2 = phrase2.substring(1,8);
        String string3 = string2.concat(string1);
        System.out.println(string3);

//        public static String noDoubles(String st){
//            String s = st.toLowerCase();
//        }
//        for(int i = 0; i<s.length()-1; i++){
//            if(s.substring(i,i+2).equalsIgnoreCase(s.substring(i,i+1)+ string1.substring(i,i+1))){
//                s.replace(string1.substring(i,i+2), "--");
//            }
//        }

        boolean jolly = false;
        String w = "woods";
        for(int i =0; i < w.length()-1; i++){
            if(w.substring(i,i+1).equalsIgnoreCase(w.substring(i+1,i+2))){
                jolly = true;
                System.out.println(jolly);
            }
        }

        String s7 = "woods";
        for(int i = 0; i<s7.length()-1; i++){
            if(s7.substring(i, i+1).equalsIgnoreCase(s7.substring(i+1,i+2))){
                String noDoubles = s7.replace(s7.substring(i,i+1),"-");
                System.out.println(noDoubles);
            }
        }

        String [] insertArray = {"bob","robert","bow","rodney"};
            for(int index = 1; index < insertArray.length; index++){
                String key = insertArray[index];
                int position = index;
                while(position > 0 && insertArray[position-1].compareTo(insertArray[position]) > 0){
                    insertArray[position] = insertArray[position-1];
                    position--;
                }
                insertArray[position] = key;
            }
            for(int i = 0; i < insertArray.length; i++){
                System.out.println(insertArray[i]);
            }

            String reverse = "Hello";
            String reverse2 = "";
            for(int i = reverse.length()-1; i>=0; i--){
                reverse2 += reverse.substring(i,i+1);
            }

        System.out.println(reverse2);

    }
}
