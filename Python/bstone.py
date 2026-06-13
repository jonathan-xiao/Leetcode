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
            