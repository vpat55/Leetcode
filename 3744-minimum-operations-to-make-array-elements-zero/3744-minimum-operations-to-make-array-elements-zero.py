class Solution:
    def minOperations(self, q: List[List[int]]) -> int:
        f=lambda x:sum(max(0,x-4**i)for i in range(16));return sum(f(b+1)-f(a)+1>>1 for a,b in q)