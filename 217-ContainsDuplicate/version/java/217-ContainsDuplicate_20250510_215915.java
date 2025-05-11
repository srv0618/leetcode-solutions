// Last updated: 10/05/2025, 21:59:15
class Solution {
    public boolean containsDuplicate(int[] nums) {
        return Arrays.stream(nums).distinct().count() < nums.length;
    }
}