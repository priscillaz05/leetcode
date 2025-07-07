// Last updated: 7/7/2025, 7:51:08 PM
class FindSumPairs {    int[] nums1;
    int[] nums2;
    Map<Integer, Integer> existed = new HashMap<>();

    public FindSumPairs(int[] nums1, int[] nums2) {
        this.nums1 = nums1;
        this.nums2 = nums2;

        for (int a : nums2) {
            if (!existed.containsKey(a)) {
                existed.put(a, 1);
            } else {
                existed.put(a, existed.get(a) + 1);
            }
        }
    }

    public void add(int index, int val) {
        int num = nums2[index];
        existed.put(num, existed.get(num) - 1);

        num += val;
        nums2[index] = num;

        if (existed.containsKey(num)) {
            existed.put(num, existed.get(num) + 1);
        } else {
            existed.put(num, 1);
        }
    }

    public int count(int tot) {
        int ans = 0;

        for (int a : nums1) {
            int leftover = tot - a;

            if (existed.containsKey(leftover)) {
                int amount = existed.get(leftover);
                ans += amount;
            }
        }

//        System.out.println(ans);
        return ans;
    }
}