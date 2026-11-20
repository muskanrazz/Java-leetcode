class Solution {
    public boolean check(int low, int high, int[] nums) {
        int min = Integer.MAX_VALUE;
        for (int i = low; i <= high; i++) {
            min = Math.min(nums[i], min);
        }
        int and = nums[low];
        for (int i = low; i <= high; i++) {
            and = and & nums[i];
        }
        return and == min;

    }

    public int countConsistent(int[] nums) {
        int low = 0;
        int high = 0;
        int count = 0;
        while (low < nums.length) {
            if (high < nums.length) {
                if (check(low, high, nums) == true) {

                    count++;
                   
                } high++;
        
            } else {
                low++;
                high = low;
            }
        }

        return count;
        
    }
}