// Last updated: 13/07/2025, 00:35:00
class Solution {
    public int fib(int n) {

        if(n<=0) return n;
        
        int one = 1,two = 0;

        for(int i = 0;i< n-1;i++)
        {
            int temp = one;
            one = one + two;
            two = temp;
        }

        return one;

    }

    
}