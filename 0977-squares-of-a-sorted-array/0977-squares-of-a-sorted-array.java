class Solution {
    public int[] sortedSquares(int[] nums) {
    int n= nums.length;
    int low=0;
    int high=n-1;
    int res[]= new int[n];
    int j=n-1;

    while(low<=high){
        int lSquare= nums[low]*nums[low];
        int rSquare= nums[high]*nums[high];

        if(lSquare>rSquare){
            res[j]= lSquare;
            low++;
        }
        else{
            res[j]=rSquare;
            high--;
        }
        j--;
    }
    return res;
    }
}