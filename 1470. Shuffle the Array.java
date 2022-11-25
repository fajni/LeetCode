package Problems;
import java.util.*;
public class Shuffle_the_Array {

    public static int[] shuffleBetter(int nums[], int n){

        int res[] = new int[nums.length];
        int p=0, i=0, j=n;
        while(j<nums.length){
            res[p++]=nums[i++];
            res[p++]=nums[j++];
        }
        return res;
    }

    public static int[] shuffleMine(int nums[], int n){
        int x[] = new int[nums.length/2];
        int y[] = new int[nums.length/2];

        int counter1=0,counter2=0;
        for(int i=0;i<x.length;i++)
            x[i]=nums[i];
        for(int i=y.length;i<nums.length;i++)
            y[counter1++]=nums[i];

        counter1=0;

        for(int i=0;i<nums.length;i++){
            if(i%2==0)
                nums[i]=x[counter1++];
            else if(i%2!=0)
                nums[i]=y[counter2++];
        }
        return nums;
    }

    public static void main(String[] args) {
        int nums[] = {2,5,1,3,4,7};
        int n=3;

        System.out.print(Arrays.toString(shuffleMine(nums,n))+" ");
    }
}
