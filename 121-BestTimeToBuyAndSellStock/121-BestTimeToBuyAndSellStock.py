# Last updated: 7/4/2025, 11:42:31 AM
class Solution(object):
    def maxProfit(self, prices):
        """
        :type prices: List[int]
        :rtype: int
        """
        
        n = len(prices)
        cheapest = 100000
        max_diff = 0

        for i in range(0, n):
            cur = prices[i]
            if cur < cheapest:
                cheapest = prices[i]
                continue

            diff = cur - cheapest

            if diff > max_diff:
                max_diff = diff

        return max_diff
