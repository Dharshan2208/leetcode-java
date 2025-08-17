class Solution {
    public boolean isAnagram(String s, String t) {

        int hash1[] = new int[26];
        int hash2[] = new int[26];

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            hash1[ch - 'a']++;
        }

        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            hash2[ch - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if (hash1[i] != hash2[i]) {
                return false;
            }
        }
        return true;
    }
}