// Last updated: 7/11/2025, 10:12:08 PM
class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;

        int n = (int) Math.log10(x);
//        System.out.println(n);

        int i = 1;
        int j = n;

        while (i <= j) {
            int right = (int) (x % (Math.pow(10, i)) / (Math.pow(10, i - 1)));
            int left = (int) (x / Math.pow(10, j) % 10);
//            System.out.println("Right: " + right + " Left: " + left);
            if (right != left) return false;

            i++;
            j--;
        }

        return true;
    }
}