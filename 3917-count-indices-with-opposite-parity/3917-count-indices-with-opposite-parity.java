class Solution {
    
    public int countParity(int x, int [] nums, int i){
        int count=0;              //T.C= O(N2)
                          // S.C=O(N)
        int n =nums.length;
        if(x%2==0){
        for(int j=i+1; j<n; j++){
            if(nums[j]% 2 != 0){
              count++;
            }
        }
    }
        else{
            for(int j=i+1; j<n; j++){
                if(nums[j]% 2==0){
                    count++;
                }
            }
        }
        return count;
}
    
    public int[] countOppositeParity(int[] nums) {
        int n= nums.length;
        int arr[] = new int [n];
     
        for(int i=0; i<n; i++){
            arr[i] = countParity(nums[i], nums, i);
        }
          return arr;
    }
}