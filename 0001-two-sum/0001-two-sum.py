class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        map = {}
        n = len(nums)

        for i in range(n):
            numMap[nums[i]] = i
        
        for i in range(n):
            #Ensure that we are not self-referencing
            if (target - nums[i]) in map and map[target - nums[i]] != i:
                return [i, map[target - nums[i]]]
        return []