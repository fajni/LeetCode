package Problems;

import java.util.*;

public class Reverse_String {

    public static void StackReverseString(char[] s){

        Stack<Character> st = new Stack<>();
        String str= new String(s);

        for(int i=0;i<str.length();i++)
            st.push(s[i]);

        char ans[] = new char[s.length];
        int i=0;

        while(st.size()>0)
            s[i++]=st.pop();

        for(int j=0;j<str.length();j++)
            ans[j]=str.charAt(j);
    }

    public static void reverseString(char[] s){
        char c[] = new char[s.length];
        int counter=0;

        for(int i=s.length-1;i>=0;i--)
            c[counter++]=s[i];

        for(int i=0;i<c.length;i++)
            System.out.print(c[i]);
    }

    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        System.out.println("Array: "+Arrays.toString(s));
        reverseString(s);
    }
}
