class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int flag=x;
        int digit = 0;
        int reverse=0;
        while(x>0){
            digit=x%10;
            reverse=(reverse*10)+digit;
            x=(int)(x/10);
        }
        if(reverse==flag){
            return true;}
        else{
            return false;

            }
        }
    }
