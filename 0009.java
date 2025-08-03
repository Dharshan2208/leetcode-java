class Solution {
    public boolean isPalindrome(int x) {

        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reverse = 0;
        while (x > reverse) {
            int digits = x % 10;
            reverse = reverse * 10 + digits;
            x /= 10;
        }

        // ignore the middle digit--> x==reverse/10

        return (reverse == x) || (x == reverse / 10);

    }
}