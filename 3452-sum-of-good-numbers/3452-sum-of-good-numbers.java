class Solution {
    public int sumOfGoodNumbers(int[] nums, int k) {
        int n =nums.length;
        int sum =0;
       for(int i=0;i<n;i++){
        boolean left = true, right = true;

            if (i - k >= 0)
                left = nums[i] > nums[i - k];

            if (i + k < n)
                right = nums[i] > nums[i + k];

            if (left && right)
                sum = sum + nums[i];
       } 
       return sum;
    }
}