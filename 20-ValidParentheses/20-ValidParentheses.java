// Last updated: 7/12/2025, 12:05:09 PM
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] pair = new char[256];
        pair[')'] = '(';
        pair[']'] = '[';
        pair['}'] = '{';

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            }

            if (c == ')' || c == ']' || c == '}') {
                if (!stack.isEmpty()) {
                    char match = stack.pop();
                    if (match != pair[c]) return false;
                } else return false;
            }
        }

        return stack.isEmpty();
    }
}