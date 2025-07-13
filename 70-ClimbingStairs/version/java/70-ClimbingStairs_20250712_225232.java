// Last updated: 12/07/2025, 22:52:32
class Solution {
    public int fib(int n) {

        int [] cache = new int[n+1];
        Arrays.fill(cache, -1);
        return fib_memo(n,cache);

    }

    private int fib_memo(int n, int[] cache) {

        if(n<=1) return n;

        if(cache[n] != -1){
            return cache[n];
        }

        cache[n] = fib_memo(n-1,cache) + fib_memo(n-2,cache);

        return cache[n];
    }
}