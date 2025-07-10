// Last updated: 7/10/2025, 11:23:20 PM
class Solution {
    public boolean wordPattern(String pattern, String s) {
        int[] p = new int[26];
        HashMap<String, Integer> map = new HashMap<>();

        String[] words = s.split(" ");
        if (pattern.length() != words.length) return false;

        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String w = words[i];

            int patternIndex = p[c - 'a'];
            int wordIndex = map.getOrDefault(w, 0);

            if (patternIndex != wordIndex) return false;

            p[c - 'a'] = i + 1;
            map.put(w, i + 1);
        }

        return true;
    }
}