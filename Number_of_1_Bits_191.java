package Problems;

import java.util.*;

public class Number_of_1_Bits_191 {

    // you need to treat n as an unsigned value
    public static int hammingWeight(int n) {
        int counter = 0, i =0;
        String s;
        s = Integer.toBinaryString(n);
        System.out.println("S: " + s);

        while(i<s.length()){
            if(s.charAt(i)=='1')
                counter++;
            i++;
        }

        return counter;
    }

    public static void main(String[] args) {

        int n = 00000000000000000000000010000000;
        System.out.println(hammingWeight(n));
    }
}
