// Last updated: 30/08/2026, 19:59:06
1class Solution {
2    public List<List<Integer>> generate(int numrow) {
3        List<List<Integer>> tri = new ArrayList<>();
4        for(int i=0;i<numrow;i++){
5            List<Integer> row = new ArrayList<>();
6            for(int j=0;j<=i;j++){
7                if(j==0 || j==i){
8                    row.add(1);
9                }else{
10                    int sum = tri.get(i-1).get(j-1)+tri.get(i-1).get(j);
11                    row.add(sum);
12                }
13            }
14            tri.add(row);
15        }
16        return tri;
17    }
18}