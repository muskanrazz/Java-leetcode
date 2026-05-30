class Solution {
    public int returnToBoundaryCount(int[] nums) {
        int n = nums.length;
       int arr []  = new int[n];
       int sum=0;
       for(int i=0; i<n; i++){
        sum= sum+nums[i];
        arr[i]=sum;
    
       }
       int count=0;
       for(int i=0; i<n; i++){
        if(arr[i]==0) count++;
       }
       return count;
    }
}