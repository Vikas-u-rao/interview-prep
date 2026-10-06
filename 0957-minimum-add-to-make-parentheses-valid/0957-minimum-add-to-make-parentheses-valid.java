class Solution {
    public int minAddToMakeValid(String s) {
        int max = 0;
        int min = 0;
        if (s.equals("")) {
            return 0;
        }
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                max++;
            } else if (ch == ')') {
                max--;
                if (max < 0) {
                    min++;
                    max = 0;
                }
            }

        }
        return Math.abs(max + min);
    }
}