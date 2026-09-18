class Solution {
    public boolean isPalindrome(int x) {
        int original = x;
        int reverse = 0;
        boolean result;

        while(x>0){
            int digit = x%10;
            reverse = reverse*10+digit;
            x=x/10;
        }

        if(original==reverse){
            result=true;
        }else{
            result=false;
        }

        return result;
    }
}