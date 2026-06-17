class TreeNode(object):
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

class Solution(object):
    def maxDepth(self, root):
        # idea: recursion
        if not root:
            return 0
        else:
            return 1 + max(self.maxDepth(root.left), self.maxDepth(root.right))
        
    def invertTree(self, root):
        # idea: recursion
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
        # idea: use a helper and recurse down both halves
        if not root:
            return True
        else:
            return self.symHelp(root.left, root.right)

    def sortedArrayToBST(self, nums):
        # idea: recurse, splitting the array into halves 
        if not nums:
            return None
        elif len(nums) == 1:
            root = TreeNode(nums[0])
        else:
            left = 0
            right = len(nums)
            mid = (left + right) // 2
            root = TreeNode(nums[mid])
            root.left = self.sortedArrayToBST(nums[left:mid])
            root.right = self.sortedArrayToBST(nums[mid+1:right])

        return root
    
    def buildTree(self, preorder, inorder):
        # idea: preorder always has the element before inorder so recurse, splitting the array down the coincidint spot
        if not preorder or not inorder:
            return None

        rval = preorder[0]
        root = TreeNode(rval)
        
        mid = inorder.index(rval)

        root.left = self.buildTree(preorder[1:mid+1], inorder[:mid])
        root.right = self.buildTree(preorder[mid+1:], inorder[mid+1:])
        return root
