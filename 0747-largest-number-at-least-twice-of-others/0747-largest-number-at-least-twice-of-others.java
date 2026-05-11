class Solution {
    public int dominantIndex(int[] nums) {
        int n= nums.length;
        int max=0;
        
        for(int i=0; i<n; i++){
            if(nums[i]>nums[max])
            max=i;
        }
         for (int i = 0; i < n; i++) {
            if (max!= i && nums[max] < 2 * nums[i]) return -1;
            
        }
        return max;
    }
}