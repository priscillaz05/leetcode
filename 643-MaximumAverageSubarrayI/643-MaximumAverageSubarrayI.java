// Last updated: 8/17/2025, 1:48:05 PM
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        int left = 0;
        int right = k;
        double avg = sum * 1.00000 / k;

        while (right < nums.length) {
            sum -= nums[left++];
            sum += nums[right++];

            avg = Math.max(avg, sum * 1.00000 / k);
        }

        return avg;
    }
}