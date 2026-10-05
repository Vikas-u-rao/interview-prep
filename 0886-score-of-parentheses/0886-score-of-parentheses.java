class Solution {
    public int scoreOfParentheses(String s) {
        Deque<Integer> stack = new ArrayDeque<>();
        int result = 0;
        stack.push(0);
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                stack.push(0);
            }
            if (ch == ')') {
                int inside = stack.pop();
                int score = 0;
                if (inside == 0) {
                    score++;
                } else {
                    score = 2 * inside;
                }
                int prev = stack.pop();
                stack.push(prev + score);
            }
        }
        result = stack.pop();
        return result;
    }
}