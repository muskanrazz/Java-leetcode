class Solution {
    public int dominantIndex(int[] nums) {
        int n= nums.length;
        int max= nums[0];
        int maxIndex=0;           //T.C = O(N)

        for(int i=0; i<n; i++){
            if(nums[i]>max){
                max= nums[i];
                maxIndex=i;
            }
        }
        for(int i=0; i<n; i++){
            if(nums[i]==max){
              nums[i] = -1;
            }
        }
        for(int i=0; i<n; i++){
            if(nums[i]>max/2){
                return -1;
            }
        }
        return maxIndex;
    }
}