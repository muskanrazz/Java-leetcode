class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int n= nums.length;
        int currpro=1;;
        int left=0;
       int count=0;

        for(int right=0; right<n; right++){
            currpro = currpro*nums[right]; // EXPAND
        
        while(currpro>=k){ // SHRINK
            // update the window
            currpro= currpro/nums[left];
            left++;
        }
            count= count + (right-left+1);
        }
        return count;
    }
}