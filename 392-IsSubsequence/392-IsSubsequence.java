// Last updated: 7/6/2025, 8:33:13 PM
class Solution {
    public boolean isSubsequence(String s, String t) {
                int sIdx = 0;
        int tIdx = 0;
        if (s.isEmpty()) {
            return true;
        }
        if (t.isEmpty()) {
            return false;
        }
        while (tIdx < t.length()) {
            if (s.charAt(sIdx) == t.charAt(tIdx)) {
                sIdx++;
                if (sIdx >= s.length()) {
                    return true;
                }
            }
            tIdx++;
        }

        return false;
    }
}