class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set= new HashSet<>();
        for(int ele: nums){
            if(set.contains(ele)==true) return true;
            else{
                set.add(ele);
            }
        }
        return false;
    }
}