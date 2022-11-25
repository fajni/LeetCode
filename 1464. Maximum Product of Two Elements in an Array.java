package Problems;

import java.util.Arrays;

public class Maximum_Product_of_Two_Elements_in_an_Array {

    public static int maxProduct(int nums[]){
        int max1 = 0, max2 = 0, number = 0;
        int temp = nums[0];

        for (int i = 0; i < nums.length; i++)
            if (nums[i] > temp) {
                temp = nums[i];
                number = i;
            }
        max1 = temp;
        temp = nums[0];
        for (int i = 0; i < nums.length; i++)
            if (i == number)
                nums[i] = 0;

        for(int i=0;i<nums.length;i++)
            if(nums[i]>temp)
                temp=nums[i];
        max2=temp;

        System.out.println(Arrays.toString(nums));

        return (max1 - 1) * (max2 - 1);
    }

    public static void main(String[] args) {

        int nums1[] = {3, 4, 5, 2};
        int nums2[] = {1, 5, 4, 5};
        int nums3[] = {3, 7};

        System.out.println(Arrays.toString(nums1) + "\n");

        System.out.println(nums1);

    }
}
