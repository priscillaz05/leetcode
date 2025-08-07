// Last updated: 8/7/2025, 10:57:28 AM
class Solution {
    public int strStr(String haystack, String needle) {
        char start = needle.charAt(0);
        int n = needle.length();

        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) == start) {
                if (i + n <= haystack.length() && haystack.substring(i, i + n).equals(needle)) {
                    return i;
                }

            }
        }
        return -1;
    }
}