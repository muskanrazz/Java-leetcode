class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
   int n = nums.length;
        int mid=(n-1)/2;
        int count=0;
        int j=nums[mid];

        for(int i=0;i<n;i++){
            if(nums[i]==j) count++;
        }
        
        if(count==1) return true;
        else return false;
    }
}