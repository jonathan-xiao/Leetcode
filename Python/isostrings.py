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

