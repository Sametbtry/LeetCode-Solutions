from typing import List


class Solution:

    def twoSum(self, numbers: List[int], target: int) -> List[int]:   # type: ignore
        size = len(numbers)
        i1 = 0
        i2 = size - 1

        while i1 < i2:
            total = numbers[i1] + numbers[i2] 
            if total == target:
                return [i1+1, i2+1]
            if total > target:
                i2 -= 1
            else:
                i1 += 1
            
            
