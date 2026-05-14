class Solution {
    public int addDigits(int num) {

       

        for(int i = 0;i <= num; i++){

             int sum = 0;

           while (num > 0) {

                int digit = num % 10;
                sum += digit;

                num = num / 10;
        }
        num =sum;
       
    }
        return num;
    }

}