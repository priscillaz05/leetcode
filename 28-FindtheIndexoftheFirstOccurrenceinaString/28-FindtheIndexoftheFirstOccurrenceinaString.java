// Last updated: 7/13/2025, 2:04:28 PM
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