class Solution(object):
    def findMedianSortedArrays(self, nums1, nums2):
        allnum = nums1 + nums2
        allnum.sort()

        if (len(allnum) % 2 != 0):
            return allnum[len(allnum)//2]
        else:
            return float(allnum[len(allnum)//2] + allnum[len(allnum)//2 - 1])/2

        