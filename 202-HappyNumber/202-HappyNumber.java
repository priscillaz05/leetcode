// Last updated: 9/2/2025, 11:04:42 AM
class Solution {
    public int getSquareDigitSum(int x) {
        double sum = 0;
        while (x != 0) {
            int lastDigit = x % 10;
            sum += Math.pow(lastDigit, 2);


            x /= 10;
        }

        return (int) sum;
    }

    public boolean isHappy(int n) {
        HashMap<Integer, Integer> seen = new HashMap<>();

        seen.put(n, seen.getOrDefault(n, 1));

        while (true) {
            n = getSquareDigitSum(n);

            if (n == 1) {
                return true;
            } else {
                int cnt = seen.getOrDefault(n, 0);
                if (cnt != 0) return false;
            }
            seen.put(n, 1);
        }
    }
}