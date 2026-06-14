class TreeNode(object):
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

class Solution(object):
    def maxDepth(self, root):
        if not root:
            return 0
        else:
            return 1 + max(self.maxDepth(root.left), self.maxDepth(root.right))
        
    def invertTree(self, root):
        if not root:
            return None
        dummy = TreeNode(root.val)
        dummy.left = self.invertTree(root.right)
        dummy.right = self.invertTree(root.left)
        root = dummy
        return root
    
    def symHelp(self, t1, t2):
        if not t1 and not t2:
            return True
        elif not t1 or not t2:
            return False
        if t1.val != t2.val:
            return False
        else:
            return self.symHelp(t1.left, t2.right) and self.symHelp(t1.right, t2.left)


    def isSymmetric(self, root):
        if not root:
            return True
        else:
            return self.symHelp(root.left, root.right)

            