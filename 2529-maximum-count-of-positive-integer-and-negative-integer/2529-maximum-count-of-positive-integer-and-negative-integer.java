class Solution {
    public int maximumCount(int[] nums) {
        int n= nums.length;
        int po=0;
        int ne=0;
        
        for(int i=0; i<n; i++){
            if(nums[i]<0)  po++;
           else if(nums[i]>0) ne++;
        }
        return Math.max(po, ne);

    }
}