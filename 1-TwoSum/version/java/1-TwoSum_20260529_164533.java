// Last updated: 29/05/2026, 16:45:33
1class Solution {
2    public int[] twoSum(int[] nums, int target) {
3    
4        Map<Integer,Integer> numsMap = new HashMap<>();
5
6		for(int i=0; i<nums.length; i++){
7		
8			if( !numsMap.containsKey(target - nums[i])){
9				numsMap.put(nums[i],i);
10			}
11			else {
12				return new int[]{i,numsMap.get(target-nums[i])};
13			}
14		}
15        return null;
16    }
17}