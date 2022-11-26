package Problems;
import java.util.*;
public class convertArrayToInteger {
    public static Scanner input = new Scanner(System.in);

    public static int ArraytoInteger(int array[]){
        int number=0;

        for(int i=0;i<array.length;i++)
            number=number*10+array[i];

        return number;
    }

    public static void main(String[] args) {
        System.out.print("Enter size of array: ");
        int n = input.nextInt();
        int a[] = new int[n];
        for(int i=0;i<a.length;i++){
            System.out.print("Enter "+(i+1)+". element: ");
            a[i]=input.nextInt();
        }
        System.out.println("Array: "+Arrays.toString(a));

        System.out.println("Number: "+ArraytoInteger(a));
    }
}