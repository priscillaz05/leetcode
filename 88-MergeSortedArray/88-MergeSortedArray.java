// Last updated: 7/4/2025, 11:41:17 AM
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] ans = new int[m + n];

        int i = 0;
        int j = 0;
        int ind = 0;

        while (i < m && j < n) {
            if (nums2[j] <= nums1[i]) {
                ans[ind++] = nums2[j++];
            } else if (nums1[i] < nums2[j]) {
                ans[ind++] = nums1[i++];
            }
        }

        for (; j < n; j++) {
            ans[ind++] = nums2[j];
        }

        for (; i < m; i++) {
            ans[ind++] = nums1[i];
        }

        int redo = 0;
        for(int a : ans){
            nums1[redo++] = a;
        }    
    }
}