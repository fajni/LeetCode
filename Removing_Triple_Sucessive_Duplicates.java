package Problems;
import java.util.*;
public class Removing_Triple_Sucessive_Duplicates {
    public static Scanner input = new Scanner(System.in);

    public static int RemovingTripleSucessiveDuplicates(String s) {
        int counter = 0, counter1 = 0, counter2 = 0;

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                counter2=0;
                counter1++;
                if(counter1%3==0)
                    counter++;
            }
            if(s.charAt(i)=='0'){
                counter1=0;
                counter2++;
                if(counter2%3==0)
                    counter++;
            }

        }

        return counter;
    }

    public static void main(String[] args) {

        System.out.print("Enter string: ");
        String s = input.next();
        System.out.println(RemovingTripleSucessiveDuplicates(s));


    }
}
