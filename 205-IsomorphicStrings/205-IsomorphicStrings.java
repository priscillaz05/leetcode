// Last updated: 7/9/2025, 9:51:00 PM
class Solution {
    public boolean isIsomorphic(String s, String t) {
        // keep track of last appearing position of certain character
        int[] sPos = new int[256];
        int[] tPos = new int[256];

        if (s.length() != t.length()) return false;

        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            if (sPos[sChar] != tPos[tChar]) return false;

            sPos[sChar] = i + 1;
            tPos[tChar] = i + 1;
        }

        return true;
    }
}