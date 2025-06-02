// Last updated: 01/06/2025, 21:23:11
class Solution {
    public boolean isPalindrome(String s) {
        char[] charArray = s.toLowerCase().replaceAll("[^a-zA-Z0-9]","").toCharArray();

        int left = 0;
        int right = charArray.length-1;

        while(left<right){
            
            if(charArray[left]==charArray[right]){
                left++;
                right--;
            }
            else{
                return false;
            }
        }

        return true;
    }
}