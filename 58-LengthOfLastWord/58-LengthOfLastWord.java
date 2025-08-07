// Last updated: 8/7/2025, 10:57:27 AM
class Solution {
    public int lengthOfLastWord(String s) {
        String[] words = s.split(" ");
        int n = words.length;
        return(words[n-1].length());
        
    }
}