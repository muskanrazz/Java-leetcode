class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int low = 0;
        int high = n-1;
        int res[] = new int [n];
        int j=0;
        k=k%n;
     
     for(int i=n-k; i<n; i++){
       res[j]=nums[i];
       j++; // index x of res
     }
      for(int i=0; i<n-k; i++){
      res[j]= nums[i];
      j++;
     }

     // copy all the values to res to nums
     for(int i=0; i<n; i++){
      nums[i]= res[i];
     }
    }
}