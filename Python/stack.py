class Solution(object):
    def isValid(self, s):
        # idea: simple stack approach is O(n)
        st = list()
        for i in range(len(s)):
            if s[i] == '(':
                st.append('(')
            elif s[i] == '[':
                st.append('[')
            elif s[i] == '{':
                st.append('{')
            elif s[i] == ')':
                if (not st) or st[-1] != '(':
                    return False
                else:
                    st.pop()
            elif s[i] == ']':
                if (not st) or st[-1] != '[':
                    return False
                else:
                    st.pop()
            elif s[i] == '}':
                if (not st) or st[-1] != '{':
                    return False
                else:
                    st.pop()

        if not st:
            return True
        else:
            return False
