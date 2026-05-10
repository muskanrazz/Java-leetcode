class Solution {
    public boolean isPerfectSquare(int num) {
        int sqrt=(int) Math.sqrt(num);
        for(int i=1; i<=sqrt; i++){
            if(i*i==num){
                return true;
            }
        }
        return false;
    }
}