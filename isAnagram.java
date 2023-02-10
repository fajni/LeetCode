package Problems;

import java.util.Arrays;

public class isAnagram {

    public static boolean isAnagram(String s, String t) {

        /*
        int number = 0;

        if (s.length() != t.length())
            return false;

        HashMap<Integer, Character> hm = new HashMap<>();
        for (int i = 0; i < s.length(); i++)
            hm.put(i, s.charAt(i));

        for (int i = 0; i < t.length(); i++)
            if (hm.containsValue(t.charAt(i)))
                number++;

        if(number == hm.size())
            return true;

        return false;
         */

        if (s.length() != t.length())
            return false;

        char S[] = s.toCharArray();
        char T[] = t.toCharArray();

        Arrays.sort(S);
        Arrays.sort(T);

        System.out.println("S: " + Arrays.toString(S));
        System.out.println("T: " + Arrays.toString(T));

        for (int i = 0; i < S.length; i++)
            if(S[i] != T[i])
                return false;

        return true;
    }

    public static void main(String[] args) {

        String s = "anagram";
        String t = "nagaram";
        String s1 = "aacc";
        String s2 = "ccac";

        System.out.println(isAnagram(s,t));
    }
}
