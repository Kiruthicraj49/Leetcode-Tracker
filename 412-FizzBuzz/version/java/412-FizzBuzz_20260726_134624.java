// Last updated: 26/07/2026, 13:46:24
1class Solution {
2    public List<Integer> selfDividingNumbers(int left, int right) {
3        List<Integer> res = new ArrayList<>();
4        for(int i=left;i<=right;i++){
5            if(isSelfdivide(i)){
6                res.add(i);
7            }
8        }
9        return res;
10    }
11    private boolean isSelfdivide(int num){
12        int temp=num;
13        while(temp>0){
14            int digit = temp%10;
15            if(digit==0 || num%digit != 0){
16                return false;
17            }
18            temp = temp/10;
19        }
20        return true;
21    }
22}