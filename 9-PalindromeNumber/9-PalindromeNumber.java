// Last updated: 7/11/2025, 10:15:29 PM
class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;

        int reverse = 0;
        int tmp = x;

        while (tmp != 0) {
            int digit = tmp % 10;
            reverse = reverse * 10 + digit;
            tmp /= 10;
        }

        return reverse == x;
    }
}