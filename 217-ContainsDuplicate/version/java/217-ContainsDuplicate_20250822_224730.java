// Last updated: 22/08/2025, 22:47:30
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();

		for(int i:nums)
		{
			if((map.getOrDefault(i,0)+1)>1) return true;

			map.put(i,map.getOrDefault(i,0)+1);
		}

		return false;
    }
}