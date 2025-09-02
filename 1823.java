class Solution {
    public int findTheWinner(int n, int k) {

        // brute force like o(n square)
        List<Integer> people = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            people.add(i);
        }

        int curr = 0;

        while (people.size() > 1) {
            curr = (curr + k - 1) % people.size();
            people.remove(curr);
        }

        return people.get(0);

    }
}