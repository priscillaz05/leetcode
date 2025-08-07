// Last updated: 8/7/2025, 10:31:59 AM
class Solution {
    public int majorityElement(int[] nums) {
        if (nums.length == 1) return nums[0];

        HashMap<Integer, Integer> cnt = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int cur = nums[i];

            if (cnt.containsKey(cur)) {
                int res = cnt.get(cur);
                if (++res > nums.length / 2) return cur;

                cnt.put(cur, cnt.get(cur) + 1);
            } else {
                cnt.put(cur, 1);
            }
        }

        return 0;
    }
}