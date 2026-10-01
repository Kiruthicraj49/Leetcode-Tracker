// Last updated: 01/10/2026, 08:56:29
1class Solution {
2    public boolean isValid(String s) {
3        Stack<Character> stack = new Stack<>();
4        char[] ch= s.toCharArray();
5        for(char c : ch){
6            if(c=='(' || c=='{' || c=='['){
7                stack.push(c);
8            }
9            else{
10                if(stack.empty()) return false;
11                else if(c==')' && stack.peek()=='(') stack.pop();
12                else if(c=='}' && stack.peek()=='{') stack.pop();
13                else if(c==']' && stack.peek()=='[') stack.pop();
14                else return false;
15            }
16        }
17        return stack.empty();
18    }
19}