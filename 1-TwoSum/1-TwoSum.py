# Last updated: 7/4/2025, 11:42:29 AM
class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        n = len(nums)
        ans = []

        for i in range(0, n):
            for j in range(i+1, n):
                if nums[i] + nums[j] == target:
                    ans.append(i)
                    ans.append(j)
                    return ans

        return 0