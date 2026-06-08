class ListNode(object):
        def __init__(self, x):
            self.val = x
            self.next = None

class Solution(object):
    def hasCycle(self, head):
        # idea: fast and slow
        if not head or not head.next: return False
        slow = head
        fast = head.next
        while fast.next and fast.next.next:
            if slow == fast:
                return True
            else:
                fast = fast.next.next
                slow = slow.next

        return False
    
    def addTwoNumbers(self, l1, l2):
        # idea: make a dummy variable to initialize a curr
        # then iterate and update curr as you go
        dummy = ListNode(0)
        curr = dummy
        carry = 0

        while l1 or l2 or carry:
            val1 = l1.val if l1 else 0
            val2 = l2.val if l2 else 0
            total = val1 + val2 + carry

            carry = total // 10
            curr.next = ListNode(total % 10)
            curr = curr.next

            if l1:
                l1 = l1.next
            if l2:
                l2 = l2.next

        return dummy.next

    