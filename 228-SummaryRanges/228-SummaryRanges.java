// Last updated: 7/12/2025, 2:13:52 PM
class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ans = new ArrayList<>();

        int i = 0;
        while (i < nums.length) {
            int st = nums[i];
            StringBuilder str = new StringBuilder(st + "");

            int j = i + 1;
            for (; j <= nums.length; j++) {
                if (j == nums.length || nums[j] != nums[j - 1] + 1) {
                    int end = nums[j - 1];

                    if (st != end) {
                        str.append("->");
                        str.append(end);
                    }

                    ans.add(str.toString());
                    break;
                }
            }
            i = j;
        }

        return ans;
    }
}