// Last updated: 08/05/2025, 20:58:04
class Solution {
    public boolean isPalindrome(int x) {
        
        if(x<0) return false;

        int result = 0;
        int temp = x;
        while(temp != 0){
            
            result = result*10 + temp%10;
            temp = temp/10;

        }

        return x==result ? true: false;
        
    }
}