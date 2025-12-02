class Solution1:
    def mergeAlternately(self, word1: str, word2: str) -> str:
        w1_len = len(word1)
        w2_len = len(word2)
        new_str = ""
        i = 0
        while(i < w1_len and i < w2_len):
            new_str += word1[i]
            new_str += word2[i]
            i += 1
        new_str += word1[i : ] if w1_len > w2_len else word2[i : ]
        return new_str
class Solution2:
    def mergeAlternately(self, word1: str, word2: str) -> str:
        
        res=''
        
        for i in range(min(len(word1),len(word2))):
            res += word1[i] + word2[i]
            
        return res + word1[i+1:] + word2[i+1:]
class Solution3:
    def mergeAlternately(self, word1: str, word2: str) -> str:
        merged = []

        for a, b in zip(word1, word2):
            merged.append(a + b)
        
        merged.append(word1[len(word2):])
        merged.append(word2[len(word1):])

        return "".join(merged)
    
if __name__ =="__main__":
    s1 = Solution1()
    print(s1.mergeAlternately("aaa", "vvvvsfdsadsfdvv"))