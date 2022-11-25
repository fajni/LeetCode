package Problems;
import java.util.*;
public class Subtrack_the_Product_and_Sum_of_Digits_of_an_Integer {
    public static Scanner input = new Scanner(System.in);

    public static int subtractProductAndSum(int n) {

        int p=1, sum=0;
        String temp = Integer.toString(n);
        int c[] = new int[temp.length()];

        for(int i=0;i<c.length;i++)
            c[i]=temp.charAt(i)-'0';

        for(int i=0;i<c.length;i++){
            p=p*c[i];
            sum=sum+c[i];
        }

        return (p-sum);

    }

    public static int subtrackProduckandSum2(int n){
        int p=1, sum=0;

        while(n!=0){
            System.out.print("n: "+n+"\n");
            n=n/10;
        }

        return p-sum;
    }


    public static void main(String[] args) {
        System.out.print("Enter n: ");
        int n = input.nextInt();

        System.out.println(subtrackProduckandSum2(n));
    }


}
