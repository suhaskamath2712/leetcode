# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def addTwoNumbers(self, l1, l2):
        """
        :type l1: ListNode
        :type l2: ListNode
        :rtype: ListNode
        """
        curr1,curr2 = l1,l2
        carry = 0
        head = None
        while curr1 != None or curr2 != None or carry != 0:
            l1val = curr1.val if curr1 != None else 0
            l2val = curr2.val if curr2 != None else 0
            sum = carry + l1val + l2val
            digit = sum

            if sum > 9:
                carry = sum//10
                digit %= 10
            else:
                carry = 0
            
            if head == None:
                head = ListNode(digit)
                curr3 = head
            else:
                curr3.next = ListNode(digit)
                curr3 = curr3.next
            
            curr1 = curr1.next if curr1 != None else None
            curr2 = curr2.next if curr2 != None else None
        
        return head