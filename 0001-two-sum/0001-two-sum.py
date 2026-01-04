class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        rlist = []
        for i in range(len(nums)):
            for j in range(len(nums)):
                if j != i and nums[i] + nums[j] == target:
                    rlist.append(i)
                    rlist.append(j)
                    break
            if len(rlist) != 0:
                break
        
        return rlist