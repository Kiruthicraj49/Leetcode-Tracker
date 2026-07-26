// Last updated: 26/07/2026, 12:27:58
1class Solution {
2    public List<String> fizzBuzz(int n) {
3        List<String> ans = new ArrayList<>();
4        for(int i=1;i<=n;i++){
5            boolean d3=(i%3==0);
6            boolean d5=(i%5==0);
7            if(d3 && d5){
8                ans.add("FizzBuzz");
9            }
10            else if(d3){
11                ans.add("Fizz");
12            }
13            else if(d5){
14                ans.add("Buzz");
15            }
16            else{
17                ans.add(String.valueOf(i));
18            }
19        }
20        return ans;
21    }
22}