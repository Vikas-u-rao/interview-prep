class Solution {
    public String rearrangeString(String s, char x, char y) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        String t = new String(arr);
        if (y < x) {
            return t;
        } else {
            return new StringBuilder(t).reverse().toString();
        }
    }
}