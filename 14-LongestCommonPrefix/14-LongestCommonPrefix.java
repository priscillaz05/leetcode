// Last updated: 8/8/2025, 10:02:43 PM
class Solution {
    public String longestCommonPrefix(String[] strs) {

        if (strs.length == 0) return "";

        if (strs.length == 1) return strs[0];

        String ans = strs[0];

        for (String str : strs) {
            int i = 0;
            while (i < Math.min(ans.length(), str.length())) {
                if (ans.charAt(i) == (str.charAt(i))) i++;
                else break;
            }
            ans = ans.substring(0, i);
        }

        return ans;
    }
}