class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set <Integer> set = new HashSet<>();
        int n = nums.length;

        for(int ele: nums){
            set.add(ele);
        }
        List<Integer> li = new ArrayList<>();
        for(int i=1; i<=n; i++){
            if(!set.contains(i)){
                li.add(i);
            }
        }
        return li;
    }
}