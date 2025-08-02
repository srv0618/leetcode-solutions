// Last updated: 02/08/2025, 17:04:00
class Solution {
    
    int[] cache;

    public int climbStairs(int n){
		
        if ( n<=2 ) return n;
		cache = new int[n + 1];
		Arrays.fill(cache, -1);
		int result = countStairs(n,0);

		return result;
	}
	
	public int countStairs(int n, int i){
		
		if( i>= n) return n==i ? 1:0;

		if(cache[i] != -1) return cache[i];

		cache[i] = countStairs(n,i+1) + countStairs(n,i+2);

		return cache[i];
	}

    
}