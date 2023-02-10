package Problems;

import java.util.Arrays;

public class isAnagram {

    public static boolean isAnagram(String s, String t) {

        if (s.length() != t.length())
            return false;

        char S[] = s.toCharArray();
        char T[] = t.toCharArray();

        Arrays.sort(S);
        Arrays.sort(T);

        for (int i = 0; i < s.length(); i++)
            if (S[i] != T[i])
                return false;

        return true;
    }

    public static void main(String[] args) {

        String s = "anagram";
        String t = "nagaram";
        String s1 = "aacc";
        String s2 = "ccac";

        System.out.println(isAnagram(s, t));
    }
}
