package Problems;
import java.util.*;
public class Length_of_Last_Word {
    public static Scanner input = new Scanner(System.in);

    public static int moje(String s){
        String c[] = s.split(" ");
        return c[c.length-1].length();
    }

    public static int lengthOfLastWord(String s){
        int counter=0;
        s=s.trim();

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                counter=0;
                continue;
            }
            else counter++;
        }
        return counter;
    }

    public static void main(String[] args) {

        System.out.print("Enter string: ");
        String s = input.nextLine();

        System.out.println(lengthOfLastWord(s));

    }

}
