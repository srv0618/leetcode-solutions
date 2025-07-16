// Last updated: 16/07/2025, 13:26:24
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        int j=0;
        while(ans[0]==0 && ans[1]==0){
            j++;
            for(int i=0;i<nums.length-j;i++){
                if(nums[i] + nums[i+j]==target){
                    ans[0] = i;
                    ans[1] = i+j;
                }
            }
        }
        return ans;
    }
}