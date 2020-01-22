//Michael Murphy
//loopsProj
import java.util.Scanner;
public class loopsProj2 {
    public static void main(String [] args){
        String vaultpin = "";//empty string that becomes the random password for the vault
        String password = "qwertyuiopasdfghjklzxcvbnm1234567890`-=[]',./!@#$%^&*()~_+{}|:<>?QWERTYUIOPASDFGHJKLZXCVBNM";//string of character that could possibly be in the vaults password
        for(int i = 0; i < 6; i++){
            int randpin = (int)(Math.random()*password.length());//randomizes length of password
            String pin = password.substring(randpin, randpin+1);//takes last character of the length of the index and adds the index +1 to exclude the other characters
            vaultpin += pin;//sets empty string equal to the random password that was made
        }
        //System.out.println(vaultpin);
        Scanner input = new Scanner(System.in);//user input
        boolean guesser = true;
        while(guesser = true){//while loop that allows the user to guess as many times as they want until they guess correctly or quit
            System.out.println("Enter an a 6 character  ");
            String guess = input.nextLine();
            if(guess.equals(vaultpin)){
                System.out.println("YAY! You now have access to the vault!");
                break;//ends program when user enters the correct pin
            }
            if(guess.equals("q")){
                break;//ends program when user enters q
            }
            else{
                System.out.println("WRONG");//prints when user inputs the wrong pin
            }
        }
    }
}
