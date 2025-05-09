// Last updated: 08/05/2025, 20:41:18
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];

        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++){

            int j = target - nums[i];
            if(map.containsKey(j)) {

                result[0] = map.get(j);
                result[1] = i;
                return result;
            } 
            
            map.put(nums[i],i);
        }

        return  result;
    }
}