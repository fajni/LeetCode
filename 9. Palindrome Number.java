package Problems;
import java.util.*;
public class Palindrome_Number {
    public static Scanner input = new Scanner(System.in);

    public static boolean isPalindrom(int x){

        String temp = Integer.toString(x);
        int n = temp.length();

        int a[] = new int[n];
        int b[] = new int[n];

        for(int i=0;i<temp.length();i++)
            a[i]=temp.charAt(i) - '0';


        for(int i=0;i<a.length;i++){ //ne moze for(int i=0;i<n;i++) jer se n smanjuje
            b[i]=a[n-1];
            n--;
        }
        
        boolean end = true;
        for(int i=0;i<a.length;i++){ // -||-
            if(b[i]!=a[i])
                end=false;
            //else end=false;

        }

        return end;
    }

    public static boolean bolje(int x){

        System.out.println("Greska kod \"-10\"");
        String temp=Integer.toString(x);
        int n = temp.length();

        int a[] = new int[n];
        int b[] = new int[n];

        for(int i=a.length-1;i>=0;i--){
            a[i] = x%10; //uzima poslednju cifru sa int broja
            x /=10; //delis sa 10 da bi izgubio poslednju cifru
        }

        for(int i=0;i<b.length;i++){
            b[i]=a[n-1];
            n--;
        }

        boolean end=true;
        for(int i=0;i<b.length;i++){
            if(a[i]!=b[i])
                end=false;
        }

        return end;
    }

    public static void main(String[] args) {

        System.out.println("Enter palindrom number: ");
        int x = input.nextInt();

        //System.out.println(bolje(x)+"\n\n");
        System.out.println(isPalindrom(x));
    }
}
