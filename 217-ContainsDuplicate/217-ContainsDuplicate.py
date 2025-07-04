# Last updated: 7/4/2025, 11:42:32 AM
class Solution(object):
    def containsDuplicate(self, nums):
        """
        :type nums: List[int]
        :rtype: bool
        """
        n = len(nums)
        nums_set = set(nums)
        n2 = len(nums_set)

        if n!=n2:
            return True
        else:
            return False