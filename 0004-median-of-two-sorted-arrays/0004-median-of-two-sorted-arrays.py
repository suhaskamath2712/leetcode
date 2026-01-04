class Solution(object):
    def findMedianSortedArrays(self, nums1, nums2):
        """
        :type nums1: List[int]
        :type nums2: List[int]
        :rtype: float
        """

        allnum = nums1 + nums2
        print(allnum)
        allnum.sort()
        print(allnum)

        if (len(allnum) % 2 != 0):
            return allnum[len(allnum)//2]
        else:
            return float(allnum[len(allnum)//2] + allnum[len(allnum)//2 - 1])/2

        