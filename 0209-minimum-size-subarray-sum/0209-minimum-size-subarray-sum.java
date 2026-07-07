class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n= nums.length;
        int currsum=0;
        int left=0;
        int window=Integer.MAX_VALUE;

        for(int right=0; right<n; right++){
            currsum = currsum + nums[right];

            while(currsum>=target){
                currsum = currsum - nums[left];
                window= Math.min(window, (right-left+1));
                left++;
                
            }
        }
        if(window==Integer.MAX_VALUE) return 0;
        return window;

    }
}