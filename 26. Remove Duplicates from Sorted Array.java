package Problems;
import java.util.*;
public class Remove_Duplicates_from_Sorted_Array {
    public static Scanner input = new Scanner(System.in);

    public static int removeDuplicates(int[] nums){

        if(nums.length == 0 || nums.length ==1)
            return nums.length;

        int counter=0;
        for(int i=0;i<nums.length-1;i++)
            if(nums[i]!=nums[i+1])
                nums[counter++]=nums[i];


        nums[counter++]=nums[nums.length-1];
        System.out.println(Arrays.toString(nums));
        return counter;

    }

    public static void main(String[] args) {

        int array[] = {0,0,1,1,1,1,2,2,3,3,4};
        //int array[] = {1,1,2};
        System.out.println(removeDuplicates(array));
    }
}
