// Last updated: 7/5/2025, 9:25:28 PM
class Solution {
        public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");

        int n = s.length();
        int i = 0;
        int j = n - 1;

        while (i <= j) {
            if (s.charAt(i++) != s.charAt(j--)) {
                return false;
            }
        }

        return true;
    }
}