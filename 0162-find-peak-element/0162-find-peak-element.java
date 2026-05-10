class Solution {
    public int findPeakElement(int[] nums) {
       int n = nums.length;
       int max=nums[0];  
        //T.C=O(N), S.C=O(1)
        for(int i=0; i<n; i++){
            if(max<=nums[i]){
            max=nums[i];
            }
            else{
               return i-1;
            }
        }
        return n-1;
    }
}