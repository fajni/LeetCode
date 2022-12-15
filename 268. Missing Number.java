package Problems;

import java.util.Arrays;

public class Missing_Number_268 {

    public static int missingNumber(int[] nums) {

        int i = 0;
        //SORT ARRAY - BUBBLE
        /*
        for (i = 0; i < nums.length; i++)
            for (int j = 0; j < nums.length; j++)
                if (nums[i] < nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }

         */

        Arrays.sort(nums);

        System.out.println("Array: " + Arrays.toString(nums));
        for (i = 0; i < nums.length; i++)
            if (nums[i] != i)
                return i;
        return i;
    }

    public static int XOR(int[] nums){
        int res = nums.length;
        for(int i=0;i<nums.length;i++){
            res ^= i;
            res ^= nums[i];
        }
        return res;
    }

    public static void main(String[] args) {

        int nums[] = {0, 1};
        int nums2[] = {3, 0, 1};

        System.out.println(missingNumber(nums2));

    }
}
