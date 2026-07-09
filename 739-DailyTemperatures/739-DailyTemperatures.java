// Last updated: 09/07/2026, 15:06:47
class Solution {
    public int[] dailyTemperatures(int[] temp) {
        // int n=temp.length;
        // int[] res = new int[n];
        // for(int i=0;i<n;i++){
        //     for(int j=i+1;j<n;j++){
        //         if(temp[j] > temp[i]){
        //             res[i]=j-i;
        //             break;
        //         }
        //     }
        // }
        // return res;


        int n=temp.length;
        int[] ans = new int[n];
        Stack <Integer> stack = new Stack<>();
        Arrays.fill(ans,0);
        for(int i=0;i<n;i++){
            while(!stack.empty() && temp[i] > temp[stack.peek()]){
                ans[stack.peek()] = i - stack.peek();
                stack.pop();
            }
            stack.push(i);
        }
        return ans;
    }
}