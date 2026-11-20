class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int preSum[] = new int[n];
        preSum[0] = 0;
        int suffSum[] = new int[n];
        suffSum[n-1] = 0;
        int result[] = new int[n];
        
        for(int i = 1; i<n ;i++){
            preSum[i] = nums[i-1] + preSum[i-1];
        }

        for(int i = n-2; i>=0 ;i--){
            suffSum[i] = nums[i+1] + suffSum[i+1];
        }

        for(int i = 0 ;i<n;i++){
            result[i] = Math.abs(preSum[i] - suffSum[i]);
        }

        return result;
        
    }
}