class Solution {
    public String clearDigits(String s) {
        Stack<Character> charac = new Stack<>();
        StringBuilder res = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isDigit(ch)) {
                charac.pop();
            } else {
                charac.push(ch);
            }
        }

        while (!charac.isEmpty()) {
            res.append(charac.pop());
        }

        return res.reverse().toString();
    }
}