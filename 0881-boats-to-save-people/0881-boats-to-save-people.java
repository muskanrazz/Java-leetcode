class Solution {
    public int numRescueBoats(int[] people, int limit) {
       int n= people.length;
       // T.C = NlogN + O(N)
     Arrays.sort(people);  // sort dunc complexity is NlogN
     int count=0;
     int low=0;
     int high=n-1;
     while(low<=high){
        if(people[low]+people[high]<=limit){
            count++;
            low++;
            high--;
        }
        else{
            count++;
            high--;
        }
     }
     return count;
    }
}