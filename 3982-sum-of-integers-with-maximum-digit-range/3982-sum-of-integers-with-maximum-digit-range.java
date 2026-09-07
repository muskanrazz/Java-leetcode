class Solution {
    public static int diff(int n){
        int max=0;
        int min=Integer.MAX_VALUE;
        while(n>0){
            int rem=n%10;
            min=Math.min(min,rem);
            max=Math.max(max,rem);
            n=n/10;
        }
        return max-min;
    }
    public int maxDigitRange(int[] nums) {
        int n = nums.length;
        int arr[]=new int[n];
        int max=0;
        for(int i=0;i<n;i++){
            arr[i]=diff(nums[i]);
            max=Math.max(max,diff(nums[i]));
        }

        int sum=0;
        for(int i=0;i<n;i++){
            if(arr[i]==max)
            sum += nums[i];
        }
        return sum;
    }
}