class Solution {
       public static boolean powOfTwo(int n){
        //base
        if(n<=0) return false;
        if(n>1){
       if(n%2==0) return powOfTwo(n/2);
       else return false;
        }
        return true;

    }
    public boolean isPowerOfTwo(int n) {
      return powOfTwo(n);
    }
}