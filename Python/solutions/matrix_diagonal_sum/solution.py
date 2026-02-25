class Solution:
    def diagonalSum(self, mat: list[list[int]]) -> int:
        mat_len = len(mat)
        matrix_sum = 0
        for i in range(mat_len):
            matrix_sum += mat[i][i] + mat [i][mat_len-1-i]
        if mat_len % 2 == 1:
            matrix_sum -= mat[mat_len//2][mat_len//2]
        return matrix_sum 


if __name__ == "__main__":
    mat = [[1,2,3],
            [4,5,6],
            [7,8,9]]
    o1 = Solution()
    result = o1.diagonalSum(mat)
    print(result)
'''
time : O(n)
space : O(1)
'''