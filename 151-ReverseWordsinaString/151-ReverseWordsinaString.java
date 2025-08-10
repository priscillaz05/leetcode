// Last updated: 8/9/2025, 10:39:06 PM
class Solution {
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");

//        for (String t : words) System.out.println(t);

        StringBuilder sb = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            sb.append(" ");
        }

        return sb.substring(0, sb.length() - 1);

    }
}