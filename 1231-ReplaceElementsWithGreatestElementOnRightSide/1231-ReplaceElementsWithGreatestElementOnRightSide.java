// Last updated: 09/07/2026, 15:06:32
class Solution {
    public int[] replaceElements(int[] arr) {
        // int n=arr.length;
        // for(int i=0;i<n;i++){
        //     int max=-1;
        //     for(int j=i+1;j<n;j++){
        //         if(arr[j]>max){
        //             max=arr[j];
        //         }
        //     }
        //     arr[i]=max;
        // }
        // return arr;

        int n=arr.length;
        int max=-1;
        int cmax=Integer.MIN_VALUE;
        for(int i=n-1;i>=0;i--){
            if(arr[i]>cmax){
                cmax=arr[i];
            }
            arr[i]=max;
            max=cmax;
        }
        return arr;
    }
}