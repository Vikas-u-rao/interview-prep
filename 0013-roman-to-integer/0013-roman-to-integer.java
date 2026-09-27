class Solution {
    public int romanToInt(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'I') {
                result = result + 1;
            }
            if (ch == 'V') {
                if (i > 0 && s.charAt(i - 1) == 'I') {
                    result = result - 2;
                }
                result = result + 5;
            }
            if (ch == 'X') {
                if (i > 0 && s.charAt(i - 1) == 'I') {
                    result = result - 2;
                }
                result = result + 10;
            }
            if (ch == 'L') {
                if (i > 0 && s.charAt(i - 1) == 'X') {
                    result = result - 20;
                }
                result = result + 50;
            }
            if (ch == 'C') {
                if (i > 0 && s.charAt(i - 1) == 'X') {
                    result = result - 20;
                }
                result = result + 100;
            }
            if (ch == 'D') {
                if (i > 0 && s.charAt(i - 1) == 'C') {
                    result = result - 200;
                }
                result = result + 500;
            }
            if (ch == 'M') {
                if (i > 0 && s.charAt(i - 1) == 'C') {
                    result = result - 200;
                }
                result = result + 1000;
            }

        }
        return result;
    }
}