// Last updated: 12/07/2025, 22:38:28
class Solution {
    public int fib(int n) {
        if(n==0) return 0;
        if(n<=2) return 1;

        return fib(n-2) + fib(n-1);
    }
}