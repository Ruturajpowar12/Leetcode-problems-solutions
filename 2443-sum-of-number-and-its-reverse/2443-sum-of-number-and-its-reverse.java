class Solution {

    public boolean sumOfNumberAndReverse(int num) {

        for (int i = 0; i <= num; i++) {

            int rev = reverse(i);

            if (i + rev == num) {
                return true;
            }
        }

        return false;
    }

    public int reverse(int n) {

        int rev = 0;

        while (n != 0) {

            int digit = n % 10;

            rev = rev * 10 + digit;

            n = n / 10;
        }

        return rev;
    }
}