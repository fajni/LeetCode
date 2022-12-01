package Problems;

import java.util.*;

public class Determine_if_String_Halves_Are_Alike_1704 {

    public static boolean halvenAreAlike(String s) {

        char[] v = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        int counterB = 0, counterA = 0;

        for(int i=0;i<s.length()/2;i++)
            for(int j=0;j<v.length;j++)
                if(s.charAt(i)==v[j])
                    counterA++;
        for(int i=s.length()/2;i<s.length();i++)
            for(int j=0;j<v.length;j++)
                if(s.charAt(i)==v[j])
                    counterB++;

        System.out.println("CounterA: " + counterA + "\nCounterB: " + counterB);

        if (counterA == counterB) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {

        String s1 = "book";
        String s2 = "textbook";
        String s3 = "Aa";

        System.out.println(halvenAreAlike(s3));
    }
}
