// Last updated: 26/07/2026, 16:22:25
1class Solution {
2    public int maximumProduct(int[] nums) {
3        int max1=Integer.MIN_VALUE;
4        int max2=Integer.MIN_VALUE;
5        int max3=Integer.MIN_VALUE;
6        int min1=Integer.MAX_VALUE;
7        int min2=Integer.MAX_VALUE;
8        for(int n: nums){
9            if(n>max1){
10                max3=max2;
11                max2=max1;
12                max1=n;
13            }
14            else if(n>max2){
15                max3=max2;
16                max2=n;
17            }
18            else if(n>max3){
19                max3=n;
20            }
21
22            if(n<min1){
23                min2=min1;
24                min1=n;
25            }
26            else if(n<min2){
27                min2=n;
28            }
29        }
30        int opt1 = max1*max2*max3;
31        int opt2 = min1*min2*max1;
32        return Math.max(opt1,opt2);
33    }
34}