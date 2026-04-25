class Solution(object):
    def hIndex(self, citations):
        # idea: sort and reverse the array
        # then traverse through until i meets or exceeds citations[i]
        # remember that we start from 0, so no need to return i-1
        citations.sort()
        citations.reverse()
        for i in range (0,len(citations)):
            if i >= citations[i]:
                return i
            
        return len(citations)