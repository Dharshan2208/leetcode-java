class Solution {
    public int climbStairs(int n) {

        //time exceeded
        // if (n == 1) return 1;
        // if (n == 2) return 2;
        // return climbStairs(n-1) + climbStairs(n-2);

        if (n == 1)
            return 1;

        int ways[] = new int[n + 1];
        ways[1] = 1;
        ways[2] = 2;

        for (int i = 3; i <= n; i++) {
            ways[i] = ways[i - 1] + ways[i - 2];
        }

        return ways[n];
    }

    // Have to think do it in o(1) space
}