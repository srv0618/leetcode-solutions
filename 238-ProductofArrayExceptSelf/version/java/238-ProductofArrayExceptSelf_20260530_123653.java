// Last updated: 30/05/2026, 12:36:53
1class Solution {
2    public int[] productExceptSelf(int[] nums) {
3
4		int[] left = new int[nums.length];
5		
6
7		left[0]=1;
8
9		for(int i=1;i<nums.length;i++){
10			left[i] = left[i-1]*nums[i-1];
11		}
12        int[] result = new int[nums.length];
13		int right=1;
14		for(int j=nums.length-1;j>=0;j--){
15            result[j] = left[j] * right;
16			right= right*nums[j];
17		}
18		
19		
20		return result;
21    }
22}