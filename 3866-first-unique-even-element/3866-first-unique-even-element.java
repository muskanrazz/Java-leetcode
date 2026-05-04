class Solution {
    public int firstUniqueEven(int[] nums) {
        Map<Integer, Integer> map = new LinkedHashMap<>();
        int arr= nums.length;

        for(int ele:nums){
            map.put(ele, map.getOrDefault(ele, 0)+1);
        }
       
        for(int key: map.keySet()){
          if(key%2==0){
            if(map.get(key)==1) return key;
             
          }
        }
        return -1;
    }
}