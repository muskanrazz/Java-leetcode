class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int n= costs.length;
        Arrays.sort(costs);
      int sum=0;
      int low=0;
      int count=0;
      while(low<n){
        sum += costs[low];
       
        if(sum<=coins) {
            count++;
            low++;
        }
        else {
           break;
        }
      }
      return count;
    }
}