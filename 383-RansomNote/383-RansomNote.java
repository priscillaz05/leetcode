// Last updated: 7/7/2025, 8:22:06 PM
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.isEmpty()) return true;
        if (magazine.isEmpty()) return false;
        
        HashMap<Character, Integer> m = new HashMap<>();

        for (int i = 0; i < magazine.length(); i++) {
            char c = magazine.charAt(i);
            if (!m.containsKey(c)) {
                m.put(c, 1);
            } else {
                m.put(c, m.get(c) + 1);
            }
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            char c = ransomNote.charAt(i);
            if (!m.containsKey(c) || m.get(c) <= 0) {
                return false;
            } else {
                m.put(c, m.get(c) - 1);
            }
        }

        return true;
    }
}