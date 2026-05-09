from typing import List


class Solution:

    def twoSum(self, numbers: List[int], target: int) -> List[int]:   # type: ignore 
        # Two Pointers
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
            
            '''
            Dizi sıralıysa -> Two Pointers (minimum bellek (O1), yüksek hız(ON)), 
            dizi sırasızsa -> Hash Map (ekstra bellek (ON), yüksek hız(ON)) kullanılır.
            '''
    
    def twoSumHashMap(self, numbers: List[int], target: int) -> List[int]: # type: ignore
        seen = {}

        for i, num in enumerate(numbers):
            fark = target - num

            if fark in seen: 
                return [seen[fark]+1, i+1]
            
            seen[num] = i

    def twoSumSet(self, numbers: list[int], target: int) -> list[int]: # type: ignore # index degil sadece numbers'daki degeri dondurecceksek 
            seen = set()
            for num in numbers:
                fark = target - num
                if fark in seen:
                    return [fark, num]
                seen.add(num)


o1 = Solution()
sonuc = o1.twoSumHashMap([4, 10 , 3, 2, 1], 7)
print(sonuc)

