class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> nums = new HashSet<>();

        for(int i=0;i<nums1.length; i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i] == nums2[j])
                    nums.add(nums1[i]);
            }
        }

        nums1 = new int[nums.size()];
        int index = 0;
        for(Integer i : nums){
            nums1[index] = i;
            index++;
        }

        return nums1;
    }
}