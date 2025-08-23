// Last updated: 23/08/2025, 09:44:35
class Solution {
    public boolean containsDuplicate(int[] nums) {
        System.gc();
        Map<Integer,Integer> map = new HashMap<>();

		for(int i:nums)
		{
			if(map.containsKey(i)) return true;

			map.put(i,1);
		}

		return false;
    }
}