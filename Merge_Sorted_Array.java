package Problems;

import java.util.*;

public class Merge_Sorted_Array {

    public static Scanner input = new Scanner(System.in);

    public static void merge(int nums1[], int m, int nums2[], int n) {

        int array[] = new int[m+n];

        for(int i=0;i<nums1.length;i++){
            array[i]=nums1[i];
        }

        int counter=0;
        for(int i=m;i<array.length;i++){
            array[i]=nums2[counter++];
        }

        int temp;
        for(int i=0;i<array.length;i++)
            for(int j=i+1;j<array.length;j++)
                if(array[i]>array[j]){
                    temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }


        System.out.println("\n\nArray: "+Arrays.toString(array));

    }

    public static void main(String[] args) {

        //nums1
        System.out.print("Enter size of nums1: ");
        int m = input.nextInt();
        int nums1[] = new int[m];
        for (int i = 0; i < nums1.length; i++) {
            System.out.println("Enter " + (i + 1) + ". element: ");
            nums1[i] = input.nextInt();
        }

        //nums2
        System.out.print("Enter size of nums2: ");
        int n = input.nextInt();
        int nums2[] = new int[n];
        for (int i = 0; i < nums2.length; i++) {
            System.out.println("Enter " + (i + 1) + ". element: ");
            nums2[i] = input.nextInt();
        }

        System.out.println("NUMS1: " + Arrays.toString(nums1));
        System.out.println("NUMS2: " + Arrays.toString(nums2));

        merge(nums1,m,nums2,n);
    }
}
