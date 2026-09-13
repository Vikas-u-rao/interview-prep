    class Solution {
        public int reverse(int x) {
            long absx=Math.abs((long)x);
            String str = new StringBuilder(String.valueOf(absx)).reverse().toString();
            long rev=Long.parseLong(str);
            if(x<0){
                rev=-rev;
            }
            if(rev<Integer.MIN_VALUE||rev>Integer.MAX_VALUE){
                return 0;
            }
            return (int)rev;
        }
    }