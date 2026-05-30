// Last updated: 30/05/2026, 10:05:48
1class Solution {
2    public int[] productExceptSelf(int[] nums) {
3
4		int[] left = new int[nums.length];
5		int[] right = new int[nums.length];
6
7		left[0]=1;
8
9		for(int i=1;i<nums.length;i++){
10			left[i] = left[i-1]*nums[i-1];
11		}
12
13		right[nums.length-1]=1;
14		for(int j=nums.length-2;j>=0;j--){
15			right[j]= right[j+1]*nums[j+1];
16		}
17		int[] result = new int[nums.length];
18		for(int k=0;k<nums.length;k++){
19			result[k] = right[k]*left[k];
20		}
21
22		return result;
23    }
24}