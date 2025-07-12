// Last updated: 7/12/2025, 12:06:50 PM
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] pair = new char[256];
        pair[')'] = '(';
        pair[']'] = '[';
        pair['}'] = '{';

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            }

            if (c == ')' || c == ']' || c == '}') {
                if (stack.isEmpty()) return false;
                char match = stack.pop();
                if (match != pair[c]) return false;
            }
        }

        return stack.isEmpty();
    }
}