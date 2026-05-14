class Solution {
    public int reverse(int x) {
        int rev =0;
        // example 123
        //123 % 10   =  3 
        // 3 * 10 + 3 = 3 then 
        // 123 / 10 = 12  ... repeat
        
        while(x != 0){
            int digit = x % 10;

            //overflow
               if (rev > Integer.MAX_VALUE / 10 || 
                rev < Integer.MIN_VALUE / 10) {
                return 0;
            }

            rev = rev * 10 + digit;
            x = x /10;
        }
        return rev;
        
    }
}