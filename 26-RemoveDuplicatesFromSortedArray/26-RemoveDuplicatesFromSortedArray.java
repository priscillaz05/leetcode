// Last updated: 7/9/2025, 9:51:12 PM
class Solution {
    public int removeDuplicates(int[] nums) {
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != nums[index]) {
                nums[++index] = nums[i];
            }
        }
//
//        for (int i = 0; i < index + 1; i++) {
//            System.out.println(nums[i]);
//        }

        return index + 1;
    }
}