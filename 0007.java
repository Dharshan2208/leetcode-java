class Solution {
    public int reverse(int n) {
        int reversed = 0;
        while (n != 0) {
            int digit = n % 10;

            if (reversed > Integer.MAX_VALUE / 10
                    || (reversed == Integer.MAX_VALUE / 10 && digit > Integer.MAX_VALUE % 10)) {
                return 0;
            }
            if (reversed < Integer.MIN_VALUE / 10
                    || (reversed == Integer.MIN_VALUE / 10 && digit < Integer.MIN_VALUE % 10)) {
                return 0;
            }

            reversed = reversed * 10 + digit;
            n /= 10;
        }
        return reversed;
    }
}