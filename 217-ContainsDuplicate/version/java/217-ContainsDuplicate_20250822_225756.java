// Last updated: 22/08/2025, 22:57:56
class Solution {
    public boolean containsDuplicate(int[] nums) {
        System.gc();
        HashSet<Integer> set = new HashSet<>(Arrays.stream(nums).boxed().toList());
        return set.size() != nums.length;
    }
}