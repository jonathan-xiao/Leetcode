class Solution(object):
    def ransom(self, ransomNote, magazine):
        # idea: use a dictionary to store a frequency map of mag, then check note against it
        hsh = {}
        for c in magazine:
            hsh[c] = hsh.get(c,0)+1
        
        for c in ransomNote:
            if hsh.get(c,0) == 0:
                return False
            else:
                hsh[c] -= 1
            
        return True
