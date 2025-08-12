// Last updated: 8/12/2025, 2:43:42 PM
class Solution {
    public int maxOperations(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int ans = 0;

        for (int x : nums) {
            int y = k - x;

            if (x * 2 == k) {
                ans += map.get(x) / 2;
            } else {
                ans += Math.min(map.get(x), map.getOrDefault(y, 0));
            }

            map.put(x, 0);
        }

        return ans;
    }
}