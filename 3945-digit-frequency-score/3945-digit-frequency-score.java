class Solution {
    public int digitFrequencyScore(int n) {
    
    Map<Integer, Integer> map = new HashMap<>();

    int sum =0;

    while(n!=0){
        int rem = n%10;
        map.put(rem, map.getOrDefault(rem, 0)+ 1);
        n= n/10;
    }
    for(int key: map.keySet()){
        sum = sum + key*map.get(key);
    }
    return sum;
    }
}