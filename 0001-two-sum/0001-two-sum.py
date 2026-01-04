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
            map[nums[i]] = i
        
        for i in range(n):
            #Calculate complement to reduce calculations
            comp = target - nums[i]
            #Ensure that we are not self-referencing
            if (comp) in map and map[comp] != i:
                return [i, map[comp]]
        return []