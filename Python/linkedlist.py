class Solution(object):
    class ListNode(object):
        def __init__(self, x):
            self.val = x
            self.next = None

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
    