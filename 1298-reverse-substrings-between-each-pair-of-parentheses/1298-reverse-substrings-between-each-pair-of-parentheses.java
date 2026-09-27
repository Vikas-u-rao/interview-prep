class Solution {
    public String reverseParentheses(String s) {
        Deque<String> stack=new ArrayDeque<>();
        StringBuilder result=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
                if(ch=='('){
                stack.push(result.toString());
                result=new StringBuilder();
                }
                else if(ch==')'){
                    result.reverse();
                    String previous=stack.pop();
                    result=new StringBuilder(previous).append(result);
                }
                else{
                    result.append(ch);
                }
            }
            return result.toString();
        }
}