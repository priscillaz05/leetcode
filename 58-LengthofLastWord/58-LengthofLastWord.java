// Last updated: 7/20/2025, 9:27:18 AM
class Solution {
    public int lengthOfLastWord(String s) {
        String[] words = s.split(" ");
        int n = words.length;
        return(words[n-1].length());
        
    }
}