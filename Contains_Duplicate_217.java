package Problems;

import java.util.*;

public class Contains_Duplicate_217 {

    public static boolean containsDuplicates2(int[] nums) {
        Arrays.sort(nums);
        int i = 0;
        int j = 0;
        while (i < nums.length) {
            j = i;
            while (j < nums.length) {
                if (nums[i] == nums[j] && i != j)
                    return true;
                j++;
            }
            i++;
        }
        return false;

        /*
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            }
            set.add(nums[i]);
        }
        return false;
         */
    }

    public static boolean containsDuplicates(int[] nums) {

        /*You have to use Hashing because of big memory usage of array*/
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++)
            set.add(nums[i]);

        if(set.size() == nums.length)
            return false;

        return true;
    }

    public static void main(String[] args) {

        int nums1[] = {1, 11, 3, 5, 2};
        int nums2[] = {2, 14, 18, 22, 22};
        System.out.println(containsDuplicates(nums1));

    }
}
