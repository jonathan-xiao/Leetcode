class Solution(object):
    def iso(self, s, t):
        # idea: use a dict to track s -> t bindings
        # use a set to track t duplicates
        md = dict()
        used = set()
        if (len(s) != len(t)):
            return False
        else:
            for i in range(len(s)):
                if s[i] in md:
                    if md.get(s[i]) == t[i]:
                        continue
                    else:
                        return False
                else:
                    if t[i] in used:
                        return False
                    md[s[i]] = t[i]
                    used.add(t[i])

            return True
        
    def wordPattern(self, pattern, s):
        # exact same idea as before, just use the split() function
        md = dict()
        used = set()
        words = s.split()
        if len(words) != len(pattern):
            return False
        for i in range(len(pattern)):
                if pattern[i] in md:
                    if md.get(pattern[i]) == words[i]:
                        continue
                    else:
                        return False
                else:
                    if words[i] in used:
                        return False
                    md[pattern[i]] = words[i]
                    used.add(words[i])

        return True
    
    def anagram(self, s, t):
        # use a dict to track character and frequencies
        md = dict()
        for c in s:
            md[c] = md.get(c, 0) + 1

        for c in t:
            if c in md and md[c] != 1:
                md[c] = md.get(c) - 1
            elif c in md and md[c] == 1:
                md.pop(c)
            else:
                return False
            
        if any(md.values()):
            return False
        
        return True
    
    def group(self, strs):
        # idea: use a dict to store a base version, then compare sorted strings on it
        d = dict()
        res = []
        count = 0
        for s in strs:
            key = tuple(sorted(s))
            if key in d:
                res[d[key]].append(s)
            else:
                d[key] = count
                res.append([s])
                count += 1
        
        return res



