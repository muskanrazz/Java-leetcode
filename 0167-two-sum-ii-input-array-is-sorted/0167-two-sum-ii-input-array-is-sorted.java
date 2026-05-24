class Solution {
    public int[] twoSum(int[] numbers, int target) {
       // T.C= O(N)
       // S.C= O(1)
       int n =numbers.length;
       int ans[]= new int[2];
       for(int i=0; i<n; i++){
       int low=i+1;
       int high =n-1;

       while(low<=high){
        int mid= low + (high-low)/2;
        if(numbers[i]+numbers[mid]==target){
         ans[0]= i+1;
         ans[1]=mid+1;
         return ans;
        }
        else if(numbers[i]+numbers[mid]>target){
            high = mid - 1;
        }
        else{
            low= mid + 1;
        }
       }
       
       }
       return ans;
    }
}