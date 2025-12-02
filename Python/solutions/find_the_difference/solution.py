class Solution1:
    def findTheDifference(self, s: str, t: str) -> str:
        sum_t = 0
        sum_s = 0 
        for char in t:
            sum_t += ord(char)
        for char in s:
            sum_s += ord(char)

        found_char = chr(sum_t - sum_s)
        return found_char
class Solution2:  # S1'in kisa hali> s_sum = sum(ord(x) for x in s)
    def findTheDifference(self, s: str, t: str) -> str:
        s_sum = sum(ord(x) for x in s)
        t_sum = sum(ord(y) for y in t)
    
        return chr(t_sum - s_sum)
class Solution3: # list() casting then remove(s) 
    def findTheDifference(self, s: str, t: str) -> str:    
        S, T = list(s) , list(t)
        for c in S:
            T.remove(c)
        return T[0]

if __name__ == "__main__":  
    s1 = Solution1()
    result = s1.findTheDifference(s = "abcd", t = "abcde")
    print(result)   
