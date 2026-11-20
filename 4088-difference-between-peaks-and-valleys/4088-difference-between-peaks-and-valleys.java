class Solution {
     public int peakValleyDifference(int[] nums) {
        int peak = 0;
        int val = 0;
        for(int i = 1 ;i < nums.length-1;i++){
            //check peak 
            if(nums[i] > nums[i-1] && nums[i] > nums[i+1]) peak += nums[i];
            if(nums[i] < nums[i-1] && nums[i] < nums[i+1]) val += nums[i];
        }
        return peak - val ;
        
    }
}