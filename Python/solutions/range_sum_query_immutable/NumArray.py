class NumArray:
    def __init__(self, nums: list[int]):
        n = len(nums)
        self.prefix = [0] * n
        self.prefix[0] = nums[0]

        for i in range(1,n):
            self.prefix[i] = self.prefix [i-1] + nums[i]
        
        #  prefix 1 = prefix 0 + nums 1
        #  prefix 2 = prefix 1 + nums 2

    def sumRange(self, left : int, right : int) -> int:
        if left == 0:
            return self.prefix[right]
        return self.prefix[right] - self.prefix[left - 1]