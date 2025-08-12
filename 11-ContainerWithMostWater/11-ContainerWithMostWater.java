// Last updated: 8/12/2025, 2:19:34 PM
class Solution {
    public int maxArea(int[] height) {

        int left = 0;
        int right = height.length - 1;
        int ans = 0;

        while (left <= right) {
            int area = (right - left) * Math.min(height[left], height[right]);

            ans = Math.max(ans, area);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return ans;
    }
}