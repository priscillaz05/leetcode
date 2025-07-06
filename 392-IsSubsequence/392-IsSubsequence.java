// Last updated: 7/6/2025, 8:29:37 PM
class Solution {
    public boolean isSubsequence(String s, String t) {
//        int[] visited = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            char cur = s.charAt(i);
//            System.out.println("cur: " + cur);

            boolean found = false;
            for (int j = 0; j < t.length(); j++) {
//                System.out.println(t.length() + " " + j);
                if (t.charAt(j) == cur) {
//                    System.out.println("character in t:" + t.charAt(j));
//                    if (i > 0 && j < visited[i - 1]) return false;

                    found = true;
                    t = t.substring(j + 1);
//                    System.out.println("t: " + t);
//                    visited[i] = j;
                    break;
                }
            }

            if (!found) return false;
        }

        return true;

    }
}