// Last updated: 7/11/2025, 9:04:04 PM
class Solution {
    public boolean isAnagram(String s, String t) {
        int[] cnt = new int[26];

        if (s.length() != t.length()) return false;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            cnt[c - 'a']++;
        }

        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            if (cnt[c - 'a'] <= 0) return false;

            cnt[c - 'a']--;
        }


        return true;
    }
}