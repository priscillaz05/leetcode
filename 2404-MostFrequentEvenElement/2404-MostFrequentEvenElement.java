// Last updated: 8/7/2025, 10:57:11 AM
class Solution {
    public int mostFrequentEven(int[] nums) {
        if (nums.length == 1) return nums[0] % 2 == 0 ? nums[0] : -1;
        HashMap<Integer, Integer> map = new HashMap<>();

        int curMaxCnt = 0;
        int curAns = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            int cur = nums[i];
            if (cur % 2 != 0) continue;

            if (!map.containsKey(cur)) {
                map.put(cur, 0);
            } else {
                map.put(cur, map.get(cur) + 1);
            }

            int cnt = map.get(cur);

            if (cnt == curMaxCnt) {
                curAns = Math.min(curAns, cur);
            } else if (cnt > curMaxCnt) {
                curMaxCnt = cnt;
                curAns = cur;
            }
        }

        return curAns == Integer.MAX_VALUE ? -1 : curAns;
    }
}